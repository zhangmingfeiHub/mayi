package com.mfzhang.mayi.datasource.domain;

import java.io.Serializable;
import java.util.Date;

public class MdmMall implements Serializable {
    private String mdGuid;

    private String mdmId;

    private String mallCode;

    private String psCode;

    private String fullName;

    private String shortName;

    private String mallType;

    private String mallClass;

    private String provinceCode;

    private String cityCode;

    private String countryCode;

    private String address;

    private String postCode;

    private String telephone;

    private Date openDate;

    private String regionOne;

    private String regionTwo;

    private String area;

    private String status;

    private String gps;

    private String delete;

    private Date createtime;

    private String createby;

    private Date modifytime;

    private String modifyby;

    private String operatorEmail;

    private String omsTemp;

    private Date endDate;

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

    public String getMallCode() {
        return mallCode;
    }

    public void setMallCode(String mallCode) {
        this.mallCode = mallCode == null ? null : mallCode.trim();
    }

    public String getPsCode() {
        return psCode;
    }

    public void setPsCode(String psCode) {
        this.psCode = psCode == null ? null : psCode.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getMallType() {
        return mallType;
    }

    public void setMallType(String mallType) {
        this.mallType = mallType == null ? null : mallType.trim();
    }

    public String getMallClass() {
        return mallClass;
    }

    public void setMallClass(String mallClass) {
        this.mallClass = mallClass == null ? null : mallClass.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getRegionOne() {
        return regionOne;
    }

    public void setRegionOne(String regionOne) {
        this.regionOne = regionOne == null ? null : regionOne.trim();
    }

    public String getRegionTwo() {
        return regionTwo;
    }

    public void setRegionTwo(String regionTwo) {
        this.regionTwo = regionTwo == null ? null : regionTwo.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete == null ? null : delete.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby == null ? null : modifyby.trim();
    }

    public String getOperatorEmail() {
        return operatorEmail;
    }

    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail == null ? null : operatorEmail.trim();
    }

    public String getOmsTemp() {
        return omsTemp;
    }

    public void setOmsTemp(String omsTemp) {
        this.omsTemp = omsTemp == null ? null : omsTemp.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}