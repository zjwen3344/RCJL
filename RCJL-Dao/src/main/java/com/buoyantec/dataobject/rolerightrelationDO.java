package com.buoyantec.dataobject;

import java.util.Date;

public class rolerightrelationDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.trr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long trrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long trId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.T_R_tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tRTrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.right_type
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Integer rightType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.trr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date trrCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rolerightrelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rolerightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public rolerightrelationDO(Long trrId, Long trId, Long tRTrId, Integer rightType, Date trrCreatetime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.trrId = trrId;
        this.trId = trId;
        this.tRTrId = tRTrId;
        this.rightType = rightType;
        this.trrCreatetime = trrCreatetime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rolerightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public rolerightrelationDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.trr_id
     *
     * @return the value of t_rolerightrelation.trr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTrrId() {
        return trrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.trr_id
     *
     * @param trrId the value for t_rolerightrelation.trr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTrrId(Long trrId) {
        this.trrId = trrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.tr_id
     *
     * @return the value of t_rolerightrelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTrId() {
        return trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.tr_id
     *
     * @param trId the value for t_rolerightrelation.tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTrId(Long trId) {
        this.trId = trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.T_R_tr_id
     *
     * @return the value of t_rolerightrelation.T_R_tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long gettRTrId() {
        return tRTrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.T_R_tr_id
     *
     * @param tRTrId the value for t_rolerightrelation.T_R_tr_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void settRTrId(Long tRTrId) {
        this.tRTrId = tRTrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.right_type
     *
     * @return the value of t_rolerightrelation.right_type
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Integer getRightType() {
        return rightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.right_type
     *
     * @param rightType the value for t_rolerightrelation.right_type
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setRightType(Integer rightType) {
        this.rightType = rightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.trr_CreateTime
     *
     * @return the value of t_rolerightrelation.trr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTrrCreatetime() {
        return trrCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.trr_CreateTime
     *
     * @param trrCreatetime the value for t_rolerightrelation.trr_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTrrCreatetime(Date trrCreatetime) {
        this.trrCreatetime = trrCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.ep_Delete
     *
     * @return the value of t_rolerightrelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.ep_Delete
     *
     * @param epDelete the value for t_rolerightrelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.ep_DeleteTime
     *
     * @return the value of t_rolerightrelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.ep_DeleteTime
     *
     * @param epDeletetime the value for t_rolerightrelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rolerightrelation.DelectUser
     *
     * @return the value of t_rolerightrelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rolerightrelation.DelectUser
     *
     * @param delectuser the value for t_rolerightrelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}