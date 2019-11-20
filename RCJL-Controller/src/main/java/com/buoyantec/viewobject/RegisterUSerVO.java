package com.buoyantec.viewobject;

import com.buoyantec.Utils.EmRegistType;

public class RegisterUSerVO {
    //学生学号
    private String tuStudentid;

    public String getTuStudentid() {
        return tuStudentid;
    }

    public void setTuStudentid(String tuStudentid) {
        this.tuStudentid = tuStudentid;
    }

    public String getTuIdnumber() {
        return tuIdnumber;
    }

    public void setTuIdnumber(String tuIdnumber) {
        this.tuIdnumber = tuIdnumber;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getVsername() {
        return vsername;
    }

    public void setVsername(String vsername) {
        this.vsername = vsername;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public String getEpCode() {
        return epCode;
    }

    public void setEpCode(String epCode) {
        this.epCode = epCode;
    }

    public String getEpAddr() {
        return epAddr;
    }

    public void setEpAddr(String epAddr) {
        this.epAddr = epAddr;
    }

    public String getEpContact() {
        return epContact;
    }

    public void setEpContact(String epContact) {
        this.epContact = epContact;
    }

    public String getEpContacphone() {
        return epContacphone;
    }

    public void setEpContacphone(String epContacphone) {
        this.epContacphone = epContacphone;
    }

    public String getEpSite() {
        return epSite;
    }

    public void setEpSite(String epSite) {
        this.epSite = epSite;
    }

    public String getEpEmail() {
        return epEmail;
    }

    public void setEpEmail(String epEmail) {
        this.epEmail = epEmail;
    }

    public String getEpRegCap() {
        return epRegCap;
    }

    public void setEpRegCap(String epRegCap) {
        this.epRegCap = epRegCap;
    }

    public String getEpIndustry() {
        return epIndustry;
    }

    public void setEpIndustry(String epIndustry) {
        this.epIndustry = epIndustry;
    }

    public String getEpIntroduction() {
        return epIntroduction;
    }

    public void setEpIntroduction(String epIntroduction) {
        this.epIntroduction = epIntroduction;
    }

    public String getEpNature() {
        return epNature;
    }

    public void setEpNature(String epNature) {
        this.epNature = epNature;
    }


    public EmRegistType getRegistType() {
        return registType;
    }

    public void setRegistType(EmRegistType registType) {
        this.registType = registType;
    }

    //注册用户类型
    private EmRegistType registType;

    //身份证号码
    private String tuIdnumber;
    //登录用户名
    private String loginName;
    //姓名
    private String vsername;
    //手机号
    private String mobile;
    //密码字段
    private String password;
    //邮箱
    private String email;
    //企业名称
    private  String epName;
    //组织机构代码
    private  String epCode;
    //地址
    private  String epAddr;
    //联系人
    private String epContact;
    //联系电话
    private  String epContacphone;
    //企业网址
    private  String epSite;
    //企业邮箱
    private  String epEmail;
    //注册资金
    private  String epRegCap;
    //所属行业
    private  String epIndustry;
    //公司介绍
    private  String epIntroduction;
    //公司性质
    private  String epNature;


}
