package com.buoyantec.dataobject;

import java.util.Date;

public class userrolerelationDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.tur_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long turId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.tu_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long tuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.tr_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long trId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.tur_CreateTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date turCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userrolerelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_userrolerelation
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public userrolerelationDO(Long turId, Long tuId, Long trId, Date turCreatetime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.turId = turId;
        this.tuId = tuId;
        this.trId = trId;
        this.turCreatetime = turCreatetime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_userrolerelation
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public userrolerelationDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.tur_id
     *
     * @return the value of t_userrolerelation.tur_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getTurId() {
        return turId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.tur_id
     *
     * @param turId the value for t_userrolerelation.tur_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTurId(Long turId) {
        this.turId = turId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.tu_id
     *
     * @return the value of t_userrolerelation.tu_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.tu_id
     *
     * @param tuId the value for t_userrolerelation.tu_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.tr_id
     *
     * @return the value of t_userrolerelation.tr_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getTrId() {
        return trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.tr_id
     *
     * @param trId the value for t_userrolerelation.tr_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTrId(Long trId) {
        this.trId = trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.tur_CreateTime
     *
     * @return the value of t_userrolerelation.tur_CreateTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getTurCreatetime() {
        return turCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.tur_CreateTime
     *
     * @param turCreatetime the value for t_userrolerelation.tur_CreateTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTurCreatetime(Date turCreatetime) {
        this.turCreatetime = turCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.ep_Delete
     *
     * @return the value of t_userrolerelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.ep_Delete
     *
     * @param epDelete the value for t_userrolerelation.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.ep_DeleteTime
     *
     * @return the value of t_userrolerelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.ep_DeleteTime
     *
     * @param epDeletetime the value for t_userrolerelation.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userrolerelation.DelectUser
     *
     * @return the value of t_userrolerelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userrolerelation.DelectUser
     *
     * @param delectuser the value for t_userrolerelation.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}