package com.buoyantec.service;

import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.error.BusinessException;

public interface EnterpriseService {

    /**
     * 企业信息注册接口
     * @param enterpriseDO
     */
    Long RegisterEnterprise(enterpriseDO enterpriseDO) throws BusinessException;


}
