package com.itoystergold.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeployLevelSalaryRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeployLevelSalaryRuleExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rid like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rid not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNull() {
            addCriterion("levelid is null");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNotNull() {
            addCriterion("levelid is not null");
            return (Criteria) this;
        }

        public Criteria andLevelidEqualTo(String value) {
            addCriterion("levelid =", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotEqualTo(String value) {
            addCriterion("levelid <>", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThan(String value) {
            addCriterion("levelid >", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThanOrEqualTo(String value) {
            addCriterion("levelid >=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThan(String value) {
            addCriterion("levelid <", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThanOrEqualTo(String value) {
            addCriterion("levelid <=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLike(String value) {
            addCriterion("levelid like", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotLike(String value) {
            addCriterion("levelid not like", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidIn(List<String> values) {
            addCriterion("levelid in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotIn(List<String> values) {
            addCriterion("levelid not in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidBetween(String value1, String value2) {
            addCriterion("levelid between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotBetween(String value1, String value2) {
            addCriterion("levelid not between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateIsNull() {
            addCriterion("introduce_rate is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateIsNotNull() {
            addCriterion("introduce_rate is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateEqualTo(BigDecimal value) {
            addCriterion("introduce_rate =", value, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateNotEqualTo(BigDecimal value) {
            addCriterion("introduce_rate <>", value, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateGreaterThan(BigDecimal value) {
            addCriterion("introduce_rate >", value, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("introduce_rate >=", value, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateLessThan(BigDecimal value) {
            addCriterion("introduce_rate <", value, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("introduce_rate <=", value, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateIn(List<BigDecimal> values) {
            addCriterion("introduce_rate in", values, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateNotIn(List<BigDecimal> values) {
            addCriterion("introduce_rate not in", values, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("introduce_rate between", value1, value2, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andIntroduceRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("introduce_rate not between", value1, value2, "introduceRate");
            return (Criteria) this;
        }

        public Criteria andManageRateIsNull() {
            addCriterion("manage_rate is null");
            return (Criteria) this;
        }

        public Criteria andManageRateIsNotNull() {
            addCriterion("manage_rate is not null");
            return (Criteria) this;
        }

        public Criteria andManageRateEqualTo(BigDecimal value) {
            addCriterion("manage_rate =", value, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateNotEqualTo(BigDecimal value) {
            addCriterion("manage_rate <>", value, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateGreaterThan(BigDecimal value) {
            addCriterion("manage_rate >", value, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_rate >=", value, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateLessThan(BigDecimal value) {
            addCriterion("manage_rate <", value, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_rate <=", value, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateIn(List<BigDecimal> values) {
            addCriterion("manage_rate in", values, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateNotIn(List<BigDecimal> values) {
            addCriterion("manage_rate not in", values, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_rate between", value1, value2, "manageRate");
            return (Criteria) this;
        }

        public Criteria andManageRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_rate not between", value1, value2, "manageRate");
            return (Criteria) this;
        }

        public Criteria andServiceAmtIsNull() {
            addCriterion("service_amt is null");
            return (Criteria) this;
        }

        public Criteria andServiceAmtIsNotNull() {
            addCriterion("service_amt is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAmtEqualTo(BigDecimal value) {
            addCriterion("service_amt =", value, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtNotEqualTo(BigDecimal value) {
            addCriterion("service_amt <>", value, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtGreaterThan(BigDecimal value) {
            addCriterion("service_amt >", value, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_amt >=", value, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtLessThan(BigDecimal value) {
            addCriterion("service_amt <", value, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_amt <=", value, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtIn(List<BigDecimal> values) {
            addCriterion("service_amt in", values, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtNotIn(List<BigDecimal> values) {
            addCriterion("service_amt not in", values, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_amt between", value1, value2, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andServiceAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_amt not between", value1, value2, "serviceAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtIsNull() {
            addCriterion("subsidy_amt is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtIsNotNull() {
            addCriterion("subsidy_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtEqualTo(BigDecimal value) {
            addCriterion("subsidy_amt =", value, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtNotEqualTo(BigDecimal value) {
            addCriterion("subsidy_amt <>", value, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtGreaterThan(BigDecimal value) {
            addCriterion("subsidy_amt >", value, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidy_amt >=", value, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtLessThan(BigDecimal value) {
            addCriterion("subsidy_amt <", value, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subsidy_amt <=", value, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtIn(List<BigDecimal> values) {
            addCriterion("subsidy_amt in", values, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtNotIn(List<BigDecimal> values) {
            addCriterion("subsidy_amt not in", values, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidy_amt between", value1, value2, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subsidy_amt not between", value1, value2, "subsidyAmt");
            return (Criteria) this;
        }

        public Criteria andShareRateIsNull() {
            addCriterion("share_rate is null");
            return (Criteria) this;
        }

        public Criteria andShareRateIsNotNull() {
            addCriterion("share_rate is not null");
            return (Criteria) this;
        }

        public Criteria andShareRateEqualTo(BigDecimal value) {
            addCriterion("share_rate =", value, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateNotEqualTo(BigDecimal value) {
            addCriterion("share_rate <>", value, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateGreaterThan(BigDecimal value) {
            addCriterion("share_rate >", value, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_rate >=", value, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateLessThan(BigDecimal value) {
            addCriterion("share_rate <", value, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_rate <=", value, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateIn(List<BigDecimal> values) {
            addCriterion("share_rate in", values, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateNotIn(List<BigDecimal> values) {
            addCriterion("share_rate not in", values, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_rate between", value1, value2, "shareRate");
            return (Criteria) this;
        }

        public Criteria andShareRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_rate not between", value1, value2, "shareRate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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