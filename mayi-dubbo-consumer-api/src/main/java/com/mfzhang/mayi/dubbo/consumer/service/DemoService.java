package com.mfzhang.mayi.dubbo.consumer.service;

import com.mfzhang.mayi.common.ServiceResult;

/**
 * dubbo demo service
 *
 * @author Guo YL 2017年9月12日 上午12:05:46
 */
public interface DemoService {

	/**
	 * 对<name> 说hello
	 * 
	 * @param name 用户
	 * @return
	 * @author Guo YL 2017年9月12日 上午12:06:19
	 */
	ServiceResult<String> sayHello(String name);
	
}
