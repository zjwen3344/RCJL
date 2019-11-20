package com.buoyantec;

import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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

        if(ex instanceof BusinessException){
            BusinessException businessException = (BusinessException) ex;
            responseData.put("ErrCode", businessException.getErrorCode());
            responseData.put("ErrMsg", businessException.getErrmsg());
        }else{
            responseData.put("ErrCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
            responseData.put("ErrMsg", EmBusinessError.UNKNOWN_ERROR.getErrmsg());
        }

        return CommonReturnType.create(responseData, "Error");
    }

}
