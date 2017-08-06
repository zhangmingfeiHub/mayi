package com.mfzhang.mayi.datasource.domain;

import java.io.Serializable;
import java.util.Date;

public class OmsMarketInfo implements Serializable {
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

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

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
        this.marketNumber = marketNumber == null ? null : marketNumber.trim();
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
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
        this.firstOrgName = firstOrgName == null ? null : firstOrgName.trim();
    }

    public String getSecondOrgName() {
        return secondOrgName;
    }

    public void setSecondOrgName(String secondOrgName) {
        this.secondOrgName = secondOrgName == null ? null : secondOrgName.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
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
        this.marketAddress = marketAddress == null ? null : marketAddress.trim();
    }

    public String getMarketShort() {
        return marketShort;
    }

    public void setMarketShort(String marketShort) {
        this.marketShort = marketShort == null ? null : marketShort.trim();
    }

    public String getMarketStamp() {
        return marketStamp;
    }

    public void setMarketStamp(String marketStamp) {
        this.marketStamp = marketStamp == null ? null : marketStamp.trim();
    }

    public String getMarketPic() {
        return marketPic;
    }

    public void setMarketPic(String marketPic) {
        this.marketPic = marketPic == null ? null : marketPic.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
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
        this.openingHours = openingHours == null ? null : openingHours.trim();
    }

    public String getOutMarketId() {
        return outMarketId;
    }

    public void setOutMarketId(String outMarketId) {
        this.outMarketId = outMarketId == null ? null : outMarketId.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}