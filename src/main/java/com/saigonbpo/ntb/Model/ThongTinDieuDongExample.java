package com.saigonbpo.ntb.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ThongTinDieuDongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThongTinDieuDongExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTauidIsNull() {
            addCriterion("tauID is null");
            return (Criteria) this;
        }

        public Criteria andTauidIsNotNull() {
            addCriterion("tauID is not null");
            return (Criteria) this;
        }

        public Criteria andTauidEqualTo(Integer value) {
            addCriterion("tauID =", value, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidNotEqualTo(Integer value) {
            addCriterion("tauID <>", value, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidGreaterThan(Integer value) {
            addCriterion("tauID >", value, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tauID >=", value, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidLessThan(Integer value) {
            addCriterion("tauID <", value, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidLessThanOrEqualTo(Integer value) {
            addCriterion("tauID <=", value, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidIn(List<Integer> values) {
            addCriterion("tauID in", values, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidNotIn(List<Integer> values) {
            addCriterion("tauID not in", values, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidBetween(Integer value1, Integer value2) {
            addCriterion("tauID between", value1, value2, "tauid");
            return (Criteria) this;
        }

        public Criteria andTauidNotBetween(Integer value1, Integer value2) {
            addCriterion("tauID not between", value1, value2, "tauid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIsNull() {
            addCriterion("thuyenvienId is null");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIsNotNull() {
            addCriterion("thuyenvienId is not null");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidEqualTo(Integer value) {
            addCriterion("thuyenvienId =", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotEqualTo(Integer value) {
            addCriterion("thuyenvienId <>", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidGreaterThan(Integer value) {
            addCriterion("thuyenvienId >", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidGreaterThanOrEqualTo(Integer value) {
            addCriterion("thuyenvienId >=", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidLessThan(Integer value) {
            addCriterion("thuyenvienId <", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidLessThanOrEqualTo(Integer value) {
            addCriterion("thuyenvienId <=", value, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidIn(List<Integer> values) {
            addCriterion("thuyenvienId in", values, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotIn(List<Integer> values) {
            addCriterion("thuyenvienId not in", values, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidBetween(Integer value1, Integer value2) {
            addCriterion("thuyenvienId between", value1, value2, "thuyenvienid");
            return (Criteria) this;
        }

        public Criteria andThuyenvienidNotBetween(Integer value1, Integer value2) {
            addCriterion("thuyenvienId not between", value1, value2, "thuyenvienid");
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
            addCriterionForJDBCDate("tungay =", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotEqualTo(Date value) {
            addCriterionForJDBCDate("tungay <>", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayGreaterThan(Date value) {
            addCriterionForJDBCDate("tungay >", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tungay >=", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLessThan(Date value) {
            addCriterionForJDBCDate("tungay <", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tungay <=", value, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayIn(List<Date> values) {
            addCriterionForJDBCDate("tungay in", values, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotIn(List<Date> values) {
            addCriterionForJDBCDate("tungay not in", values, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tungay between", value1, value2, "tungay");
            return (Criteria) this;
        }

        public Criteria andTungayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tungay not between", value1, value2, "tungay");
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
            addCriterionForJDBCDate("denngay =", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotEqualTo(Date value) {
            addCriterionForJDBCDate("denngay <>", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayGreaterThan(Date value) {
            addCriterionForJDBCDate("denngay >", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("denngay >=", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLessThan(Date value) {
            addCriterionForJDBCDate("denngay <", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("denngay <=", value, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayIn(List<Date> values) {
            addCriterionForJDBCDate("denngay in", values, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotIn(List<Date> values) {
            addCriterionForJDBCDate("denngay not in", values, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("denngay between", value1, value2, "denngay");
            return (Criteria) this;
        }

        public Criteria andDenngayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("denngay not between", value1, value2, "denngay");
            return (Criteria) this;
        }

        public Criteria andGhichuonIsNull() {
            addCriterion("ghichuon is null");
            return (Criteria) this;
        }

        public Criteria andGhichuonIsNotNull() {
            addCriterion("ghichuon is not null");
            return (Criteria) this;
        }

        public Criteria andGhichuonEqualTo(String value) {
            addCriterion("ghichuon =", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonNotEqualTo(String value) {
            addCriterion("ghichuon <>", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonGreaterThan(String value) {
            addCriterion("ghichuon >", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonGreaterThanOrEqualTo(String value) {
            addCriterion("ghichuon >=", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonLessThan(String value) {
            addCriterion("ghichuon <", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonLessThanOrEqualTo(String value) {
            addCriterion("ghichuon <=", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonLike(String value) {
            addCriterion("ghichuon like", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonNotLike(String value) {
            addCriterion("ghichuon not like", value, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonIn(List<String> values) {
            addCriterion("ghichuon in", values, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonNotIn(List<String> values) {
            addCriterion("ghichuon not in", values, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonBetween(String value1, String value2) {
            addCriterion("ghichuon between", value1, value2, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuonNotBetween(String value1, String value2) {
            addCriterion("ghichuon not between", value1, value2, "ghichuon");
            return (Criteria) this;
        }

        public Criteria andGhichuoffIsNull() {
            addCriterion("ghichuoff is null");
            return (Criteria) this;
        }

        public Criteria andGhichuoffIsNotNull() {
            addCriterion("ghichuoff is not null");
            return (Criteria) this;
        }

        public Criteria andGhichuoffEqualTo(String value) {
            addCriterion("ghichuoff =", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffNotEqualTo(String value) {
            addCriterion("ghichuoff <>", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffGreaterThan(String value) {
            addCriterion("ghichuoff >", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffGreaterThanOrEqualTo(String value) {
            addCriterion("ghichuoff >=", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffLessThan(String value) {
            addCriterion("ghichuoff <", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffLessThanOrEqualTo(String value) {
            addCriterion("ghichuoff <=", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffLike(String value) {
            addCriterion("ghichuoff like", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffNotLike(String value) {
            addCriterion("ghichuoff not like", value, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffIn(List<String> values) {
            addCriterion("ghichuoff in", values, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffNotIn(List<String> values) {
            addCriterion("ghichuoff not in", values, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffBetween(String value1, String value2) {
            addCriterion("ghichuoff between", value1, value2, "ghichuoff");
            return (Criteria) this;
        }

        public Criteria andGhichuoffNotBetween(String value1, String value2) {
            addCriterion("ghichuoff not between", value1, value2, "ghichuoff");
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
            addCriterionForJDBCDate("ngaytao =", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngaytao <>", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThan(Date value) {
            addCriterionForJDBCDate("ngaytao >", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaytao >=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThan(Date value) {
            addCriterionForJDBCDate("ngaytao <", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaytao <=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIn(List<Date> values) {
            addCriterionForJDBCDate("ngaytao in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngaytao not in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaytao between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaytao not between", value1, value2, "ngaytao");
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
            addCriterionForJDBCDate("ngaycapnhat =", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngaycapnhat <>", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatGreaterThan(Date value) {
            addCriterionForJDBCDate("ngaycapnhat >", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaycapnhat >=", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatLessThan(Date value) {
            addCriterionForJDBCDate("ngaycapnhat <", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaycapnhat <=", value, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatIn(List<Date> values) {
            addCriterionForJDBCDate("ngaycapnhat in", values, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngaycapnhat not in", values, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaycapnhat between", value1, value2, "ngaycapnhat");
            return (Criteria) this;
        }

        public Criteria andNgaycapnhatNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaycapnhat not between", value1, value2, "ngaycapnhat");
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

        public Criteria andChucdanhidIsNull() {
            addCriterion("chucdanhId is null");
            return (Criteria) this;
        }

        public Criteria andChucdanhidIsNotNull() {
            addCriterion("chucdanhId is not null");
            return (Criteria) this;
        }

        public Criteria andChucdanhidEqualTo(Integer value) {
            addCriterion("chucdanhId =", value, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidNotEqualTo(Integer value) {
            addCriterion("chucdanhId <>", value, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidGreaterThan(Integer value) {
            addCriterion("chucdanhId >", value, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chucdanhId >=", value, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidLessThan(Integer value) {
            addCriterion("chucdanhId <", value, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidLessThanOrEqualTo(Integer value) {
            addCriterion("chucdanhId <=", value, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidIn(List<Integer> values) {
            addCriterion("chucdanhId in", values, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidNotIn(List<Integer> values) {
            addCriterion("chucdanhId not in", values, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidBetween(Integer value1, Integer value2) {
            addCriterion("chucdanhId between", value1, value2, "chucdanhid");
            return (Criteria) this;
        }

        public Criteria andChucdanhidNotBetween(Integer value1, Integer value2) {
            addCriterion("chucdanhId not between", value1, value2, "chucdanhid");
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