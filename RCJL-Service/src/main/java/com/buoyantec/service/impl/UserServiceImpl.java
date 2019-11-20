package com.buoyantec.service.impl;

import com.buoyantec.Utils.MyBeanUtils;
import com.buoyantec.dao.UserDOMapper;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.UserDOExample;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.EnterpriseService;
import com.buoyantec.service.UserEPService;
import com.buoyantec.service.UserService;
import com.buoyantec.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;
    @Autowired
    private EnterpriseService enterpriseService;
    @Autowired
    private UserEPService epService;


    @Override
    public UserModel getUserById(Integer id) {
        //调用userdomapper获取到对应的用户 dataobject
        UserDO userDOA = userDOMapper.selectByPrimaryKey((long) id);
        return ConvertFromDataObject(userDOA);
    }

    //企业用户注册用接口
    @Override
    public void RegisterUser(UserDO userDO, enterpriseDO enterpriseDO) throws BusinessException {
        if (userDO == null || enterpriseDO == null)
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "用户对象或企业对象为空");
       //插入用户
       userDOMapper.insertSelective(userDO);
        //插入企业信息
       Long epID= enterpriseService.RegisterEnterprise(enterpriseDO);

       try {
           //插入用户关联企业信息
           epService.AddUserTU(epID,userDO.getTuId());

       }catch (Exception e){
           //如果在插入企业信息的时候报错，那么就把刚刚插入的用户信息删除
            userDOMapper.deleteByPrimaryKey((long) userDO.getTuId());

           throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"关联企业用户信息失败");
       }



    }

    /**
     * 通过用户名查询用户名是否被占用
     * @param logName
     * @return
     */
    @Override
    public boolean UserRepeat(String logName) {
        UserDOExample userDOExample = new UserDOExample();
        UserDOExample.Criteria criterion = userDOExample.createCriteria();
        criterion.andLoginNameEqualTo(logName);
        List<UserDO> list = userDOMapper.selectByExample(userDOExample);
        if (list.size() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public UserDO Login(String UserName, String Password) {
        //创建一个复杂查询器
        UserDOExample userDOExample =new UserDOExample();
        //通过上面的复杂查询器，来生成一个查询条件
        UserDOExample.Criteria criteria=userDOExample.createCriteria();
        //设置查询条件
        criteria.andLoginNameEqualTo(UserName);
        criteria.andPasswordEqualTo(Password);
        //查询
        List<UserDO>userDOList=userDOMapper.selectByExample(userDOExample);
        if(userDOList.size()!=0){
            return  userDOList.get(0);
        }
        return null;
    }

    /**
     * 将UserDO转换成Usermode 实现数据库对象 部分字段脱密处理。
     *
     * @param userDO 数据库DO对象
     * @return 返回一个脱密了的UserModel 数据库对象
     */
    private UserModel ConvertFromDataObject(UserDO userDO) {
        if (userDO == null) {
            return null;
        }
        //创建一个空的UserModel对象 用于合并用
        UserModel userModel = new UserModel();
        //合并两个对象，UserModel 字段要与DO对象的字段保持一致
        // 如果UserModel里面没有的就会被舍弃掉从而实现脱密
        MyBeanUtils.copyProperties(userDO, userModel);
        return userModel;
    }
}
