package com.buoyantec.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class schoolrightDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public schoolrightDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
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
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
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

        public Criteria andTsIdIsNull() {
            addCriterion("ts_id is null");
            return (Criteria) this;
        }

        public Criteria andTsIdIsNotNull() {
            addCriterion("ts_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsIdEqualTo(Long value) {
            addCriterion("ts_id =", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotEqualTo(Long value) {
            addCriterion("ts_id <>", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdGreaterThan(Long value) {
            addCriterion("ts_id >", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ts_id >=", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdLessThan(Long value) {
            addCriterion("ts_id <", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdLessThanOrEqualTo(Long value) {
            addCriterion("ts_id <=", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdIn(List<Long> values) {
            addCriterion("ts_id in", values, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotIn(List<Long> values) {
            addCriterion("ts_id not in", values, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdBetween(Long value1, Long value2) {
            addCriterion("ts_id between", value1, value2, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotBetween(Long value1, Long value2) {
            addCriterion("ts_id not between", value1, value2, "tsId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Long value) {
            addCriterion("school_ID =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Long value) {
            addCriterion("school_ID <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Long value) {
            addCriterion("school_ID >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("school_ID >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Long value) {
            addCriterion("school_ID <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Long value) {
            addCriterion("school_ID <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Long> values) {
            addCriterion("school_ID in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Long> values) {
            addCriterion("school_ID not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Long value1, Long value2) {
            addCriterion("school_ID between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Long value1, Long value2) {
            addCriterion("school_ID not between", value1, value2, "schoolId");
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

        public Criteria andTsCreatimeIsNull() {
            addCriterion("ts_creatime is null");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeIsNotNull() {
            addCriterion("ts_creatime is not null");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeEqualTo(Date value) {
            addCriterion("ts_creatime =", value, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeNotEqualTo(Date value) {
            addCriterion("ts_creatime <>", value, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeGreaterThan(Date value) {
            addCriterion("ts_creatime >", value, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ts_creatime >=", value, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeLessThan(Date value) {
            addCriterion("ts_creatime <", value, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeLessThanOrEqualTo(Date value) {
            addCriterion("ts_creatime <=", value, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeIn(List<Date> values) {
            addCriterion("ts_creatime in", values, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeNotIn(List<Date> values) {
            addCriterion("ts_creatime not in", values, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeBetween(Date value1, Date value2) {
            addCriterion("ts_creatime between", value1, value2, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andTsCreatimeNotBetween(Date value1, Date value2) {
            addCriterion("ts_creatime not between", value1, value2, "tsCreatime");
            return (Criteria) this;
        }

        public Criteria andEpDeleteIsNull() {
            addCriterion("ep_Delete is null");
            return (Criteria) this;
        }

        public Criteria andEpDeleteIsNotNull() {
            addCriterion("ep_Delete is not null");
            return (Criteria) this;
        }

        public Criteria andEpDeleteEqualTo(Boolean value) {
            addCriterion("ep_Delete =", value, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteNotEqualTo(Boolean value) {
            addCriterion("ep_Delete <>", value, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteGreaterThan(Boolean value) {
            addCriterion("ep_Delete >", value, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ep_Delete >=", value, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteLessThan(Boolean value) {
            addCriterion("ep_Delete <", value, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("ep_Delete <=", value, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteIn(List<Boolean> values) {
            addCriterion("ep_Delete in", values, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteNotIn(List<Boolean> values) {
            addCriterion("ep_Delete not in", values, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("ep_Delete between", value1, value2, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ep_Delete not between", value1, value2, "epDelete");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeIsNull() {
            addCriterion("ep_DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeIsNotNull() {
            addCriterion("ep_DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeEqualTo(Date value) {
            addCriterion("ep_DeleteTime =", value, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeNotEqualTo(Date value) {
            addCriterion("ep_DeleteTime <>", value, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeGreaterThan(Date value) {
            addCriterion("ep_DeleteTime >", value, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ep_DeleteTime >=", value, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeLessThan(Date value) {
            addCriterion("ep_DeleteTime <", value, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("ep_DeleteTime <=", value, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeIn(List<Date> values) {
            addCriterion("ep_DeleteTime in", values, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeNotIn(List<Date> values) {
            addCriterion("ep_DeleteTime not in", values, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeBetween(Date value1, Date value2) {
            addCriterion("ep_DeleteTime between", value1, value2, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andEpDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("ep_DeleteTime not between", value1, value2, "epDeletetime");
            return (Criteria) this;
        }

        public Criteria andDelectuserIsNull() {
            addCriterion("DelectUser is null");
            return (Criteria) this;
        }

        public Criteria andDelectuserIsNotNull() {
            addCriterion("DelectUser is not null");
            return (Criteria) this;
        }

        public Criteria andDelectuserEqualTo(String value) {
            addCriterion("DelectUser =", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserNotEqualTo(String value) {
            addCriterion("DelectUser <>", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserGreaterThan(String value) {
            addCriterion("DelectUser >", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserGreaterThanOrEqualTo(String value) {
            addCriterion("DelectUser >=", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserLessThan(String value) {
            addCriterion("DelectUser <", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserLessThanOrEqualTo(String value) {
            addCriterion("DelectUser <=", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserLike(String value) {
            addCriterion("DelectUser like", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserNotLike(String value) {
            addCriterion("DelectUser not like", value, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserIn(List<String> values) {
            addCriterion("DelectUser in", values, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserNotIn(List<String> values) {
            addCriterion("DelectUser not in", values, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserBetween(String value1, String value2) {
            addCriterion("DelectUser between", value1, value2, "delectuser");
            return (Criteria) this;
        }

        public Criteria andDelectuserNotBetween(String value1, String value2) {
            addCriterion("DelectUser not between", value1, value2, "delectuser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_schoolright
     *
     * @mbg.generated do_not_delete_during_merge Mon Nov 25 10:09:14 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_schoolright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
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