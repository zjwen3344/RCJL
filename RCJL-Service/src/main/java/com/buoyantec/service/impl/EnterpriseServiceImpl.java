package com.buoyantec.service.impl;


import com.buoyantec.dao.enterpriseDOMapper;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private enterpriseDOMapper enterpriseDOMapper;


    /**
     * 注册企业角色
     * @param enterpriseDO
     * @return 插入数据库以后返回的id值
     * @throws BusinessException
     */
    @Override
    public Long RegisterEnterprise(enterpriseDO enterpriseDO) throws BusinessException {
        if(enterpriseDO==null){
            throw  new BusinessException(EmBusinessError.Enterprise_Not_Null);
        }

        enterpriseDOMapper.insertSelective(enterpriseDO);

            return  enterpriseDO.getTeId();
    }
}
