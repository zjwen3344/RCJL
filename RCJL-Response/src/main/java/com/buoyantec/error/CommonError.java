package com.buoyantec.error;

public interface CommonError {
    public  int getErrorCode();
    public  String getErrmsg();
    public CommonError setErrMsg(String errMsg);
}
