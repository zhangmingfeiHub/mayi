package com.mfzhang.mayi.job;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring mvc 配置
 * useDefaultFilters 用来指示是否自动扫描带有@Component、@Repository、@Service和@Controller的类，默认true；
 * includeFilters 用来添加要扫描的注解
 * excludeFilters 用来排除要扫描的注解
 * 如果添加和排除的是相同，则必须include-filter在前，exclude-filter在后
 *
 * @author Guo YL 2017年11月5日 下午4:31:59
 */
//@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MarkInterface.class, useDefaultFilters = false, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
})
public class WebMvcConfig extends WebMvcConfigurationSupport {

	@Bean  
    public ViewResolver viewResolver() {  
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();  
        viewResolver.setPrefix("/WEB-INF/jsp/");  
        viewResolver.setSuffix(".jsp");  
        return viewResolver;  
    }
	
}
