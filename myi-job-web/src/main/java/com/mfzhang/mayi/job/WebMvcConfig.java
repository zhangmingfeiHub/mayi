package com.mfzhang.mayi.job;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.mfzhang.mayi.job.view.UserInfoExcelTemplateView;

/**
 * Spring mvc 配置
 * useDefaultFilters 用来指示是否自动扫描带有@Component、@Repository、@Service和@Controller的类，默认true；
 * includeFilters 用来添加要扫描的注解
 * excludeFilters 用来排除要扫描的注解
 * 如果添加和排除的是相同，则必须include-filter在前，exclude-filter在后
 *
 * @author Guo YL 2017年11月5日 下午4:31:59
 */
@Configuration
// @EnableWebMvc
@ComponentScan(basePackageClasses = MarkInterface.class, useDefaultFilters = false, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
})
public class WebMvcConfig extends WebMvcConfigurationSupport {
/*
	@Bean  
    public ViewResolver viewResolver() {  
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();  
        viewResolver.setPrefix("/WEB-INF/jsp/");  
        viewResolver.setSuffix(".jsp");  
        return viewResolver;  
    }
	*/
	
	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".jsp");
		registry.enableContentNegotiation(new UserInfoExcelTemplateView());
	}
	
	/**
	 * 设置由 web容器处理静态资源 ，相当于 xml中的<mvc:default-servlet-handler/>
	 */
	@Override
	protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	/**
	 * 资源访问处理器
	 * 可以在jsp中使用/static/**的方式访问/WEB-INF/static/下的内容
	 */
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");
	}
	
}
