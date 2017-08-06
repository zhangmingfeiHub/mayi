package com.mfzhang.mayi.datasource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 配置连接类，多个配置合在一起
 * 
 * @author mingfei.zhang 2017年8月6日 下午5:27:46
 */
@Configuration
@Import({BeanConfig.class, WebConfig.class})
@ImportResource(locations = {"classpath:spring/applicationContext*.xml"})
public class MayiConfig {

}
