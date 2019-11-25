package com.buoyantec.dataobject;

import java.util.Date;

public class speyearsDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.ts_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Long tsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.SpeYears_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String speyearsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.SpeYears_Years
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Integer speyearsYears;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Boolean epDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date epDeletetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private String delectuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_speyears.ts_createTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    private Date tsCreatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public speyearsDO(Long tsId, String speyearsName, Integer speyearsYears, Boolean epDelete, Date epDeletetime, String delectuser, Date tsCreatetime) {
        this.tsId = tsId;
        this.speyearsName = speyearsName;
        this.speyearsYears = speyearsYears;
        this.epDelete = epDelete;
        this.epDeletetime = epDeletetime;
        this.delectuser = delectuser;
        this.tsCreatetime = tsCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public speyearsDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.ts_id
     *
     * @return the value of t_speyears.ts_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Long getTsId() {
        return tsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.ts_id
     *
     * @param tsId the value for t_speyears.ts_id
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTsId(Long tsId) {
        this.tsId = tsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.SpeYears_Name
     *
     * @return the value of t_speyears.SpeYears_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getSpeyearsName() {
        return speyearsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.SpeYears_Name
     *
     * @param speyearsName the value for t_speyears.SpeYears_Name
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setSpeyearsName(String speyearsName) {
        this.speyearsName = speyearsName == null ? null : speyearsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.SpeYears_Years
     *
     * @return the value of t_speyears.SpeYears_Years
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Integer getSpeyearsYears() {
        return speyearsYears;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.SpeYears_Years
     *
     * @param speyearsYears the value for t_speyears.SpeYears_Years
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setSpeyearsYears(Integer speyearsYears) {
        this.speyearsYears = speyearsYears;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.ep_Delete
     *
     * @return the value of t_speyears.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Boolean getEpDelete() {
        return epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.ep_Delete
     *
     * @param epDelete the value for t_speyears.ep_Delete
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDelete(Boolean epDelete) {
        this.epDelete = epDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.ep_DeleteTime
     *
     * @return the value of t_speyears.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getEpDeletetime() {
        return epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.ep_DeleteTime
     *
     * @param epDeletetime the value for t_speyears.ep_DeleteTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setEpDeletetime(Date epDeletetime) {
        this.epDeletetime = epDeletetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.DelectUser
     *
     * @return the value of t_speyears.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getDelectuser() {
        return delectuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.DelectUser
     *
     * @param delectuser the value for t_speyears.DelectUser
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setDelectuser(String delectuser) {
        this.delectuser = delectuser == null ? null : delectuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_speyears.ts_createTime
     *
     * @return the value of t_speyears.ts_createTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Date getTsCreatetime() {
        return tsCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_speyears.ts_createTime
     *
     * @param tsCreatetime the value for t_speyears.ts_createTime
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setTsCreatetime(Date tsCreatetime) {
        this.tsCreatetime = tsCreatetime;
    }
}