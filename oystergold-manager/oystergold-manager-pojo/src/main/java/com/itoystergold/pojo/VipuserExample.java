package com.itoystergold.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VipuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipuserExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(String value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(String value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(String value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(String value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(String value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(String value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLike(String value) {
            addCriterion("vid like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotLike(String value) {
            addCriterion("vid not like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<String> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<String> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(String value1, String value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(String value1, String value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vname is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vname is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vname =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vname <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vname >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vname >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vname <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vname <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vname like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vname not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vname in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vname not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vname between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vname not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVusernameIsNull() {
            addCriterion("vusername is null");
            return (Criteria) this;
        }

        public Criteria andVusernameIsNotNull() {
            addCriterion("vusername is not null");
            return (Criteria) this;
        }

        public Criteria andVusernameEqualTo(String value) {
            addCriterion("vusername =", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotEqualTo(String value) {
            addCriterion("vusername <>", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameGreaterThan(String value) {
            addCriterion("vusername >", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameGreaterThanOrEqualTo(String value) {
            addCriterion("vusername >=", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameLessThan(String value) {
            addCriterion("vusername <", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameLessThanOrEqualTo(String value) {
            addCriterion("vusername <=", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameLike(String value) {
            addCriterion("vusername like", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotLike(String value) {
            addCriterion("vusername not like", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameIn(List<String> values) {
            addCriterion("vusername in", values, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotIn(List<String> values) {
            addCriterion("vusername not in", values, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameBetween(String value1, String value2) {
            addCriterion("vusername between", value1, value2, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotBetween(String value1, String value2) {
            addCriterion("vusername not between", value1, value2, "vusername");
            return (Criteria) this;
        }

        public Criteria andVtelephoneIsNull() {
            addCriterion("vtelephone is null");
            return (Criteria) this;
        }

        public Criteria andVtelephoneIsNotNull() {
            addCriterion("vtelephone is not null");
            return (Criteria) this;
        }

        public Criteria andVtelephoneEqualTo(String value) {
            addCriterion("vtelephone =", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneNotEqualTo(String value) {
            addCriterion("vtelephone <>", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneGreaterThan(String value) {
            addCriterion("vtelephone >", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("vtelephone >=", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneLessThan(String value) {
            addCriterion("vtelephone <", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneLessThanOrEqualTo(String value) {
            addCriterion("vtelephone <=", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneLike(String value) {
            addCriterion("vtelephone like", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneNotLike(String value) {
            addCriterion("vtelephone not like", value, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneIn(List<String> values) {
            addCriterion("vtelephone in", values, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneNotIn(List<String> values) {
            addCriterion("vtelephone not in", values, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneBetween(String value1, String value2) {
            addCriterion("vtelephone between", value1, value2, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVtelephoneNotBetween(String value1, String value2) {
            addCriterion("vtelephone not between", value1, value2, "vtelephone");
            return (Criteria) this;
        }

        public Criteria andVlevelIsNull() {
            addCriterion("vlevel is null");
            return (Criteria) this;
        }

        public Criteria andVlevelIsNotNull() {
            addCriterion("vlevel is not null");
            return (Criteria) this;
        }

        public Criteria andVlevelEqualTo(String value) {
            addCriterion("vlevel =", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelNotEqualTo(String value) {
            addCriterion("vlevel <>", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelGreaterThan(String value) {
            addCriterion("vlevel >", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelGreaterThanOrEqualTo(String value) {
            addCriterion("vlevel >=", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelLessThan(String value) {
            addCriterion("vlevel <", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelLessThanOrEqualTo(String value) {
            addCriterion("vlevel <=", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelLike(String value) {
            addCriterion("vlevel like", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelNotLike(String value) {
            addCriterion("vlevel not like", value, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelIn(List<String> values) {
            addCriterion("vlevel in", values, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelNotIn(List<String> values) {
            addCriterion("vlevel not in", values, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelBetween(String value1, String value2) {
            addCriterion("vlevel between", value1, value2, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVlevelNotBetween(String value1, String value2) {
            addCriterion("vlevel not between", value1, value2, "vlevel");
            return (Criteria) this;
        }

        public Criteria andVpasswordIsNull() {
            addCriterion("vpassword is null");
            return (Criteria) this;
        }

        public Criteria andVpasswordIsNotNull() {
            addCriterion("vpassword is not null");
            return (Criteria) this;
        }

        public Criteria andVpasswordEqualTo(String value) {
            addCriterion("vpassword =", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotEqualTo(String value) {
            addCriterion("vpassword <>", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordGreaterThan(String value) {
            addCriterion("vpassword >", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("vpassword >=", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordLessThan(String value) {
            addCriterion("vpassword <", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordLessThanOrEqualTo(String value) {
            addCriterion("vpassword <=", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordLike(String value) {
            addCriterion("vpassword like", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotLike(String value) {
            addCriterion("vpassword not like", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordIn(List<String> values) {
            addCriterion("vpassword in", values, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotIn(List<String> values) {
            addCriterion("vpassword not in", values, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordBetween(String value1, String value2) {
            addCriterion("vpassword between", value1, value2, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotBetween(String value1, String value2) {
            addCriterion("vpassword not between", value1, value2, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVcodeIsNull() {
            addCriterion("vcode is null");
            return (Criteria) this;
        }

        public Criteria andVcodeIsNotNull() {
            addCriterion("vcode is not null");
            return (Criteria) this;
        }

        public Criteria andVcodeEqualTo(String value) {
            addCriterion("vcode =", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeNotEqualTo(String value) {
            addCriterion("vcode <>", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeGreaterThan(String value) {
            addCriterion("vcode >", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeGreaterThanOrEqualTo(String value) {
            addCriterion("vcode >=", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeLessThan(String value) {
            addCriterion("vcode <", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeLessThanOrEqualTo(String value) {
            addCriterion("vcode <=", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeLike(String value) {
            addCriterion("vcode like", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeNotLike(String value) {
            addCriterion("vcode not like", value, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeIn(List<String> values) {
            addCriterion("vcode in", values, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeNotIn(List<String> values) {
            addCriterion("vcode not in", values, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeBetween(String value1, String value2) {
            addCriterion("vcode between", value1, value2, "vcode");
            return (Criteria) this;
        }

        public Criteria andVcodeNotBetween(String value1, String value2) {
            addCriterion("vcode not between", value1, value2, "vcode");
            return (Criteria) this;
        }

        public Criteria andVstatusIsNull() {
            addCriterion("vstatus is null");
            return (Criteria) this;
        }

        public Criteria andVstatusIsNotNull() {
            addCriterion("vstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVstatusEqualTo(String value) {
            addCriterion("vstatus =", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusNotEqualTo(String value) {
            addCriterion("vstatus <>", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusGreaterThan(String value) {
            addCriterion("vstatus >", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusGreaterThanOrEqualTo(String value) {
            addCriterion("vstatus >=", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusLessThan(String value) {
            addCriterion("vstatus <", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusLessThanOrEqualTo(String value) {
            addCriterion("vstatus <=", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusLike(String value) {
            addCriterion("vstatus like", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusNotLike(String value) {
            addCriterion("vstatus not like", value, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusIn(List<String> values) {
            addCriterion("vstatus in", values, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusNotIn(List<String> values) {
            addCriterion("vstatus not in", values, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusBetween(String value1, String value2) {
            addCriterion("vstatus between", value1, value2, "vstatus");
            return (Criteria) this;
        }

        public Criteria andVstatusNotBetween(String value1, String value2) {
            addCriterion("vstatus not between", value1, value2, "vstatus");
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