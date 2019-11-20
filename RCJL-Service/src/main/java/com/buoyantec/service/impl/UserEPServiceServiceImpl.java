package com.buoyantec.service.impl;

import com.buoyantec.dao.userepDOMapper;
import com.buoyantec.dataobject.userepDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.UserEPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserEPServiceServiceImpl implements UserEPService {


    @Autowired
    private userepDOMapper userepDOMapper;

    /**
     * 注册用户与企业信息关系
     * @param epID  企业信息ID
     * @param tuID 用户表ID
     */
    @Override
    public void AddUserTU(Long epID,Long tuID) throws BusinessException {
        //com.alibaba.druid.util.StringUtils.equals();
        if(epID==null ||tuID==null){
            throw  new BusinessException(EmBusinessError.Enterprise_ID_NUll);
        }

        userepDO userepDO=new userepDO();
        userepDO.setEpId(epID );
        userepDO.setTuId(tuID);
        userepDOMapper.insertSelective(userepDO);



    }
}
