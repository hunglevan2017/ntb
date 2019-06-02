package com.saigonbpo.ntb.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KinhNghiemLamViecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KinhNghiemLamViecExample() {
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

        public Criteria andTentauIsNull() {
            addCriterion("tentau is null");
            return (Criteria) this;
        }

        public Criteria andTentauIsNotNull() {
            addCriterion("tentau is not null");
            return (Criteria) this;
        }

        public Criteria andTentauEqualTo(String value) {
            addCriterion("tentau =", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauNotEqualTo(String value) {
            addCriterion("tentau <>", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauGreaterThan(String value) {
            addCriterion("tentau >", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauGreaterThanOrEqualTo(String value) {
            addCriterion("tentau >=", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauLessThan(String value) {
            addCriterion("tentau <", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauLessThanOrEqualTo(String value) {
            addCriterion("tentau <=", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauLike(String value) {
            addCriterion("tentau like", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauNotLike(String value) {
            addCriterion("tentau not like", value, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauIn(List<String> values) {
            addCriterion("tentau in", values, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauNotIn(List<String> values) {
            addCriterion("tentau not in", values, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauBetween(String value1, String value2) {
            addCriterion("tentau between", value1, value2, "tentau");
            return (Criteria) this;
        }

        public Criteria andTentauNotBetween(String value1, String value2) {
            addCriterion("tentau not between", value1, value2, "tentau");
            return (Criteria) this;
        }

        public Criteria andLoaitauIsNull() {
            addCriterion("loaitau is null");
            return (Criteria) this;
        }

        public Criteria andLoaitauIsNotNull() {
            addCriterion("loaitau is not null");
            return (Criteria) this;
        }

        public Criteria andLoaitauEqualTo(Integer value) {
            addCriterion("loaitau =", value, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauNotEqualTo(Integer value) {
            addCriterion("loaitau <>", value, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauGreaterThan(Integer value) {
            addCriterion("loaitau >", value, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauGreaterThanOrEqualTo(Integer value) {
            addCriterion("loaitau >=", value, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauLessThan(Integer value) {
            addCriterion("loaitau <", value, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauLessThanOrEqualTo(Integer value) {
            addCriterion("loaitau <=", value, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauIn(List<Integer> values) {
            addCriterion("loaitau in", values, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauNotIn(List<Integer> values) {
            addCriterion("loaitau not in", values, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauBetween(Integer value1, Integer value2) {
            addCriterion("loaitau between", value1, value2, "loaitau");
            return (Criteria) this;
        }

        public Criteria andLoaitauNotBetween(Integer value1, Integer value2) {
            addCriterion("loaitau not between", value1, value2, "loaitau");
            return (Criteria) this;
        }

        public Criteria andTencongtyIsNull() {
            addCriterion("tencongty is null");
            return (Criteria) this;
        }

        public Criteria andTencongtyIsNotNull() {
            addCriterion("tencongty is not null");
            return (Criteria) this;
        }

        public Criteria andTencongtyEqualTo(String value) {
            addCriterion("tencongty =", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyNotEqualTo(String value) {
            addCriterion("tencongty <>", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyGreaterThan(String value) {
            addCriterion("tencongty >", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyGreaterThanOrEqualTo(String value) {
            addCriterion("tencongty >=", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyLessThan(String value) {
            addCriterion("tencongty <", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyLessThanOrEqualTo(String value) {
            addCriterion("tencongty <=", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyLike(String value) {
            addCriterion("tencongty like", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyNotLike(String value) {
            addCriterion("tencongty not like", value, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyIn(List<String> values) {
            addCriterion("tencongty in", values, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyNotIn(List<String> values) {
            addCriterion("tencongty not in", values, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyBetween(String value1, String value2) {
            addCriterion("tencongty between", value1, value2, "tencongty");
            return (Criteria) this;
        }

        public Criteria andTencongtyNotBetween(String value1, String value2) {
            addCriterion("tencongty not between", value1, value2, "tencongty");
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

        public Criteria andGhichuIsNull() {
            addCriterion("ghichu is null");
            return (Criteria) this;
        }

        public Criteria andGhichuIsNotNull() {
            addCriterion("ghichu is not null");
            return (Criteria) this;
        }

        public Criteria andGhichuEqualTo(String value) {
            addCriterion("ghichu =", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotEqualTo(String value) {
            addCriterion("ghichu <>", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuGreaterThan(String value) {
            addCriterion("ghichu >", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuGreaterThanOrEqualTo(String value) {
            addCriterion("ghichu >=", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuLessThan(String value) {
            addCriterion("ghichu <", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuLessThanOrEqualTo(String value) {
            addCriterion("ghichu <=", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuLike(String value) {
            addCriterion("ghichu like", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotLike(String value) {
            addCriterion("ghichu not like", value, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuIn(List<String> values) {
            addCriterion("ghichu in", values, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotIn(List<String> values) {
            addCriterion("ghichu not in", values, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuBetween(String value1, String value2) {
            addCriterion("ghichu between", value1, value2, "ghichu");
            return (Criteria) this;
        }

        public Criteria andGhichuNotBetween(String value1, String value2) {
            addCriterion("ghichu not between", value1, value2, "ghichu");
            return (Criteria) this;
        }

        public Criteria andChucdanhIsNull() {
            addCriterion("chucdanh is null");
            return (Criteria) this;
        }

        public Criteria andChucdanhIsNotNull() {
            addCriterion("chucdanh is not null");
            return (Criteria) this;
        }

        public Criteria andChucdanhEqualTo(String value) {
            addCriterion("chucdanh =", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhNotEqualTo(String value) {
            addCriterion("chucdanh <>", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhGreaterThan(String value) {
            addCriterion("chucdanh >", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhGreaterThanOrEqualTo(String value) {
            addCriterion("chucdanh >=", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhLessThan(String value) {
            addCriterion("chucdanh <", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhLessThanOrEqualTo(String value) {
            addCriterion("chucdanh <=", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhLike(String value) {
            addCriterion("chucdanh like", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhNotLike(String value) {
            addCriterion("chucdanh not like", value, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhIn(List<String> values) {
            addCriterion("chucdanh in", values, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhNotIn(List<String> values) {
            addCriterion("chucdanh not in", values, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhBetween(String value1, String value2) {
            addCriterion("chucdanh between", value1, value2, "chucdanh");
            return (Criteria) this;
        }

        public Criteria andChucdanhNotBetween(String value1, String value2) {
            addCriterion("chucdanh not between", value1, value2, "chucdanh");
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

        public Criteria andMycompanyIsNull() {
            addCriterion("mycompany is null");
            return (Criteria) this;
        }

        public Criteria andMycompanyIsNotNull() {
            addCriterion("mycompany is not null");
            return (Criteria) this;
        }

        public Criteria andMycompanyEqualTo(Integer value) {
            addCriterion("mycompany =", value, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyNotEqualTo(Integer value) {
            addCriterion("mycompany <>", value, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyGreaterThan(Integer value) {
            addCriterion("mycompany >", value, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mycompany >=", value, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyLessThan(Integer value) {
            addCriterion("mycompany <", value, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyLessThanOrEqualTo(Integer value) {
            addCriterion("mycompany <=", value, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyIn(List<Integer> values) {
            addCriterion("mycompany in", values, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyNotIn(List<Integer> values) {
            addCriterion("mycompany not in", values, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyBetween(Integer value1, Integer value2) {
            addCriterion("mycompany between", value1, value2, "mycompany");
            return (Criteria) this;
        }

        public Criteria andMycompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("mycompany not between", value1, value2, "mycompany");
            return (Criteria) this;
        }

        public Criteria andTrongtaiIsNull() {
            addCriterion("trongtai is null");
            return (Criteria) this;
        }

        public Criteria andTrongtaiIsNotNull() {
            addCriterion("trongtai is not null");
            return (Criteria) this;
        }

        public Criteria andTrongtaiEqualTo(String value) {
            addCriterion("trongtai =", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotEqualTo(String value) {
            addCriterion("trongtai <>", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiGreaterThan(String value) {
            addCriterion("trongtai >", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiGreaterThanOrEqualTo(String value) {
            addCriterion("trongtai >=", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiLessThan(String value) {
            addCriterion("trongtai <", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiLessThanOrEqualTo(String value) {
            addCriterion("trongtai <=", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiLike(String value) {
            addCriterion("trongtai like", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotLike(String value) {
            addCriterion("trongtai not like", value, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiIn(List<String> values) {
            addCriterion("trongtai in", values, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotIn(List<String> values) {
            addCriterion("trongtai not in", values, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiBetween(String value1, String value2) {
            addCriterion("trongtai between", value1, value2, "trongtai");
            return (Criteria) this;
        }

        public Criteria andTrongtaiNotBetween(String value1, String value2) {
            addCriterion("trongtai not between", value1, value2, "trongtai");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayIsNull() {
            addCriterion("congsuatmay is null");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayIsNotNull() {
            addCriterion("congsuatmay is not null");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayEqualTo(String value) {
            addCriterion("congsuatmay =", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotEqualTo(String value) {
            addCriterion("congsuatmay <>", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayGreaterThan(String value) {
            addCriterion("congsuatmay >", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayGreaterThanOrEqualTo(String value) {
            addCriterion("congsuatmay >=", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayLessThan(String value) {
            addCriterion("congsuatmay <", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayLessThanOrEqualTo(String value) {
            addCriterion("congsuatmay <=", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayLike(String value) {
            addCriterion("congsuatmay like", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotLike(String value) {
            addCriterion("congsuatmay not like", value, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayIn(List<String> values) {
            addCriterion("congsuatmay in", values, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotIn(List<String> values) {
            addCriterion("congsuatmay not in", values, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayBetween(String value1, String value2) {
            addCriterion("congsuatmay between", value1, value2, "congsuatmay");
            return (Criteria) this;
        }

        public Criteria andCongsuatmayNotBetween(String value1, String value2) {
            addCriterion("congsuatmay not between", value1, value2, "congsuatmay");
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