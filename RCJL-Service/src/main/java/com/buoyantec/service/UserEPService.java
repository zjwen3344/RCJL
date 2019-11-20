package com.buoyantec.service;
import com.buoyantec.error.BusinessException;

public interface UserEPService {

    void AddUserTU(Long epID,Long tuID) throws BusinessException;

}
