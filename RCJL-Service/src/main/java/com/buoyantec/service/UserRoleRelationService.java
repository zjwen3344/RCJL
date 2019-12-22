package com.buoyantec.service;

import com.buoyantec.dataobject.userrolerelationDO;

import java.util.List;
import java.util.Map;

/**
 * @program: RCJL
 * @description: 用户与角色关联表操作类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 15:31
 **/
public interface UserRoleRelationService {
    List<userrolerelationDO> FindByUserID(Long id);
    List<userrolerelationDO> FindByUserID(List<Long> id);
    userrolerelationDO FindByID(Long id);
    List<userrolerelationDO> FindByID(List<Long> id);
    void Save(userrolerelationDO perDO);
    void Delect(Long id,Long UserID);
}
