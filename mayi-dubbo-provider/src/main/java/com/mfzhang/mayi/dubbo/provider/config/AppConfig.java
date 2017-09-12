package com.mfzhang.mayi.dubbo.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.mfzhang.mayi.dubbo.provider.AppMark;
import com.mfzhang.mayi.dubbo.provider.bean.Student;

/**
 * 配置类
 * 
 * @author mingfei.zhang 2017年9月12日 下午4:54:53
 */
@Configuration
@ComponentScan(basePackageClasses = {AppMark.class})
@ImportResource(locations = {"META-INF/spring/dubbo-demo-provider.xml"})
public class AppConfig {

	@Bean
	public Student student() {
		System.out.println("=======student==============================");
		return new Student();
	}
	
}
