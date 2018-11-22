package com.zebra.print.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * CORS全局配置 除了细粒度基于注解的配置，你可能会想定义一些全局CORS的配置。 这类似于使用过滤器，但可以在Spring
 * MVC中声明，并结合细粒度@CrossOrigin配置。 默认情况下所有的域名和GET、HEAD和POST方法都是允许的。
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}