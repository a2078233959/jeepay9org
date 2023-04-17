package org.jeepay.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayInterfaceExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public PayInterfaceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andIfCodeIsNull() {
            addCriterion("IfCode is null");
            return (Criteria) this;
        }

        public Criteria andIfCodeIsNotNull() {
            addCriterion("IfCode is not null");
            return (Criteria) this;
        }

        public Criteria andIfCodeEqualTo(String value) {
            addCriterion("IfCode =", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeNotEqualTo(String value) {
            addCriterion("IfCode <>", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeGreaterThan(String value) {
            addCriterion("IfCode >", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IfCode >=", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeLessThan(String value) {
            addCriterion("IfCode <", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeLessThanOrEqualTo(String value) {
            addCriterion("IfCode <=", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeLike(String value) {
            addCriterion("IfCode like", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeNotLike(String value) {
            addCriterion("IfCode not like", value, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeIn(List<String> values) {
            addCriterion("IfCode in", values, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeNotIn(List<String> values) {
            addCriterion("IfCode not in", values, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeBetween(String value1, String value2) {
            addCriterion("IfCode between", value1, value2, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfCodeNotBetween(String value1, String value2) {
            addCriterion("IfCode not between", value1, value2, "ifCode");
            return (Criteria) this;
        }

        public Criteria andIfNameIsNull() {
            addCriterion("IfName is null");
            return (Criteria) this;
        }

        public Criteria andIfNameIsNotNull() {
            addCriterion("IfName is not null");
            return (Criteria) this;
        }

        public Criteria andIfNameEqualTo(String value) {
            addCriterion("IfName =", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameNotEqualTo(String value) {
            addCriterion("IfName <>", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameGreaterThan(String value) {
            addCriterion("IfName >", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameGreaterThanOrEqualTo(String value) {
            addCriterion("IfName >=", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameLessThan(String value) {
            addCriterion("IfName <", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameLessThanOrEqualTo(String value) {
            addCriterion("IfName <=", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameLike(String value) {
            addCriterion("IfName like", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameNotLike(String value) {
            addCriterion("IfName not like", value, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameIn(List<String> values) {
            addCriterion("IfName in", values, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameNotIn(List<String> values) {
            addCriterion("IfName not in", values, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameBetween(String value1, String value2) {
            addCriterion("IfName between", value1, value2, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfNameNotBetween(String value1, String value2) {
            addCriterion("IfName not between", value1, value2, "ifName");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeIsNull() {
            addCriterion("IfTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeIsNotNull() {
            addCriterion("IfTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeEqualTo(String value) {
            addCriterion("IfTypeCode =", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeNotEqualTo(String value) {
            addCriterion("IfTypeCode <>", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeGreaterThan(String value) {
            addCriterion("IfTypeCode >", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IfTypeCode >=", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeLessThan(String value) {
            addCriterion("IfTypeCode <", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("IfTypeCode <=", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeLike(String value) {
            addCriterion("IfTypeCode like", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeNotLike(String value) {
            addCriterion("IfTypeCode not like", value, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeIn(List<String> values) {
            addCriterion("IfTypeCode in", values, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeNotIn(List<String> values) {
            addCriterion("IfTypeCode not in", values, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeBetween(String value1, String value2) {
            addCriterion("IfTypeCode between", value1, value2, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andIfTypeCodeNotBetween(String value1, String value2) {
            addCriterion("IfTypeCode not between", value1, value2, "ifTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PayType =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PayType <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PayType >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PayType >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PayType <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PayType <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PayType like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PayType not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PayType in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PayType not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PayType between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PayType not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("Scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("Scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(Byte value) {
            addCriterion("Scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(Byte value) {
            addCriterion("Scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(Byte value) {
            addCriterion("Scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(Byte value) {
            addCriterion("Scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(Byte value) {
            addCriterion("Scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(Byte value) {
            addCriterion("Scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<Byte> values) {
            addCriterion("Scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<Byte> values) {
            addCriterion("Scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(Byte value1, Byte value2) {
            addCriterion("Scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(Byte value1, Byte value2) {
            addCriterion("Scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andParamIsNull() {
            addCriterion("Param is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("Param is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(String value) {
            addCriterion("Param =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(String value) {
            addCriterion("Param <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(String value) {
            addCriterion("Param >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(String value) {
            addCriterion("Param >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(String value) {
            addCriterion("Param <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(String value) {
            addCriterion("Param <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLike(String value) {
            addCriterion("Param like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotLike(String value) {
            addCriterion("Param not like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<String> values) {
            addCriterion("Param in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<String> values) {
            addCriterion("Param not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(String value1, String value2) {
            addCriterion("Param between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(String value1, String value2) {
            addCriterion("Param not between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andExtraIsNull() {
            addCriterion("Extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("Extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("Extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("Extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("Extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("Extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("Extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("Extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("Extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("Extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("Extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("Extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("Extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("Extra not between", value1, value2, "extra");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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