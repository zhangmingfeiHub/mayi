package com.mfzhang.mayi.dubbo.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.dubbo.consumer.AppMark;

/**
 * 配置类
 * 
 * @author mingfei.zhang 2017年9月12日 下午5:34:42
 */
@Configuration
@ComponentScan(basePackageClasses = {AppMark.class})
@ImportResource("classpath:META-INF/spring/dubbo-demo-consumer.xml")
public class AppConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	
}
