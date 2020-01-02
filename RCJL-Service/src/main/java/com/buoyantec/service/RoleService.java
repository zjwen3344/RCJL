package com.buoyantec.service;

import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.roleDO;

import java.util.List;
import java.util.Map;

/**
 * @program: RCJL
 * @description: 角色表
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 15:31
 **/
public interface RoleService {
    roleDO FindByID(Long id);
    List<roleDO> FindByID(List<Long> id);
    void Save(roleDO perDO);
    void Delect(Long id,Long UserID);
    Map<Long,String> FindByUserID(Long UserID);

}
