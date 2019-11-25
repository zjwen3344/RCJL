package com.buoyantec.service;

import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.service.model.UserModel;

public interface UserService {
    //通过ID获取用户名

    /**
     *用过ID获取用户名
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);

    /**
     * 企业用户注册
     * @param userDO
     * @param enterpriseDO
     */
    void RegisterUser(UserDO userDO, enterpriseDO enterpriseDO) throws BusinessException;

    /**
     * 通过用户登录ID查询用户是否重复
     * @param logName
     */
    boolean UserRepeat(String logName);

    /**
     * 登录用户接口
     * @param UserName 用户名
     * @param Password 密码
     * @return 如果返回了UserDo对象则表示此用户名与密码正确，反之则错误
     */
    UserDO Login(String UserName,String Password);

    /**
     * 通过用户名查找用户
     * @param name  用户名
     * @return
     */
    UserDO FindByUserName(String name);

}
