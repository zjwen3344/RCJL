package com.buoyantec.dataobject;

public class ttwocategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_twocategory.tt_ID
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    private Long ttId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_twocategory.to_ID
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    private String toId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_twocategory.tt_Name
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    private String ttName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public ttwocategory(Long ttId, String toId, String ttName) {
        this.ttId = ttId;
        this.toId = toId;
        this.ttName = ttName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public ttwocategory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_twocategory.tt_ID
     *
     * @return the value of t_twocategory.tt_ID
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public Long getTtId() {
        return ttId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_twocategory.tt_ID
     *
     * @param ttId the value for t_twocategory.tt_ID
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public void setTtId(Long ttId) {
        this.ttId = ttId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_twocategory.to_ID
     *
     * @return the value of t_twocategory.to_ID
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public String getToId() {
        return toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_twocategory.to_ID
     *
     * @param toId the value for t_twocategory.to_ID
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public void setToId(String toId) {
        this.toId = toId == null ? null : toId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_twocategory.tt_Name
     *
     * @return the value of t_twocategory.tt_Name
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public String getTtName() {
        return ttName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_twocategory.tt_Name
     *
     * @param ttName the value for t_twocategory.tt_Name
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    public void setTtName(String ttName) {
        this.ttName = ttName == null ? null : ttName.trim();
    }
}