package com.buoyantec;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @program: RCJL
 * @description: 自定义AuthenticationToken
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-21 17:01
 **/
public class AuthToken  implements AuthenticationToken
{
    private  String token;

    public AuthToken(String token){
        this.token=token;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }
}
