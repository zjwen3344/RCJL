package com.buoyantec.service.impl;

import com.buoyantec.dao.UserDOMapper;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.UserDOExample;
import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.dataobject.tokenDOExample;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: RCJL
 * @description: 实现tokenService接口定义的方法
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-21 15:34
 **/
@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private com.buoyantec.dao.tokenDOMapper tokenDOMapper;

    @Autowired
    private UserDOMapper userDOMapper;


    @Override
    public tokenDO findByUserId(Long id) {
        tokenDOExample example=new tokenDOExample();
        tokenDOExample.Criteria criteria=example.createCriteria();
        criteria.andTuIdEqualTo(id);
        List<tokenDO> token= tokenDOMapper.selectByExample(example);
        if(token.size()!=0){
            return  token.get(0);
        }
        return null;
    }


    /**
     * 通过用户名查询用户对象的token
     *
     * @param name
     * @return
     * @throws BusinessException
     */
    @Override
    public tokenDO findByUserName(String name) throws BusinessException {

        UserDOExample userDOExample = new UserDOExample();
        UserDOExample.Criteria criterion = userDOExample.createCriteria();
        criterion.andLoginNameEqualTo(name);
        List<UserDO> list = userDOMapper.selectByExample(userDOExample);

        if (list.size() == 0) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        tokenDO DO=findByUserId(list.get(0).getTuId());
        return DO;
    }

    /**
     * 向token表插入对象
     *
     * @param tokenDO
     */
    @Override
    public void Save(tokenDO tokenDO) {
        tokenDOMapper.insertSelective(tokenDO);
    }

    /**
     * 通过Token查询token信息
     * @param accessToken
     * @return
     * @throws BusinessException
     */
    @Override
    public tokenDO findByToken(String accessToken) throws BusinessException {
        tokenDOExample tokenDOExample = new tokenDOExample();
        tokenDOExample.Criteria criterion = tokenDOExample.createCriteria();
        criterion.andTkTokenEqualTo(accessToken);
        List<tokenDO> list = tokenDOMapper.selectByExample(tokenDOExample);
        if (list.size() == 0) throw new BusinessException(EmBusinessError.TOKEN_IS_NULL);
        return list.get(0);
    }

    @Override
    public void Updata(tokenDO tokenDO) {
        tokenDOMapper.updateByPrimaryKeySelective(tokenDO);
    }
}

