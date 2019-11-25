package com.buoyantec.service.impl;

import com.buoyantec.Utils.JwtUtils;
import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.service.ShiroService;
import com.buoyantec.service.TokenService;
import com.buoyantec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;


    private final static int EXPIRE = 3600 * 12;

    /**
     * 生成Token
     *
     * @param userID 用户ID
     * @return
     */
    @Override
    public Map<String, Object> createToken(Integer userID) {
        Map<String, Object> result = new HashMap<>();
        //生成Token
        String token = JwtUtils.encode(userID, EXPIRE);
        System.out.print(token);

        //生成当前时间用来计算过期时间
        Date now = new Date();
        //计算出过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
        //查询这个对象在token表里面是否已经有了数据记录
        tokenDO tokenEntity =tokenService.findByUserId(userID);
        //如果没有 token 就创建一个Token对象并且保存到数据库里面
        if(com.alibaba.druid.util.StringUtils.isEmpty(token)){
            tokenEntity=new tokenDO();
            tokenEntity.setTuId(Long.valueOf( userID));
            tokenEntity.setTkBuildtime(now);
            tokenEntity.setTkExpired(expireTime);
            tokenEntity.setTkToken(token);
            tokenService.Save(tokenEntity);
        }else{
            //如果已有了，那么就更新Token以及他的到期时间，与签发时间
            tokenEntity.setTkToken(token);
            tokenEntity.setTkBuildtime(now);
            tokenEntity.setTkExpired(expireTime);
            tokenService.Save(tokenEntity);
        }
            result.put("token",token);
            result.put("expire",EXPIRE);
        return result;
    }

    /**
     * 登出操作
     * @param userID
     */
    @Override
    public void LogOut(Integer userID) {
        Date date=new Date();
        String token=JwtUtils.encode(userID,date.getTime());
        tokenDO tokenDO= tokenService.findByUserId(userID);
        tokenDO.setTkToken(token);
        tokenDO.setTkExpired(new Date(date.getTime()-10000));
        tokenService.Save(tokenDO);
    }

    @Override
    public tokenDO findByToken(String accessToken) throws BusinessException {
        return tokenService.findByToken(accessToken);
    }




}
