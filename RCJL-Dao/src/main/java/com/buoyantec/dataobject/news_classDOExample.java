package com.buoyantec.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class news_classDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public news_classDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTncIdIsNull() {
            addCriterion("tnc_id is null");
            return (Criteria) this;
        }

        public Criteria andTncIdIsNotNull() {
            addCriterion("tnc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTncIdEqualTo(Long value) {
            addCriterion("tnc_id =", value, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdNotEqualTo(Long value) {
            addCriterion("tnc_id <>", value, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdGreaterThan(Long value) {
            addCriterion("tnc_id >", value, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tnc_id >=", value, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdLessThan(Long value) {
            addCriterion("tnc_id <", value, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdLessThanOrEqualTo(Long value) {
            addCriterion("tnc_id <=", value, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdIn(List<Long> values) {
            addCriterion("tnc_id in", values, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdNotIn(List<Long> values) {
            addCriterion("tnc_id not in", values, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdBetween(Long value1, Long value2) {
            addCriterion("tnc_id between", value1, value2, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncIdNotBetween(Long value1, Long value2) {
            addCriterion("tnc_id not between", value1, value2, "tncId");
            return (Criteria) this;
        }

        public Criteria andTncNameIsNull() {
            addCriterion("tnc_Name is null");
            return (Criteria) this;
        }

        public Criteria andTncNameIsNotNull() {
            addCriterion("tnc_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTncNameEqualTo(String value) {
            addCriterion("tnc_Name =", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameNotEqualTo(String value) {
            addCriterion("tnc_Name <>", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameGreaterThan(String value) {
            addCriterion("tnc_Name >", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameGreaterThanOrEqualTo(String value) {
            addCriterion("tnc_Name >=", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameLessThan(String value) {
            addCriterion("tnc_Name <", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameLessThanOrEqualTo(String value) {
            addCriterion("tnc_Name <=", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameLike(String value) {
            addCriterion("tnc_Name like", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameNotLike(String value) {
            addCriterion("tnc_Name not like", value, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameIn(List<String> values) {
            addCriterion("tnc_Name in", values, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameNotIn(List<String> values) {
            addCriterion("tnc_Name not in", values, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameBetween(String value1, String value2) {
            addCriterion("tnc_Name between", value1, value2, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncNameNotBetween(String value1, String value2) {
            addCriterion("tnc_Name not between", value1, value2, "tncName");
            return (Criteria) this;
        }

        public Criteria andTncIcoIsNull() {
            addCriterion("tnc_ICO is null");
            return (Criteria) this;
        }

        public Criteria andTncIcoIsNotNull() {
            addCriterion("tnc_ICO is not null");
            return (Criteria) this;
        }

        public Criteria andTncIcoEqualTo(String value) {
            addCriterion("tnc_ICO =", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoNotEqualTo(String value) {
            addCriterion("tnc_ICO <>", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoGreaterThan(String value) {
            addCriterion("tnc_ICO >", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoGreaterThanOrEqualTo(String value) {
            addCriterion("tnc_ICO >=", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoLessThan(String value) {
            addCriterion("tnc_ICO <", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoLessThanOrEqualTo(String value) {
            addCriterion("tnc_ICO <=", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoLike(String value) {
            addCriterion("tnc_ICO like", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoNotLike(String value) {
            addCriterion("tnc_ICO not like", value, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoIn(List<String> values) {
            addCriterion("tnc_ICO in", values, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoNotIn(List<String> values) {
            addCriterion("tnc_ICO not in", values, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoBetween(String value1, String value2) {
            addCriterion("tnc_ICO between", value1, value2, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncIcoNotBetween(String value1, String value2) {
            addCriterion("tnc_ICO not between", value1, value2, "tncIco");
            return (Criteria) this;
        }

        public Criteria andTncDidIsNull() {
            addCriterion("tnc__DID is null");
            return (Criteria) this;
        }

        public Criteria andTncDidIsNotNull() {
            addCriterion("tnc__DID is not null");
            return (Criteria) this;
        }

        public Criteria andTncDidEqualTo(Long value) {
            addCriterion("tnc__DID =", value, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidNotEqualTo(Long value) {
            addCriterion("tnc__DID <>", value, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidGreaterThan(Long value) {
            addCriterion("tnc__DID >", value, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidGreaterThanOrEqualTo(Long value) {
            addCriterion("tnc__DID >=", value, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidLessThan(Long value) {
            addCriterion("tnc__DID <", value, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidLessThanOrEqualTo(Long value) {
            addCriterion("tnc__DID <=", value, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidIn(List<Long> values) {
            addCriterion("tnc__DID in", values, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidNotIn(List<Long> values) {
            addCriterion("tnc__DID not in", values, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidBetween(Long value1, Long value2) {
            addCriterion("tnc__DID between", value1, value2, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncDidNotBetween(Long value1, Long value2) {
            addCriterion("tnc__DID not between", value1, value2, "tncDid");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeIsNull() {
            addCriterion("tnc_CarteTime is null");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeIsNotNull() {
            addCriterion("tnc_CarteTime is not null");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeEqualTo(Date value) {
            addCriterion("tnc_CarteTime =", value, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeNotEqualTo(Date value) {
            addCriterion("tnc_CarteTime <>", value, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeGreaterThan(Date value) {
            addCriterion("tnc_CarteTime >", value, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tnc_CarteTime >=", value, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeLessThan(Date value) {
            addCriterion("tnc_CarteTime <", value, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeLessThanOrEqualTo(Date value) {
            addCriterion("tnc_CarteTime <=", value, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeIn(List<Date> values) {
            addCriterion("tnc_CarteTime in", values, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeNotIn(List<Date> values) {
            addCriterion("tnc_CarteTime not in", values, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeBetween(Date value1, Date value2) {
            addCriterion("tnc_CarteTime between", value1, value2, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncCartetimeNotBetween(Date value1, Date value2) {
            addCriterion("tnc_CarteTime not between", value1, value2, "tncCartetime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeIsNull() {
            addCriterion("tnc_modifTime is null");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeIsNotNull() {
            addCriterion("tnc_modifTime is not null");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeEqualTo(Date value) {
            addCriterion("tnc_modifTime =", value, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeNotEqualTo(Date value) {
            addCriterion("tnc_modifTime <>", value, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeGreaterThan(Date value) {
            addCriterion("tnc_modifTime >", value, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tnc_modifTime >=", value, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeLessThan(Date value) {
            addCriterion("tnc_modifTime <", value, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeLessThanOrEqualTo(Date value) {
            addCriterion("tnc_modifTime <=", value, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeIn(List<Date> values) {
            addCriterion("tnc_modifTime in", values, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeNotIn(List<Date> values) {
            addCriterion("tnc_modifTime not in", values, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeBetween(Date value1, Date value2) {
            addCriterion("tnc_modifTime between", value1, value2, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModiftimeNotBetween(Date value1, Date value2) {
            addCriterion("tnc_modifTime not between", value1, value2, "tncModiftime");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridIsNull() {
            addCriterion("tnc_ModifUserID is null");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridIsNotNull() {
            addCriterion("tnc_ModifUserID is not null");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridEqualTo(Long value) {
            addCriterion("tnc_ModifUserID =", value, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridNotEqualTo(Long value) {
            addCriterion("tnc_ModifUserID <>", value, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridGreaterThan(Long value) {
            addCriterion("tnc_ModifUserID >", value, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("tnc_ModifUserID >=", value, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridLessThan(Long value) {
            addCriterion("tnc_ModifUserID <", value, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridLessThanOrEqualTo(Long value) {
            addCriterion("tnc_ModifUserID <=", value, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridIn(List<Long> values) {
            addCriterion("tnc_ModifUserID in", values, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridNotIn(List<Long> values) {
            addCriterion("tnc_ModifUserID not in", values, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridBetween(Long value1, Long value2) {
            addCriterion("tnc_ModifUserID between", value1, value2, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTncModifuseridNotBetween(Long value1, Long value2) {
            addCriterion("tnc_ModifUserID not between", value1, value2, "tncModifuserid");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteIsNull() {
            addCriterion("tbc_Delete is null");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteIsNotNull() {
            addCriterion("tbc_Delete is not null");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteEqualTo(Boolean value) {
            addCriterion("tbc_Delete =", value, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteNotEqualTo(Boolean value) {
            addCriterion("tbc_Delete <>", value, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteGreaterThan(Boolean value) {
            addCriterion("tbc_Delete >", value, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tbc_Delete >=", value, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteLessThan(Boolean value) {
            addCriterion("tbc_Delete <", value, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("tbc_Delete <=", value, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteIn(List<Boolean> values) {
            addCriterion("tbc_Delete in", values, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteNotIn(List<Boolean> values) {
            addCriterion("tbc_Delete not in", values, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("tbc_Delete between", value1, value2, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTbcDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tbc_Delete not between", value1, value2, "tbcDelete");
            return (Criteria) this;
        }

        public Criteria andTuIdIsNull() {
            addCriterion("tu_id is null");
            return (Criteria) this;
        }

        public Criteria andTuIdIsNotNull() {
            addCriterion("tu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuIdEqualTo(Long value) {
            addCriterion("tu_id =", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdNotEqualTo(Long value) {
            addCriterion("tu_id <>", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdGreaterThan(Long value) {
            addCriterion("tu_id >", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tu_id >=", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdLessThan(Long value) {
            addCriterion("tu_id <", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdLessThanOrEqualTo(Long value) {
            addCriterion("tu_id <=", value, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdIn(List<Long> values) {
            addCriterion("tu_id in", values, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdNotIn(List<Long> values) {
            addCriterion("tu_id not in", values, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdBetween(Long value1, Long value2) {
            addCriterion("tu_id between", value1, value2, "tuId");
            return (Criteria) this;
        }

        public Criteria andTuIdNotBetween(Long value1, Long value2) {
            addCriterion("tu_id not between", value1, value2, "tuId");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridIsNull() {
            addCriterion("tnc_DeleteUserID is null");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridIsNotNull() {
            addCriterion("tnc_DeleteUserID is not null");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridEqualTo(Long value) {
            addCriterion("tnc_DeleteUserID =", value, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridNotEqualTo(Long value) {
            addCriterion("tnc_DeleteUserID <>", value, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridGreaterThan(Long value) {
            addCriterion("tnc_DeleteUserID >", value, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("tnc_DeleteUserID >=", value, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridLessThan(Long value) {
            addCriterion("tnc_DeleteUserID <", value, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridLessThanOrEqualTo(Long value) {
            addCriterion("tnc_DeleteUserID <=", value, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridIn(List<Long> values) {
            addCriterion("tnc_DeleteUserID in", values, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridNotIn(List<Long> values) {
            addCriterion("tnc_DeleteUserID not in", values, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridBetween(Long value1, Long value2) {
            addCriterion("tnc_DeleteUserID between", value1, value2, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeleteuseridNotBetween(Long value1, Long value2) {
            addCriterion("tnc_DeleteUserID not between", value1, value2, "tncDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeIsNull() {
            addCriterion("tnc_DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeIsNotNull() {
            addCriterion("tnc_DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeEqualTo(Date value) {
            addCriterion("tnc_DeleteTime =", value, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeNotEqualTo(Date value) {
            addCriterion("tnc_DeleteTime <>", value, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeGreaterThan(Date value) {
            addCriterion("tnc_DeleteTime >", value, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tnc_DeleteTime >=", value, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeLessThan(Date value) {
            addCriterion("tnc_DeleteTime <", value, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("tnc_DeleteTime <=", value, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeIn(List<Date> values) {
            addCriterion("tnc_DeleteTime in", values, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeNotIn(List<Date> values) {
            addCriterion("tnc_DeleteTime not in", values, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeBetween(Date value1, Date value2) {
            addCriterion("tnc_DeleteTime between", value1, value2, "tncDeletetime");
            return (Criteria) this;
        }

        public Criteria andTncDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("tnc_DeleteTime not between", value1, value2, "tncDeletetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_news_class
     *
     * @mbg.generated do_not_delete_during_merge Mon Nov 25 17:04:01 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_news_class
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}