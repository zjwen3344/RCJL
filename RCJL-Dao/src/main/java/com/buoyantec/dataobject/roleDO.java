package com.buoyantec.dataobject;

import java.util.Date;

public class roleDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.tr_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long trId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.parent_tr_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long parentTrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role_name
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.gen_time
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Date genTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.description
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public roleDO(Long trId, Long parentTrId, String roleName, Date genTime, String description, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.trId = trId;
        this.parentTrId = parentTrId;
        this.roleName = roleName;
        this.genTime = genTime;
        this.description = description;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public roleDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.tr_id
     *
     * @return the value of t_role.tr_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getTrId() {
        return trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.tr_id
     *
     * @param trId the value for t_role.tr_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setTrId(Long trId) {
        this.trId = trId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.parent_tr_id
     *
     * @return the value of t_role.parent_tr_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getParentTrId() {
        return parentTrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.parent_tr_id
     *
     * @param parentTrId the value for t_role.parent_tr_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setParentTrId(Long parentTrId) {
        this.parentTrId = parentTrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role_name
     *
     * @return the value of t_role.role_name
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role_name
     *
     * @param roleName the value for t_role.role_name
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.gen_time
     *
     * @return the value of t_role.gen_time
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Date getGenTime() {
        return genTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.gen_time
     *
     * @param genTime the value for t_role.gen_time
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.description
     *
     * @return the value of t_role.description
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.description
     *
     * @param description the value for t_role.description
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.ep_Delete
     *
     * @return the value of t_role.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.ep_Delete
     *
     * @param epDelete the value for t_role.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.ep_DeleteTime
     *
     * @return the value of t_role.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.ep_DeleteTime
     *
     * @param epDeletetime the value for t_role.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.DelectUser
     *
     * @return the value of t_role.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.DelectUser
     *
     * @param delectuser the value for t_role.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}