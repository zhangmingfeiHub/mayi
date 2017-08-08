package com.mfzhang.mayi.datasource.pojo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 *
 * @author Guo YL 2017年6月20日 下午10:33:44
 */
public class User {

	private Integer userId;
	private String username;
	private Byte sex;
	private Integer age;
	private Date birth;

	private Address address;
	
	@Value("${mayi.student.name}")
	private String stuName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username + stuName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
