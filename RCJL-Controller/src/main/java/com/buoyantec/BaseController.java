package com.buoyantec;

import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    //用于捕捉全局错误
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    //CrossOrigin 解决跨域请求问题
    @CrossOrigin
    public Object handlerException(HttpServletRequest request, Exception ex) {
        Map<String, Object> responseData = new HashMap<>();

        if (ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            responseData.put("ErrCode", businessException.getErrorCode());
            responseData.put("ErrMsg", businessException.getErrmsg());
            return CommonReturnType.create(responseData, "Error", 500);
        }
        if (ex instanceof HttpMessageNotReadableException) {
            //参数不合法
            responseData.put("ErrCode", EmBusinessError.PARAMETER_VALIDATION_ERROR.getErrorCode());
            responseData.put("ErrMsg", EmBusinessError.PARAMETER_VALIDATION_ERROR.getErrmsg());
            return CommonReturnType.create(responseData, "Error", 500);
        }
        if (ex instanceof UnauthorizedException) {
            //无权限执行
            responseData.put("ErrCode", EmBusinessError.PERMISSIONS_NOT_PER.getErrorCode());
            responseData.put("ErrMsg", EmBusinessError.PERMISSIONS_NOT_PER.getErrmsg());
            return CommonReturnType.create(responseData, "Error", 500);
        }
        if(ex instanceof UnauthenticatedException){
            //未携带Token信息
            responseData.put("ErrCode", EmBusinessError.USER_TOKEN_NULL.getErrorCode());
            responseData.put("ErrMsg", EmBusinessError.USER_TOKEN_NULL.getErrmsg());
            return CommonReturnType.create(responseData, "Error", 500);
        }

        //未知错误
        responseData.put("ErrCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
        responseData.put("ErrMsg", EmBusinessError.UNKNOWN_ERROR.getErrmsg());

        return CommonReturnType.create(responseData, "Error", 500);
    }

}
