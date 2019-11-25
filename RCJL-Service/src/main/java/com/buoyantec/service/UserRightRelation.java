package com.buoyantec.service;

import com.buoyantec.dataobject.userrightrelationDO;
import com.buoyantec.error.BusinessException;

import java.util.List;

/**
 * @program: RCJL
 * @description: 对用户权限表操作
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-22 14:54
 **/
public interface UserRightRelation {


    List<userrightrelationDO> FindByUserID(Long in) throws BusinessException;
    List<userrightrelationDO> FindByUserName(String in) throws BusinessException;
    void Save(userrightrelationDO userRela);
    void delect(Long RelaID,Long UserID);


}
