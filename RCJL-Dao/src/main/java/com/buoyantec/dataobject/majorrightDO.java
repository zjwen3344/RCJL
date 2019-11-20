package com.buoyantec.dataobject;

import java.util.Date;

public class majorrightDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.tm_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long tmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.major_ID
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long majorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.tu_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long tuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.tn_CreateTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Date tnCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_majorright.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public majorrightDO(Long tmId, Long majorId, Long tuId, Date tnCreatetime, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.tmId = tmId;
        this.majorId = majorId;
        this.tuId = tuId;
        this.tnCreatetime = tnCreatetime;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public majorrightDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.tm_id
     *
     * @return the value of t_majorright.tm_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getTmId() {
        return tmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.tm_id
     *
     * @param tmId the value for t_majorright.tm_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.major_ID
     *
     * @return the value of t_majorright.major_ID
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.major_ID
     *
     * @param majorId the value for t_majorright.major_ID
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.tu_id
     *
     * @return the value of t_majorright.tu_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.tu_id
     *
     * @param tuId the value for t_majorright.tu_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.tn_CreateTime
     *
     * @return the value of t_majorright.tn_CreateTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Date getTnCreatetime() {
        return tnCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.tn_CreateTime
     *
     * @param tnCreatetime the value for t_majorright.tn_CreateTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setTnCreatetime(Date tnCreatetime) {
        this.tnCreatetime = tnCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.ep_Delete
     *
     * @return the value of t_majorright.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.ep_Delete
     *
     * @param epDelete the value for t_majorright.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.ep_DeleteTime
     *
     * @return the value of t_majorright.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.ep_DeleteTime
     *
     * @param epDeletetime the value for t_majorright.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_majorright.DelectUser
     *
     * @return the value of t_majorright.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_majorright.DelectUser
     *
     * @param delectuser the value for t_majorright.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}