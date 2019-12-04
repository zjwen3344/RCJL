package com.buoyantec.service.impl;

import com.buoyantec.dao.userrightrelationDOMapper;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.userrightrelationDO;
import com.buoyantec.dataobject.userrightrelationDOExample;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.UserRightRelationService;
import com.buoyantec.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: RCJL
 * @description: 用户权限表实现类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-22 16:23
 **/
@Service
public class UserRightRelationServiceImpl implements UserRightRelationService {
    @Autowired
    private userrightrelationDOMapper rightrelationMapper;

    @Autowired
    private UserService userService;

    private Logger logger= LoggerFactory.getLogger(UserRightRelationServiceImpl.class);

    /**
     * 通过用户ID查询用户权限
     * @param id
     * @return
     * @throws BusinessException
     */
    @Override
    public List<userrightrelationDO> FindByUserID(Long id) throws BusinessException {
            if(id==0||id==null)throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"用户ID不能为空");
        userrightrelationDOExample rightExample=new userrightrelationDOExample();
        userrightrelationDOExample.Criteria rightcriter= rightExample.createCriteria();
        rightcriter.andTuIdEqualTo(id);
        rightcriter.andEpDeleteEqualTo(false);
        List<userrightrelationDO> listright=rightrelationMapper.selectByExample(rightExample);

        userrightrelationDO a=rightrelationMapper.selectByPrimaryKey(Long.valueOf(1) );
        logger.info(":",a);

        if(listright.isEmpty()){
            return null;
        }
        return  listright;
    }

    /**
     * 通过用户名查找对象权限
     * @param name  用户名
     * @return 权限集合
     * @throws BusinessException
     */
    @Override
    public List<userrightrelationDO> FindByUserName(String name) throws BusinessException {
        if(name.isEmpty())throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"用户名不能为空");
        //通过userservice服务去通过用户名查找用户实体
       UserDO userDO= userService.FindByUserName(name);
       if(userDO==null)if(name.isEmpty())throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"未通过用户名查找到对应的对象");
       //创建复杂查询再通过查找到的用户名查找对应的权限
        userrightrelationDOExample rightExample=new userrightrelationDOExample();
        userrightrelationDOExample.Criteria rightcriter= rightExample.createCriteria();
        rightcriter.andTuIdEqualTo(userDO.getTuId());
        List<userrightrelationDO> listright=rightrelationMapper.selectByExample(rightExample);
        if(listright.isEmpty()){
            return null;
        }
        return  listright;
    }

    /**
     * 插入权限
     * @param userRela
     */
    @Override
    public void Save(userrightrelationDO userRela) {
        rightrelationMapper.insertSelective(userRela);
    }

    /**
     * 删除权限
     * @param RelaID
     */
    @Override
    public void delect(Long RelaID,Long UserID) {
        userrightrelationDO rightDO=rightrelationMapper.selectByPrimaryKey(RelaID);
        rightDO.setEpDelete(true);
        rightDO.setEpDeletetime(new Date());
        rightDO.setDelectuser(UserID.toString());
        rightrelationMapper.updateByPrimaryKeySelective(rightDO);
    }
}
