package com.buoyantec.viewobject;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserVO {

    public Long getTuId() {
        return tuId;
    }

    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    public Long gettSSchoolId() {
        return tSSchoolId;
    }

    public void settSSchoolId(Long tSSchoolId) {
        this.tSSchoolId = tSSchoolId;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }






    //学生内部ID
    private Long tuId;
    //学校ID
    private Long tSSchoolId;
    //学院ID
    private Long collegeId;
    //专业ID
    private Long majorId;
    //班级ID
    private Long classId;
    //所属组织
    private Long toId;
    //学生学号
    private String tuStudentid;
    //身份证号码
    private String tuIdnumber;
    //登录用户名
    private String loginName;
    //姓名
    private String vsername;
    //手机号
    private String mobile;
    //邮箱
    private String email;
    //最后登录时间
    private Date lastLoginTime;

    public Map<Long, String> getUserRoles() {
        return UserRoles;
    }

    public void setUserRoles(Map<Long, String> userRoles) {
        UserRoles = userRoles;
    }

    //用户角色
    private  Map<Long,String> UserRoles;



}
