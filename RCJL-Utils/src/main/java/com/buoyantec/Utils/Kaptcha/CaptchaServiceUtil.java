package com.buoyantec.Utils.Kaptcha;

import com.alibaba.druid.util.StringUtils;
import com.buoyantec.Utils.JedisUtil;
import com.buoyantec.error.BusinessException;
import com.google.code.kaptcha.impl.DefaultKaptcha;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: RCJL
 * @description: 验证码生成类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-29 10:04
 **/

public class CaptchaServiceUtil {


  // static  DefaultKaptcha producer=new DefaultKaptcha();

    public  static Map<String,Object> createToken(int CodeTime,DefaultKaptcha producer) throws IOException, BusinessException {
        //生成一个UUID做为Token存储在redis里面一会用户得带着这个UUID和它的验证码答案来找我核对
        String CaptChaToken= UUID.randomUUID().toString();
        Map<String,Object> map=new HashMap<>();
        //生成文字验证码，一会带入生成图片验证码里面用，还要存入redis里面用
        String textCaptch=producer.createText();
        //用于生成图片验证码
        ByteArrayOutputStream outputStream=null;
        BufferedImage image=producer.createImage(textCaptch);
        outputStream=new ByteArrayOutputStream();
        ImageIO.write(image,"jpg",outputStream);

        //生成base64的验证码图片并且存入map内一会返回给调用者
        map.put("img", Base64.getEncoder().encodeToString(outputStream.toByteArray()));
        //向redis里面存入验证码
        JedisUtil.setObjectCaptcha(CaptChaToken,textCaptch,CodeTime);
        //向map里面存入对应验证码的token用于核对答案时候寻找
        map.put("CaptChaToken",CaptChaToken);
        return map;
    }

    /**
     * 校验验证码
     * @param ID  验证码token
     * @param Code  验证码值
     * @return
     * @throws BusinessException
     */
    public static boolean checkCodeToken(String ID,String Code) throws BusinessException {
        if(StringUtils.isEmpty(ID)||StringUtils.isEmpty(Code)){
            return false;

        }
        String value=JedisUtil.getJson(ID);
        JedisUtil.delKey(ID);
        if(value==null){
            return false;
        }
        if(Code.equals(value)){
            return true;
        }
        return false;
    }


}
