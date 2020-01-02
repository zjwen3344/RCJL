package com.buoyantec.viewobject;

import java.util.Date;

/**
 * @program: RCJL
 * @description: 新闻类型的返回类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-23 17:47
 **/
public class NewsTypeVO
{
    public Long getTncId() {
        return tncId;
    }

    public void setTncId(Long tncId) {
        this.tncId = tncId;
    }

    public String getTncName() {
        return tncName;
    }

    public void setTncName(String tncName) {
        this.tncName = tncName;
    }

    public String getTncIco() {
        return tncIco;
    }

    public void setTncIco(String tncIco) {
        this.tncIco = tncIco;
    }

    public Long getTncDid() {
        return tncDid;
    }

    public void setTncDid(Long tncDid) {
        this.tncDid = tncDid;
    }

    public Date getTncCartetime() {
        return tncCartetime;
    }

    public void setTncCartetime(Date tncCartetime) {
        this.tncCartetime = tncCartetime;
    }

    private  Long  tncId ;
    private  String   tncName;
    private  String   tncIco;
    private  Long  tncDid ;
    private  Date  tncCartetime ;
}
