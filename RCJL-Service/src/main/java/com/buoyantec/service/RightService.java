package com.buoyantec.service;

import com.buoyantec.dataobject.permissionDO;

import java.util.List;

/**
 * @program: RCJL
 * @description: 权限表
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-22 16:20
 **/
public interface RightService {
    List<permissionDO> FindByID(Long id);
    List<permissionDO> FindByName(String Name);
    void Save(permissionDO rightdo);
    void Delect(Long id);
}
