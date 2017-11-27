package com.mfzhang.mayi.job;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

/**
 * Sping 配置
 *
 * @author Guo YL 2017年10月31日 下午10:25:49
 */
@Configuration
@ComponentScan(basePackageClasses = MarkInterface.class, excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
})
@ImportResource("classpath*:spring/spring-*.xml")
public class WebConfig {

}
