package com.mfzhang.mayi.datasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.datasource.BasePackageMarker;

@Configuration // 表明是配置类
// @ComponentScan("com.mfzhang.mayi.datasource") // 扫描包
// @ComponentScan(basePackages="com.mfzhang.mayi.datasource")
// @ComponentScan(basePackages={"com.mfzhang.mayi.datasource"})
// @ComponentScan(basePackageClasses=BasePackageMarker.class)
@ComponentScan(basePackageClasses = {BasePackageMarker.class})
public class WebConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	
}
