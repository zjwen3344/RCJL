package com.buoyantec.response;

public class CommonReturnType {
    //表明返回请求的返回结果，可能是“success”或者是“error”
    private  String status;
    //若status=success ，那么data应该返回用户请求的Json数据，
    //若status=error  那么data里面应该使用通用的错误请求类
    private  Object data;

    public  static CommonReturnType create(Object result){
        return  CommonReturnType.create(result,"Success");
    }

    public  static CommonReturnType create(Object result,String status){
        CommonReturnType type=new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return  type;

    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
