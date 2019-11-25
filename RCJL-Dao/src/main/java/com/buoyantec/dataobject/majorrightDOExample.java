package com.buoyantec.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class majorrightDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public majorrightDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
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
     * This method corresponds to the database table t_majorright
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
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
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
     * This class corresponds to the database table t_majorright
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

        public Criteria andTmIdIsNull() {
            addCriterion("tm_id is null");
            return (Criteria) this;
        }

        public Criteria andTmIdIsNotNull() {
            addCriterion("tm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTmIdEqualTo(Long value) {
            addCriterion("tm_id =", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdNotEqualTo(Long value) {
            addCriterion("tm_id <>", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdGreaterThan(Long value) {
            addCriterion("tm_id >", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tm_id >=", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdLessThan(Long value) {
            addCriterion("tm_id <", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdLessThanOrEqualTo(Long value) {
            addCriterion("tm_id <=", value, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdIn(List<Long> values) {
            addCriterion("tm_id in", values, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdNotIn(List<Long> values) {
            addCriterion("tm_id not in", values, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdBetween(Long value1, Long value2) {
            addCriterion("tm_id between", value1, value2, "tmId");
            return (Criteria) this;
        }

        public Criteria andTmIdNotBetween(Long value1, Long value2) {
            addCriterion("tm_id not between", value1, value2, "tmId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_ID is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Long value) {
            addCriterion("major_ID =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Long value) {
            addCriterion("major_ID <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Long value) {
            addCriterion("major_ID >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("major_ID >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Long value) {
            addCriterion("major_ID <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Long value) {
            addCriterion("major_ID <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Long> values) {
            addCriterion("major_ID in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Long> values) {
            addCriterion("major_ID not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Long value1, Long value2) {
            addCriterion("major_ID between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Long value1, Long value2) {
            addCriterion("major_ID not between", value1, value2, "majorId");
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

        public Criteria andTnCreatetimeIsNull() {
            addCriterion("tn_CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeIsNotNull() {
            addCriterion("tn_CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeEqualTo(Date value) {
            addCriterion("tn_CreateTime =", value, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeNotEqualTo(Date value) {
            addCriterion("tn_CreateTime <>", value, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeGreaterThan(Date value) {
            addCriterion("tn_CreateTime >", value, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tn_CreateTime >=", value, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeLessThan(Date value) {
            addCriterion("tn_CreateTime <", value, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("tn_CreateTime <=", value, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeIn(List<Date> values) {
            addCriterion("tn_CreateTime in", values, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeNotIn(List<Date> values) {
            addCriterion("tn_CreateTime not in", values, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeBetween(Date value1, Date value2) {
            addCriterion("tn_CreateTime between", value1, value2, "tnCreatetime");
            return (Criteria) this;
        }

        public Criteria andTnCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("tn_CreateTime not between", value1, value2, "tnCreatetime");
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
     * This class corresponds to the database table t_majorright
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
     * This class corresponds to the database table t_majorright
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