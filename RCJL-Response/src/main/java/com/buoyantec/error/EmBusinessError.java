package com.buoyantec.error;

public enum EmBusinessError  implements CommonError{
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    PARAMETER_CHECKCODE_ERROR(10002,"验证码校验错误，请检查验证码输入") ,
    //未知错误
    UNKNOWN_ERROR(10002,"未知错误")
    ,
    SYSTEM_ERROR(10003,"系统Util工具错误"),
    //20000开头为用户信息相关错误类型
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_PASSORD_AND_USER_ERROR(20002,"用户名或密码错误"),
    TOKEN_IS_NULL(20003,"无此用户Token信息"),
    PERMISSIONS_NOT_INFO(20004,"无此用户权限信息"),
    PERMISSIONS_NOT_PER(20005,"此用户无权限操作"),

    //30000企业错误类型
    Enterprise_Not_Null(30001,"企业信息不能为空"),
    Enterprise_ID_NUll(30002,"企业与用户ID不能为空"),

    //添加新闻的报错
    NEWS_ERROR(40001,"添加新闻时发生错误,请联系管理员处理"),
    NEWS_NULL(40002,"您要查找新闻不存在,或已被删除")


    ;
    private  int errCode;
    private  String errmsg;

    //初始化枚举类报错的错误码与错误信息
    private  EmBusinessError(int errCode,String errmsg){
        this.errCode=errCode;
        this.errmsg=errmsg;
    }


    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrmsg() {
        return this.errmsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errmsg=errMsg;
        return this;
    }
}
