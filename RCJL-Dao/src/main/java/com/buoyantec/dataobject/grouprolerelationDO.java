package com.buoyantec.dataobject;

import java.util.Date;

public class grouprolerelationDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.tgr_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tgrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long trId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.tg_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.tgr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tgrCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprolerelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprolerelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public grouprolerelationDO(Long tgrId, Long trId, Long tgId, Date tgrCreatetime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.tgrId = tgrId;
        this.trId = trId;
        this.tgId = tgId;
        this.tgrCreatetime = tgrCreatetime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprolerelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public grouprolerelationDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.tgr_ID
     *
     * @return the value of t_grouprolerelation.tgr_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTgrId() {
        return tgrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.tgr_ID
     *
     * @param tgrId the value for t_grouprolerelation.tgr_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTgrId(Long tgrId) {
        this.tgrId = tgrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.tr_id
     *
     * @return the value of t_grouprolerelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTrId() {
        return trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.tr_id
     *
     * @param trId the value for t_grouprolerelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTrId(Long trId) {
        this.trId = trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.tg_id
     *
     * @return the value of t_grouprolerelation.tg_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTgId() {
        return tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.tg_id
     *
     * @param tgId the value for t_grouprolerelation.tg_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.tgr_CreateTime
     *
     * @return the value of t_grouprolerelation.tgr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTgrCreatetime() {
        return tgrCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.tgr_CreateTime
     *
     * @param tgrCreatetime the value for t_grouprolerelation.tgr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTgrCreatetime(Date tgrCreatetime) {
        this.tgrCreatetime = tgrCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.ep_Delete
     *
     * @return the value of t_grouprolerelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.ep_Delete
     *
     * @param epDelete the value for t_grouprolerelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.ep_DeleteTime
     *
     * @return the value of t_grouprolerelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.ep_DeleteTime
     *
     * @param epDeletetime the value for t_grouprolerelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprolerelation.DelectUser
     *
     * @return the value of t_grouprolerelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprolerelation.DelectUser
     *
     * @param delectuser the value for t_grouprolerelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}