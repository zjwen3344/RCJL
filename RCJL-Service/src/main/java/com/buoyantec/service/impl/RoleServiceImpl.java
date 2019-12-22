package com.buoyantec.service.impl;

import com.buoyantec.dao.roleDOMapper;
import com.buoyantec.dataobject.roleDO;
import com.buoyantec.dataobject.roleDOExample;
import com.buoyantec.dataobject.userrolerelationDO;
import com.buoyantec.service.RoleService;
import com.buoyantec.service.UserRoleRelationService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private UserRoleRelationService userRoleRelationService;

    /**
     *
     * @param id
     * @return
     */
    @Override
    public roleDO FindByID(Long id) {
        return roleDOMapper.selectByPrimaryKey(id);
    }

    //查询一群角色
    @Override
    public List<roleDO> FindByID(List<Long> id) {
        List<roleDO> list=FindByID(id);
        for (Long i:id){
            list.add(FindByID(i));
        }
        return list;
    }


    /**
     * 给用户赋角色
     * @param perDO
     */
    @Override
    public void Save(roleDO perDO) {
        roleDOMapper.insertSelective(perDO);
    }

    /**
     * 去除用户角色
     * @param id
     * @param UserID
     */
    @Override
    public void Delect(Long id, Long UserID) {
        roleDO DOrele=FindByID(id);
        DOrele.setDelectuser(UserID.toString());
        DOrele.setEpDelete(true);
        DOrele.setEpDeletetime(new Date());
        roleDOMapper.updateByPrimaryKeySelective(DOrele);
    }

    /**
     * 通过用户ID查询用户的角色以及角色ID
     * @param UserID
     * @return
     */
    @Override
    public Map<Long, String> FindByUserID(Long UserID) {
        Map<Long,String> resole=new HashMap<>();
       for (userrolerelationDO id:userRoleRelationService.FindByUserID(UserID)){
           resole.put(FindByID(id.getTrId()).getTrId(),FindByID(id.getTrId()).getRoleName());

       }
       Map<String,Object> userVOObj=new HashMap<>();


        return resole;
    }
}
