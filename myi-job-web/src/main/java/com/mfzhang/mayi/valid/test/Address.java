package com.mfzhang.mayi.valid.test;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

/**
 * 
 * 
 * @author mingfei.zhang 2017年11月22日 下午3:42:04
 */
public class Address implements Serializable {

	/**
	 * -5367111501090587574L
	 * 
	 * @author mingfei.zhang 2017年11月22日 下午3:41:58
	 */
	private static final long serialVersionUID = -5367111501090587574L;

	@NotBlank(message = "省份code不能为空")
	private String provinceCode;
	private String provinceName;
	private String cityCode;
	private String cityName;
	private String detail;

	public Address() {}
	
	public Address(@NotBlank(message = "省份code不能为空") String provinceCode, String provinceName, String cityCode,
			String cityName, String detail) {
		super();
		this.provinceCode = provinceCode;
		this.provinceName = provinceName;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.detail = detail;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
