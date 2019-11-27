package com.buoyantec.service.impl;

import com.buoyantec.dao.roleDOMapper;
import com.buoyantec.dataobject.roleDO;
import com.buoyantec.dataobject.roleDOExample;
import com.buoyantec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: RCJL
 * @description: 角色表操作实现类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 15:34
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private roleDOMapper roleDOMapper;

    @Override
    public roleDO FindByID(Long id) {
        return roleDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<roleDO> FindByID(List<Long> id) {
        List<roleDO> list=FindByID(id);
        for (Long i:id){
            list.add(FindByID(i));
        }
        return list;
    }



    @Override
    public void Save(roleDO perDO) {
        roleDOMapper.insertSelective(perDO);
    }

    @Override
    public void Delect(Long id, Long UserID) {
        roleDO DOrele=FindByID(id);
        DOrele.setDelectuser(UserID.toString());
        DOrele.setEpDelete(true);
        DOrele.setEpDeletetime(new Date());
        roleDOMapper.updateByPrimaryKeySelective(DOrele);
    }
}
