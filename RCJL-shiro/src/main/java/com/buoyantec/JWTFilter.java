package com.buoyantec;

import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: RCJL
 * @description: JWT请求拦截器
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-27 15:55
 **/
public class JWTFilter extends BasicHttpAuthenticationFilter  {
    // 登录标识
    private static String LOGIN_SIGN = "Authorization";

    Logger logger=LoggerFactory.getLogger(JWTFilter.class);

    /**
     * 检测用户是否已经登录，如果携带了Authorization就代表里面登录了
     * @param request
     * @param response
     * @return
     */
    @Override
    public boolean isLoginAttempt(ServletRequest request,ServletResponse response){
        HttpServletRequest req = (HttpServletRequest) request;

        String authorization = req.getHeader(LOGIN_SIGN);

        return authorization != null;

    }

    /**
     *这里之所以一直返回true是因为 调用了getSubject()方法，
     * 这个方法会触发自己写的Realm，具体鉴权会在那里面执行
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String authorization = httpServletRequest.getHeader("Authorization");

        JWTToken token = new JWTToken(authorization);
        // 提交给realm进行登入，如果错误他会抛出异常并被捕获
        getSubject(request, response).login(token);
        // 如果没有抛出异常则代表登入成功，返回true
        return true;
    }

    /**
     * 这里我们详细说明下为什么最终返回的都是true，即允许访问
     * 例如我们提供一个地址 GET /article
     * 登入用户和游客看到的内容是不同的
     * 如果在这里返回了false，请求会被直接拦截，用户看不到任何东西
     * 所以我们在这里返回true，Controller中可以通过 subject.isAuthenticated() 来判断用户是否登入
     * 如果有些资源只有登入用户才能访问，我们只需要在方法上面加上 @RequiresAuthentication 注解即可
     * 但是这样做有一个缺点，就是不能够对GET,POST等请求进行分别过滤鉴权(因为我们重写了官方的方法)，但实际上对应用影响不大
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
       //调用是否登录方法，来判断Header是否含有Ttoken
        //如果含有的话就会跳到executelogin方法里面取触发Reaml来进行鉴权，和登录校验
        if (isLoginAttempt(request, response)) {
            try {
                executeLogin(request, response);
            } catch (Exception e) {
                //如果Header里面没有Token报错
                response401(request, response);
            }
        }
        return true;
    }


    /**
     * 对跨域提供支持
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }
    /**
     * 将非法请求跳转到 /401
     */
    private void response401(ServletRequest req, ServletResponse resp) {
        try {
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendRedirect("/401");
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
