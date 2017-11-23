package com.mfzhang.mayi.valid.test;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * 
 * @author mingfei.zhang 2017年11月22日 下午3:41:06
 */
public class UserInfo implements Serializable {

	/**
	 * -7329858980060303089L
	 * 
	 * @author mingfei.zhang 2017年11月22日 下午3:40:56
	 */
	private static final long serialVersionUID = -7329858980060303089L;

	@NotNull(message = "主键ID不能为空")
	private Integer id;

	@NotBlank(message = "名称不能为空")
	private String username;

	@NotNull(message = "出生日期不能为空")
	private Date birthDate;

	@NotNull(message = "地址不能为空")
	@Valid
	private Address address;
	
	@Valid
	@NotNull(message = "电话不能为空")
	@Size(max = 3, message = "电话最多3个")
	private List<Phone> phoneList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}

}
