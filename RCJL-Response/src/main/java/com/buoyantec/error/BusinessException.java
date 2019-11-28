package com.buoyantec.error;

public class BusinessException  extends  Exception implements CommonError  {

    private CommonError commonError;

    /**
     * 使用通用的ErrMsg
     * @param commonError
     */
    public  BusinessException(CommonError commonError){
        super();
        this.commonError=commonError;
    }

    /**
     * 用于自定义一个ErrMsg
     * @param commonError
     * @param errMsg
     */
    public  BusinessException (CommonError commonError, String errMsg){
        super();
        this.commonError=commonError;
        this.commonError.setErrMsg(errMsg);
    }



    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrmsg() {
        return this.commonError.getErrmsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
