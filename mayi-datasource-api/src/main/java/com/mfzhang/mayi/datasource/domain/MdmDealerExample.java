package com.mfzhang.mayi.datasource.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MdmDealerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdmDealerExample() {
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

        public Criteria andDealerCodeIsNull() {
            addCriterion("dealer_code is null");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIsNotNull() {
            addCriterion("dealer_code is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCodeEqualTo(String value) {
            addCriterion("dealer_code =", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotEqualTo(String value) {
            addCriterion("dealer_code <>", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeGreaterThan(String value) {
            addCriterion("dealer_code >", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_code >=", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLessThan(String value) {
            addCriterion("dealer_code <", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLessThanOrEqualTo(String value) {
            addCriterion("dealer_code <=", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeLike(String value) {
            addCriterion("dealer_code like", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotLike(String value) {
            addCriterion("dealer_code not like", value, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeIn(List<String> values) {
            addCriterion("dealer_code in", values, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotIn(List<String> values) {
            addCriterion("dealer_code not in", values, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeBetween(String value1, String value2) {
            addCriterion("dealer_code between", value1, value2, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andDealerCodeNotBetween(String value1, String value2) {
            addCriterion("dealer_code not between", value1, value2, "dealerCode");
            return (Criteria) this;
        }

        public Criteria andSapNumberIsNull() {
            addCriterion("sap_number is null");
            return (Criteria) this;
        }

        public Criteria andSapNumberIsNotNull() {
            addCriterion("sap_number is not null");
            return (Criteria) this;
        }

        public Criteria andSapNumberEqualTo(String value) {
            addCriterion("sap_number =", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberNotEqualTo(String value) {
            addCriterion("sap_number <>", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberGreaterThan(String value) {
            addCriterion("sap_number >", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sap_number >=", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberLessThan(String value) {
            addCriterion("sap_number <", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberLessThanOrEqualTo(String value) {
            addCriterion("sap_number <=", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberLike(String value) {
            addCriterion("sap_number like", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberNotLike(String value) {
            addCriterion("sap_number not like", value, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberIn(List<String> values) {
            addCriterion("sap_number in", values, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberNotIn(List<String> values) {
            addCriterion("sap_number not in", values, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberBetween(String value1, String value2) {
            addCriterion("sap_number between", value1, value2, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andSapNumberNotBetween(String value1, String value2) {
            addCriterion("sap_number not between", value1, value2, "sapNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIsNull() {
            addCriterion("business_nature is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIsNotNull() {
            addCriterion("business_nature is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureEqualTo(String value) {
            addCriterion("business_nature =", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotEqualTo(String value) {
            addCriterion("business_nature <>", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureGreaterThan(String value) {
            addCriterion("business_nature >", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureGreaterThanOrEqualTo(String value) {
            addCriterion("business_nature >=", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLessThan(String value) {
            addCriterion("business_nature <", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLessThanOrEqualTo(String value) {
            addCriterion("business_nature <=", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLike(String value) {
            addCriterion("business_nature like", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotLike(String value) {
            addCriterion("business_nature not like", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIn(List<String> values) {
            addCriterion("business_nature in", values, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotIn(List<String> values) {
            addCriterion("business_nature not in", values, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureBetween(String value1, String value2) {
            addCriterion("business_nature between", value1, value2, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotBetween(String value1, String value2) {
            addCriterion("business_nature not between", value1, value2, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNull() {
            addCriterion("is_agent is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNotNull() {
            addCriterion("is_agent is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentEqualTo(String value) {
            addCriterion("is_agent =", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotEqualTo(String value) {
            addCriterion("is_agent <>", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThan(String value) {
            addCriterion("is_agent >", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThanOrEqualTo(String value) {
            addCriterion("is_agent >=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThan(String value) {
            addCriterion("is_agent <", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThanOrEqualTo(String value) {
            addCriterion("is_agent <=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLike(String value) {
            addCriterion("is_agent like", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotLike(String value) {
            addCriterion("is_agent not like", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentIn(List<String> values) {
            addCriterion("is_agent in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotIn(List<String> values) {
            addCriterion("is_agent not in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentBetween(String value1, String value2) {
            addCriterion("is_agent between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotBetween(String value1, String value2) {
            addCriterion("is_agent not between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateIsNull() {
            addCriterion("is_merge_certificate is null");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateIsNotNull() {
            addCriterion("is_merge_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateEqualTo(String value) {
            addCriterion("is_merge_certificate =", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateNotEqualTo(String value) {
            addCriterion("is_merge_certificate <>", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateGreaterThan(String value) {
            addCriterion("is_merge_certificate >", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("is_merge_certificate >=", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateLessThan(String value) {
            addCriterion("is_merge_certificate <", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateLessThanOrEqualTo(String value) {
            addCriterion("is_merge_certificate <=", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateLike(String value) {
            addCriterion("is_merge_certificate like", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateNotLike(String value) {
            addCriterion("is_merge_certificate not like", value, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateIn(List<String> values) {
            addCriterion("is_merge_certificate in", values, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateNotIn(List<String> values) {
            addCriterion("is_merge_certificate not in", values, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateBetween(String value1, String value2) {
            addCriterion("is_merge_certificate between", value1, value2, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andIsMergeCertificateNotBetween(String value1, String value2) {
            addCriterion("is_merge_certificate not between", value1, value2, "isMergeCertificate");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andRAddrIsNull() {
            addCriterion("r_addr is null");
            return (Criteria) this;
        }

        public Criteria andRAddrIsNotNull() {
            addCriterion("r_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRAddrEqualTo(String value) {
            addCriterion("r_addr =", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrNotEqualTo(String value) {
            addCriterion("r_addr <>", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrGreaterThan(String value) {
            addCriterion("r_addr >", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrGreaterThanOrEqualTo(String value) {
            addCriterion("r_addr >=", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrLessThan(String value) {
            addCriterion("r_addr <", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrLessThanOrEqualTo(String value) {
            addCriterion("r_addr <=", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrLike(String value) {
            addCriterion("r_addr like", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrNotLike(String value) {
            addCriterion("r_addr not like", value, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrIn(List<String> values) {
            addCriterion("r_addr in", values, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrNotIn(List<String> values) {
            addCriterion("r_addr not in", values, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrBetween(String value1, String value2) {
            addCriterion("r_addr between", value1, value2, "rAddr");
            return (Criteria) this;
        }

        public Criteria andRAddrNotBetween(String value1, String value2) {
            addCriterion("r_addr not between", value1, value2, "rAddr");
            return (Criteria) this;
        }

        public Criteria andCorpoNameIsNull() {
            addCriterion("corpo_name is null");
            return (Criteria) this;
        }

        public Criteria andCorpoNameIsNotNull() {
            addCriterion("corpo_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorpoNameEqualTo(String value) {
            addCriterion("corpo_name =", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameNotEqualTo(String value) {
            addCriterion("corpo_name <>", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameGreaterThan(String value) {
            addCriterion("corpo_name >", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameGreaterThanOrEqualTo(String value) {
            addCriterion("corpo_name >=", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameLessThan(String value) {
            addCriterion("corpo_name <", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameLessThanOrEqualTo(String value) {
            addCriterion("corpo_name <=", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameLike(String value) {
            addCriterion("corpo_name like", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameNotLike(String value) {
            addCriterion("corpo_name not like", value, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameIn(List<String> values) {
            addCriterion("corpo_name in", values, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameNotIn(List<String> values) {
            addCriterion("corpo_name not in", values, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameBetween(String value1, String value2) {
            addCriterion("corpo_name between", value1, value2, "corpoName");
            return (Criteria) this;
        }

        public Criteria andCorpoNameNotBetween(String value1, String value2) {
            addCriterion("corpo_name not between", value1, value2, "corpoName");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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