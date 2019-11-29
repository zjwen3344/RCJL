package com.buoyantec;

import com.buoyantec.Utils.Kaptcha.CaptchaServiceUtil;
import com.buoyantec.error.BusinessException;
import com.buoyantec.response.CommonReturnType;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @program: RCJL
 * @description: 用于获取验证码
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-29 11:05
 **/
@RestController
@RequestMapping("Captcha")
public class CaptchaController {

    @Autowired
    private DefaultKaptcha producer;

    /**
     * 生成获取验证码
     * @return
     * @throws BusinessException
     */
    @RequestMapping("/GetCaptcha")
    @ResponseBody
    public CommonReturnType GetCaptcha() throws IOException, BusinessException {
        return  CommonReturnType.create(  CaptchaServiceUtil.createToken(50*60,producer));
    }



}
