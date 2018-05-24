package com.itoystergold.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeployCardbinsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeployCardbinsExample() {
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

        public Criteria andBinIdIsNull() {
            addCriterion("BIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andBinIdIsNotNull() {
            addCriterion("BIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBinIdEqualTo(String value) {
            addCriterion("BIN_ID =", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotEqualTo(String value) {
            addCriterion("BIN_ID <>", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThan(String value) {
            addCriterion("BIN_ID >", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIN_ID >=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThan(String value) {
            addCriterion("BIN_ID <", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThanOrEqualTo(String value) {
            addCriterion("BIN_ID <=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLike(String value) {
            addCriterion("BIN_ID like", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotLike(String value) {
            addCriterion("BIN_ID not like", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdIn(List<String> values) {
            addCriterion("BIN_ID in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotIn(List<String> values) {
            addCriterion("BIN_ID not in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdBetween(String value1, String value2) {
            addCriterion("BIN_ID between", value1, value2, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotBetween(String value1, String value2) {
            addCriterion("BIN_ID not between", value1, value2, "binId");
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

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("BANK_ID like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("BANK_ID not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andCardbinIsNull() {
            addCriterion("CARDBIN is null");
            return (Criteria) this;
        }

        public Criteria andCardbinIsNotNull() {
            addCriterion("CARDBIN is not null");
            return (Criteria) this;
        }

        public Criteria andCardbinEqualTo(String value) {
            addCriterion("CARDBIN =", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinNotEqualTo(String value) {
            addCriterion("CARDBIN <>", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinGreaterThan(String value) {
            addCriterion("CARDBIN >", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinGreaterThanOrEqualTo(String value) {
            addCriterion("CARDBIN >=", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinLessThan(String value) {
            addCriterion("CARDBIN <", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinLessThanOrEqualTo(String value) {
            addCriterion("CARDBIN <=", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinLike(String value) {
            addCriterion("CARDBIN like", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinNotLike(String value) {
            addCriterion("CARDBIN not like", value, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinIn(List<String> values) {
            addCriterion("CARDBIN in", values, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinNotIn(List<String> values) {
            addCriterion("CARDBIN not in", values, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinBetween(String value1, String value2) {
            addCriterion("CARDBIN between", value1, value2, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardbinNotBetween(String value1, String value2) {
            addCriterion("CARDBIN not between", value1, value2, "cardbin");
            return (Criteria) this;
        }

        public Criteria andCardLengthIsNull() {
            addCriterion("CARD_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCardLengthIsNotNull() {
            addCriterion("CARD_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCardLengthEqualTo(String value) {
            addCriterion("CARD_LENGTH =", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthNotEqualTo(String value) {
            addCriterion("CARD_LENGTH <>", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthGreaterThan(String value) {
            addCriterion("CARD_LENGTH >", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_LENGTH >=", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthLessThan(String value) {
            addCriterion("CARD_LENGTH <", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthLessThanOrEqualTo(String value) {
            addCriterion("CARD_LENGTH <=", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthLike(String value) {
            addCriterion("CARD_LENGTH like", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthNotLike(String value) {
            addCriterion("CARD_LENGTH not like", value, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthIn(List<String> values) {
            addCriterion("CARD_LENGTH in", values, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthNotIn(List<String> values) {
            addCriterion("CARD_LENGTH not in", values, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthBetween(String value1, String value2) {
            addCriterion("CARD_LENGTH between", value1, value2, "cardLength");
            return (Criteria) this;
        }

        public Criteria andCardLengthNotBetween(String value1, String value2) {
            addCriterion("CARD_LENGTH not between", value1, value2, "cardLength");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
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