package com.saigonbpo.ntb.Model;

import java.util.ArrayList;
import java.util.List;

public class ThongTinGiaDinhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThongTinGiaDinhExample() {
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

        public Criteria andCongtyIsNull() {
            addCriterion("congty is null");
            return (Criteria) this;
        }

        public Criteria andCongtyIsNotNull() {
            addCriterion("congty is not null");
            return (Criteria) this;
        }

        public Criteria andCongtyEqualTo(String value) {
            addCriterion("congty =", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyNotEqualTo(String value) {
            addCriterion("congty <>", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyGreaterThan(String value) {
            addCriterion("congty >", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyGreaterThanOrEqualTo(String value) {
            addCriterion("congty >=", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyLessThan(String value) {
            addCriterion("congty <", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyLessThanOrEqualTo(String value) {
            addCriterion("congty <=", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyLike(String value) {
            addCriterion("congty like", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyNotLike(String value) {
            addCriterion("congty not like", value, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyIn(List<String> values) {
            addCriterion("congty in", values, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyNotIn(List<String> values) {
            addCriterion("congty not in", values, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyBetween(String value1, String value2) {
            addCriterion("congty between", value1, value2, "congty");
            return (Criteria) this;
        }

        public Criteria andCongtyNotBetween(String value1, String value2) {
            addCriterion("congty not between", value1, value2, "congty");
            return (Criteria) this;
        }

        public Criteria andNghenghiepIsNull() {
            addCriterion("nghenghiep is null");
            return (Criteria) this;
        }

        public Criteria andNghenghiepIsNotNull() {
            addCriterion("nghenghiep is not null");
            return (Criteria) this;
        }

        public Criteria andNghenghiepEqualTo(String value) {
            addCriterion("nghenghiep =", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepNotEqualTo(String value) {
            addCriterion("nghenghiep <>", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepGreaterThan(String value) {
            addCriterion("nghenghiep >", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepGreaterThanOrEqualTo(String value) {
            addCriterion("nghenghiep >=", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepLessThan(String value) {
            addCriterion("nghenghiep <", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepLessThanOrEqualTo(String value) {
            addCriterion("nghenghiep <=", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepLike(String value) {
            addCriterion("nghenghiep like", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepNotLike(String value) {
            addCriterion("nghenghiep not like", value, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepIn(List<String> values) {
            addCriterion("nghenghiep in", values, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepNotIn(List<String> values) {
            addCriterion("nghenghiep not in", values, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepBetween(String value1, String value2) {
            addCriterion("nghenghiep between", value1, value2, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andNghenghiepNotBetween(String value1, String value2) {
            addCriterion("nghenghiep not between", value1, value2, "nghenghiep");
            return (Criteria) this;
        }

        public Criteria andDienthoaiIsNull() {
            addCriterion("dienthoai is null");
            return (Criteria) this;
        }

        public Criteria andDienthoaiIsNotNull() {
            addCriterion("dienthoai is not null");
            return (Criteria) this;
        }

        public Criteria andDienthoaiEqualTo(String value) {
            addCriterion("dienthoai =", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiNotEqualTo(String value) {
            addCriterion("dienthoai <>", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiGreaterThan(String value) {
            addCriterion("dienthoai >", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiGreaterThanOrEqualTo(String value) {
            addCriterion("dienthoai >=", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiLessThan(String value) {
            addCriterion("dienthoai <", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiLessThanOrEqualTo(String value) {
            addCriterion("dienthoai <=", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiLike(String value) {
            addCriterion("dienthoai like", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiNotLike(String value) {
            addCriterion("dienthoai not like", value, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiIn(List<String> values) {
            addCriterion("dienthoai in", values, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiNotIn(List<String> values) {
            addCriterion("dienthoai not in", values, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiBetween(String value1, String value2) {
            addCriterion("dienthoai between", value1, value2, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDienthoaiNotBetween(String value1, String value2) {
            addCriterion("dienthoai not between", value1, value2, "dienthoai");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNull() {
            addCriterion("diachi is null");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNotNull() {
            addCriterion("diachi is not null");
            return (Criteria) this;
        }

        public Criteria andDiachiEqualTo(String value) {
            addCriterion("diachi =", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotEqualTo(String value) {
            addCriterion("diachi <>", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThan(String value) {
            addCriterion("diachi >", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThanOrEqualTo(String value) {
            addCriterion("diachi >=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThan(String value) {
            addCriterion("diachi <", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThanOrEqualTo(String value) {
            addCriterion("diachi <=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLike(String value) {
            addCriterion("diachi like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotLike(String value) {
            addCriterion("diachi not like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiIn(List<String> values) {
            addCriterion("diachi in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotIn(List<String> values) {
            addCriterion("diachi not in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiBetween(String value1, String value2) {
            addCriterion("diachi between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotBetween(String value1, String value2) {
            addCriterion("diachi not between", value1, value2, "diachi");
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

        public Criteria andQuanheIsNull() {
            addCriterion("quanhe is null");
            return (Criteria) this;
        }

        public Criteria andQuanheIsNotNull() {
            addCriterion("quanhe is not null");
            return (Criteria) this;
        }

        public Criteria andQuanheEqualTo(Integer value) {
            addCriterion("quanhe =", value, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheNotEqualTo(Integer value) {
            addCriterion("quanhe <>", value, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheGreaterThan(Integer value) {
            addCriterion("quanhe >", value, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheGreaterThanOrEqualTo(Integer value) {
            addCriterion("quanhe >=", value, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheLessThan(Integer value) {
            addCriterion("quanhe <", value, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheLessThanOrEqualTo(Integer value) {
            addCriterion("quanhe <=", value, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheIn(List<Integer> values) {
            addCriterion("quanhe in", values, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheNotIn(List<Integer> values) {
            addCriterion("quanhe not in", values, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheBetween(Integer value1, Integer value2) {
            addCriterion("quanhe between", value1, value2, "quanhe");
            return (Criteria) this;
        }

        public Criteria andQuanheNotBetween(Integer value1, Integer value2) {
            addCriterion("quanhe not between", value1, value2, "quanhe");
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