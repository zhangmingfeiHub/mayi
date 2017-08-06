package com.mfzhang.mayi.datasource.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsMarketInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsMarketInfoExample() {
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

        public Criteria andIdUuidIsNull() {
            addCriterion("id_uuid is null");
            return (Criteria) this;
        }

        public Criteria andIdUuidIsNotNull() {
            addCriterion("id_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andIdUuidEqualTo(Integer value) {
            addCriterion("id_uuid =", value, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidNotEqualTo(Integer value) {
            addCriterion("id_uuid <>", value, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidGreaterThan(Integer value) {
            addCriterion("id_uuid >", value, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_uuid >=", value, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidLessThan(Integer value) {
            addCriterion("id_uuid <", value, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidLessThanOrEqualTo(Integer value) {
            addCriterion("id_uuid <=", value, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidIn(List<Integer> values) {
            addCriterion("id_uuid in", values, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidNotIn(List<Integer> values) {
            addCriterion("id_uuid not in", values, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidBetween(Integer value1, Integer value2) {
            addCriterion("id_uuid between", value1, value2, "idUuid");
            return (Criteria) this;
        }

        public Criteria andIdUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("id_uuid not between", value1, value2, "idUuid");
            return (Criteria) this;
        }

        public Criteria andMarketNumberIsNull() {
            addCriterion("market_number is null");
            return (Criteria) this;
        }

        public Criteria andMarketNumberIsNotNull() {
            addCriterion("market_number is not null");
            return (Criteria) this;
        }

        public Criteria andMarketNumberEqualTo(String value) {
            addCriterion("market_number =", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberNotEqualTo(String value) {
            addCriterion("market_number <>", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberGreaterThan(String value) {
            addCriterion("market_number >", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberGreaterThanOrEqualTo(String value) {
            addCriterion("market_number >=", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberLessThan(String value) {
            addCriterion("market_number <", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberLessThanOrEqualTo(String value) {
            addCriterion("market_number <=", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberLike(String value) {
            addCriterion("market_number like", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberNotLike(String value) {
            addCriterion("market_number not like", value, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberIn(List<String> values) {
            addCriterion("market_number in", values, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberNotIn(List<String> values) {
            addCriterion("market_number not in", values, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberBetween(String value1, String value2) {
            addCriterion("market_number between", value1, value2, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNumberNotBetween(String value1, String value2) {
            addCriterion("market_number not between", value1, value2, "marketNumber");
            return (Criteria) this;
        }

        public Criteria andMarketNameIsNull() {
            addCriterion("market_name is null");
            return (Criteria) this;
        }

        public Criteria andMarketNameIsNotNull() {
            addCriterion("market_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarketNameEqualTo(String value) {
            addCriterion("market_name =", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameNotEqualTo(String value) {
            addCriterion("market_name <>", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameGreaterThan(String value) {
            addCriterion("market_name >", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameGreaterThanOrEqualTo(String value) {
            addCriterion("market_name >=", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameLessThan(String value) {
            addCriterion("market_name <", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameLessThanOrEqualTo(String value) {
            addCriterion("market_name <=", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameLike(String value) {
            addCriterion("market_name like", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameNotLike(String value) {
            addCriterion("market_name not like", value, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameIn(List<String> values) {
            addCriterion("market_name in", values, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameNotIn(List<String> values) {
            addCriterion("market_name not in", values, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameBetween(String value1, String value2) {
            addCriterion("market_name between", value1, value2, "marketName");
            return (Criteria) this;
        }

        public Criteria andMarketNameNotBetween(String value1, String value2) {
            addCriterion("market_name not between", value1, value2, "marketName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdIsNull() {
            addCriterion("first_org_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdIsNotNull() {
            addCriterion("first_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdEqualTo(Integer value) {
            addCriterion("first_org_id =", value, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdNotEqualTo(Integer value) {
            addCriterion("first_org_id <>", value, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdGreaterThan(Integer value) {
            addCriterion("first_org_id >", value, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_org_id >=", value, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdLessThan(Integer value) {
            addCriterion("first_org_id <", value, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_org_id <=", value, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdIn(List<Integer> values) {
            addCriterion("first_org_id in", values, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdNotIn(List<Integer> values) {
            addCriterion("first_org_id not in", values, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("first_org_id between", value1, value2, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_org_id not between", value1, value2, "firstOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdIsNull() {
            addCriterion("second_org_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdIsNotNull() {
            addCriterion("second_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdEqualTo(Integer value) {
            addCriterion("second_org_id =", value, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdNotEqualTo(Integer value) {
            addCriterion("second_org_id <>", value, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdGreaterThan(Integer value) {
            addCriterion("second_org_id >", value, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_org_id >=", value, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdLessThan(Integer value) {
            addCriterion("second_org_id <", value, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("second_org_id <=", value, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdIn(List<Integer> values) {
            addCriterion("second_org_id in", values, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdNotIn(List<Integer> values) {
            addCriterion("second_org_id not in", values, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("second_org_id between", value1, value2, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("second_org_id not between", value1, value2, "secondOrgId");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameIsNull() {
            addCriterion("first_org_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameIsNotNull() {
            addCriterion("first_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameEqualTo(String value) {
            addCriterion("first_org_name =", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameNotEqualTo(String value) {
            addCriterion("first_org_name <>", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameGreaterThan(String value) {
            addCriterion("first_org_name >", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_org_name >=", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameLessThan(String value) {
            addCriterion("first_org_name <", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameLessThanOrEqualTo(String value) {
            addCriterion("first_org_name <=", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameLike(String value) {
            addCriterion("first_org_name like", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameNotLike(String value) {
            addCriterion("first_org_name not like", value, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameIn(List<String> values) {
            addCriterion("first_org_name in", values, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameNotIn(List<String> values) {
            addCriterion("first_org_name not in", values, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameBetween(String value1, String value2) {
            addCriterion("first_org_name between", value1, value2, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andFirstOrgNameNotBetween(String value1, String value2) {
            addCriterion("first_org_name not between", value1, value2, "firstOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameIsNull() {
            addCriterion("second_org_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameIsNotNull() {
            addCriterion("second_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameEqualTo(String value) {
            addCriterion("second_org_name =", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameNotEqualTo(String value) {
            addCriterion("second_org_name <>", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameGreaterThan(String value) {
            addCriterion("second_org_name >", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_org_name >=", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameLessThan(String value) {
            addCriterion("second_org_name <", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameLessThanOrEqualTo(String value) {
            addCriterion("second_org_name <=", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameLike(String value) {
            addCriterion("second_org_name like", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameNotLike(String value) {
            addCriterion("second_org_name not like", value, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameIn(List<String> values) {
            addCriterion("second_org_name in", values, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameNotIn(List<String> values) {
            addCriterion("second_org_name not in", values, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameBetween(String value1, String value2) {
            addCriterion("second_org_name between", value1, value2, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andSecondOrgNameNotBetween(String value1, String value2) {
            addCriterion("second_org_name not between", value1, value2, "secondOrgName");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andMarketAddressIsNull() {
            addCriterion("market_address is null");
            return (Criteria) this;
        }

        public Criteria andMarketAddressIsNotNull() {
            addCriterion("market_address is not null");
            return (Criteria) this;
        }

        public Criteria andMarketAddressEqualTo(String value) {
            addCriterion("market_address =", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressNotEqualTo(String value) {
            addCriterion("market_address <>", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressGreaterThan(String value) {
            addCriterion("market_address >", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressGreaterThanOrEqualTo(String value) {
            addCriterion("market_address >=", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressLessThan(String value) {
            addCriterion("market_address <", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressLessThanOrEqualTo(String value) {
            addCriterion("market_address <=", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressLike(String value) {
            addCriterion("market_address like", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressNotLike(String value) {
            addCriterion("market_address not like", value, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressIn(List<String> values) {
            addCriterion("market_address in", values, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressNotIn(List<String> values) {
            addCriterion("market_address not in", values, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressBetween(String value1, String value2) {
            addCriterion("market_address between", value1, value2, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketAddressNotBetween(String value1, String value2) {
            addCriterion("market_address not between", value1, value2, "marketAddress");
            return (Criteria) this;
        }

        public Criteria andMarketShortIsNull() {
            addCriterion("market_short is null");
            return (Criteria) this;
        }

        public Criteria andMarketShortIsNotNull() {
            addCriterion("market_short is not null");
            return (Criteria) this;
        }

        public Criteria andMarketShortEqualTo(String value) {
            addCriterion("market_short =", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortNotEqualTo(String value) {
            addCriterion("market_short <>", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortGreaterThan(String value) {
            addCriterion("market_short >", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortGreaterThanOrEqualTo(String value) {
            addCriterion("market_short >=", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortLessThan(String value) {
            addCriterion("market_short <", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortLessThanOrEqualTo(String value) {
            addCriterion("market_short <=", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortLike(String value) {
            addCriterion("market_short like", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortNotLike(String value) {
            addCriterion("market_short not like", value, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortIn(List<String> values) {
            addCriterion("market_short in", values, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortNotIn(List<String> values) {
            addCriterion("market_short not in", values, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortBetween(String value1, String value2) {
            addCriterion("market_short between", value1, value2, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketShortNotBetween(String value1, String value2) {
            addCriterion("market_short not between", value1, value2, "marketShort");
            return (Criteria) this;
        }

        public Criteria andMarketStampIsNull() {
            addCriterion("market_stamp is null");
            return (Criteria) this;
        }

        public Criteria andMarketStampIsNotNull() {
            addCriterion("market_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andMarketStampEqualTo(String value) {
            addCriterion("market_stamp =", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampNotEqualTo(String value) {
            addCriterion("market_stamp <>", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampGreaterThan(String value) {
            addCriterion("market_stamp >", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampGreaterThanOrEqualTo(String value) {
            addCriterion("market_stamp >=", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampLessThan(String value) {
            addCriterion("market_stamp <", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampLessThanOrEqualTo(String value) {
            addCriterion("market_stamp <=", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampLike(String value) {
            addCriterion("market_stamp like", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampNotLike(String value) {
            addCriterion("market_stamp not like", value, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampIn(List<String> values) {
            addCriterion("market_stamp in", values, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampNotIn(List<String> values) {
            addCriterion("market_stamp not in", values, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampBetween(String value1, String value2) {
            addCriterion("market_stamp between", value1, value2, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketStampNotBetween(String value1, String value2) {
            addCriterion("market_stamp not between", value1, value2, "marketStamp");
            return (Criteria) this;
        }

        public Criteria andMarketPicIsNull() {
            addCriterion("market_pic is null");
            return (Criteria) this;
        }

        public Criteria andMarketPicIsNotNull() {
            addCriterion("market_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPicEqualTo(String value) {
            addCriterion("market_pic =", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicNotEqualTo(String value) {
            addCriterion("market_pic <>", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicGreaterThan(String value) {
            addCriterion("market_pic >", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicGreaterThanOrEqualTo(String value) {
            addCriterion("market_pic >=", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicLessThan(String value) {
            addCriterion("market_pic <", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicLessThanOrEqualTo(String value) {
            addCriterion("market_pic <=", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicLike(String value) {
            addCriterion("market_pic like", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicNotLike(String value) {
            addCriterion("market_pic not like", value, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicIn(List<String> values) {
            addCriterion("market_pic in", values, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicNotIn(List<String> values) {
            addCriterion("market_pic not in", values, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicBetween(String value1, String value2) {
            addCriterion("market_pic between", value1, value2, "marketPic");
            return (Criteria) this;
        }

        public Criteria andMarketPicNotBetween(String value1, String value2) {
            addCriterion("market_pic not between", value1, value2, "marketPic");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("lon like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("lon not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andCarportIsNull() {
            addCriterion("carport is null");
            return (Criteria) this;
        }

        public Criteria andCarportIsNotNull() {
            addCriterion("carport is not null");
            return (Criteria) this;
        }

        public Criteria andCarportEqualTo(Integer value) {
            addCriterion("carport =", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportNotEqualTo(Integer value) {
            addCriterion("carport <>", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportGreaterThan(Integer value) {
            addCriterion("carport >", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportGreaterThanOrEqualTo(Integer value) {
            addCriterion("carport >=", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportLessThan(Integer value) {
            addCriterion("carport <", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportLessThanOrEqualTo(Integer value) {
            addCriterion("carport <=", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportIn(List<Integer> values) {
            addCriterion("carport in", values, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportNotIn(List<Integer> values) {
            addCriterion("carport not in", values, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportBetween(Integer value1, Integer value2) {
            addCriterion("carport between", value1, value2, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportNotBetween(Integer value1, Integer value2) {
            addCriterion("carport not between", value1, value2, "carport");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursIsNull() {
            addCriterion("opening_hours is null");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursIsNotNull() {
            addCriterion("opening_hours is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursEqualTo(String value) {
            addCriterion("opening_hours =", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursNotEqualTo(String value) {
            addCriterion("opening_hours <>", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursGreaterThan(String value) {
            addCriterion("opening_hours >", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursGreaterThanOrEqualTo(String value) {
            addCriterion("opening_hours >=", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursLessThan(String value) {
            addCriterion("opening_hours <", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursLessThanOrEqualTo(String value) {
            addCriterion("opening_hours <=", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursLike(String value) {
            addCriterion("opening_hours like", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursNotLike(String value) {
            addCriterion("opening_hours not like", value, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursIn(List<String> values) {
            addCriterion("opening_hours in", values, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursNotIn(List<String> values) {
            addCriterion("opening_hours not in", values, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursBetween(String value1, String value2) {
            addCriterion("opening_hours between", value1, value2, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOpeningHoursNotBetween(String value1, String value2) {
            addCriterion("opening_hours not between", value1, value2, "openingHours");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdIsNull() {
            addCriterion("out_market_id is null");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdIsNotNull() {
            addCriterion("out_market_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdEqualTo(String value) {
            addCriterion("out_market_id =", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdNotEqualTo(String value) {
            addCriterion("out_market_id <>", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdGreaterThan(String value) {
            addCriterion("out_market_id >", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_market_id >=", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdLessThan(String value) {
            addCriterion("out_market_id <", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdLessThanOrEqualTo(String value) {
            addCriterion("out_market_id <=", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdLike(String value) {
            addCriterion("out_market_id like", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdNotLike(String value) {
            addCriterion("out_market_id not like", value, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdIn(List<String> values) {
            addCriterion("out_market_id in", values, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdNotIn(List<String> values) {
            addCriterion("out_market_id not in", values, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdBetween(String value1, String value2) {
            addCriterion("out_market_id between", value1, value2, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andOutMarketIdNotBetween(String value1, String value2) {
            addCriterion("out_market_id not between", value1, value2, "outMarketId");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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