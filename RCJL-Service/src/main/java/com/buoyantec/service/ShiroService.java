package com.buoyantec.service;

import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.error.BusinessException;

import java.util.Map;

public interface ShiroService {
    //传入用户ID 生成Token对象
     Map<String,Object> createToken(String UserName,String Password) throws BusinessException;


    //查找Token
     tokenDO findByToken(String accessToken) throws BusinessException;

}
