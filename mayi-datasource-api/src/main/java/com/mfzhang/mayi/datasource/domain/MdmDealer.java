package com.mfzhang.mayi.datasource.domain;

import java.io.Serializable;
import java.util.Date;

public class MdmDealer implements Serializable {
    private String mdGuid;

    private String mdmId;

    private String dealerCode;

    private String sapNumber;

    private String businessName;

    private String businessNature;

    private String businessType;

    private String isAgent;

    private String isMergeCertificate;

    private String cId;

    private String oId;

    private String tId;

    private String pId;

    private String province;

    private String city;

    private String area;

    private String rAddr;

    private String corpoName;

    private String delete;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getMdGuid() {
        return mdGuid;
    }

    public void setMdGuid(String mdGuid) {
        this.mdGuid = mdGuid == null ? null : mdGuid.trim();
    }

    public String getMdmId() {
        return mdmId;
    }

    public void setMdmId(String mdmId) {
        this.mdmId = mdmId == null ? null : mdmId.trim();
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode == null ? null : dealerCode.trim();
    }

    public String getSapNumber() {
        return sapNumber;
    }

    public void setSapNumber(String sapNumber) {
        this.sapNumber = sapNumber == null ? null : sapNumber.trim();
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature == null ? null : businessNature.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(String isAgent) {
        this.isAgent = isAgent == null ? null : isAgent.trim();
    }

    public String getIsMergeCertificate() {
        return isMergeCertificate;
    }

    public void setIsMergeCertificate(String isMergeCertificate) {
        this.isMergeCertificate = isMergeCertificate == null ? null : isMergeCertificate.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getrAddr() {
        return rAddr;
    }

    public void setrAddr(String rAddr) {
        this.rAddr = rAddr == null ? null : rAddr.trim();
    }

    public String getCorpoName() {
        return corpoName;
    }

    public void setCorpoName(String corpoName) {
        this.corpoName = corpoName == null ? null : corpoName.trim();
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete == null ? null : delete.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}