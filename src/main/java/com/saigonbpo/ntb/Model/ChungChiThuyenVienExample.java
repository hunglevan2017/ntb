package com.saigonbpo.ntb.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChungChiThuyenVienExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChungChiThuyenVienExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIsNull() {
            addCriterion("thuyenvienID is null");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIsNotNull() {
            addCriterion("thuyenvienID is not null");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidEqualTo(Integer value) {
            addCriterion("thuyenvienID =", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotEqualTo(Integer value) {
            addCriterion("thuyenvienID <>", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidGreaterThan(Integer value) {
            addCriterion("thuyenvienID >", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidGreaterThanOrEqualTo(Integer value) {
            addCriterion("thuyenvienID >=", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidLessThan(Integer value) {
            addCriterion("thuyenvienID <", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidLessThanOrEqualTo(Integer value) {
            addCriterion("thuyenvienID <=", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIn(List<Integer> values) {
            addCriterion("thuyenvienID in", values, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotIn(List<Integer> values) {
            addCriterion("thuyenvienID not in", values, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidBetween(Integer value1, Integer value2) {
            addCriterion("thuyenvienID between", value1, value2, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotBetween(Integer value1, Integer value2) {
            addCriterion("thuyenvienID not between", value1, value2, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalIsNull() {
            addCriterion("tenchungchiVAL is null");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalIsNotNull() {
            addCriterion("tenchungchiVAL is not null");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalEqualTo(Integer value) {
            addCriterion("tenchungchiVAL =", value, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalNotEqualTo(Integer value) {
            addCriterion("tenchungchiVAL <>", value, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalGreaterThan(Integer value) {
            addCriterion("tenchungchiVAL >", value, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalGreaterThanOrEqualTo(Integer value) {
            addCriterion("tenchungchiVAL >=", value, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalLessThan(Integer value) {
            addCriterion("tenchungchiVAL <", value, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalLessThanOrEqualTo(Integer value) {
            addCriterion("tenchungchiVAL <=", value, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalIn(List<Integer> values) {
            addCriterion("tenchungchiVAL in", values, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalNotIn(List<Integer> values) {
            addCriterion("tenchungchiVAL not in", values, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalBetween(Integer value1, Integer value2) {
            addCriterion("tenchungchiVAL between", value1, value2, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andTenchungchivalNotBetween(Integer value1, Integer value2) {
            addCriterion("tenchungchiVAL not between", value1, value2, "tenchungchival");
            return (Criteria) this;
        }

        public Criteria andSoIsNull() {
            addCriterion("so is null");
            return (Criteria) this;
        }

        public Criteria andSoIsNotNull() {
            addCriterion("so is not null");
            return (Criteria) this;
        }

        public Criteria andSoEqualTo(String value) {
            addCriterion("so =", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotEqualTo(String value) {
            addCriterion("so <>", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoGreaterThan(String value) {
            addCriterion("so >", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoGreaterThanOrEqualTo(String value) {
            addCriterion("so >=", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLessThan(String value) {
            addCriterion("so <", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLessThanOrEqualTo(String value) {
            addCriterion("so <=", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLike(String value) {
            addCriterion("so like", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotLike(String value) {
            addCriterion("so not like", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoIn(List<String> values) {
            addCriterion("so in", values, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotIn(List<String> values) {
            addCriterion("so not in", values, "so");
            return (Criteria) this;
        }

        public Criteria andSoBetween(String value1, String value2) {
            addCriterion("so between", value1, value2, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotBetween(String value1, String value2) {
            addCriterion("so not between", value1, value2, "so");
            return (Criteria) this;
        }

        public Criteria andTungayIsNull() {
            addCriterion("tungay is null");
            return (Criteria) this;
        }

        public Criteria andTungayIsNotNull() {
            addCriterion("tungay is not null");
            return (Criteria) this;
        }

        public Criteria andTungayEqualTo(Date value) {
            addCriterion("tungay =", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotEqualTo(Date value) {
            addCriterion("tungay <>", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayGreaterThan(Date value) {
            addCriterion("tungay >", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayGreaterThanOrEqualTo(Date value) {
            addCriterion("tungay >=", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLessThan(Date value) {
            addCriterion("tungay <", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLessThanOrEqualTo(Date value) {
            addCriterion("tungay <=", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayIn(List<Date> values) {
            addCriterion("tungay in", values, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotIn(List<Date> values) {
            addCriterion("tungay not in", values, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayBetween(Date value1, Date value2) {
            addCriterion("tungay between", value1, value2, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotBetween(Date value1, Date value2) {
            addCriterion("tungay not between", value1, value2, "tungay");
            return (Criteria) this;
        }

        public Criteria andDenngayIsNull() {
            addCriterion("denngay is null");
            return (Criteria) this;
        }

        public Criteria andDenngayIsNotNull() {
            addCriterion("denngay is not null");
            return (Criteria) this;
        }

        public Criteria andDenngayEqualTo(Date value) {
            addCriterion("denngay =", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotEqualTo(Date value) {
            addCriterion("denngay <>", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayGreaterThan(Date value) {
            addCriterion("denngay >", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayGreaterThanOrEqualTo(Date value) {
            addCriterion("denngay >=", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLessThan(Date value) {
            addCriterion("denngay <", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLessThanOrEqualTo(Date value) {
            addCriterion("denngay <=", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayIn(List<Date> values) {
            addCriterion("denngay in", values, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotIn(List<Date> values) {
            addCriterion("denngay not in", values, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayBetween(Date value1, Date value2) {
            addCriterion("denngay between", value1, value2, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotBetween(Date value1, Date value2) {
            addCriterion("denngay not between", value1, value2, "denngay");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIsNull() {
            addCriterion("ngaytao is null");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIsNotNull() {
            addCriterion("ngaytao is not null");
            return (Criteria) this;
        }

        public Criteria andNgaytaoEqualTo(Date value) {
            addCriterion("ngaytao =", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotEqualTo(Date value) {
            addCriterion("ngaytao <>", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThan(Date value) {
            addCriterion("ngaytao >", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThanOrEqualTo(Date value) {
            addCriterion("ngaytao >=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThan(Date value) {
            addCriterion("ngaytao <", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThanOrEqualTo(Date value) {
            addCriterion("ngaytao <=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIn(List<Date> values) {
            addCriterion("ngaytao in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotIn(List<Date> values) {
            addCriterion("ngaytao not in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoBetween(Date value1, Date value2) {
            addCriterion("ngaytao between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotBetween(Date value1, Date value2) {
            addCriterion("ngaytao not between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidIsNull() {
            addCriterion("nguoitaoId is null");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidIsNotNull() {
            addCriterion("nguoitaoId is not null");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidEqualTo(Integer value) {
            addCriterion("nguoitaoId =", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidNotEqualTo(Integer value) {
            addCriterion("nguoitaoId <>", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidGreaterThan(Integer value) {
            addCriterion("nguoitaoId >", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nguoitaoId >=", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidLessThan(Integer value) {
            addCriterion("nguoitaoId <", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidLessThanOrEqualTo(Integer value) {
            addCriterion("nguoitaoId <=", value, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidIn(List<Integer> values) {
            addCriterion("nguoitaoId in", values, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidNotIn(List<Integer> values) {
            addCriterion("nguoitaoId not in", values, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidBetween(Integer value1, Integer value2) {
            addCriterion("nguoitaoId between", value1, value2, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNguoitaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("nguoitaoId not between", value1, value2, "nguoitaoid");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIsNull() {
            addCriterion("ngaycapnhat is null");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIsNotNull() {
            addCriterion("ngaycapnhat is not null");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatEqualTo(Date value) {
            addCriterion("ngaycapnhat =", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotEqualTo(Date value) {
            addCriterion("ngaycapnhat <>", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatGreaterThan(Date value) {
            addCriterion("ngaycapnhat >", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatGreaterThanOrEqualTo(Date value) {
            addCriterion("ngaycapnhat >=", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatLessThan(Date value) {
            addCriterion("ngaycapnhat <", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatLessThanOrEqualTo(Date value) {
            addCriterion("ngaycapnhat <=", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIn(List<Date> values) {
            addCriterion("ngaycapnhat in", values, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotIn(List<Date> values) {
            addCriterion("ngaycapnhat not in", values, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatBetween(Date value1, Date value2) {
            addCriterion("ngaycapnhat between", value1, value2, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotBetween(Date value1, Date value2) {
            addCriterion("ngaycapnhat not between", value1, value2, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidIsNull() {
            addCriterion("nguoicapnhatId is null");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidIsNotNull() {
            addCriterion("nguoicapnhatId is not null");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidEqualTo(Integer value) {
            addCriterion("nguoicapnhatId =", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidNotEqualTo(Integer value) {
            addCriterion("nguoicapnhatId <>", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidGreaterThan(Integer value) {
            addCriterion("nguoicapnhatId >", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nguoicapnhatId >=", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidLessThan(Integer value) {
            addCriterion("nguoicapnhatId <", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidLessThanOrEqualTo(Integer value) {
            addCriterion("nguoicapnhatId <=", value, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidIn(List<Integer> values) {
            addCriterion("nguoicapnhatId in", values, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidNotIn(List<Integer> values) {
            addCriterion("nguoicapnhatId not in", values, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidBetween(Integer value1, Integer value2) {
            addCriterion("nguoicapnhatId between", value1, value2, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andNguoicapnhatidNotBetween(Integer value1, Integer value2) {
            addCriterion("nguoicapnhatId not between", value1, value2, "nguoicapnhatid");
            return (Criteria) this;
        }

        public Criteria andHinhscanIsNull() {
            addCriterion("hinhscan is null");
            return (Criteria) this;
        }

        public Criteria andHinhscanIsNotNull() {
            addCriterion("hinhscan is not null");
            return (Criteria) this;
        }

        public Criteria andHinhscanEqualTo(Integer value) {
            addCriterion("hinhscan =", value, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanNotEqualTo(Integer value) {
            addCriterion("hinhscan <>", value, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanGreaterThan(Integer value) {
            addCriterion("hinhscan >", value, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanGreaterThanOrEqualTo(Integer value) {
            addCriterion("hinhscan >=", value, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanLessThan(Integer value) {
            addCriterion("hinhscan <", value, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanLessThanOrEqualTo(Integer value) {
            addCriterion("hinhscan <=", value, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanIn(List<Integer> values) {
            addCriterion("hinhscan in", values, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanNotIn(List<Integer> values) {
            addCriterion("hinhscan not in", values, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanBetween(Integer value1, Integer value2) {
            addCriterion("hinhscan between", value1, value2, "hinhscan");
            return (Criteria) this;
        }

        public Criteria andHinhscanNotBetween(Integer value1, Integer value2) {
            addCriterion("hinhscan not between", value1, value2, "hinhscan");
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