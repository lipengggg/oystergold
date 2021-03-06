package com.itoystergold.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeployClsbankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeployClsbankExample() {
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

        public Criteria andClsbankNoIsNull() {
            addCriterion("CLSBANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andClsbankNoIsNotNull() {
            addCriterion("CLSBANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClsbankNoEqualTo(String value) {
            addCriterion("CLSBANK_NO =", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoNotEqualTo(String value) {
            addCriterion("CLSBANK_NO <>", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoGreaterThan(String value) {
            addCriterion("CLSBANK_NO >", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoGreaterThanOrEqualTo(String value) {
            addCriterion("CLSBANK_NO >=", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoLessThan(String value) {
            addCriterion("CLSBANK_NO <", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoLessThanOrEqualTo(String value) {
            addCriterion("CLSBANK_NO <=", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoLike(String value) {
            addCriterion("CLSBANK_NO like", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoNotLike(String value) {
            addCriterion("CLSBANK_NO not like", value, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoIn(List<String> values) {
            addCriterion("CLSBANK_NO in", values, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoNotIn(List<String> values) {
            addCriterion("CLSBANK_NO not in", values, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoBetween(String value1, String value2) {
            addCriterion("CLSBANK_NO between", value1, value2, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andClsbankNoNotBetween(String value1, String value2) {
            addCriterion("CLSBANK_NO not between", value1, value2, "clsbankNo");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("BANK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("BANK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("BANK_TYPE =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("BANK_TYPE <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("BANK_TYPE >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TYPE >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("BANK_TYPE <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("BANK_TYPE <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("BANK_TYPE like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("BANK_TYPE not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("BANK_TYPE in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("BANK_TYPE not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("BANK_TYPE between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("BANK_TYPE not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankStatusIsNull() {
            addCriterion("BANK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBankStatusIsNotNull() {
            addCriterion("BANK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBankStatusEqualTo(String value) {
            addCriterion("BANK_STATUS =", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusNotEqualTo(String value) {
            addCriterion("BANK_STATUS <>", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusGreaterThan(String value) {
            addCriterion("BANK_STATUS >", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_STATUS >=", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusLessThan(String value) {
            addCriterion("BANK_STATUS <", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusLessThanOrEqualTo(String value) {
            addCriterion("BANK_STATUS <=", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusLike(String value) {
            addCriterion("BANK_STATUS like", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusNotLike(String value) {
            addCriterion("BANK_STATUS not like", value, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusIn(List<String> values) {
            addCriterion("BANK_STATUS in", values, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusNotIn(List<String> values) {
            addCriterion("BANK_STATUS not in", values, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusBetween(String value1, String value2) {
            addCriterion("BANK_STATUS between", value1, value2, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankStatusNotBetween(String value1, String value2) {
            addCriterion("BANK_STATUS not between", value1, value2, "bankStatus");
            return (Criteria) this;
        }

        public Criteria andBankSeqIsNull() {
            addCriterion("BANK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBankSeqIsNotNull() {
            addCriterion("BANK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBankSeqEqualTo(String value) {
            addCriterion("BANK_SEQ =", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotEqualTo(String value) {
            addCriterion("BANK_SEQ <>", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqGreaterThan(String value) {
            addCriterion("BANK_SEQ >", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_SEQ >=", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqLessThan(String value) {
            addCriterion("BANK_SEQ <", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqLessThanOrEqualTo(String value) {
            addCriterion("BANK_SEQ <=", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqLike(String value) {
            addCriterion("BANK_SEQ like", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotLike(String value) {
            addCriterion("BANK_SEQ not like", value, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqIn(List<String> values) {
            addCriterion("BANK_SEQ in", values, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotIn(List<String> values) {
            addCriterion("BANK_SEQ not in", values, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqBetween(String value1, String value2) {
            addCriterion("BANK_SEQ between", value1, value2, "bankSeq");
            return (Criteria) this;
        }

        public Criteria andBankSeqNotBetween(String value1, String value2) {
            addCriterion("BANK_SEQ not between", value1, value2, "bankSeq");
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