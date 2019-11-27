package com.buoyantec.service;

import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.error.BusinessException;

/**
 * @program: RCJL
 * @description: 用于操作Token表内容
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-21 15:31
 **/
public interface TokenService {
    tokenDO findByUserId(Long id);

    tokenDO findByUserName(String name)throws BusinessException ;

    void Save(tokenDO tokenDO);

    tokenDO findByToken(String accessToken) throws BusinessException;

    void Updata(tokenDO tokenDO);
}

