package com.buoyantec.viewobject;

import java.util.Date;

/**
 * @program: RCJL
 * @description: 新闻返回脱密类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-20 19:21
 **/
public class NewsVO {

    public String getTnTitle() {
        return tnTitle;
    }

    public void setTnTitle(String tnTitle) {
        this.tnTitle = tnTitle;
    }

    public String getTnVicetitle() {
        return tnVicetitle;
    }

    public void setTnVicetitle(String tnVicetitle) {
        this.tnVicetitle = tnVicetitle;
    }

    public String getTnTitlecole() {
        return tnTitlecole;
    }

    public void setTnTitlecole(String tnTitlecole) {
        this.tnTitlecole = tnTitlecole;
    }

    public Integer getTnTitleb() {
        return tnTitleb;
    }

    public void setTnTitleb(Integer tnTitleb) {
        this.tnTitleb = tnTitleb;
    }

    public Integer getTnOrde() {
        return tnOrde;
    }

    public void setTnOrde(Integer tnOrde) {
        this.tnOrde = tnOrde;
    }

    public String getTnIntr() {
        return tnIntr;
    }

    public void setTnIntr(String tnIntr) {
        this.tnIntr = tnIntr;
    }

    public Integer getTnNumberOc() {
        return tnNumberOc;
    }

    public void setTnNumberOc(Integer tnNumberOc) {
        this.tnNumberOc = tnNumberOc;
    }

    public Date getTnReleasedatetime() {
        return tnReleasedatetime;
    }

    public void setTnReleasedatetime(Date tnReleasedatetime) {
        this.tnReleasedatetime = tnReleasedatetime;
    }

    public String getTnAuthor() {
        return tnAuthor;
    }

    public void setTnAuthor(String tnAuthor) {
        this.tnAuthor = tnAuthor;
    }

    public String getTnCover() {
        return tnCover;
    }

    public void setTnCover(String tnCover) {
        this.tnCover = tnCover;
    }

    public String getTnContent() {
        return tnContent;
    }

    public void setTnContent(String tnContent) {
        this.tnContent = tnContent;
    }

    private  Long tnId;
    private Long tncId;

    public Long getTnId() {
        return tnId;
    }

    public void setTnId(Long tnId) {
        this.tnId = tnId;
    }

    public Long getTncId() {
        return tncId;
    }

    public void setTncId(Long tncId) {
        this.tncId = tncId;
    }

    private  String tnTitle;
    private  String tnVicetitle;
    private  String tnTitlecole;
    private  Integer tnTitleb;
    private  Integer tnOrde;
    private  String tnIntr;
    private  Integer tnNumberOc;
    private Date tnReleasedatetime;
    private  String tnAuthor;
    private  String tnCover;
    private  String tnContent;

}
