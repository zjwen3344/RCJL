package com.buoyantec.dataobject;

import java.util.Date;

public class collegesrightDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.College_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long collegeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tcCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collegesright.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public collegesrightDO(Long tcId, Long collegeId, Long tuId, Date tcCreatetime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.tcId = tcId;
        this.collegeId = collegeId;
        this.tuId = tuId;
        this.tcCreatetime = tcCreatetime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public collegesrightDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.tc_id
     *
     * @return the value of t_collegesright.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTcId() {
        return tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.tc_id
     *
     * @param tcId the value for t_collegesright.tc_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcId(Long tcId) {
        this.tcId = tcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.College_ID
     *
     * @return the value of t_collegesright.College_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getCollegeId() {
        return collegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.College_ID
     *
     * @param collegeId the value for t_collegesright.College_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.tu_id
     *
     * @return the value of t_collegesright.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.tu_id
     *
     * @param tuId the value for t_collegesright.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.tc_CreateTime
     *
     * @return the value of t_collegesright.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTcCreatetime() {
        return tcCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.tc_CreateTime
     *
     * @param tcCreatetime the value for t_collegesright.tc_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTcCreatetime(Date tcCreatetime) {
        this.tcCreatetime = tcCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.ep_Delete
     *
     * @return the value of t_collegesright.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.ep_Delete
     *
     * @param epDelete the value for t_collegesright.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.ep_DeleteTime
     *
     * @return the value of t_collegesright.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.ep_DeleteTime
     *
     * @param epDeletetime the value for t_collegesright.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collegesright.DelectUser
     *
     * @return the value of t_collegesright.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collegesright.DelectUser
     *
     * @param delectuser the value for t_collegesright.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}