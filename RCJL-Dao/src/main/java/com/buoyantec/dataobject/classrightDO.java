package com.buoyantec.dataobject;

import java.util.Date;

public class classrightDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.Class_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tcCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_classright.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public classrightDO(Long tcId, Long classId, Long tuId, Boolean epDelete, Date tcCreatetime, Date epDeletetime, String delectuser) {
        this.tcId = tcId;
        this.classId = classId;
        this.tuId = tuId;
        this.epDelete = epDelete;
        this.tcCreatetime = tcCreatetime;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public classrightDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.tc_id
     *
     * @return the value of t_classright.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTcId() {
        return tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.tc_id
     *
     * @param tcId the value for t_classright.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcId(Long tcId) {
        this.tcId = tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.Class_ID
     *
     * @return the value of t_classright.Class_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.Class_ID
     *
     * @param classId the value for t_classright.Class_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.tu_id
     *
     * @return the value of t_classright.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.tu_id
     *
     * @param tuId the value for t_classright.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.ep_Delete
     *
     * @return the value of t_classright.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.ep_Delete
     *
     * @param epDelete the value for t_classright.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.tc_CreateTime
     *
     * @return the value of t_classright.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTcCreatetime() {
        return tcCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.tc_CreateTime
     *
     * @param tcCreatetime the value for t_classright.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcCreatetime(Date tcCreatetime) {
        this.tcCreatetime = tcCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.ep_DeleteTime
     *
     * @return the value of t_classright.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.ep_DeleteTime
     *
     * @param epDeletetime the value for t_classright.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_classright.DelectUser
     *
     * @return the value of t_classright.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_classright.DelectUser
     *
     * @param delectuser the value for t_classright.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}