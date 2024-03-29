package com.buoyantec.dataobject;

import java.util.Date;

public class ClassDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.major_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long majorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.Class_Code
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String classCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.class_Name
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tcCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.tc_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean tcDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.tc_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tcDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_class.tc_DeleteUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tcDeleteuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public ClassDO(Long tcId, Long majorId, String classCode, String className, Date tcCreatetime, Boolean tcDelete, Date tcDeletetime, String tcDeleteuser) {
        this.tcId = tcId;
        this.majorId = majorId;
        this.classCode = classCode;
        this.className = className;
        this.tcCreatetime = tcCreatetime;
        this.tcDelete = tcDelete;
        this.tcDeletetime = tcDeletetime;
        this.tcDeleteuser = tcDeleteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public ClassDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.tc_id
     *
     * @return the value of t_class.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTcId() {
        return tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.tc_id
     *
     * @param tcId the value for t_class.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcId(Long tcId) {
        this.tcId = tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.major_ID
     *
     * @return the value of t_class.major_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.major_ID
     *
     * @param majorId the value for t_class.major_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.Class_Code
     *
     * @return the value of t_class.Class_Code
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.Class_Code
     *
     * @param classCode the value for t_class.Class_Code
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.class_Name
     *
     * @return the value of t_class.class_Name
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.class_Name
     *
     * @param className the value for t_class.class_Name
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.tc_CreateTime
     *
     * @return the value of t_class.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTcCreatetime() {
        return tcCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.tc_CreateTime
     *
     * @param tcCreatetime the value for t_class.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcCreatetime(Date tcCreatetime) {
        this.tcCreatetime = tcCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.tc_Delete
     *
     * @return the value of t_class.tc_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getTcDelete() {
        return tcDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.tc_Delete
     *
     * @param tcDelete the value for t_class.tc_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcDelete(Boolean tcDelete) {
        this.tcDelete = tcDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.tc_DeleteTime
     *
     * @return the value of t_class.tc_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTcDeletetime() {
        return tcDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.tc_DeleteTime
     *
     * @param tcDeletetime the value for t_class.tc_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcDeletetime(Date tcDeletetime) {
        this.tcDeletetime = tcDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_class.tc_DeleteUser
     *
     * @return the value of t_class.tc_DeleteUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTcDeleteuser() {
        return tcDeleteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_class.tc_DeleteUser
     *
     * @param tcDeleteuser the value for t_class.tc_DeleteUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcDeleteuser(String tcDeleteuser) {
        this.tcDeleteuser = tcDeleteuser == null ? null : tcDeleteuser.trim();
    }
}