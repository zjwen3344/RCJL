package com.buoyantec.response;

import java.util.Date;

public class CommonReturnType {
    //表明返回请求的返回结果，可能是“success”或者是“error”

    private  int Code;

    private  String status;

    private Date date;

    //若status=success ，那么data应该返回用户请求的Json数据，
    //若status=error  那么data里面应该使用通用的错误请求类
    private  Object data;


    public  static CommonReturnType create(Object result){
        CommonReturnType type=new CommonReturnType();
        type.setDate(new Date());
        type.setData(result);
        type.setStatus("Success");
        type.setCode(200);
        return type;
    }

    public  static CommonReturnType create(Object result,String status,int code){
        CommonReturnType type=new CommonReturnType();
        type.setCode(code);
        type.setDate(new Date());
        type.setStatus(status);
        type.setData(result);
        return  type;

    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
