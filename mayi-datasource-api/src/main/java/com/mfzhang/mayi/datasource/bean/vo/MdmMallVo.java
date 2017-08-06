package com.mfzhang.mayi.datasource.bean.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * MDM 商场信息Vo
 * 
 * @author mingfei.zhang 2017年8月6日 下午12:22:21
 */
public class MdmMallVo implements Serializable {

	/**
	 * 
	 * @author mingfei.zhang 2017年8月6日 下午12:22:17
	 */
	private static final long serialVersionUID = -8014197561759528360L;

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
	private String operatorEmail;
	private String omsTemp;
	private Date endDate;

	public String getMdGuid() {
		return mdGuid;
	}

	public void setMdGuid(String mdGuid) {
		this.mdGuid = mdGuid;
	}

	public String getMdmId() {
		return mdmId;
	}

	public void setMdmId(String mdmId) {
		this.mdmId = mdmId;
	}

	public String getMallCode() {
		return mallCode;
	}

	public void setMallCode(String mallCode) {
		this.mallCode = mallCode;
	}

	public String getPsCode() {
		return psCode;
	}

	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getMallType() {
		return mallType;
	}

	public void setMallType(String mallType) {
		this.mallType = mallType;
	}

	public String getMallClass() {
		return mallClass;
	}

	public void setMallClass(String mallClass) {
		this.mallClass = mallClass;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
		this.regionOne = regionOne;
	}

	public String getRegionTwo() {
		return regionTwo;
	}

	public void setRegionTwo(String regionTwo) {
		this.regionTwo = regionTwo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getOperatorEmail() {
		return operatorEmail;
	}

	public void setOperatorEmail(String operatorEmail) {
		this.operatorEmail = operatorEmail;
	}

	public String getOmsTemp() {
		return omsTemp;
	}

	public void setOmsTemp(String omsTemp) {
		this.omsTemp = omsTemp;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
