package com.mfzhang.mayi.common.utils;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

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

	private static final char[] CHECK_BIT_ARRAY = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
	private static final int CHECK_BIT_LENGTH = CHECK_BIT_ARRAY.length;

	private static final int[] W = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
	private static final int W_LENGTH = W.length;

	private static final Pattern IDCARD_PATTERN = Pattern.compile("\\d{15}(\\d{2}[Xx\\d])?");
	
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

	/**
	 * 判断身份证号码是否有效<br/>
	 * true: 有效<br/>
	 * false: 无效
	 * 
	 * @author mingfei.z
	 * @param value
	 * @return
	 */
	public static boolean isValid(String value) {
		if (!StringUtils.hasText(value)) {
			return false;
		}

		// 15位身份证不校验
		if (value.length() == 15) {
			return true;
		}
		
		if (!IDCARD_PATTERN.matcher(value).matches()) {
			return false;
		}
		
		int s = 0;
		for (int i = 0; i < W_LENGTH; i++) {
			s += Integer.parseInt(String.valueOf(value.charAt(i))) * W[i];
		}
		
		return Character.toUpperCase(value.charAt(17)) == getCheckBit(s);
	}

	private static char getCheckBit(int s) {
		return CHECK_BIT_ARRAY[s % CHECK_BIT_LENGTH];
	}
	
}
