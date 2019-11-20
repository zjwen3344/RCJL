package com.buoyantec.dataobject;

import java.util.Date;

public class groupDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.tg_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long tgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_name
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.parent_tg_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Long parentTgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.gen_time
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Date genTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.description
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    private String delectuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public groupDO(Long tgId, String groupName, Long parentTgId, Date genTime, String description, Boolean epDelete, Date epDeletetime, String delectuser) {
        this.tgId = tgId;
        this.groupName = groupName;
        this.parentTgId = parentTgId;
        this.genTime = genTime;
        this.description = description;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public groupDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.tg_id
     *
     * @return the value of t_group.tg_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getTgId() {
        return tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.tg_id
     *
     * @param tgId the value for t_group.tg_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_name
     *
     * @return the value of t_group.group_name
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_name
     *
     * @param groupName the value for t_group.group_name
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.parent_tg_id
     *
     * @return the value of t_group.parent_tg_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Long getParentTgId() {
        return parentTgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.parent_tg_id
     *
     * @param parentTgId the value for t_group.parent_tg_id
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setParentTgId(Long parentTgId) {
        this.parentTgId = parentTgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.gen_time
     *
     * @return the value of t_group.gen_time
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Date getGenTime() {
        return genTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.gen_time
     *
     * @param genTime the value for t_group.gen_time
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.description
     *
     * @return the value of t_group.description
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.description
     *
     * @param description the value for t_group.description
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.ep_Delete
     *
     * @return the value of t_group.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.ep_Delete
     *
     * @param epDelete the value for t_group.ep_Delete
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.ep_DeleteTime
     *
     * @return the value of t_group.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.ep_DeleteTime
     *
     * @param epDeletetime the value for t_group.ep_DeleteTime
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.DelectUser
     *
     * @return the value of t_group.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.DelectUser
     *
     * @param delectuser the value for t_group.DelectUser
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }
}