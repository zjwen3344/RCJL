package com.buoyantec.service;

import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.error.BusinessException;

import java.util.Map;

public interface ShiroService {
    //传入用户ID 生成Token对象
    public Map<String,Object> createToken(Integer userID);

    //登出
    public void LogOut(Integer userID);

    //查找Token
    public tokenDO findByToken(String accessToken) throws BusinessException;

}
