package com.mfzhang.mayi.common.utils;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;

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
	
	/**
	 * 
	 * 
	 * @param obj
	 * @return
	 * @author Guo YL 2017年9月25日 上午12:56:03
	 */
	public static String writeValueAsString(Object obj) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		
		try {
			// ObjectMapper Date类型默认转为timestamp形式，现取消默认
			objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
			// 设置自定义Date格式
			objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			
			// 这种方式不生效，可能是个bug
			// objectMapper.getSerializationConfig().with(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			// objectMapper.getDeserializationConfig().with(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			json = objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			
			logger.error("对象转json格式异常，msg={}", e);
		}
		
		return json;
	}
	
	/**
	 * 
	 * @param content
	 * @param clazz
	 * @return
	 * @author mingfei.zhang 2017年11月28日 上午10:32:03
	 */
	public static Object readValue(String content, Class clazz) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Object object = null;
		
		try {
			object = objectMapper.readValue(content, clazz);
		} catch (Exception e) {
			
			logger.error("json格式转对象异常，msg={}", e);
		}
		
		return object;
	}
	
}
