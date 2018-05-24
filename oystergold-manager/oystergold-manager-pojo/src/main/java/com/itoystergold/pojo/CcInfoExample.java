package com.itoystergold.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CcInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CcInfoExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCtelephoneIsNull() {
            addCriterion("ctelephone is null");
            return (Criteria) this;
        }

        public Criteria andCtelephoneIsNotNull() {
            addCriterion("ctelephone is not null");
            return (Criteria) this;
        }

        public Criteria andCtelephoneEqualTo(String value) {
            addCriterion("ctelephone =", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneNotEqualTo(String value) {
            addCriterion("ctelephone <>", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneGreaterThan(String value) {
            addCriterion("ctelephone >", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ctelephone >=", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneLessThan(String value) {
            addCriterion("ctelephone <", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneLessThanOrEqualTo(String value) {
            addCriterion("ctelephone <=", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneLike(String value) {
            addCriterion("ctelephone like", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneNotLike(String value) {
            addCriterion("ctelephone not like", value, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneIn(List<String> values) {
            addCriterion("ctelephone in", values, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneNotIn(List<String> values) {
            addCriterion("ctelephone not in", values, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneBetween(String value1, String value2) {
            addCriterion("ctelephone between", value1, value2, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCtelephoneNotBetween(String value1, String value2) {
            addCriterion("ctelephone not between", value1, value2, "ctelephone");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCvidIsNull() {
            addCriterion("cvid is null");
            return (Criteria) this;
        }

        public Criteria andCvidIsNotNull() {
            addCriterion("cvid is not null");
            return (Criteria) this;
        }

        public Criteria andCvidEqualTo(String value) {
            addCriterion("cvid =", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotEqualTo(String value) {
            addCriterion("cvid <>", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidGreaterThan(String value) {
            addCriterion("cvid >", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidGreaterThanOrEqualTo(String value) {
            addCriterion("cvid >=", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidLessThan(String value) {
            addCriterion("cvid <", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidLessThanOrEqualTo(String value) {
            addCriterion("cvid <=", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidLike(String value) {
            addCriterion("cvid like", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotLike(String value) {
            addCriterion("cvid not like", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidIn(List<String> values) {
            addCriterion("cvid in", values, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotIn(List<String> values) {
            addCriterion("cvid not in", values, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidBetween(String value1, String value2) {
            addCriterion("cvid between", value1, value2, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotBetween(String value1, String value2) {
            addCriterion("cvid not between", value1, value2, "cvid");
            return (Criteria) this;
        }

        public Criteria andCparamIsNull() {
            addCriterion("cparam is null");
            return (Criteria) this;
        }

        public Criteria andCparamIsNotNull() {
            addCriterion("cparam is not null");
            return (Criteria) this;
        }

        public Criteria andCparamEqualTo(String value) {
            addCriterion("cparam =", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamNotEqualTo(String value) {
            addCriterion("cparam <>", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamGreaterThan(String value) {
            addCriterion("cparam >", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamGreaterThanOrEqualTo(String value) {
            addCriterion("cparam >=", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamLessThan(String value) {
            addCriterion("cparam <", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamLessThanOrEqualTo(String value) {
            addCriterion("cparam <=", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamLike(String value) {
            addCriterion("cparam like", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamNotLike(String value) {
            addCriterion("cparam not like", value, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamIn(List<String> values) {
            addCriterion("cparam in", values, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamNotIn(List<String> values) {
            addCriterion("cparam not in", values, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamBetween(String value1, String value2) {
            addCriterion("cparam between", value1, value2, "cparam");
            return (Criteria) this;
        }

        public Criteria andCparamNotBetween(String value1, String value2) {
            addCriterion("cparam not between", value1, value2, "cparam");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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