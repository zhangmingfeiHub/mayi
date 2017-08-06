package com.mfzhang.mayi.datasource.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.datasource.Address;
import com.mfzhang.mayi.datasource.BasePackageMarker;
import com.mfzhang.mayi.datasource.User;
import com.mfzhang.mayi.datasource.bean.vo.MdmMallVo;
import com.mfzhang.mayi.datasource.bean.vo.UserInfoVo;

@Configuration // 表明是配置类
// @ComponentScan("com.mfzhang.mayi.datasource") // 扫描包
// @ComponentScan(basePackages="com.mfzhang.mayi.datasource")
// @ComponentScan(basePackages={"com.mfzhang.mayi.datasource"})
// @ComponentScan(basePackageClasses=BasePackageMarker.class)
@ComponentScan(basePackageClasses = {BasePackageMarker.class})
public class WebConfig {

	@Bean
	public User user() {
		User user = new User();
		user.setUserId(1);
		user.setUsername("A");
		user.setSex((byte)1);
		user.setAge(22);
		user.setBirth(new Date());
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
	
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	
}
