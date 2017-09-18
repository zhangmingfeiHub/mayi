package com.mfzhang.mayi.dubbo.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.dubbo.provider.AppMark;
import com.mfzhang.mayi.dubbo.provider.bean.Student;

/**
 * 配置类
 * 
 * @author mingfei.zhang 2017年9月12日 下午4:54:53
 */
@Configuration
@ComponentScan(basePackageClasses = {AppMark.class})
public class AppConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	
	@Bean
	public Student student() {
		Student student = new Student();
		student.setStuId(100);
		student.setStuName(student.getStuId() + "-name");
		return student;
	}
	
}
