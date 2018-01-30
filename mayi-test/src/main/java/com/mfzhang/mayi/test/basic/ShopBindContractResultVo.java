package com.mfzhang.mayi.test.basic;

import java.io.Serializable;

/**
 * 店铺绑合同，返回数据
 * 
 * @author mingfei.z
 */
public class ShopBindContractResultVo implements Serializable {

	/**
	 * 1838088900990756848L
	 */
	private static final long serialVersionUID = 1838088900990756848L;
	
	private Integer shopId; // 店铺ID
	
	private String shopName; // 店铺名称
	
	private Integer dealerId; // 商户ID（龙果ID）
	
	private String outDealerId; // 商户ID（招商ID）
	
	private String dealerName; // 商户名
	
	private String brandName; // 品牌名
	
	private String seriesName; // 系列名
	
	private String mobilePhone; // 店长手机号
	
	private String marketName; // 商场名称
	
	private String marketFloor; // 店铺所在楼层
	
	private String contractCode; // 合同
	
	private String secondContractCode; // 次合同
	
	private Integer isDel; // 店铺状态：0-有效；1-无效；

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}

	public String getOutDealerId() {
		return outDealerId;
	}

	public void setOutDealerId(String outDealerId) {
		this.outDealerId = outDealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMarketFloor() {
		return marketFloor;
	}

	public void setMarketFloor(String marketFloor) {
		this.marketFloor = marketFloor;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getSecondContractCode() {
		return secondContractCode;
	}

	public void setSecondContractCode(String secondContractCode) {
		this.secondContractCode = secondContractCode;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}
