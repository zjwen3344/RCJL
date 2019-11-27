package com.buoyantec;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @program: RCJL
 * @description: 替换调ShiroToken
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-27 15:38
 **/
public class JWTToken implements AuthenticationToken {

    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
