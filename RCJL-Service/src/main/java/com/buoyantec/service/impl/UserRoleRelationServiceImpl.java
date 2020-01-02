package com.buoyantec.service.impl;

import com.buoyantec.dao.userrolerelationDOMapper;
import com.buoyantec.dataobject.userrolerelationDO;
import com.buoyantec.dataobject.userrolerelationDOExample;
import com.buoyantec.service.UserRoleRelationService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: RCJL
 * @description: 用户关联角色查询对象实现类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 15:34
 **/
@Service
public class UserRoleRelationServiceImpl implements UserRoleRelationService {
   @Autowired
    private userrolerelationDOMapper rolemapper;


    /**
     * 通过用户ID查询用户角色
     * @param Userid
     * @return
     */
    @Override
    public List<userrolerelationDO> FindByUserID(Long Userid) {
        userrolerelationDOExample example=new userrolerelationDOExample();
        userrolerelationDOExample.Criteria criteria=example.createCriteria();
        criteria.andTuIdEqualTo(Userid);
        criteria.andEpDeleteEqualTo(false);
        return  rolemapper.selectByExample(example);
    }

    @Override
    public List<userrolerelationDO> FindByUserID(List<Long> Userid) {
        //创建一个容器用于存放查询回来的角色信息
        List<userrolerelationDO> userrolerelationDOS=new ArrayList<>();
            //循环查询他的角色信息
          for (Long i:Userid){
              userrolerelationDOExample example=new userrolerelationDOExample();
              userrolerelationDOExample.Criteria criteria=example.createCriteria();
              criteria.andTuIdEqualTo(i);
              criteria.andEpDeleteEqualTo(false);
              userrolerelationDOS.addAll(rolemapper.selectByExample(example));
          }

        return userrolerelationDOS;
    }

    @Override
    public userrolerelationDO FindByID(Long id) {

        return rolemapper.selectByPrimaryKey(id);
    }

    @Override
    public List<userrolerelationDO> FindByID(List<Long> id) {
        List<userrolerelationDO> list= new ArrayList<>();
        for (Long i:id){
            list.add(FindByID(i));
        }

        return list;
    }

    @Override
    public void Save(userrolerelationDO perDO) {
        rolemapper.insertSelective(perDO);
    }

    @Override
    public void Delect(Long id, Long UserID) {
        userrolerelationDO userrole=FindByID(id);
        userrole.setDelectuser(UserID.toString());
        userrole.setEpDelete(true);
        userrole.setEpDeletetime(new Date());
    }
}
