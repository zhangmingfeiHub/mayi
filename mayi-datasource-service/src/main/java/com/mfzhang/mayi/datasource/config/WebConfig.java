package com.mfzhang.mayi.datasource.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mfzhang.mayi.datasource.Address;
import com.mfzhang.mayi.datasource.User;

@Configuration // 表明是配置类
@ComponentScan("com.mfzhang.mayi.datasource") // 扫描包
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
	
}
