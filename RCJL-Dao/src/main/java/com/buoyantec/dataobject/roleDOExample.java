package com.buoyantec.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class roleDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public roleDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
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
     * This method corresponds to the database table t_role
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
     * This method corresponds to the database table t_role
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
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
     * This class corresponds to the database table t_role
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

        public Criteria andTrIdIsNull() {
            addCriterion("tr_id is null");
            return (Criteria) this;
        }

        public Criteria andTrIdIsNotNull() {
            addCriterion("tr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrIdEqualTo(Long value) {
            addCriterion("tr_id =", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotEqualTo(Long value) {
            addCriterion("tr_id <>", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdGreaterThan(Long value) {
            addCriterion("tr_id >", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_id >=", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLessThan(Long value) {
            addCriterion("tr_id <", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLessThanOrEqualTo(Long value) {
            addCriterion("tr_id <=", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdIn(List<Long> values) {
            addCriterion("tr_id in", values, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotIn(List<Long> values) {
            addCriterion("tr_id not in", values, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdBetween(Long value1, Long value2) {
            addCriterion("tr_id between", value1, value2, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotBetween(Long value1, Long value2) {
            addCriterion("tr_id not between", value1, value2, "trId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdIsNull() {
            addCriterion("parent_tr_id is null");
            return (Criteria) this;
        }

        public Criteria andParentTrIdIsNotNull() {
            addCriterion("parent_tr_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentTrIdEqualTo(Long value) {
            addCriterion("parent_tr_id =", value, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdNotEqualTo(Long value) {
            addCriterion("parent_tr_id <>", value, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdGreaterThan(Long value) {
            addCriterion("parent_tr_id >", value, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_tr_id >=", value, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdLessThan(Long value) {
            addCriterion("parent_tr_id <", value, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_tr_id <=", value, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdIn(List<Long> values) {
            addCriterion("parent_tr_id in", values, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdNotIn(List<Long> values) {
            addCriterion("parent_tr_id not in", values, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdBetween(Long value1, Long value2) {
            addCriterion("parent_tr_id between", value1, value2, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andParentTrIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_tr_id not between", value1, value2, "parentTrId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNull() {
            addCriterion("gen_time is null");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNotNull() {
            addCriterion("gen_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenTimeEqualTo(Date value) {
            addCriterion("gen_time =", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotEqualTo(Date value) {
            addCriterion("gen_time <>", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThan(Date value) {
            addCriterion("gen_time >", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gen_time >=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThan(Date value) {
            addCriterion("gen_time <", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThanOrEqualTo(Date value) {
            addCriterion("gen_time <=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeIn(List<Date> values) {
            addCriterion("gen_time in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotIn(List<Date> values) {
            addCriterion("gen_time not in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeBetween(Date value1, Date value2) {
            addCriterion("gen_time between", value1, value2, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotBetween(Date value1, Date value2) {
            addCriterion("gen_time not between", value1, value2, "genTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andTrTagIsNull() {
            addCriterion("tr_Tag is null");
            return (Criteria) this;
        }

        public Criteria andTrTagIsNotNull() {
            addCriterion("tr_Tag is not null");
            return (Criteria) this;
        }

        public Criteria andTrTagEqualTo(String value) {
            addCriterion("tr_Tag =", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagNotEqualTo(String value) {
            addCriterion("tr_Tag <>", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagGreaterThan(String value) {
            addCriterion("tr_Tag >", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagGreaterThanOrEqualTo(String value) {
            addCriterion("tr_Tag >=", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagLessThan(String value) {
            addCriterion("tr_Tag <", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagLessThanOrEqualTo(String value) {
            addCriterion("tr_Tag <=", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagLike(String value) {
            addCriterion("tr_Tag like", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagNotLike(String value) {
            addCriterion("tr_Tag not like", value, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagIn(List<String> values) {
            addCriterion("tr_Tag in", values, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagNotIn(List<String> values) {
            addCriterion("tr_Tag not in", values, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagBetween(String value1, String value2) {
            addCriterion("tr_Tag between", value1, value2, "trTag");
            return (Criteria) this;
        }

        public Criteria andTrTagNotBetween(String value1, String value2) {
            addCriterion("tr_Tag not between", value1, value2, "trTag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_role
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
     * This class corresponds to the database table t_role
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