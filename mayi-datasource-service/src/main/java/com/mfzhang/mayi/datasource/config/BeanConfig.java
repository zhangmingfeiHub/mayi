package com.mfzhang.mayi.datasource.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.datasource.bean.vo.MdmMallVo;
import com.mfzhang.mayi.datasource.bean.vo.UserInfoVo;
import com.mfzhang.mayi.datasource.pojo.Address;
import com.mfzhang.mayi.datasource.pojo.User;

@Configuration
public class BeanConfig {

	/*
	 * 1. javaConfig第一种注入方式
	 * 
	@Bean
	public User user() {
		User user = new User();
		user.setUserId(1);
		user.setUsername("A");
		user.setSex((byte)1);
		user.setAge(22);
		user.setBirth(new Date());
		
		user.setAddress(address()); // 1. javaConfig第一种注入方式
		
		return user;
	}
	*/
	
	@Bean
	public User user(Address address) {
		User user = new User();
		user.setUserId(1);
		user.setUsername("A");
		user.setSex((byte)1);
		user.setAge(22);
		user.setBirth(new Date());
		
		user.setAddress(address); // 2. javaConfig第二种注入方式
		
		return user;
	}
	
	@Bean
	public Address address() {
		Address address = new Address();
		address.setProvinceCode("0000001");
		address.setProvinceName("A省");
		address.setCityCode("0001");
		address.setCityName("B市");
		return address;
	}
	
	@Bean
	public UserInfoVo userInfo() {
		
		UserInfoVo userInfoVo = new UserInfoVo();
		userInfoVo.setId(1);
		userInfoVo.setAgentsBusinessId(111);
		userInfoVo.setDeleteStatus(CommonConstants.DeleteStatus.NO);
		userInfoVo.seteSigned("222");
		userInfoVo.setIdCard("card");
		userInfoVo.setMobilePhone("15011111111");
		userInfoVo.setOpenId("openId");
		
		return userInfoVo;
	}
	
	@Bean
	public MdmMallVo mdmMallVo() {
		MdmMallVo mdmMallVo = new MdmMallVo();
		mdmMallVo.setMdGuid("11111");
		mdmMallVo.setAddress("address");
		mdmMallVo.setFullName("fullname");
		
		return mdmMallVo;
	}
	
}
