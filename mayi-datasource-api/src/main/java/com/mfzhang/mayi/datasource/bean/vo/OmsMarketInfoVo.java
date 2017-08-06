package com.mfzhang.mayi.datasource.bean.vo;

import java.io.Serializable;

/**
 * 商场信息Vo
 * 
 * @author mingfei.zhang 2017年8月6日 下午4:23:40
 */
public class OmsMarketInfoVo implements Serializable {

	/**
	 * 
	 * @author mingfei.zhang 2017年8月6日 下午4:23:36
	 */
	private static final long serialVersionUID = 4504083309229447344L;

	private Integer id;
	private Integer idUuid;
	private String marketNumber;
	private String marketName;
	private Integer firstOrgId;
	private Integer secondOrgId;
	private String firstOrgName;
	private String secondOrgName;
	private String provinceId;
	private String provinceName;
	private String cityId;
	private String cityName;
	private Integer districtId;
	private String marketAddress;
	private String marketShort;
	private String marketStamp;
	private String marketPic;
	private String lon;
	private String lat;
	private Integer carport;
	private String openingHours;
	private String outMarketId;
	private Integer isDel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdUuid() {
		return idUuid;
	}

	public void setIdUuid(Integer idUuid) {
		this.idUuid = idUuid;
	}

	public String getMarketNumber() {
		return marketNumber;
	}

	public void setMarketNumber(String marketNumber) {
		this.marketNumber = marketNumber;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public Integer getFirstOrgId() {
		return firstOrgId;
	}

	public void setFirstOrgId(Integer firstOrgId) {
		this.firstOrgId = firstOrgId;
	}

	public Integer getSecondOrgId() {
		return secondOrgId;
	}

	public void setSecondOrgId(Integer secondOrgId) {
		this.secondOrgId = secondOrgId;
	}

	public String getFirstOrgName() {
		return firstOrgName;
	}

	public void setFirstOrgName(String firstOrgName) {
		this.firstOrgName = firstOrgName;
	}

	public String getSecondOrgName() {
		return secondOrgName;
	}

	public void setSecondOrgName(String secondOrgName) {
		this.secondOrgName = secondOrgName;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getMarketAddress() {
		return marketAddress;
	}

	public void setMarketAddress(String marketAddress) {
		this.marketAddress = marketAddress;
	}

	public String getMarketShort() {
		return marketShort;
	}

	public void setMarketShort(String marketShort) {
		this.marketShort = marketShort;
	}

	public String getMarketStamp() {
		return marketStamp;
	}

	public void setMarketStamp(String marketStamp) {
		this.marketStamp = marketStamp;
	}

	public String getMarketPic() {
		return marketPic;
	}

	public void setMarketPic(String marketPic) {
		this.marketPic = marketPic;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public Integer getCarport() {
		return carport;
	}

	public void setCarport(Integer carport) {
		this.carport = carport;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getOutMarketId() {
		return outMarketId;
	}

	public void setOutMarketId(String outMarketId) {
		this.outMarketId = outMarketId;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}
