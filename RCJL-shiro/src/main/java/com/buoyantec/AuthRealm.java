package com.buoyantec;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.buoyantec.Utils.JWTUtil;
import com.buoyantec.dataobject.*;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.*;
import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: RCJL
 * @description: Realm校验权限
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-21 16:45
 **/
public class AuthRealm extends AuthorizingRealm {

    Logger logger= LoggerFactory.getLogger(AuthRealm.class);

    @Autowired
    private UserRightRelationService rightRelation;

    @Autowired
    private PermissionService PerSerive;

    @Autowired
    private UserRoleRelationService userroleService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private  UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserDO userDO=(UserDO) principalCollection.getPrimaryPrincipal();
        if(userDO==null){
            try {
                throw new BusinessException(EmBusinessError.PERMISSIONS_NOT_INFO,"无此用户");
            } catch (BusinessException e) {
                e.printStackTrace();
            }
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();

      //用于存放，用户连接权限表的数据
        List<userrightrelationDO> right;
        //用于从用户连接权限表查询具体的权限名称，权限标识
        List<permissionDO> permission = new ArrayList<>();

        //用于存放 用户连接角色表时候的数据；
        List<userrolerelationDO> userroleRelat;
        //用于存放从角色连接表里面查询回来的数据，再次查询角色的信息
        List<roleDO> role=new ArrayList<>();

        try {
            //通过用户连接权限表里面的用户ID来查询用户有多少权限ID
           right=rightRelation.FindByUserID(userDO.getTuId());

           //用户啥权限都没有直接return掉
            if(right==null){
                return simpleAuthorizationInfo;
            }
            //把用户刚刚查询到的权限ID给带到权限表里面查询权限的标识

          for (userrightrelationDO i:right){
            permission.add(PerSerive.FindByID(i.getTurId()));
          }
            //查询角色连接用户表 来确定这个用户有多少个角色
            userroleRelat=userroleService.FindByUserID(userDO.getTuId());
          //没有角色就不添加了
            if(userroleRelat!=null){
                for (userrolerelationDO i:userroleRelat){
                    role.add(roleService.FindByID(i.getTrId()));
                }
            }
            //通过角色连接用户表里面查询到的角色ID 来查询角色的名字


        } catch (BusinessException e) {
            e.printStackTrace();
        }

        //取出角色交给Shiro处理
        for (roleDO i:role){
            simpleAuthorizationInfo.addRole(i.getTrTag());
        }
        //取出权限标识交给Shiro处理
        for (permissionDO i: permission){
            simpleAuthorizationInfo.addStringPermission(i.getTrTag());
        }

        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String accessToken = (String) authenticationToken.getCredentials();
       System.out.printf(accessToken);
       String UserName=JWTUtil.GetUserName( accessToken);
       logger.info(accessToken);
        UserDO user = null;
        tokenDO token;
        try {
             token =tokenService.findByToken(accessToken);

            if(token==null||token.getTkExpired().getTime()<System.currentTimeMillis())
                throw  new BusinessException(EmBusinessError.TOKEN_IS_NULL,"Token无效,请重新登录");

             user=userService.getUserById(token.getTuId());
            if(user==null){
                throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
            }


        } catch (BusinessException e) {
            e.printStackTrace();
        }
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user,accessToken,this.getName());
        return info;
    }




    @Override
    public boolean  supports(AuthenticationToken token){
        return  token instanceof JWTToken;
    }
}
