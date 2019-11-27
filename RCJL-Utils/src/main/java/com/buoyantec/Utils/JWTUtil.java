package com.buoyantec.Utils;

import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @program: RCJL
 * @description: JWT工具类集合
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-27 15:40
 **/
public class JWTUtil {

    // 过期时间30天
    private static final long EXPIRE_TIME = 24 * 60 * 30 * 1000;

    /**
     * 校验token是否正确
     *
     * @param token    密钥
     * @param username 登录名
     * @param password 密码
     * @return
     */
    public static boolean verify(String token, String username, String password) {
        try {
            //加密密码
            Algorithm algorithm = Algorithm.HMAC256(password);
            //再把用户名也追加上去
            JWTVerifier verifier = JWT.require(algorithm).withClaim("username", username).build();

            DecodedJWT jwt = verifier.verify(token);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 生成签名
     * @param username
     * @param password
     * @return
     */
    public static String  sign(String username,String password){
        Date date=new Date(System.currentTimeMillis()+EXPIRE_TIME);
        Algorithm algorithm=Algorithm.HMAC256(password);
        return JWT.create()
                .withClaim("username", username)
                .withExpiresAt(date)
                .sign(algorithm);
    }

    /**
     * 获取登录用户名
     * @param token
     * @return
     */
    public static String GetUserName(String token){
        try {
            DecodedJWT jwt=JWT.decode(token);
            return  jwt.getClaim("username").asString();
        }catch (JWTDecodeException e){
            return  null;
        }
    }


}
