package com.buoyantec.dataobject;

import java.util.Date;

public class collegesDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.tc_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long tcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.school_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long schoolId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.College_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String collegeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.tc_creatertime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date tcCreatertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_colleges.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_colleges
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public collegesDO(Long tcId, Long schoolId, String collegeName, Date tcCreatertime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.tcId = tcId;
        this.schoolId = schoolId;
        this.collegeName = collegeName;
        this.tcCreatertime = tcCreatertime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_colleges
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public collegesDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.tc_id
     *
     * @return the value of t_colleges.tc_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getTcId() {
        return tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.tc_id
     *
     * @param tcId the value for t_colleges.tc_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTcId(Long tcId) {
        this.tcId = tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.school_ID
     *
     * @return the value of t_colleges.school_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.school_ID
     *
     * @param schoolId the value for t_colleges.school_ID
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.College_Name
     *
     * @return the value of t_colleges.College_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.College_Name
     *
     * @param collegeName the value for t_colleges.College_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.tc_creatertime
     *
     * @return the value of t_colleges.tc_creatertime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getTcCreatertime() {
        return tcCreatertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.tc_creatertime
     *
     * @param tcCreatertime the value for t_colleges.tc_creatertime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTcCreatertime(Date tcCreatertime) {
        this.tcCreatertime = tcCreatertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.ep_Delete
     *
     * @return the value of t_colleges.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.ep_Delete
     *
     * @param epDelete the value for t_colleges.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.ep_DeleteTime
     *
     * @return the value of t_colleges.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.ep_DeleteTime
     *
     * @param epDeletetime the value for t_colleges.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_colleges.DelectUser
     *
     * @return the value of t_colleges.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_colleges.DelectUser
     *
     * @param delectuser the value for t_colleges.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}