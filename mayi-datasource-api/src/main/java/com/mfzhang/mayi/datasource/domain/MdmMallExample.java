package com.mfzhang.mayi.datasource.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MdmMallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdmMallExample() {
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

        public Criteria andMdGuidIsNull() {
            addCriterion("md_guid is null");
            return (Criteria) this;
        }

        public Criteria andMdGuidIsNotNull() {
            addCriterion("md_guid is not null");
            return (Criteria) this;
        }

        public Criteria andMdGuidEqualTo(String value) {
            addCriterion("md_guid =", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidNotEqualTo(String value) {
            addCriterion("md_guid <>", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidGreaterThan(String value) {
            addCriterion("md_guid >", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidGreaterThanOrEqualTo(String value) {
            addCriterion("md_guid >=", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidLessThan(String value) {
            addCriterion("md_guid <", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidLessThanOrEqualTo(String value) {
            addCriterion("md_guid <=", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidLike(String value) {
            addCriterion("md_guid like", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidNotLike(String value) {
            addCriterion("md_guid not like", value, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidIn(List<String> values) {
            addCriterion("md_guid in", values, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidNotIn(List<String> values) {
            addCriterion("md_guid not in", values, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidBetween(String value1, String value2) {
            addCriterion("md_guid between", value1, value2, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdGuidNotBetween(String value1, String value2) {
            addCriterion("md_guid not between", value1, value2, "mdGuid");
            return (Criteria) this;
        }

        public Criteria andMdmIdIsNull() {
            addCriterion("mdm_id is null");
            return (Criteria) this;
        }

        public Criteria andMdmIdIsNotNull() {
            addCriterion("mdm_id is not null");
            return (Criteria) this;
        }

        public Criteria andMdmIdEqualTo(String value) {
            addCriterion("mdm_id =", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdNotEqualTo(String value) {
            addCriterion("mdm_id <>", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdGreaterThan(String value) {
            addCriterion("mdm_id >", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("mdm_id >=", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdLessThan(String value) {
            addCriterion("mdm_id <", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdLessThanOrEqualTo(String value) {
            addCriterion("mdm_id <=", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdLike(String value) {
            addCriterion("mdm_id like", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdNotLike(String value) {
            addCriterion("mdm_id not like", value, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdIn(List<String> values) {
            addCriterion("mdm_id in", values, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdNotIn(List<String> values) {
            addCriterion("mdm_id not in", values, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdBetween(String value1, String value2) {
            addCriterion("mdm_id between", value1, value2, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMdmIdNotBetween(String value1, String value2) {
            addCriterion("mdm_id not between", value1, value2, "mdmId");
            return (Criteria) this;
        }

        public Criteria andMallCodeIsNull() {
            addCriterion("mall_code is null");
            return (Criteria) this;
        }

        public Criteria andMallCodeIsNotNull() {
            addCriterion("mall_code is not null");
            return (Criteria) this;
        }

        public Criteria andMallCodeEqualTo(String value) {
            addCriterion("mall_code =", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotEqualTo(String value) {
            addCriterion("mall_code <>", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeGreaterThan(String value) {
            addCriterion("mall_code >", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mall_code >=", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeLessThan(String value) {
            addCriterion("mall_code <", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeLessThanOrEqualTo(String value) {
            addCriterion("mall_code <=", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeLike(String value) {
            addCriterion("mall_code like", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotLike(String value) {
            addCriterion("mall_code not like", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeIn(List<String> values) {
            addCriterion("mall_code in", values, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotIn(List<String> values) {
            addCriterion("mall_code not in", values, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeBetween(String value1, String value2) {
            addCriterion("mall_code between", value1, value2, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotBetween(String value1, String value2) {
            addCriterion("mall_code not between", value1, value2, "mallCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeIsNull() {
            addCriterion("ps_code is null");
            return (Criteria) this;
        }

        public Criteria andPsCodeIsNotNull() {
            addCriterion("ps_code is not null");
            return (Criteria) this;
        }

        public Criteria andPsCodeEqualTo(String value) {
            addCriterion("ps_code =", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeNotEqualTo(String value) {
            addCriterion("ps_code <>", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeGreaterThan(String value) {
            addCriterion("ps_code >", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ps_code >=", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeLessThan(String value) {
            addCriterion("ps_code <", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeLessThanOrEqualTo(String value) {
            addCriterion("ps_code <=", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeLike(String value) {
            addCriterion("ps_code like", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeNotLike(String value) {
            addCriterion("ps_code not like", value, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeIn(List<String> values) {
            addCriterion("ps_code in", values, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeNotIn(List<String> values) {
            addCriterion("ps_code not in", values, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeBetween(String value1, String value2) {
            addCriterion("ps_code between", value1, value2, "psCode");
            return (Criteria) this;
        }

        public Criteria andPsCodeNotBetween(String value1, String value2) {
            addCriterion("ps_code not between", value1, value2, "psCode");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andMallTypeIsNull() {
            addCriterion("mall_type is null");
            return (Criteria) this;
        }

        public Criteria andMallTypeIsNotNull() {
            addCriterion("mall_type is not null");
            return (Criteria) this;
        }

        public Criteria andMallTypeEqualTo(String value) {
            addCriterion("mall_type =", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotEqualTo(String value) {
            addCriterion("mall_type <>", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeGreaterThan(String value) {
            addCriterion("mall_type >", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mall_type >=", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeLessThan(String value) {
            addCriterion("mall_type <", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeLessThanOrEqualTo(String value) {
            addCriterion("mall_type <=", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeLike(String value) {
            addCriterion("mall_type like", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotLike(String value) {
            addCriterion("mall_type not like", value, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeIn(List<String> values) {
            addCriterion("mall_type in", values, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotIn(List<String> values) {
            addCriterion("mall_type not in", values, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeBetween(String value1, String value2) {
            addCriterion("mall_type between", value1, value2, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallTypeNotBetween(String value1, String value2) {
            addCriterion("mall_type not between", value1, value2, "mallType");
            return (Criteria) this;
        }

        public Criteria andMallClassIsNull() {
            addCriterion("mall_class is null");
            return (Criteria) this;
        }

        public Criteria andMallClassIsNotNull() {
            addCriterion("mall_class is not null");
            return (Criteria) this;
        }

        public Criteria andMallClassEqualTo(String value) {
            addCriterion("mall_class =", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassNotEqualTo(String value) {
            addCriterion("mall_class <>", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassGreaterThan(String value) {
            addCriterion("mall_class >", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassGreaterThanOrEqualTo(String value) {
            addCriterion("mall_class >=", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassLessThan(String value) {
            addCriterion("mall_class <", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassLessThanOrEqualTo(String value) {
            addCriterion("mall_class <=", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassLike(String value) {
            addCriterion("mall_class like", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassNotLike(String value) {
            addCriterion("mall_class not like", value, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassIn(List<String> values) {
            addCriterion("mall_class in", values, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassNotIn(List<String> values) {
            addCriterion("mall_class not in", values, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassBetween(String value1, String value2) {
            addCriterion("mall_class between", value1, value2, "mallClass");
            return (Criteria) this;
        }

        public Criteria andMallClassNotBetween(String value1, String value2) {
            addCriterion("mall_class not between", value1, value2, "mallClass");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andRegionOneIsNull() {
            addCriterion("region_one is null");
            return (Criteria) this;
        }

        public Criteria andRegionOneIsNotNull() {
            addCriterion("region_one is not null");
            return (Criteria) this;
        }

        public Criteria andRegionOneEqualTo(String value) {
            addCriterion("region_one =", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneNotEqualTo(String value) {
            addCriterion("region_one <>", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneGreaterThan(String value) {
            addCriterion("region_one >", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneGreaterThanOrEqualTo(String value) {
            addCriterion("region_one >=", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneLessThan(String value) {
            addCriterion("region_one <", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneLessThanOrEqualTo(String value) {
            addCriterion("region_one <=", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneLike(String value) {
            addCriterion("region_one like", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneNotLike(String value) {
            addCriterion("region_one not like", value, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneIn(List<String> values) {
            addCriterion("region_one in", values, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneNotIn(List<String> values) {
            addCriterion("region_one not in", values, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneBetween(String value1, String value2) {
            addCriterion("region_one between", value1, value2, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionOneNotBetween(String value1, String value2) {
            addCriterion("region_one not between", value1, value2, "regionOne");
            return (Criteria) this;
        }

        public Criteria andRegionTwoIsNull() {
            addCriterion("region_two is null");
            return (Criteria) this;
        }

        public Criteria andRegionTwoIsNotNull() {
            addCriterion("region_two is not null");
            return (Criteria) this;
        }

        public Criteria andRegionTwoEqualTo(String value) {
            addCriterion("region_two =", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoNotEqualTo(String value) {
            addCriterion("region_two <>", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoGreaterThan(String value) {
            addCriterion("region_two >", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoGreaterThanOrEqualTo(String value) {
            addCriterion("region_two >=", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoLessThan(String value) {
            addCriterion("region_two <", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoLessThanOrEqualTo(String value) {
            addCriterion("region_two <=", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoLike(String value) {
            addCriterion("region_two like", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoNotLike(String value) {
            addCriterion("region_two not like", value, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoIn(List<String> values) {
            addCriterion("region_two in", values, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoNotIn(List<String> values) {
            addCriterion("region_two not in", values, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoBetween(String value1, String value2) {
            addCriterion("region_two between", value1, value2, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andRegionTwoNotBetween(String value1, String value2) {
            addCriterion("region_two not between", value1, value2, "regionTwo");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGpsIsNull() {
            addCriterion("gps is null");
            return (Criteria) this;
        }

        public Criteria andGpsIsNotNull() {
            addCriterion("gps is not null");
            return (Criteria) this;
        }

        public Criteria andGpsEqualTo(String value) {
            addCriterion("gps =", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotEqualTo(String value) {
            addCriterion("gps <>", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThan(String value) {
            addCriterion("gps >", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThanOrEqualTo(String value) {
            addCriterion("gps >=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThan(String value) {
            addCriterion("gps <", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThanOrEqualTo(String value) {
            addCriterion("gps <=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLike(String value) {
            addCriterion("gps like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotLike(String value) {
            addCriterion("gps not like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsIn(List<String> values) {
            addCriterion("gps in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotIn(List<String> values) {
            addCriterion("gps not in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsBetween(String value1, String value2) {
            addCriterion("gps between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotBetween(String value1, String value2) {
            addCriterion("gps not between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("delete is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("delete is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(String value) {
            addCriterion("delete =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(String value) {
            addCriterion("delete <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(String value) {
            addCriterion("delete >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("delete >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(String value) {
            addCriterion("delete <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(String value) {
            addCriterion("delete <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLike(String value) {
            addCriterion("delete like", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotLike(String value) {
            addCriterion("delete not like", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<String> values) {
            addCriterion("delete in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<String> values) {
            addCriterion("delete not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(String value1, String value2) {
            addCriterion("delete between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(String value1, String value2) {
            addCriterion("delete not between", value1, value2, "delete");
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

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifytime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifytime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifytime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifytime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifytime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifytime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifytime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifytime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifytime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifytime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("modifyby is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("modifyby is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(String value) {
            addCriterion("modifyby =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(String value) {
            addCriterion("modifyby <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(String value) {
            addCriterion("modifyby >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(String value) {
            addCriterion("modifyby >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(String value) {
            addCriterion("modifyby <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(String value) {
            addCriterion("modifyby <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLike(String value) {
            addCriterion("modifyby like", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotLike(String value) {
            addCriterion("modifyby not like", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<String> values) {
            addCriterion("modifyby in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<String> values) {
            addCriterion("modifyby not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(String value1, String value2) {
            addCriterion("modifyby between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(String value1, String value2) {
            addCriterion("modifyby not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailIsNull() {
            addCriterion("operator_email is null");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailIsNotNull() {
            addCriterion("operator_email is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailEqualTo(String value) {
            addCriterion("operator_email =", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailNotEqualTo(String value) {
            addCriterion("operator_email <>", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailGreaterThan(String value) {
            addCriterion("operator_email >", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("operator_email >=", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailLessThan(String value) {
            addCriterion("operator_email <", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailLessThanOrEqualTo(String value) {
            addCriterion("operator_email <=", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailLike(String value) {
            addCriterion("operator_email like", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailNotLike(String value) {
            addCriterion("operator_email not like", value, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailIn(List<String> values) {
            addCriterion("operator_email in", values, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailNotIn(List<String> values) {
            addCriterion("operator_email not in", values, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailBetween(String value1, String value2) {
            addCriterion("operator_email between", value1, value2, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOperatorEmailNotBetween(String value1, String value2) {
            addCriterion("operator_email not between", value1, value2, "operatorEmail");
            return (Criteria) this;
        }

        public Criteria andOmsTempIsNull() {
            addCriterion("oms_temp is null");
            return (Criteria) this;
        }

        public Criteria andOmsTempIsNotNull() {
            addCriterion("oms_temp is not null");
            return (Criteria) this;
        }

        public Criteria andOmsTempEqualTo(String value) {
            addCriterion("oms_temp =", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempNotEqualTo(String value) {
            addCriterion("oms_temp <>", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempGreaterThan(String value) {
            addCriterion("oms_temp >", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempGreaterThanOrEqualTo(String value) {
            addCriterion("oms_temp >=", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempLessThan(String value) {
            addCriterion("oms_temp <", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempLessThanOrEqualTo(String value) {
            addCriterion("oms_temp <=", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempLike(String value) {
            addCriterion("oms_temp like", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempNotLike(String value) {
            addCriterion("oms_temp not like", value, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempIn(List<String> values) {
            addCriterion("oms_temp in", values, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempNotIn(List<String> values) {
            addCriterion("oms_temp not in", values, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempBetween(String value1, String value2) {
            addCriterion("oms_temp between", value1, value2, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andOmsTempNotBetween(String value1, String value2) {
            addCriterion("oms_temp not between", value1, value2, "omsTemp");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
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