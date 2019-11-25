package com.buoyantec.dataobject;

import java.util.Date;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tu_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long tuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.T_S_school_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long tSSchoolId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.College_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long collegeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.major_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long majorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.Class_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.to_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long toId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.login_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.vsername
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String vsername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.mobile
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.Email
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gen_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date genTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.login_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date loginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.last_login_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.count
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String delectuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tu_StudentID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String tuStudentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tu_IDNumber
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String tuIdnumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public UserDO(Long tuId, Long tSSchoolId, Long collegeId, Long majorId, Long classId, Long toId, String loginName, String password, String vsername, String mobile, String email, Date genTime, Date loginTime, Date lastLoginTime, Long count, Boolean epDelete, Date epDeletetime, String delectuser, String tuStudentid, String tuIdnumber) {
        this.tuId = tuId;
        this.tSSchoolId = tSSchoolId;
        this.collegeId = collegeId;
        this.majorId = majorId;
        this.classId = classId;
        this.toId = toId;
        this.loginName = loginName;
        this.password = password;
        this.vsername = vsername;
        this.mobile = mobile;
        this.email = email;
        this.genTime = genTime;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
        this.count = count;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
        this.tuStudentid = tuStudentid;
        this.tuIdnumber = tuIdnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public UserDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tu_id
     *
     * @return the value of t_user.tu_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tu_id
     *
     * @param tuId the value for t_user.tu_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.T_S_school_ID
     *
     * @return the value of t_user.T_S_school_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long gettSSchoolId() {
        return tSSchoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.T_S_school_ID
     *
     * @param tSSchoolId the value for t_user.T_S_school_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void settSSchoolId(Long tSSchoolId) {
        this.tSSchoolId = tSSchoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.College_ID
     *
     * @return the value of t_user.College_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getCollegeId() {
        return collegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.College_ID
     *
     * @param collegeId the value for t_user.College_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.major_ID
     *
     * @return the value of t_user.major_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.major_ID
     *
     * @param majorId the value for t_user.major_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.Class_ID
     *
     * @return the value of t_user.Class_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.Class_ID
     *
     * @param classId the value for t_user.Class_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.to_id
     *
     * @return the value of t_user.to_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getToId() {
        return toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.to_id
     *
     * @param toId the value for t_user.to_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setToId(Long toId) {
        this.toId = toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.login_Name
     *
     * @return the value of t_user.login_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.login_Name
     *
     * @param loginName the value for t_user.login_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.vsername
     *
     * @return the value of t_user.vsername
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getVsername() {
        return vsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.vsername
     *
     * @param vsername the value for t_user.vsername
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setVsername(String vsername) {
        this.vsername = vsername == null ? null : vsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.mobile
     *
     * @return the value of t_user.mobile
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.mobile
     *
     * @param mobile the value for t_user.mobile
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.Email
     *
     * @return the value of t_user.Email
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.Email
     *
     * @param email the value for t_user.Email
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gen_time
     *
     * @return the value of t_user.gen_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getGenTime() {
        return genTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gen_time
     *
     * @param genTime the value for t_user.gen_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.login_time
     *
     * @return the value of t_user.login_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.login_time
     *
     * @param loginTime the value for t_user.login_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.last_login_time
     *
     * @return the value of t_user.last_login_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.last_login_time
     *
     * @param lastLoginTime the value for t_user.last_login_time
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.count
     *
     * @return the value of t_user.count
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.count
     *
     * @param count the value for t_user.count
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.ep_Delete
     *
     * @return the value of t_user.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.ep_Delete
     *
     * @param epDelete the value for t_user.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.ep_DeleteTime
     *
     * @return the value of t_user.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.ep_DeleteTime
     *
     * @param epDeletetime the value for t_user.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.DelectUser
     *
     * @return the value of t_user.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.DelectUser
     *
     * @param delectuser the value for t_user.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tu_StudentID
     *
     * @return the value of t_user.tu_StudentID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getTuStudentid() {
        return tuStudentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tu_StudentID
     *
     * @param tuStudentid the value for t_user.tu_StudentID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTuStudentid(String tuStudentid) {
        this.tuStudentid = tuStudentid == null ? null : tuStudentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tu_IDNumber
     *
     * @return the value of t_user.tu_IDNumber
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getTuIdnumber() {
        return tuIdnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tu_IDNumber
     *
     * @param tuIdnumber the value for t_user.tu_IDNumber
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTuIdnumber(String tuIdnumber) {
        this.tuIdnumber = tuIdnumber == null ? null : tuIdnumber.trim();
    }
}