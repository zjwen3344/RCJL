package com.buoyantec.viewobject;

import com.buoyantec.Utils.MD5Utils;

public class UserLoginVO {
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName ;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password =MD5Utils.getPwd(password) ;
    }

    private String UserName;
    private  String Password;
}
