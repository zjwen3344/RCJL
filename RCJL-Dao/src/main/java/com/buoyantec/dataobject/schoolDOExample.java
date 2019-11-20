package com.buoyantec.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class schoolDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public schoolDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
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
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
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

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_Name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_Name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_Name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_Name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_Name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_Name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_Name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_Name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_Name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_Name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_Name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_Name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_Name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureIsNull() {
            addCriterion("school_nature is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureIsNotNull() {
            addCriterion("school_nature is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureEqualTo(String value) {
            addCriterion("school_nature =", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotEqualTo(String value) {
            addCriterion("school_nature <>", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureGreaterThan(String value) {
            addCriterion("school_nature >", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureGreaterThanOrEqualTo(String value) {
            addCriterion("school_nature >=", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureLessThan(String value) {
            addCriterion("school_nature <", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureLessThanOrEqualTo(String value) {
            addCriterion("school_nature <=", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureLike(String value) {
            addCriterion("school_nature like", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotLike(String value) {
            addCriterion("school_nature not like", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureIn(List<String> values) {
            addCriterion("school_nature in", values, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotIn(List<String> values) {
            addCriterion("school_nature not in", values, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureBetween(String value1, String value2) {
            addCriterion("school_nature between", value1, value2, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotBetween(String value1, String value2) {
            addCriterion("school_nature not between", value1, value2, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodIsNull() {
            addCriterion("school_Cood is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodIsNotNull() {
            addCriterion("school_Cood is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodEqualTo(String value) {
            addCriterion("school_Cood =", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodNotEqualTo(String value) {
            addCriterion("school_Cood <>", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodGreaterThan(String value) {
            addCriterion("school_Cood >", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodGreaterThanOrEqualTo(String value) {
            addCriterion("school_Cood >=", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodLessThan(String value) {
            addCriterion("school_Cood <", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodLessThanOrEqualTo(String value) {
            addCriterion("school_Cood <=", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodLike(String value) {
            addCriterion("school_Cood like", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodNotLike(String value) {
            addCriterion("school_Cood not like", value, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodIn(List<String> values) {
            addCriterion("school_Cood in", values, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodNotIn(List<String> values) {
            addCriterion("school_Cood not in", values, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodBetween(String value1, String value2) {
            addCriterion("school_Cood between", value1, value2, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andSchoolCoodNotBetween(String value1, String value2) {
            addCriterion("school_Cood not between", value1, value2, "schoolCood");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNull() {
            addCriterion("Gen_time is null");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNotNull() {
            addCriterion("Gen_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenTimeEqualTo(Date value) {
            addCriterion("Gen_time =", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotEqualTo(Date value) {
            addCriterion("Gen_time <>", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThan(Date value) {
            addCriterion("Gen_time >", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Gen_time >=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThan(Date value) {
            addCriterion("Gen_time <", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThanOrEqualTo(Date value) {
            addCriterion("Gen_time <=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeIn(List<Date> values) {
            addCriterion("Gen_time in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotIn(List<Date> values) {
            addCriterion("Gen_time not in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeBetween(Date value1, Date value2) {
            addCriterion("Gen_time between", value1, value2, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotBetween(Date value1, Date value2) {
            addCriterion("Gen_time not between", value1, value2, "genTime");
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
     * This class corresponds to the database table t_school
     *
     * @mbg.generated do_not_delete_during_merge Wed Nov 20 16:34:40 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_school
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
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