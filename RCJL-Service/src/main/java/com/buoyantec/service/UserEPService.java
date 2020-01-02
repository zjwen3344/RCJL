package com.buoyantec.service;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.dataobject.userepDO;
import com.buoyantec.error.BusinessException;

public interface UserEPService {

    void AddUserTU(Long epID,Long tuID) throws BusinessException;

    enterpriseDO FindByUserID(Long UserID);

    UserDO FindByEPID(Long EPID);
}
