package com.mfzhang.mayi.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 容器工具类，此工具类会注册到Spring容器中
 * 
 * @author mingfei.zhang 2017年8月6日 上午10:16:19
 */
public class CommonUtils {

	private final static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
	
	/**
	 * 把对象转json格式
	 * 
	 * @param obj
	 * @return
	 * @author mingfei.zhang 2017年8月6日 上午10:22:40
	 */
	public static String writeValueAsString(ObjectMapper objectMapper, Object obj) {
		
		String json = null;
		
		try {
			json = objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			
			logger.error("对象转json格式异常，msg={}", e);
		}
		
		return json;
	}
	
}
