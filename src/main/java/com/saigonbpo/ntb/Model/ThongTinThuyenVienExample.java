package com.saigonbpo.ntb.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ThongTinThuyenVienExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThongTinThuyenVienExample() {
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

        public Criteria andHotenIsNull() {
            addCriterion("hoten is null");
            return (Criteria) this;
        }

        public Criteria andHotenIsNotNull() {
            addCriterion("hoten is not null");
            return (Criteria) this;
        }

        public Criteria andHotenEqualTo(String value) {
            addCriterion("hoten =", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenNotEqualTo(String value) {
            addCriterion("hoten <>", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenGreaterThan(String value) {
            addCriterion("hoten >", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenGreaterThanOrEqualTo(String value) {
            addCriterion("hoten >=", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenLessThan(String value) {
            addCriterion("hoten <", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenLessThanOrEqualTo(String value) {
            addCriterion("hoten <=", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenLike(String value) {
            addCriterion("hoten like", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenNotLike(String value) {
            addCriterion("hoten not like", value, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenIn(List<String> values) {
            addCriterion("hoten in", values, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenNotIn(List<String> values) {
            addCriterion("hoten not in", values, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenBetween(String value1, String value2) {
            addCriterion("hoten between", value1, value2, "hoten");
            return (Criteria) this;
        }

        public Criteria andHotenNotBetween(String value1, String value2) {
            addCriterion("hoten not between", value1, value2, "hoten");
            return (Criteria) this;
        }

        public Criteria andHinhIsNull() {
            addCriterion("hinh is null");
            return (Criteria) this;
        }

        public Criteria andHinhIsNotNull() {
            addCriterion("hinh is not null");
            return (Criteria) this;
        }

        public Criteria andHinhEqualTo(Integer value) {
            addCriterion("hinh =", value, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhNotEqualTo(Integer value) {
            addCriterion("hinh <>", value, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhGreaterThan(Integer value) {
            addCriterion("hinh >", value, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhGreaterThanOrEqualTo(Integer value) {
            addCriterion("hinh >=", value, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhLessThan(Integer value) {
            addCriterion("hinh <", value, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhLessThanOrEqualTo(Integer value) {
            addCriterion("hinh <=", value, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhIn(List<Integer> values) {
            addCriterion("hinh in", values, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhNotIn(List<Integer> values) {
            addCriterion("hinh not in", values, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhBetween(Integer value1, Integer value2) {
            addCriterion("hinh between", value1, value2, "hinh");
            return (Criteria) this;
        }

        public Criteria andHinhNotBetween(Integer value1, Integer value2) {
            addCriterion("hinh not between", value1, value2, "hinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhIsNull() {
            addCriterion("gioitinh is null");
            return (Criteria) this;
        }

        public Criteria andGioitinhIsNotNull() {
            addCriterion("gioitinh is not null");
            return (Criteria) this;
        }

        public Criteria andGioitinhEqualTo(Boolean value) {
            addCriterion("gioitinh =", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotEqualTo(Boolean value) {
            addCriterion("gioitinh <>", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhGreaterThan(Boolean value) {
            addCriterion("gioitinh >", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gioitinh >=", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLessThan(Boolean value) {
            addCriterion("gioitinh <", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLessThanOrEqualTo(Boolean value) {
            addCriterion("gioitinh <=", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhIn(List<Boolean> values) {
            addCriterion("gioitinh in", values, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotIn(List<Boolean> values) {
            addCriterion("gioitinh not in", values, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhBetween(Boolean value1, Boolean value2) {
            addCriterion("gioitinh between", value1, value2, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gioitinh not between", value1, value2, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhIsNull() {
            addCriterion("ngaysinh is null");
            return (Criteria) this;
        }

        public Criteria andNgaysinhIsNotNull() {
            addCriterion("ngaysinh is not null");
            return (Criteria) this;
        }

        public Criteria andNgaysinhEqualTo(Date value) {
            addCriterionForJDBCDate("ngaysinh =", value, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngaysinh <>", value, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhGreaterThan(Date value) {
            addCriterionForJDBCDate("ngaysinh >", value, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaysinh >=", value, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhLessThan(Date value) {
            addCriterionForJDBCDate("ngaysinh <", value, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaysinh <=", value, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhIn(List<Date> values) {
            addCriterionForJDBCDate("ngaysinh in", values, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngaysinh not in", values, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaysinh between", value1, value2, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNgaysinhNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaysinh not between", value1, value2, "ngaysinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhIsNull() {
            addCriterion("noisinh is null");
            return (Criteria) this;
        }

        public Criteria andNoisinhIsNotNull() {
            addCriterion("noisinh is not null");
            return (Criteria) this;
        }

        public Criteria andNoisinhEqualTo(String value) {
            addCriterion("noisinh =", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhNotEqualTo(String value) {
            addCriterion("noisinh <>", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhGreaterThan(String value) {
            addCriterion("noisinh >", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhGreaterThanOrEqualTo(String value) {
            addCriterion("noisinh >=", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhLessThan(String value) {
            addCriterion("noisinh <", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhLessThanOrEqualTo(String value) {
            addCriterion("noisinh <=", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhLike(String value) {
            addCriterion("noisinh like", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhNotLike(String value) {
            addCriterion("noisinh not like", value, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhIn(List<String> values) {
            addCriterion("noisinh in", values, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhNotIn(List<String> values) {
            addCriterion("noisinh not in", values, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhBetween(String value1, String value2) {
            addCriterion("noisinh between", value1, value2, "noisinh");
            return (Criteria) this;
        }

        public Criteria andNoisinhNotBetween(String value1, String value2) {
            addCriterion("noisinh not between", value1, value2, "noisinh");
            return (Criteria) this;
        }

        public Criteria andDtdidongIsNull() {
            addCriterion("dtdidong is null");
            return (Criteria) this;
        }

        public Criteria andDtdidongIsNotNull() {
            addCriterion("dtdidong is not null");
            return (Criteria) this;
        }

        public Criteria andDtdidongEqualTo(String value) {
            addCriterion("dtdidong =", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongNotEqualTo(String value) {
            addCriterion("dtdidong <>", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongGreaterThan(String value) {
            addCriterion("dtdidong >", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongGreaterThanOrEqualTo(String value) {
            addCriterion("dtdidong >=", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongLessThan(String value) {
            addCriterion("dtdidong <", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongLessThanOrEqualTo(String value) {
            addCriterion("dtdidong <=", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongLike(String value) {
            addCriterion("dtdidong like", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongNotLike(String value) {
            addCriterion("dtdidong not like", value, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongIn(List<String> values) {
            addCriterion("dtdidong in", values, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongNotIn(List<String> values) {
            addCriterion("dtdidong not in", values, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongBetween(String value1, String value2) {
            addCriterion("dtdidong between", value1, value2, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtdidongNotBetween(String value1, String value2) {
            addCriterion("dtdidong not between", value1, value2, "dtdidong");
            return (Criteria) this;
        }

        public Criteria andDtnhaIsNull() {
            addCriterion("dtnha is null");
            return (Criteria) this;
        }

        public Criteria andDtnhaIsNotNull() {
            addCriterion("dtnha is not null");
            return (Criteria) this;
        }

        public Criteria andDtnhaEqualTo(String value) {
            addCriterion("dtnha =", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaNotEqualTo(String value) {
            addCriterion("dtnha <>", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaGreaterThan(String value) {
            addCriterion("dtnha >", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaGreaterThanOrEqualTo(String value) {
            addCriterion("dtnha >=", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaLessThan(String value) {
            addCriterion("dtnha <", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaLessThanOrEqualTo(String value) {
            addCriterion("dtnha <=", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaLike(String value) {
            addCriterion("dtnha like", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaNotLike(String value) {
            addCriterion("dtnha not like", value, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaIn(List<String> values) {
            addCriterion("dtnha in", values, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaNotIn(List<String> values) {
            addCriterion("dtnha not in", values, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaBetween(String value1, String value2) {
            addCriterion("dtnha between", value1, value2, "dtnha");
            return (Criteria) this;
        }

        public Criteria andDtnhaNotBetween(String value1, String value2) {
            addCriterion("dtnha not between", value1, value2, "dtnha");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuIsNull() {
            addCriterion("diachitamchu is null");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuIsNotNull() {
            addCriterion("diachitamchu is not null");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuEqualTo(String value) {
            addCriterion("diachitamchu =", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuNotEqualTo(String value) {
            addCriterion("diachitamchu <>", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuGreaterThan(String value) {
            addCriterion("diachitamchu >", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuGreaterThanOrEqualTo(String value) {
            addCriterion("diachitamchu >=", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuLessThan(String value) {
            addCriterion("diachitamchu <", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuLessThanOrEqualTo(String value) {
            addCriterion("diachitamchu <=", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuLike(String value) {
            addCriterion("diachitamchu like", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuNotLike(String value) {
            addCriterion("diachitamchu not like", value, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuIn(List<String> values) {
            addCriterion("diachitamchu in", values, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuNotIn(List<String> values) {
            addCriterion("diachitamchu not in", values, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuBetween(String value1, String value2) {
            addCriterion("diachitamchu between", value1, value2, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andDiachitamchuNotBetween(String value1, String value2) {
            addCriterion("diachitamchu not between", value1, value2, "diachitamchu");
            return (Criteria) this;
        }

        public Criteria andCmndIsNull() {
            addCriterion("cmnd is null");
            return (Criteria) this;
        }

        public Criteria andCmndIsNotNull() {
            addCriterion("cmnd is not null");
            return (Criteria) this;
        }

        public Criteria andCmndEqualTo(String value) {
            addCriterion("cmnd =", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndNotEqualTo(String value) {
            addCriterion("cmnd <>", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndGreaterThan(String value) {
            addCriterion("cmnd >", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndGreaterThanOrEqualTo(String value) {
            addCriterion("cmnd >=", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndLessThan(String value) {
            addCriterion("cmnd <", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndLessThanOrEqualTo(String value) {
            addCriterion("cmnd <=", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndLike(String value) {
            addCriterion("cmnd like", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndNotLike(String value) {
            addCriterion("cmnd not like", value, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndIn(List<String> values) {
            addCriterion("cmnd in", values, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndNotIn(List<String> values) {
            addCriterion("cmnd not in", values, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndBetween(String value1, String value2) {
            addCriterion("cmnd between", value1, value2, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndNotBetween(String value1, String value2) {
            addCriterion("cmnd not between", value1, value2, "cmnd");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapIsNull() {
            addCriterion("cmndngaycap is null");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapIsNotNull() {
            addCriterion("cmndngaycap is not null");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapEqualTo(String value) {
            addCriterion("cmndngaycap =", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapNotEqualTo(String value) {
            addCriterion("cmndngaycap <>", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapGreaterThan(String value) {
            addCriterion("cmndngaycap >", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapGreaterThanOrEqualTo(String value) {
            addCriterion("cmndngaycap >=", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapLessThan(String value) {
            addCriterion("cmndngaycap <", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapLessThanOrEqualTo(String value) {
            addCriterion("cmndngaycap <=", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapLike(String value) {
            addCriterion("cmndngaycap like", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapNotLike(String value) {
            addCriterion("cmndngaycap not like", value, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapIn(List<String> values) {
            addCriterion("cmndngaycap in", values, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapNotIn(List<String> values) {
            addCriterion("cmndngaycap not in", values, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapBetween(String value1, String value2) {
            addCriterion("cmndngaycap between", value1, value2, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndngaycapNotBetween(String value1, String value2) {
            addCriterion("cmndngaycap not between", value1, value2, "cmndngaycap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapIsNull() {
            addCriterion("cmndnoicap is null");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapIsNotNull() {
            addCriterion("cmndnoicap is not null");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapEqualTo(String value) {
            addCriterion("cmndnoicap =", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapNotEqualTo(String value) {
            addCriterion("cmndnoicap <>", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapGreaterThan(String value) {
            addCriterion("cmndnoicap >", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapGreaterThanOrEqualTo(String value) {
            addCriterion("cmndnoicap >=", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapLessThan(String value) {
            addCriterion("cmndnoicap <", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapLessThanOrEqualTo(String value) {
            addCriterion("cmndnoicap <=", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapLike(String value) {
            addCriterion("cmndnoicap like", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapNotLike(String value) {
            addCriterion("cmndnoicap not like", value, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapIn(List<String> values) {
            addCriterion("cmndnoicap in", values, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapNotIn(List<String> values) {
            addCriterion("cmndnoicap not in", values, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapBetween(String value1, String value2) {
            addCriterion("cmndnoicap between", value1, value2, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andCmndnoicapNotBetween(String value1, String value2) {
            addCriterion("cmndnoicap not between", value1, value2, "cmndnoicap");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauIsNull() {
            addCriterion("diachihokhau is null");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauIsNotNull() {
            addCriterion("diachihokhau is not null");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauEqualTo(String value) {
            addCriterion("diachihokhau =", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauNotEqualTo(String value) {
            addCriterion("diachihokhau <>", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauGreaterThan(String value) {
            addCriterion("diachihokhau >", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauGreaterThanOrEqualTo(String value) {
            addCriterion("diachihokhau >=", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauLessThan(String value) {
            addCriterion("diachihokhau <", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauLessThanOrEqualTo(String value) {
            addCriterion("diachihokhau <=", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauLike(String value) {
            addCriterion("diachihokhau like", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauNotLike(String value) {
            addCriterion("diachihokhau not like", value, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauIn(List<String> values) {
            addCriterion("diachihokhau in", values, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauNotIn(List<String> values) {
            addCriterion("diachihokhau not in", values, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauBetween(String value1, String value2) {
            addCriterion("diachihokhau between", value1, value2, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andDiachihokhauNotBetween(String value1, String value2) {
            addCriterion("diachihokhau not between", value1, value2, "diachihokhau");
            return (Criteria) this;
        }

        public Criteria andBhxhIsNull() {
            addCriterion("bhxh is null");
            return (Criteria) this;
        }

        public Criteria andBhxhIsNotNull() {
            addCriterion("bhxh is not null");
            return (Criteria) this;
        }

        public Criteria andBhxhEqualTo(String value) {
            addCriterion("bhxh =", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhNotEqualTo(String value) {
            addCriterion("bhxh <>", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhGreaterThan(String value) {
            addCriterion("bhxh >", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhGreaterThanOrEqualTo(String value) {
            addCriterion("bhxh >=", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhLessThan(String value) {
            addCriterion("bhxh <", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhLessThanOrEqualTo(String value) {
            addCriterion("bhxh <=", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhLike(String value) {
            addCriterion("bhxh like", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhNotLike(String value) {
            addCriterion("bhxh not like", value, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhIn(List<String> values) {
            addCriterion("bhxh in", values, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhNotIn(List<String> values) {
            addCriterion("bhxh not in", values, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhBetween(String value1, String value2) {
            addCriterion("bhxh between", value1, value2, "bhxh");
            return (Criteria) this;
        }

        public Criteria andBhxhNotBetween(String value1, String value2) {
            addCriterion("bhxh not between", value1, value2, "bhxh");
            return (Criteria) this;
        }

        public Criteria andSolaodongIsNull() {
            addCriterion("solaodong is null");
            return (Criteria) this;
        }

        public Criteria andSolaodongIsNotNull() {
            addCriterion("solaodong is not null");
            return (Criteria) this;
        }

        public Criteria andSolaodongEqualTo(String value) {
            addCriterion("solaodong =", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongNotEqualTo(String value) {
            addCriterion("solaodong <>", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongGreaterThan(String value) {
            addCriterion("solaodong >", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongGreaterThanOrEqualTo(String value) {
            addCriterion("solaodong >=", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongLessThan(String value) {
            addCriterion("solaodong <", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongLessThanOrEqualTo(String value) {
            addCriterion("solaodong <=", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongLike(String value) {
            addCriterion("solaodong like", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongNotLike(String value) {
            addCriterion("solaodong not like", value, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongIn(List<String> values) {
            addCriterion("solaodong in", values, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongNotIn(List<String> values) {
            addCriterion("solaodong not in", values, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongBetween(String value1, String value2) {
            addCriterion("solaodong between", value1, value2, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongNotBetween(String value1, String value2) {
            addCriterion("solaodong not between", value1, value2, "solaodong");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapIsNull() {
            addCriterion("solaodongngaycap is null");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapIsNotNull() {
            addCriterion("solaodongngaycap is not null");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapEqualTo(Date value) {
            addCriterionForJDBCDate("solaodongngaycap =", value, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapNotEqualTo(Date value) {
            addCriterionForJDBCDate("solaodongngaycap <>", value, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapGreaterThan(Date value) {
            addCriterionForJDBCDate("solaodongngaycap >", value, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("solaodongngaycap >=", value, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapLessThan(Date value) {
            addCriterionForJDBCDate("solaodongngaycap <", value, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("solaodongngaycap <=", value, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapIn(List<Date> values) {
            addCriterionForJDBCDate("solaodongngaycap in", values, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapNotIn(List<Date> values) {
            addCriterionForJDBCDate("solaodongngaycap not in", values, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("solaodongngaycap between", value1, value2, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andSolaodongngaycapNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("solaodongngaycap not between", value1, value2, "solaodongngaycap");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanIsNull() {
            addCriterion("masothuecanhan is null");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanIsNotNull() {
            addCriterion("masothuecanhan is not null");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanEqualTo(String value) {
            addCriterion("masothuecanhan =", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanNotEqualTo(String value) {
            addCriterion("masothuecanhan <>", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanGreaterThan(String value) {
            addCriterion("masothuecanhan >", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanGreaterThanOrEqualTo(String value) {
            addCriterion("masothuecanhan >=", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanLessThan(String value) {
            addCriterion("masothuecanhan <", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanLessThanOrEqualTo(String value) {
            addCriterion("masothuecanhan <=", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanLike(String value) {
            addCriterion("masothuecanhan like", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanNotLike(String value) {
            addCriterion("masothuecanhan not like", value, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanIn(List<String> values) {
            addCriterion("masothuecanhan in", values, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanNotIn(List<String> values) {
            addCriterion("masothuecanhan not in", values, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanBetween(String value1, String value2) {
            addCriterion("masothuecanhan between", value1, value2, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andMasothuecanhanNotBetween(String value1, String value2) {
            addCriterion("masothuecanhan not between", value1, value2, "masothuecanhan");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocIsNull() {
            addCriterion("songuoidangkyphuthuoc is null");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocIsNotNull() {
            addCriterion("songuoidangkyphuthuoc is not null");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocEqualTo(String value) {
            addCriterion("songuoidangkyphuthuoc =", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocNotEqualTo(String value) {
            addCriterion("songuoidangkyphuthuoc <>", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocGreaterThan(String value) {
            addCriterion("songuoidangkyphuthuoc >", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocGreaterThanOrEqualTo(String value) {
            addCriterion("songuoidangkyphuthuoc >=", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocLessThan(String value) {
            addCriterion("songuoidangkyphuthuoc <", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocLessThanOrEqualTo(String value) {
            addCriterion("songuoidangkyphuthuoc <=", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocLike(String value) {
            addCriterion("songuoidangkyphuthuoc like", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocNotLike(String value) {
            addCriterion("songuoidangkyphuthuoc not like", value, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocIn(List<String> values) {
            addCriterion("songuoidangkyphuthuoc in", values, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocNotIn(List<String> values) {
            addCriterion("songuoidangkyphuthuoc not in", values, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocBetween(String value1, String value2) {
            addCriterion("songuoidangkyphuthuoc between", value1, value2, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andSonguoidangkyphuthuocNotBetween(String value1, String value2) {
            addCriterion("songuoidangkyphuthuoc not between", value1, value2, "songuoidangkyphuthuoc");
            return (Criteria) this;
        }

        public Criteria andChieucaoIsNull() {
            addCriterion("chieucao is null");
            return (Criteria) this;
        }

        public Criteria andChieucaoIsNotNull() {
            addCriterion("chieucao is not null");
            return (Criteria) this;
        }

        public Criteria andChieucaoEqualTo(String value) {
            addCriterion("chieucao =", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoNotEqualTo(String value) {
            addCriterion("chieucao <>", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoGreaterThan(String value) {
            addCriterion("chieucao >", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoGreaterThanOrEqualTo(String value) {
            addCriterion("chieucao >=", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoLessThan(String value) {
            addCriterion("chieucao <", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoLessThanOrEqualTo(String value) {
            addCriterion("chieucao <=", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoLike(String value) {
            addCriterion("chieucao like", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoNotLike(String value) {
            addCriterion("chieucao not like", value, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoIn(List<String> values) {
            addCriterion("chieucao in", values, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoNotIn(List<String> values) {
            addCriterion("chieucao not in", values, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoBetween(String value1, String value2) {
            addCriterion("chieucao between", value1, value2, "chieucao");
            return (Criteria) this;
        }

        public Criteria andChieucaoNotBetween(String value1, String value2) {
            addCriterion("chieucao not between", value1, value2, "chieucao");
            return (Criteria) this;
        }

        public Criteria andCannangIsNull() {
            addCriterion("cannang is null");
            return (Criteria) this;
        }

        public Criteria andCannangIsNotNull() {
            addCriterion("cannang is not null");
            return (Criteria) this;
        }

        public Criteria andCannangEqualTo(String value) {
            addCriterion("cannang =", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangNotEqualTo(String value) {
            addCriterion("cannang <>", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangGreaterThan(String value) {
            addCriterion("cannang >", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangGreaterThanOrEqualTo(String value) {
            addCriterion("cannang >=", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangLessThan(String value) {
            addCriterion("cannang <", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangLessThanOrEqualTo(String value) {
            addCriterion("cannang <=", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangLike(String value) {
            addCriterion("cannang like", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangNotLike(String value) {
            addCriterion("cannang not like", value, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangIn(List<String> values) {
            addCriterion("cannang in", values, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangNotIn(List<String> values) {
            addCriterion("cannang not in", values, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangBetween(String value1, String value2) {
            addCriterion("cannang between", value1, value2, "cannang");
            return (Criteria) this;
        }

        public Criteria andCannangNotBetween(String value1, String value2) {
            addCriterion("cannang not between", value1, value2, "cannang");
            return (Criteria) this;
        }

        public Criteria andNhommauIsNull() {
            addCriterion("nhommau is null");
            return (Criteria) this;
        }

        public Criteria andNhommauIsNotNull() {
            addCriterion("nhommau is not null");
            return (Criteria) this;
        }

        public Criteria andNhommauEqualTo(String value) {
            addCriterion("nhommau =", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauNotEqualTo(String value) {
            addCriterion("nhommau <>", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauGreaterThan(String value) {
            addCriterion("nhommau >", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauGreaterThanOrEqualTo(String value) {
            addCriterion("nhommau >=", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauLessThan(String value) {
            addCriterion("nhommau <", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauLessThanOrEqualTo(String value) {
            addCriterion("nhommau <=", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauLike(String value) {
            addCriterion("nhommau like", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauNotLike(String value) {
            addCriterion("nhommau not like", value, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauIn(List<String> values) {
            addCriterion("nhommau in", values, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauNotIn(List<String> values) {
            addCriterion("nhommau not in", values, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauBetween(String value1, String value2) {
            addCriterion("nhommau between", value1, value2, "nhommau");
            return (Criteria) this;
        }

        public Criteria andNhommauNotBetween(String value1, String value2) {
            addCriterion("nhommau not between", value1, value2, "nhommau");
            return (Criteria) this;
        }

        public Criteria andSizequanaoIsNull() {
            addCriterion("sizequanao is null");
            return (Criteria) this;
        }

        public Criteria andSizequanaoIsNotNull() {
            addCriterion("sizequanao is not null");
            return (Criteria) this;
        }

        public Criteria andSizequanaoEqualTo(Integer value) {
            addCriterion("sizequanao =", value, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoNotEqualTo(Integer value) {
            addCriterion("sizequanao <>", value, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoGreaterThan(Integer value) {
            addCriterion("sizequanao >", value, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sizequanao >=", value, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoLessThan(Integer value) {
            addCriterion("sizequanao <", value, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoLessThanOrEqualTo(Integer value) {
            addCriterion("sizequanao <=", value, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoIn(List<Integer> values) {
            addCriterion("sizequanao in", values, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoNotIn(List<Integer> values) {
            addCriterion("sizequanao not in", values, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoBetween(Integer value1, Integer value2) {
            addCriterion("sizequanao between", value1, value2, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizequanaoNotBetween(Integer value1, Integer value2) {
            addCriterion("sizequanao not between", value1, value2, "sizequanao");
            return (Criteria) this;
        }

        public Criteria andSizegiayIsNull() {
            addCriterion("sizegiay is null");
            return (Criteria) this;
        }

        public Criteria andSizegiayIsNotNull() {
            addCriterion("sizegiay is not null");
            return (Criteria) this;
        }

        public Criteria andSizegiayEqualTo(Integer value) {
            addCriterion("sizegiay =", value, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayNotEqualTo(Integer value) {
            addCriterion("sizegiay <>", value, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayGreaterThan(Integer value) {
            addCriterion("sizegiay >", value, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sizegiay >=", value, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayLessThan(Integer value) {
            addCriterion("sizegiay <", value, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayLessThanOrEqualTo(Integer value) {
            addCriterion("sizegiay <=", value, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayIn(List<Integer> values) {
            addCriterion("sizegiay in", values, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayNotIn(List<Integer> values) {
            addCriterion("sizegiay not in", values, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayBetween(Integer value1, Integer value2) {
            addCriterion("sizegiay between", value1, value2, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andSizegiayNotBetween(Integer value1, Integer value2) {
            addCriterion("sizegiay not between", value1, value2, "sizegiay");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongIsNull() {
            addCriterion("chichubaoholaodong is null");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongIsNotNull() {
            addCriterion("chichubaoholaodong is not null");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongEqualTo(String value) {
            addCriterion("chichubaoholaodong =", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongNotEqualTo(String value) {
            addCriterion("chichubaoholaodong <>", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongGreaterThan(String value) {
            addCriterion("chichubaoholaodong >", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongGreaterThanOrEqualTo(String value) {
            addCriterion("chichubaoholaodong >=", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongLessThan(String value) {
            addCriterion("chichubaoholaodong <", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongLessThanOrEqualTo(String value) {
            addCriterion("chichubaoholaodong <=", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongLike(String value) {
            addCriterion("chichubaoholaodong like", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongNotLike(String value) {
            addCriterion("chichubaoholaodong not like", value, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongIn(List<String> values) {
            addCriterion("chichubaoholaodong in", values, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongNotIn(List<String> values) {
            addCriterion("chichubaoholaodong not in", values, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongBetween(String value1, String value2) {
            addCriterion("chichubaoholaodong between", value1, value2, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andChichubaoholaodongNotBetween(String value1, String value2) {
            addCriterion("chichubaoholaodong not between", value1, value2, "chichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanIsNull() {
            addCriterion("tinhtranghonnhan is null");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanIsNotNull() {
            addCriterion("tinhtranghonnhan is not null");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanEqualTo(String value) {
            addCriterion("tinhtranghonnhan =", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanNotEqualTo(String value) {
            addCriterion("tinhtranghonnhan <>", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanGreaterThan(String value) {
            addCriterion("tinhtranghonnhan >", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanGreaterThanOrEqualTo(String value) {
            addCriterion("tinhtranghonnhan >=", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanLessThan(String value) {
            addCriterion("tinhtranghonnhan <", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanLessThanOrEqualTo(String value) {
            addCriterion("tinhtranghonnhan <=", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanLike(String value) {
            addCriterion("tinhtranghonnhan like", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanNotLike(String value) {
            addCriterion("tinhtranghonnhan not like", value, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanIn(List<String> values) {
            addCriterion("tinhtranghonnhan in", values, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanNotIn(List<String> values) {
            addCriterion("tinhtranghonnhan not in", values, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanBetween(String value1, String value2) {
            addCriterion("tinhtranghonnhan between", value1, value2, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andTinhtranghonnhanNotBetween(String value1, String value2) {
            addCriterion("tinhtranghonnhan not between", value1, value2, "tinhtranghonnhan");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangIsNull() {
            addCriterion("sotaikhoannganhang is null");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangIsNotNull() {
            addCriterion("sotaikhoannganhang is not null");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangEqualTo(String value) {
            addCriterion("sotaikhoannganhang =", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangNotEqualTo(String value) {
            addCriterion("sotaikhoannganhang <>", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangGreaterThan(String value) {
            addCriterion("sotaikhoannganhang >", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangGreaterThanOrEqualTo(String value) {
            addCriterion("sotaikhoannganhang >=", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangLessThan(String value) {
            addCriterion("sotaikhoannganhang <", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangLessThanOrEqualTo(String value) {
            addCriterion("sotaikhoannganhang <=", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangLike(String value) {
            addCriterion("sotaikhoannganhang like", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangNotLike(String value) {
            addCriterion("sotaikhoannganhang not like", value, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangIn(List<String> values) {
            addCriterion("sotaikhoannganhang in", values, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangNotIn(List<String> values) {
            addCriterion("sotaikhoannganhang not in", values, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangBetween(String value1, String value2) {
            addCriterion("sotaikhoannganhang between", value1, value2, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andSotaikhoannganhangNotBetween(String value1, String value2) {
            addCriterion("sotaikhoannganhang not between", value1, value2, "sotaikhoannganhang");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongIsNull() {
            addCriterion("diemhoihuong is null");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongIsNotNull() {
            addCriterion("diemhoihuong is not null");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongEqualTo(String value) {
            addCriterion("diemhoihuong =", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongNotEqualTo(String value) {
            addCriterion("diemhoihuong <>", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongGreaterThan(String value) {
            addCriterion("diemhoihuong >", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongGreaterThanOrEqualTo(String value) {
            addCriterion("diemhoihuong >=", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongLessThan(String value) {
            addCriterion("diemhoihuong <", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongLessThanOrEqualTo(String value) {
            addCriterion("diemhoihuong <=", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongLike(String value) {
            addCriterion("diemhoihuong like", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongNotLike(String value) {
            addCriterion("diemhoihuong not like", value, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongIn(List<String> values) {
            addCriterion("diemhoihuong in", values, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongNotIn(List<String> values) {
            addCriterion("diemhoihuong not in", values, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongBetween(String value1, String value2) {
            addCriterion("diemhoihuong between", value1, value2, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andDiemhoihuongNotBetween(String value1, String value2) {
            addCriterion("diemhoihuong not between", value1, value2, "diemhoihuong");
            return (Criteria) this;
        }

        public Criteria andSothichIsNull() {
            addCriterion("sothich is null");
            return (Criteria) this;
        }

        public Criteria andSothichIsNotNull() {
            addCriterion("sothich is not null");
            return (Criteria) this;
        }

        public Criteria andSothichEqualTo(String value) {
            addCriterion("sothich =", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichNotEqualTo(String value) {
            addCriterion("sothich <>", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichGreaterThan(String value) {
            addCriterion("sothich >", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichGreaterThanOrEqualTo(String value) {
            addCriterion("sothich >=", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichLessThan(String value) {
            addCriterion("sothich <", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichLessThanOrEqualTo(String value) {
            addCriterion("sothich <=", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichLike(String value) {
            addCriterion("sothich like", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichNotLike(String value) {
            addCriterion("sothich not like", value, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichIn(List<String> values) {
            addCriterion("sothich in", values, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichNotIn(List<String> values) {
            addCriterion("sothich not in", values, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichBetween(String value1, String value2) {
            addCriterion("sothich between", value1, value2, "sothich");
            return (Criteria) this;
        }

        public Criteria andSothichNotBetween(String value1, String value2) {
            addCriterion("sothich not between", value1, value2, "sothich");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongIsNull() {
            addCriterion("tinhtrangdieudong is null");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongIsNotNull() {
            addCriterion("tinhtrangdieudong is not null");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongEqualTo(Integer value) {
            addCriterion("tinhtrangdieudong =", value, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongNotEqualTo(Integer value) {
            addCriterion("tinhtrangdieudong <>", value, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongGreaterThan(Integer value) {
            addCriterion("tinhtrangdieudong >", value, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongGreaterThanOrEqualTo(Integer value) {
            addCriterion("tinhtrangdieudong >=", value, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongLessThan(Integer value) {
            addCriterion("tinhtrangdieudong <", value, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongLessThanOrEqualTo(Integer value) {
            addCriterion("tinhtrangdieudong <=", value, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongIn(List<Integer> values) {
            addCriterion("tinhtrangdieudong in", values, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongNotIn(List<Integer> values) {
            addCriterion("tinhtrangdieudong not in", values, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongBetween(Integer value1, Integer value2) {
            addCriterion("tinhtrangdieudong between", value1, value2, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andTinhtrangdieudongNotBetween(Integer value1, Integer value2) {
            addCriterion("tinhtrangdieudong not between", value1, value2, "tinhtrangdieudong");
            return (Criteria) this;
        }

        public Criteria andPassportIsNull() {
            addCriterion("passport is null");
            return (Criteria) this;
        }

        public Criteria andPassportIsNotNull() {
            addCriterion("passport is not null");
            return (Criteria) this;
        }

        public Criteria andPassportEqualTo(String value) {
            addCriterion("passport =", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportNotEqualTo(String value) {
            addCriterion("passport <>", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportGreaterThan(String value) {
            addCriterion("passport >", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportGreaterThanOrEqualTo(String value) {
            addCriterion("passport >=", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportLessThan(String value) {
            addCriterion("passport <", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportLessThanOrEqualTo(String value) {
            addCriterion("passport <=", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportLike(String value) {
            addCriterion("passport like", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportNotLike(String value) {
            addCriterion("passport not like", value, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportIn(List<String> values) {
            addCriterion("passport in", values, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportNotIn(List<String> values) {
            addCriterion("passport not in", values, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportBetween(String value1, String value2) {
            addCriterion("passport between", value1, value2, "passport");
            return (Criteria) this;
        }

        public Criteria andPassportNotBetween(String value1, String value2) {
            addCriterion("passport not between", value1, value2, "passport");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidIsNull() {
            addCriterion("chucdanhtheochuyenmonId is null");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidIsNotNull() {
            addCriterion("chucdanhtheochuyenmonId is not null");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidEqualTo(String value) {
            addCriterion("chucdanhtheochuyenmonId =", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidNotEqualTo(String value) {
            addCriterion("chucdanhtheochuyenmonId <>", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidGreaterThan(String value) {
            addCriterion("chucdanhtheochuyenmonId >", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidGreaterThanOrEqualTo(String value) {
            addCriterion("chucdanhtheochuyenmonId >=", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidLessThan(String value) {
            addCriterion("chucdanhtheochuyenmonId <", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidLessThanOrEqualTo(String value) {
            addCriterion("chucdanhtheochuyenmonId <=", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidLike(String value) {
            addCriterion("chucdanhtheochuyenmonId like", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidNotLike(String value) {
            addCriterion("chucdanhtheochuyenmonId not like", value, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidIn(List<String> values) {
            addCriterion("chucdanhtheochuyenmonId in", values, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidNotIn(List<String> values) {
            addCriterion("chucdanhtheochuyenmonId not in", values, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidBetween(String value1, String value2) {
            addCriterion("chucdanhtheochuyenmonId between", value1, value2, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheochuyenmonidNotBetween(String value1, String value2) {
            addCriterion("chucdanhtheochuyenmonId not between", value1, value2, "chucdanhtheochuyenmonid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidIsNull() {
            addCriterion("chucdanhtheohientaiId is null");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidIsNotNull() {
            addCriterion("chucdanhtheohientaiId is not null");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidEqualTo(Integer value) {
            addCriterion("chucdanhtheohientaiId =", value, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidNotEqualTo(Integer value) {
            addCriterion("chucdanhtheohientaiId <>", value, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidGreaterThan(Integer value) {
            addCriterion("chucdanhtheohientaiId >", value, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chucdanhtheohientaiId >=", value, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidLessThan(Integer value) {
            addCriterion("chucdanhtheohientaiId <", value, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidLessThanOrEqualTo(Integer value) {
            addCriterion("chucdanhtheohientaiId <=", value, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidIn(List<Integer> values) {
            addCriterion("chucdanhtheohientaiId in", values, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidNotIn(List<Integer> values) {
            addCriterion("chucdanhtheohientaiId not in", values, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidBetween(Integer value1, Integer value2) {
            addCriterion("chucdanhtheohientaiId between", value1, value2, "chucdanhtheohientaiid");
            return (Criteria) this;
        }

        public Criteria andChucdanhtheohientaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("chucdanhtheohientaiId not between", value1, value2, "chucdanhtheohientaiid");
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

        public Criteria andQuoctichIsNull() {
            addCriterion("quoctich is null");
            return (Criteria) this;
        }

        public Criteria andQuoctichIsNotNull() {
            addCriterion("quoctich is not null");
            return (Criteria) this;
        }

        public Criteria andQuoctichEqualTo(Integer value) {
            addCriterion("quoctich =", value, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichNotEqualTo(Integer value) {
            addCriterion("quoctich <>", value, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichGreaterThan(Integer value) {
            addCriterion("quoctich >", value, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichGreaterThanOrEqualTo(Integer value) {
            addCriterion("quoctich >=", value, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichLessThan(Integer value) {
            addCriterion("quoctich <", value, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichLessThanOrEqualTo(Integer value) {
            addCriterion("quoctich <=", value, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichIn(List<Integer> values) {
            addCriterion("quoctich in", values, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichNotIn(List<Integer> values) {
            addCriterion("quoctich not in", values, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichBetween(Integer value1, Integer value2) {
            addCriterion("quoctich between", value1, value2, "quoctich");
            return (Criteria) this;
        }

        public Criteria andQuoctichNotBetween(Integer value1, Integer value2) {
            addCriterion("quoctich not between", value1, value2, "quoctich");
            return (Criteria) this;
        }

        public Criteria andNguoilienheIsNull() {
            addCriterion("nguoilienhe is null");
            return (Criteria) this;
        }

        public Criteria andNguoilienheIsNotNull() {
            addCriterion("nguoilienhe is not null");
            return (Criteria) this;
        }

        public Criteria andNguoilienheEqualTo(String value) {
            addCriterion("nguoilienhe =", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheNotEqualTo(String value) {
            addCriterion("nguoilienhe <>", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheGreaterThan(String value) {
            addCriterion("nguoilienhe >", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheGreaterThanOrEqualTo(String value) {
            addCriterion("nguoilienhe >=", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheLessThan(String value) {
            addCriterion("nguoilienhe <", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheLessThanOrEqualTo(String value) {
            addCriterion("nguoilienhe <=", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheLike(String value) {
            addCriterion("nguoilienhe like", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheNotLike(String value) {
            addCriterion("nguoilienhe not like", value, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheIn(List<String> values) {
            addCriterion("nguoilienhe in", values, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheNotIn(List<String> values) {
            addCriterion("nguoilienhe not in", values, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheBetween(String value1, String value2) {
            addCriterion("nguoilienhe between", value1, value2, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNguoilienheNotBetween(String value1, String value2) {
            addCriterion("nguoilienhe not between", value1, value2, "nguoilienhe");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecIsNull() {
            addCriterion("ngaybatdaulamviec is null");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecIsNotNull() {
            addCriterion("ngaybatdaulamviec is not null");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdaulamviec =", value, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdaulamviec <>", value, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecGreaterThan(Date value) {
            addCriterionForJDBCDate("ngaybatdaulamviec >", value, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdaulamviec >=", value, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecLessThan(Date value) {
            addCriterionForJDBCDate("ngaybatdaulamviec <", value, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdaulamviec <=", value, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecIn(List<Date> values) {
            addCriterionForJDBCDate("ngaybatdaulamviec in", values, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngaybatdaulamviec not in", values, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaybatdaulamviec between", value1, value2, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andNgaybatdaulamviecNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaybatdaulamviec not between", value1, value2, "ngaybatdaulamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecIsNull() {
            addCriterion("kynanglamviec is null");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecIsNotNull() {
            addCriterion("kynanglamviec is not null");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecEqualTo(String value) {
            addCriterion("kynanglamviec =", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecNotEqualTo(String value) {
            addCriterion("kynanglamviec <>", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecGreaterThan(String value) {
            addCriterion("kynanglamviec >", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecGreaterThanOrEqualTo(String value) {
            addCriterion("kynanglamviec >=", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecLessThan(String value) {
            addCriterion("kynanglamviec <", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecLessThanOrEqualTo(String value) {
            addCriterion("kynanglamviec <=", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecLike(String value) {
            addCriterion("kynanglamviec like", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecNotLike(String value) {
            addCriterion("kynanglamviec not like", value, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecIn(List<String> values) {
            addCriterion("kynanglamviec in", values, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecNotIn(List<String> values) {
            addCriterion("kynanglamviec not in", values, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecBetween(String value1, String value2) {
            addCriterion("kynanglamviec between", value1, value2, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andKynanglamviecNotBetween(String value1, String value2) {
            addCriterion("kynanglamviec not between", value1, value2, "kynanglamviec");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidIsNull() {
            addCriterion("trangthaiId is null");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidIsNotNull() {
            addCriterion("trangthaiId is not null");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidEqualTo(String value) {
            addCriterion("trangthaiId =", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidNotEqualTo(String value) {
            addCriterion("trangthaiId <>", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidGreaterThan(String value) {
            addCriterion("trangthaiId >", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidGreaterThanOrEqualTo(String value) {
            addCriterion("trangthaiId >=", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidLessThan(String value) {
            addCriterion("trangthaiId <", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidLessThanOrEqualTo(String value) {
            addCriterion("trangthaiId <=", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidLike(String value) {
            addCriterion("trangthaiId like", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidNotLike(String value) {
            addCriterion("trangthaiId not like", value, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidIn(List<String> values) {
            addCriterion("trangthaiId in", values, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidNotIn(List<String> values) {
            addCriterion("trangthaiId not in", values, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidBetween(String value1, String value2) {
            addCriterion("trangthaiId between", value1, value2, "trangthaiid");
            return (Criteria) this;
        }

        public Criteria andTrangthaiidNotBetween(String value1, String value2) {
            addCriterion("trangthaiId not between", value1, value2, "trangthaiid");
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

        public Criteria andMasoIsNull() {
            addCriterion("maso is null");
            return (Criteria) this;
        }

        public Criteria andMasoIsNotNull() {
            addCriterion("maso is not null");
            return (Criteria) this;
        }

        public Criteria andMasoEqualTo(String value) {
            addCriterion("maso =", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoNotEqualTo(String value) {
            addCriterion("maso <>", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoGreaterThan(String value) {
            addCriterion("maso >", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoGreaterThanOrEqualTo(String value) {
            addCriterion("maso >=", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoLessThan(String value) {
            addCriterion("maso <", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoLessThanOrEqualTo(String value) {
            addCriterion("maso <=", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoLike(String value) {
            addCriterion("maso like", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoNotLike(String value) {
            addCriterion("maso not like", value, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoIn(List<String> values) {
            addCriterion("maso in", values, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoNotIn(List<String> values) {
            addCriterion("maso not in", values, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoBetween(String value1, String value2) {
            addCriterion("maso between", value1, value2, "maso");
            return (Criteria) this;
        }

        public Criteria andMasoNotBetween(String value1, String value2) {
            addCriterion("maso not between", value1, value2, "maso");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongIsNull() {
            addCriterion("ghichubaoholaodong is null");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongIsNotNull() {
            addCriterion("ghichubaoholaodong is not null");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongEqualTo(String value) {
            addCriterion("ghichubaoholaodong =", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongNotEqualTo(String value) {
            addCriterion("ghichubaoholaodong <>", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongGreaterThan(String value) {
            addCriterion("ghichubaoholaodong >", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongGreaterThanOrEqualTo(String value) {
            addCriterion("ghichubaoholaodong >=", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongLessThan(String value) {
            addCriterion("ghichubaoholaodong <", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongLessThanOrEqualTo(String value) {
            addCriterion("ghichubaoholaodong <=", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongLike(String value) {
            addCriterion("ghichubaoholaodong like", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongNotLike(String value) {
            addCriterion("ghichubaoholaodong not like", value, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongIn(List<String> values) {
            addCriterion("ghichubaoholaodong in", values, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongNotIn(List<String> values) {
            addCriterion("ghichubaoholaodong not in", values, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongBetween(String value1, String value2) {
            addCriterion("ghichubaoholaodong between", value1, value2, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andGhichubaoholaodongNotBetween(String value1, String value2) {
            addCriterion("ghichubaoholaodong not between", value1, value2, "ghichubaoholaodong");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecIsNull() {
            addCriterion("vitrilamviec is null");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecIsNotNull() {
            addCriterion("vitrilamviec is not null");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecEqualTo(String value) {
            addCriterion("vitrilamviec =", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecNotEqualTo(String value) {
            addCriterion("vitrilamviec <>", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecGreaterThan(String value) {
            addCriterion("vitrilamviec >", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecGreaterThanOrEqualTo(String value) {
            addCriterion("vitrilamviec >=", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecLessThan(String value) {
            addCriterion("vitrilamviec <", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecLessThanOrEqualTo(String value) {
            addCriterion("vitrilamviec <=", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecLike(String value) {
            addCriterion("vitrilamviec like", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecNotLike(String value) {
            addCriterion("vitrilamviec not like", value, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecIn(List<String> values) {
            addCriterion("vitrilamviec in", values, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecNotIn(List<String> values) {
            addCriterion("vitrilamviec not in", values, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecBetween(String value1, String value2) {
            addCriterion("vitrilamviec between", value1, value2, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andVitrilamviecNotBetween(String value1, String value2) {
            addCriterion("vitrilamviec not between", value1, value2, "vitrilamviec");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapIsNull() {
            addCriterion("passportngaycap is null");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapIsNotNull() {
            addCriterion("passportngaycap is not null");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapEqualTo(Date value) {
            addCriterionForJDBCDate("passportngaycap =", value, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapNotEqualTo(Date value) {
            addCriterionForJDBCDate("passportngaycap <>", value, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapGreaterThan(Date value) {
            addCriterionForJDBCDate("passportngaycap >", value, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("passportngaycap >=", value, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapLessThan(Date value) {
            addCriterionForJDBCDate("passportngaycap <", value, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("passportngaycap <=", value, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapIn(List<Date> values) {
            addCriterionForJDBCDate("passportngaycap in", values, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapNotIn(List<Date> values) {
            addCriterionForJDBCDate("passportngaycap not in", values, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("passportngaycap between", value1, value2, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngaycapNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("passportngaycap not between", value1, value2, "passportngaycap");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanIsNull() {
            addCriterion("passportngayhethan is null");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanIsNotNull() {
            addCriterion("passportngayhethan is not null");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanEqualTo(Date value) {
            addCriterionForJDBCDate("passportngayhethan =", value, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanNotEqualTo(Date value) {
            addCriterionForJDBCDate("passportngayhethan <>", value, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanGreaterThan(Date value) {
            addCriterionForJDBCDate("passportngayhethan >", value, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("passportngayhethan >=", value, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanLessThan(Date value) {
            addCriterionForJDBCDate("passportngayhethan <", value, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("passportngayhethan <=", value, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanIn(List<Date> values) {
            addCriterionForJDBCDate("passportngayhethan in", values, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanNotIn(List<Date> values) {
            addCriterionForJDBCDate("passportngayhethan not in", values, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("passportngayhethan between", value1, value2, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andPassportngayhethanNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("passportngayhethan not between", value1, value2, "passportngayhethan");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andRequestIsNull() {
            addCriterion("request is null");
            return (Criteria) this;
        }

        public Criteria andRequestIsNotNull() {
            addCriterion("request is not null");
            return (Criteria) this;
        }

        public Criteria andRequestEqualTo(Date value) {
            addCriterionForJDBCDate("request =", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotEqualTo(Date value) {
            addCriterionForJDBCDate("request <>", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThan(Date value) {
            addCriterionForJDBCDate("request >", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("request >=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThan(Date value) {
            addCriterionForJDBCDate("request <", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("request <=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestIn(List<Date> values) {
            addCriterionForJDBCDate("request in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotIn(List<Date> values) {
            addCriterionForJDBCDate("request not in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("request between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("request not between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andAgreementIsNull() {
            addCriterion("agreement is null");
            return (Criteria) this;
        }

        public Criteria andAgreementIsNotNull() {
            addCriterion("agreement is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementEqualTo(Date value) {
            addCriterionForJDBCDate("agreement =", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotEqualTo(Date value) {
            addCriterionForJDBCDate("agreement <>", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementGreaterThan(Date value) {
            addCriterionForJDBCDate("agreement >", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement >=", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementLessThan(Date value) {
            addCriterionForJDBCDate("agreement <", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement <=", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementIn(List<Date> values) {
            addCriterionForJDBCDate("agreement in", values, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotIn(List<Date> values) {
            addCriterionForJDBCDate("agreement not in", values, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement between", value1, value2, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement not between", value1, value2, "agreement");
            return (Criteria) this;
        }

        public Criteria andDatereceivedIsNull() {
            addCriterion("datereceived is null");
            return (Criteria) this;
        }

        public Criteria andDatereceivedIsNotNull() {
            addCriterion("datereceived is not null");
            return (Criteria) this;
        }

        public Criteria andDatereceivedEqualTo(Date value) {
            addCriterionForJDBCDate("datereceived =", value, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedNotEqualTo(Date value) {
            addCriterionForJDBCDate("datereceived <>", value, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedGreaterThan(Date value) {
            addCriterionForJDBCDate("datereceived >", value, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datereceived >=", value, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedLessThan(Date value) {
            addCriterionForJDBCDate("datereceived <", value, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datereceived <=", value, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedIn(List<Date> values) {
            addCriterionForJDBCDate("datereceived in", values, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedNotIn(List<Date> values) {
            addCriterionForJDBCDate("datereceived not in", values, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datereceived between", value1, value2, "datereceived");
            return (Criteria) this;
        }

        public Criteria andDatereceivedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datereceived not between", value1, value2, "datereceived");
            return (Criteria) this;
        }

        public Criteria andCheckedbyIsNull() {
            addCriterion("checkedby is null");
            return (Criteria) this;
        }

        public Criteria andCheckedbyIsNotNull() {
            addCriterion("checkedby is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedbyEqualTo(String value) {
            addCriterion("checkedby =", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyNotEqualTo(String value) {
            addCriterion("checkedby <>", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyGreaterThan(String value) {
            addCriterion("checkedby >", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyGreaterThanOrEqualTo(String value) {
            addCriterion("checkedby >=", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyLessThan(String value) {
            addCriterion("checkedby <", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyLessThanOrEqualTo(String value) {
            addCriterion("checkedby <=", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyLike(String value) {
            addCriterion("checkedby like", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyNotLike(String value) {
            addCriterion("checkedby not like", value, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyIn(List<String> values) {
            addCriterion("checkedby in", values, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyNotIn(List<String> values) {
            addCriterion("checkedby not in", values, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyBetween(String value1, String value2) {
            addCriterion("checkedby between", value1, value2, "checkedby");
            return (Criteria) this;
        }

        public Criteria andCheckedbyNotBetween(String value1, String value2) {
            addCriterion("checkedby not between", value1, value2, "checkedby");
            return (Criteria) this;
        }

        public Criteria andSmpIsNull() {
            addCriterion("smp is null");
            return (Criteria) this;
        }

        public Criteria andSmpIsNotNull() {
            addCriterion("smp is not null");
            return (Criteria) this;
        }

        public Criteria andSmpEqualTo(String value) {
            addCriterion("smp =", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpNotEqualTo(String value) {
            addCriterion("smp <>", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpGreaterThan(String value) {
            addCriterion("smp >", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpGreaterThanOrEqualTo(String value) {
            addCriterion("smp >=", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpLessThan(String value) {
            addCriterion("smp <", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpLessThanOrEqualTo(String value) {
            addCriterion("smp <=", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpLike(String value) {
            addCriterion("smp like", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpNotLike(String value) {
            addCriterion("smp not like", value, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpIn(List<String> values) {
            addCriterion("smp in", values, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpNotIn(List<String> values) {
            addCriterion("smp not in", values, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpBetween(String value1, String value2) {
            addCriterion("smp between", value1, value2, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpNotBetween(String value1, String value2) {
            addCriterion("smp not between", value1, value2, "smp");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapIsNull() {
            addCriterion("smpngaycap is null");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapIsNotNull() {
            addCriterion("smpngaycap is not null");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapEqualTo(Date value) {
            addCriterionForJDBCDate("smpngaycap =", value, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapNotEqualTo(Date value) {
            addCriterionForJDBCDate("smpngaycap <>", value, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapGreaterThan(Date value) {
            addCriterionForJDBCDate("smpngaycap >", value, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smpngaycap >=", value, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapLessThan(Date value) {
            addCriterionForJDBCDate("smpngaycap <", value, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smpngaycap <=", value, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapIn(List<Date> values) {
            addCriterionForJDBCDate("smpngaycap in", values, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapNotIn(List<Date> values) {
            addCriterionForJDBCDate("smpngaycap not in", values, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smpngaycap between", value1, value2, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngaycapNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smpngaycap not between", value1, value2, "smpngaycap");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanIsNull() {
            addCriterion("smpngayhethan is null");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanIsNotNull() {
            addCriterion("smpngayhethan is not null");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanEqualTo(Date value) {
            addCriterionForJDBCDate("smpngayhethan =", value, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanNotEqualTo(Date value) {
            addCriterionForJDBCDate("smpngayhethan <>", value, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanGreaterThan(Date value) {
            addCriterionForJDBCDate("smpngayhethan >", value, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smpngayhethan >=", value, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanLessThan(Date value) {
            addCriterionForJDBCDate("smpngayhethan <", value, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smpngayhethan <=", value, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanIn(List<Date> values) {
            addCriterionForJDBCDate("smpngayhethan in", values, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanNotIn(List<Date> values) {
            addCriterionForJDBCDate("smpngayhethan not in", values, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smpngayhethan between", value1, value2, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmpngayhethanNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smpngayhethan not between", value1, value2, "smpngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbIsNull() {
            addCriterion("smb is null");
            return (Criteria) this;
        }

        public Criteria andSmbIsNotNull() {
            addCriterion("smb is not null");
            return (Criteria) this;
        }

        public Criteria andSmbEqualTo(String value) {
            addCriterion("smb =", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbNotEqualTo(String value) {
            addCriterion("smb <>", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbGreaterThan(String value) {
            addCriterion("smb >", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbGreaterThanOrEqualTo(String value) {
            addCriterion("smb >=", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbLessThan(String value) {
            addCriterion("smb <", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbLessThanOrEqualTo(String value) {
            addCriterion("smb <=", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbLike(String value) {
            addCriterion("smb like", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbNotLike(String value) {
            addCriterion("smb not like", value, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbIn(List<String> values) {
            addCriterion("smb in", values, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbNotIn(List<String> values) {
            addCriterion("smb not in", values, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbBetween(String value1, String value2) {
            addCriterion("smb between", value1, value2, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbNotBetween(String value1, String value2) {
            addCriterion("smb not between", value1, value2, "smb");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanIsNull() {
            addCriterion("smbngayhethan is null");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanIsNotNull() {
            addCriterion("smbngayhethan is not null");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanEqualTo(Date value) {
            addCriterionForJDBCDate("smbngayhethan =", value, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanNotEqualTo(Date value) {
            addCriterionForJDBCDate("smbngayhethan <>", value, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanGreaterThan(Date value) {
            addCriterionForJDBCDate("smbngayhethan >", value, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smbngayhethan >=", value, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanLessThan(Date value) {
            addCriterionForJDBCDate("smbngayhethan <", value, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("smbngayhethan <=", value, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanIn(List<Date> values) {
            addCriterionForJDBCDate("smbngayhethan in", values, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanNotIn(List<Date> values) {
            addCriterionForJDBCDate("smbngayhethan not in", values, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smbngayhethan between", value1, value2, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andSmbngayhethanNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("smbngayhethan not between", value1, value2, "smbngayhethan");
            return (Criteria) this;
        }

        public Criteria andDateappliedIsNull() {
            addCriterion("dateapplied is null");
            return (Criteria) this;
        }

        public Criteria andDateappliedIsNotNull() {
            addCriterion("dateapplied is not null");
            return (Criteria) this;
        }

        public Criteria andDateappliedEqualTo(Date value) {
            addCriterionForJDBCDate("dateapplied =", value, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedNotEqualTo(Date value) {
            addCriterionForJDBCDate("dateapplied <>", value, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedGreaterThan(Date value) {
            addCriterionForJDBCDate("dateapplied >", value, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateapplied >=", value, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedLessThan(Date value) {
            addCriterionForJDBCDate("dateapplied <", value, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateapplied <=", value, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedIn(List<Date> values) {
            addCriterionForJDBCDate("dateapplied in", values, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedNotIn(List<Date> values) {
            addCriterionForJDBCDate("dateapplied not in", values, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateapplied between", value1, value2, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andDateappliedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateapplied not between", value1, value2, "dateapplied");
            return (Criteria) this;
        }

        public Criteria andCheckbyIsNull() {
            addCriterion("checkby is null");
            return (Criteria) this;
        }

        public Criteria andCheckbyIsNotNull() {
            addCriterion("checkby is not null");
            return (Criteria) this;
        }

        public Criteria andCheckbyEqualTo(String value) {
            addCriterion("checkby =", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyNotEqualTo(String value) {
            addCriterion("checkby <>", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyGreaterThan(String value) {
            addCriterion("checkby >", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyGreaterThanOrEqualTo(String value) {
            addCriterion("checkby >=", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyLessThan(String value) {
            addCriterion("checkby <", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyLessThanOrEqualTo(String value) {
            addCriterion("checkby <=", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyLike(String value) {
            addCriterion("checkby like", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyNotLike(String value) {
            addCriterion("checkby not like", value, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyIn(List<String> values) {
            addCriterion("checkby in", values, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyNotIn(List<String> values) {
            addCriterion("checkby not in", values, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyBetween(String value1, String value2) {
            addCriterion("checkby between", value1, value2, "checkby");
            return (Criteria) this;
        }

        public Criteria andCheckbyNotBetween(String value1, String value2) {
            addCriterion("checkby not between", value1, value2, "checkby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyIsNull() {
            addCriterion("datecheckby is null");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyIsNotNull() {
            addCriterion("datecheckby is not null");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyEqualTo(Date value) {
            addCriterionForJDBCDate("datecheckby =", value, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyNotEqualTo(Date value) {
            addCriterionForJDBCDate("datecheckby <>", value, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyGreaterThan(Date value) {
            addCriterionForJDBCDate("datecheckby >", value, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datecheckby >=", value, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyLessThan(Date value) {
            addCriterionForJDBCDate("datecheckby <", value, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datecheckby <=", value, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyIn(List<Date> values) {
            addCriterionForJDBCDate("datecheckby in", values, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyNotIn(List<Date> values) {
            addCriterionForJDBCDate("datecheckby not in", values, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datecheckby between", value1, value2, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andDatecheckbyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datecheckby not between", value1, value2, "datecheckby");
            return (Criteria) this;
        }

        public Criteria andSsIsNull() {
            addCriterion("ss is null");
            return (Criteria) this;
        }

        public Criteria andSsIsNotNull() {
            addCriterion("ss is not null");
            return (Criteria) this;
        }

        public Criteria andSsEqualTo(Integer value) {
            addCriterion("ss =", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotEqualTo(Integer value) {
            addCriterion("ss <>", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsGreaterThan(Integer value) {
            addCriterion("ss >", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ss >=", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsLessThan(Integer value) {
            addCriterion("ss <", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsLessThanOrEqualTo(Integer value) {
            addCriterion("ss <=", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsIn(List<Integer> values) {
            addCriterion("ss in", values, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotIn(List<Integer> values) {
            addCriterion("ss not in", values, "ss");
            return (Criteria) this;
        }

        public Criteria andSsBetween(Integer value1, Integer value2) {
            addCriterion("ss between", value1, value2, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotBetween(Integer value1, Integer value2) {
            addCriterion("ss not between", value1, value2, "ss");
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