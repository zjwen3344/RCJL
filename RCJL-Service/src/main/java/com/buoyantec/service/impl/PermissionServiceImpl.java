package com.buoyantec.service.impl;

import com.buoyantec.dao.permissionDOMapper;
import com.buoyantec.dataobject.permissionDO;
import com.buoyantec.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: RCJL
 * @description: 权限实现类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 10:21
 **/
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private permissionDOMapper permissionDOMapper;

    @Override
    public permissionDO FindByID(Long id) {
        return permissionDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<permissionDO> FindByID(List<Long> id) {
        List<permissionDO> list=new ArrayList<>();
        for (Long i :id){
            list.add(FindByID(i));
        }
        return list;
    }

    @Override

    public void Save(permissionDO perDO) {
        permissionDOMapper.insertSelective(perDO);
    }

    @Override
    public void Delect(Long id,Long UserID) {
            permissionDO perdo=FindByID(id);
            perdo.setDelectuser(UserID.toString());
            perdo.setEpDelete(true);
            perdo.setEpDeletetime(new Date());
            permissionDOMapper.updateByPrimaryKeySelective(perdo);
    }
}
