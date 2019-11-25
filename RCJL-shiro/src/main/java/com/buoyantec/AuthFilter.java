package com.buoyantec;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: RCJL
 * @description: 权限过滤器
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-21 16:51
 **/
public class AuthFilter extends AuthenticatingFilter {
    /**
     * 生成自定义token(感觉好像是在拦截 前端 headel传过来的token)
     * @param servletRequest
     * @param servletResponse
     * @return
     * @throws Exception
     */
    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
       //从Request请求中取出Token 来生成一个AuthToken对象
        String token =getRequestToken((HttpServletRequest) servletRequest);
        if(StringUtils.isEmpty(token)){
            return null;
        }
        return new AuthToken(token);
    }

    /**
     * 步骤1.所有请求全部拒绝访问
     * @param request
     * @param response
     * @param mappedValue
     * @return
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if (((HttpServletRequest) request).getMethod().equals(RequestMethod.OPTIONS.name())) {
            return true;
        }
        return false;
    }




    /**
     * 第二步，拒绝访问的请求，会调用onAccessDenied方法，onAccessDenied方法先获取 token，再调用executeLogin方法
     * @param servletRequest
     * @param servletResponse
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
      //取出Token
        String token = getRequestToken((HttpServletRequest) servletRequest);
        if (StringUtils.isEmpty(token)) {
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
            httpResponse.setCharacterEncoding("UTF-8");
            Map<String, Object> result = new HashMap<>();
            result.put("status", "400");
            result.put("msg", "未登录--onAccessDenied");
            String json = new Gson().toJson(result);
            httpResponse.getWriter().print(json);
            return false;
        }
        return executeLogin(servletRequest, servletResponse);
    }


    /**
     * 登陆失败时候调用
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setContentType("application/json;charset=utf-8");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setCharacterEncoding("UTF-8");
        try {
            //处理登录失败的异常
            Throwable throwable = e.getCause() == null ? e : e.getCause();
            Map<String, Object> result = new HashMap<>();
            result.put("status", "400");
            result.put("msg", "登陆失败--onLoginFailure");
            String json = JSON.toJSONString(result);
            httpResponse.getWriter().print(json);
        } catch (IOException e1) {
        }
        return false;
    }




    private  String getRequestToken(HttpServletRequest httpRequest){
        String token =httpRequest.getHeader("token");
        if(com.alibaba.druid.util.StringUtils.isEmpty(token)){
            token=httpRequest.getParameter("token");
        }
        return  token;
    }


}
