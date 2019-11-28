package com.buoyantec.service.impl;

import com.buoyantec.Utils.JWTUtil;
import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.service.ShiroService;
import com.buoyantec.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShiroServiceImpl implements ShiroService {



    @Autowired
    private TokenService tokenService;


    // 过期时间30天
    private static final long EXPIRE_TIME = 24 * 60 * 30 * 1000;

    /**
     * 登录并且向数据库中存入Token值
     * @param UserName 用户ID
     * @return
     */
    @Override
    public Map<String, Object> createToken(String UserName,String Password,Long UserID) throws BusinessException {
        Map<String, Object> result = new HashMap<>();
        //生成Token
        String token = JWTUtil.sign(UserName,Password);

        System.out.print(token);

        //生成当前时间用来计算过期时间
        Date now = new Date();
        //计算出过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE_TIME * 1000);
        //查询这个对象在token表里面是否已经有了数据记录

        tokenDO tokenEntity =tokenService.findByUserId(UserID);

        //如果没有 token 就创建一个Token对象并且保存到数据库里面
        if(tokenEntity==null){
            tokenEntity=new tokenDO();
            tokenEntity.setTuId(Long.valueOf( UserID));
            tokenEntity.setTkBuildtime(now);
            tokenEntity.setTkExpired(expireTime);
            tokenEntity.setTkToken(token);
            tokenService.Save(tokenEntity);
        }else{
            //如果已有了，那么就更新Token以及他的到期时间，与签发时间
            tokenEntity.setTkToken(token);
            tokenEntity.setTkBuildtime(now);
            tokenEntity.setTkExpired(expireTime);
            tokenService.Updata(tokenEntity);
        }
            result.put("token",token);
            result.put("expire",EXPIRE_TIME);
         return result;
    }


    @Override
    public tokenDO findByToken(String accessToken) throws BusinessException {
        return tokenService.findByToken(accessToken);
    }




}
