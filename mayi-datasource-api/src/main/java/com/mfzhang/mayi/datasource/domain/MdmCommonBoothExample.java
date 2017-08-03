package com.mfzhang.mayi.datasource.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MdmCommonBoothExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdmCommonBoothExample() {
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

        public Criteria andBoothCodeIsNull() {
            addCriterion("booth_code is null");
            return (Criteria) this;
        }

        public Criteria andBoothCodeIsNotNull() {
            addCriterion("booth_code is not null");
            return (Criteria) this;
        }

        public Criteria andBoothCodeEqualTo(String value) {
            addCriterion("booth_code =", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeNotEqualTo(String value) {
            addCriterion("booth_code <>", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeGreaterThan(String value) {
            addCriterion("booth_code >", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeGreaterThanOrEqualTo(String value) {
            addCriterion("booth_code >=", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeLessThan(String value) {
            addCriterion("booth_code <", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeLessThanOrEqualTo(String value) {
            addCriterion("booth_code <=", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeLike(String value) {
            addCriterion("booth_code like", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeNotLike(String value) {
            addCriterion("booth_code not like", value, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeIn(List<String> values) {
            addCriterion("booth_code in", values, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeNotIn(List<String> values) {
            addCriterion("booth_code not in", values, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeBetween(String value1, String value2) {
            addCriterion("booth_code between", value1, value2, "boothCode");
            return (Criteria) this;
        }

        public Criteria andBoothCodeNotBetween(String value1, String value2) {
            addCriterion("booth_code not between", value1, value2, "boothCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeIsNull() {
            addCriterion("cad_code is null");
            return (Criteria) this;
        }

        public Criteria andCadCodeIsNotNull() {
            addCriterion("cad_code is not null");
            return (Criteria) this;
        }

        public Criteria andCadCodeEqualTo(String value) {
            addCriterion("cad_code =", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeNotEqualTo(String value) {
            addCriterion("cad_code <>", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeGreaterThan(String value) {
            addCriterion("cad_code >", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cad_code >=", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeLessThan(String value) {
            addCriterion("cad_code <", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeLessThanOrEqualTo(String value) {
            addCriterion("cad_code <=", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeLike(String value) {
            addCriterion("cad_code like", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeNotLike(String value) {
            addCriterion("cad_code not like", value, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeIn(List<String> values) {
            addCriterion("cad_code in", values, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeNotIn(List<String> values) {
            addCriterion("cad_code not in", values, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeBetween(String value1, String value2) {
            addCriterion("cad_code between", value1, value2, "cadCode");
            return (Criteria) this;
        }

        public Criteria andCadCodeNotBetween(String value1, String value2) {
            addCriterion("cad_code not between", value1, value2, "cadCode");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeIsNull() {
            addCriterion("space_type is null");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeIsNotNull() {
            addCriterion("space_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeEqualTo(String value) {
            addCriterion("space_type =", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotEqualTo(String value) {
            addCriterion("space_type <>", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeGreaterThan(String value) {
            addCriterion("space_type >", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("space_type >=", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeLessThan(String value) {
            addCriterion("space_type <", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeLessThanOrEqualTo(String value) {
            addCriterion("space_type <=", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeLike(String value) {
            addCriterion("space_type like", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotLike(String value) {
            addCriterion("space_type not like", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeIn(List<String> values) {
            addCriterion("space_type in", values, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotIn(List<String> values) {
            addCriterion("space_type not in", values, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeBetween(String value1, String value2) {
            addCriterion("space_type between", value1, value2, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotBetween(String value1, String value2) {
            addCriterion("space_type not between", value1, value2, "spaceType");
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

        public Criteria andMallEntityCodeIsNull() {
            addCriterion("mall_entity_code is null");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeIsNotNull() {
            addCriterion("mall_entity_code is not null");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeEqualTo(String value) {
            addCriterion("mall_entity_code =", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeNotEqualTo(String value) {
            addCriterion("mall_entity_code <>", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeGreaterThan(String value) {
            addCriterion("mall_entity_code >", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mall_entity_code >=", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeLessThan(String value) {
            addCriterion("mall_entity_code <", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeLessThanOrEqualTo(String value) {
            addCriterion("mall_entity_code <=", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeLike(String value) {
            addCriterion("mall_entity_code like", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeNotLike(String value) {
            addCriterion("mall_entity_code not like", value, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeIn(List<String> values) {
            addCriterion("mall_entity_code in", values, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeNotIn(List<String> values) {
            addCriterion("mall_entity_code not in", values, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeBetween(String value1, String value2) {
            addCriterion("mall_entity_code between", value1, value2, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andMallEntityCodeNotBetween(String value1, String value2) {
            addCriterion("mall_entity_code not between", value1, value2, "mallEntityCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeIsNull() {
            addCriterion("buliding_code is null");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeIsNotNull() {
            addCriterion("buliding_code is not null");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeEqualTo(String value) {
            addCriterion("buliding_code =", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeNotEqualTo(String value) {
            addCriterion("buliding_code <>", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeGreaterThan(String value) {
            addCriterion("buliding_code >", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buliding_code >=", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeLessThan(String value) {
            addCriterion("buliding_code <", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeLessThanOrEqualTo(String value) {
            addCriterion("buliding_code <=", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeLike(String value) {
            addCriterion("buliding_code like", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeNotLike(String value) {
            addCriterion("buliding_code not like", value, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeIn(List<String> values) {
            addCriterion("buliding_code in", values, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeNotIn(List<String> values) {
            addCriterion("buliding_code not in", values, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeBetween(String value1, String value2) {
            addCriterion("buliding_code between", value1, value2, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andBulidingCodeNotBetween(String value1, String value2) {
            addCriterion("buliding_code not between", value1, value2, "bulidingCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeIsNull() {
            addCriterion("floor_code is null");
            return (Criteria) this;
        }

        public Criteria andFloorCodeIsNotNull() {
            addCriterion("floor_code is not null");
            return (Criteria) this;
        }

        public Criteria andFloorCodeEqualTo(String value) {
            addCriterion("floor_code =", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeNotEqualTo(String value) {
            addCriterion("floor_code <>", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeGreaterThan(String value) {
            addCriterion("floor_code >", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("floor_code >=", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeLessThan(String value) {
            addCriterion("floor_code <", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeLessThanOrEqualTo(String value) {
            addCriterion("floor_code <=", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeLike(String value) {
            addCriterion("floor_code like", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeNotLike(String value) {
            addCriterion("floor_code not like", value, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeIn(List<String> values) {
            addCriterion("floor_code in", values, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeNotIn(List<String> values) {
            addCriterion("floor_code not in", values, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeBetween(String value1, String value2) {
            addCriterion("floor_code between", value1, value2, "floorCode");
            return (Criteria) this;
        }

        public Criteria andFloorCodeNotBetween(String value1, String value2) {
            addCriterion("floor_code not between", value1, value2, "floorCode");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Integer value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Integer value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Integer value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Integer value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Integer value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Integer> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Integer> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Integer value1, Integer value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeIsNull() {
            addCriterion("category_one_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeIsNotNull() {
            addCriterion("category_one_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeEqualTo(String value) {
            addCriterion("category_one_code =", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeNotEqualTo(String value) {
            addCriterion("category_one_code <>", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeGreaterThan(String value) {
            addCriterion("category_one_code >", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_one_code >=", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeLessThan(String value) {
            addCriterion("category_one_code <", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeLessThanOrEqualTo(String value) {
            addCriterion("category_one_code <=", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeLike(String value) {
            addCriterion("category_one_code like", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeNotLike(String value) {
            addCriterion("category_one_code not like", value, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeIn(List<String> values) {
            addCriterion("category_one_code in", values, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeNotIn(List<String> values) {
            addCriterion("category_one_code not in", values, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeBetween(String value1, String value2) {
            addCriterion("category_one_code between", value1, value2, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryOneCodeNotBetween(String value1, String value2) {
            addCriterion("category_one_code not between", value1, value2, "categoryOneCode");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIsNull() {
            addCriterion("category_two_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIsNotNull() {
            addCriterion("category_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdEqualTo(String value) {
            addCriterion("category_two_id =", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotEqualTo(String value) {
            addCriterion("category_two_id <>", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdGreaterThan(String value) {
            addCriterion("category_two_id >", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_two_id >=", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLessThan(String value) {
            addCriterion("category_two_id <", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLessThanOrEqualTo(String value) {
            addCriterion("category_two_id <=", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLike(String value) {
            addCriterion("category_two_id like", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotLike(String value) {
            addCriterion("category_two_id not like", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIn(List<String> values) {
            addCriterion("category_two_id in", values, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotIn(List<String> values) {
            addCriterion("category_two_id not in", values, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdBetween(String value1, String value2) {
            addCriterion("category_two_id between", value1, value2, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotBetween(String value1, String value2) {
            addCriterion("category_two_id not between", value1, value2, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceIsNull() {
            addCriterion("budgetary_price is null");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceIsNotNull() {
            addCriterion("budgetary_price is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceEqualTo(Double value) {
            addCriterion("budgetary_price =", value, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceNotEqualTo(Double value) {
            addCriterion("budgetary_price <>", value, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceGreaterThan(Double value) {
            addCriterion("budgetary_price >", value, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("budgetary_price >=", value, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceLessThan(Double value) {
            addCriterion("budgetary_price <", value, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceLessThanOrEqualTo(Double value) {
            addCriterion("budgetary_price <=", value, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceIn(List<Double> values) {
            addCriterion("budgetary_price in", values, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceNotIn(List<Double> values) {
            addCriterion("budgetary_price not in", values, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceBetween(Double value1, Double value2) {
            addCriterion("budgetary_price between", value1, value2, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBudgetaryPriceNotBetween(Double value1, Double value2) {
            addCriterion("budgetary_price not between", value1, value2, "budgetaryPrice");
            return (Criteria) this;
        }

        public Criteria andBoothLevelIsNull() {
            addCriterion("booth_level is null");
            return (Criteria) this;
        }

        public Criteria andBoothLevelIsNotNull() {
            addCriterion("booth_level is not null");
            return (Criteria) this;
        }

        public Criteria andBoothLevelEqualTo(String value) {
            addCriterion("booth_level =", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelNotEqualTo(String value) {
            addCriterion("booth_level <>", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelGreaterThan(String value) {
            addCriterion("booth_level >", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelGreaterThanOrEqualTo(String value) {
            addCriterion("booth_level >=", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelLessThan(String value) {
            addCriterion("booth_level <", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelLessThanOrEqualTo(String value) {
            addCriterion("booth_level <=", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelLike(String value) {
            addCriterion("booth_level like", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelNotLike(String value) {
            addCriterion("booth_level not like", value, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelIn(List<String> values) {
            addCriterion("booth_level in", values, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelNotIn(List<String> values) {
            addCriterion("booth_level not in", values, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelBetween(String value1, String value2) {
            addCriterion("booth_level between", value1, value2, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothLevelNotBetween(String value1, String value2) {
            addCriterion("booth_level not between", value1, value2, "boothLevel");
            return (Criteria) this;
        }

        public Criteria andBoothDescIsNull() {
            addCriterion("booth_desc is null");
            return (Criteria) this;
        }

        public Criteria andBoothDescIsNotNull() {
            addCriterion("booth_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBoothDescEqualTo(String value) {
            addCriterion("booth_desc =", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescNotEqualTo(String value) {
            addCriterion("booth_desc <>", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescGreaterThan(String value) {
            addCriterion("booth_desc >", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescGreaterThanOrEqualTo(String value) {
            addCriterion("booth_desc >=", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescLessThan(String value) {
            addCriterion("booth_desc <", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescLessThanOrEqualTo(String value) {
            addCriterion("booth_desc <=", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescLike(String value) {
            addCriterion("booth_desc like", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescNotLike(String value) {
            addCriterion("booth_desc not like", value, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescIn(List<String> values) {
            addCriterion("booth_desc in", values, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescNotIn(List<String> values) {
            addCriterion("booth_desc not in", values, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescBetween(String value1, String value2) {
            addCriterion("booth_desc between", value1, value2, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothDescNotBetween(String value1, String value2) {
            addCriterion("booth_desc not between", value1, value2, "boothDesc");
            return (Criteria) this;
        }

        public Criteria andBoothStatusIsNull() {
            addCriterion("booth_status is null");
            return (Criteria) this;
        }

        public Criteria andBoothStatusIsNotNull() {
            addCriterion("booth_status is not null");
            return (Criteria) this;
        }

        public Criteria andBoothStatusEqualTo(String value) {
            addCriterion("booth_status =", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusNotEqualTo(String value) {
            addCriterion("booth_status <>", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusGreaterThan(String value) {
            addCriterion("booth_status >", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusGreaterThanOrEqualTo(String value) {
            addCriterion("booth_status >=", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusLessThan(String value) {
            addCriterion("booth_status <", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusLessThanOrEqualTo(String value) {
            addCriterion("booth_status <=", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusLike(String value) {
            addCriterion("booth_status like", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusNotLike(String value) {
            addCriterion("booth_status not like", value, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusIn(List<String> values) {
            addCriterion("booth_status in", values, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusNotIn(List<String> values) {
            addCriterion("booth_status not in", values, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusBetween(String value1, String value2) {
            addCriterion("booth_status between", value1, value2, "boothStatus");
            return (Criteria) this;
        }

        public Criteria andBoothStatusNotBetween(String value1, String value2) {
            addCriterion("booth_status not between", value1, value2, "boothStatus");
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