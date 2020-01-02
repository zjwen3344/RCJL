package com.buoyantec.service.impl;

import com.buoyantec.dao.UserDOMapper;
import com.buoyantec.dao.enterpriseDOMapper;
import com.buoyantec.dao.userepDOMapper;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.dataobject.userepDO;
import com.buoyantec.dataobject.userepDOExample;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.UserEPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserEPServiceServiceImpl implements UserEPService {


    @Autowired
    private com.buoyantec.dao.userepDOMapper userepDOMapper;
    @Autowired
    private enterpriseDOMapper EPDao;
    private UserDOMapper UserDao;

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

    /**
     * 通过用户ID来获取对应企业信息
     * @param UserID
     * @return
     */
    @Override
    public enterpriseDO FindByUserID(Long UserID) {
        userepDOExample userepEX=new userepDOExample();
        userepEX.createCriteria().andTuIdEqualTo(UserID);
        userepEX.createCriteria().andEpDeleteEqualTo(false);
        List<userepDO> list=userepDOMapper.selectByExample(userepEX);;
        if(list!=null){
          return EPDao.selectByPrimaryKey(list.get(0).getEpId()) ;
        }
        return null;
    }

    /**
     * 通过企业ID获取对应用户信息
     * @param EPID
     * @return
     */
    @Override
    public UserDO FindByEPID(Long EPID) {
        userepDOExample userepEX=new userepDOExample();
        userepEX.createCriteria().andEpIdEqualTo(EPID);
        userepEX.createCriteria().andEpDeleteEqualTo(false);
        List<userepDO> list=userepDOMapper.selectByExample(userepEX);;
        if(list!=null){
            return UserDao.selectByPrimaryKey(list.get(0).getTuId());
        }
        return null;
    }
}
