package com.buoyantec.Exception;

import com.buoyantec.BaseController;
import com.buoyantec.error.BusinessException;
import com.buoyantec.response.CommonReturnType;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: RCJL
 * @description: 捕捉Shiro全局异常
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-28 10:22
 **/
@RestControllerAdvice
public class ExceptionController   {


    // 捕捉shiro的异常
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(ShiroException.class)
    public CommonReturnType handle401(ShiroException e) {
        return  CommonReturnType.create(e.getMessage(),"error",401);
    }

    // 捕捉shiro的异常
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(AuthenticationException.class)
    public CommonReturnType Realm(AuthenticationException e) {
        return  CommonReturnType.create(e.getMessage(),"error",401);
    }






    // 捕捉UnauthorizedException
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(BusinessException.class)
    public CommonReturnType handle401() {
        return  CommonReturnType.create(null,"error",401);
    }

    // 捕捉其他所有异常
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonReturnType globalException(HttpServletRequest request, Throwable ex) {
        return  CommonReturnType.create(getStatus(request).value(),ex.getMessage(),401);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
