package com.buoyantec.dataobject;

import java.util.Date;

public class grouprightrelationDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.tgr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tgrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long trId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.tg_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.right_type
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Integer rightType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.tgr_tgr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tgrTgrCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grouprightrelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public grouprightrelationDO(Long tgrId, Long trId, Long tgId, Integer rightType, Date tgrTgrCreatetime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.tgrId = tgrId;
        this.trId = trId;
        this.tgId = tgId;
        this.rightType = rightType;
        this.tgrTgrCreatetime = tgrTgrCreatetime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public grouprightrelationDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.tgr_id
     *
     * @return the value of t_grouprightrelation.tgr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTgrId() {
        return tgrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.tgr_id
     *
     * @param tgrId the value for t_grouprightrelation.tgr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTgrId(Long tgrId) {
        this.tgrId = tgrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.tr_id
     *
     * @return the value of t_grouprightrelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTrId() {
        return trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.tr_id
     *
     * @param trId the value for t_grouprightrelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTrId(Long trId) {
        this.trId = trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.tg_id
     *
     * @return the value of t_grouprightrelation.tg_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTgId() {
        return tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.tg_id
     *
     * @param tgId the value for t_grouprightrelation.tg_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.right_type
     *
     * @return the value of t_grouprightrelation.right_type
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Integer getRightType() {
        return rightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.right_type
     *
     * @param rightType the value for t_grouprightrelation.right_type
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setRightType(Integer rightType) {
        this.rightType = rightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.tgr_tgr_CreateTime
     *
     * @return the value of t_grouprightrelation.tgr_tgr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTgrTgrCreatetime() {
        return tgrTgrCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.tgr_tgr_CreateTime
     *
     * @param tgrTgrCreatetime the value for t_grouprightrelation.tgr_tgr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTgrTgrCreatetime(Date tgrTgrCreatetime) {
        this.tgrTgrCreatetime = tgrTgrCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.ep_Delete
     *
     * @return the value of t_grouprightrelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.ep_Delete
     *
     * @param epDelete the value for t_grouprightrelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.ep_DeleteTime
     *
     * @return the value of t_grouprightrelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.ep_DeleteTime
     *
     * @param epDeletetime the value for t_grouprightrelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grouprightrelation.DelectUser
     *
     * @return the value of t_grouprightrelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grouprightrelation.DelectUser
     *
     * @param delectuser the value for t_grouprightrelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}