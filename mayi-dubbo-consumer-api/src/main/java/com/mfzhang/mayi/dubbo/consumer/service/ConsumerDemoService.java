package com.mfzhang.mayi.dubbo.consumer.service;

/**
 * 
 * 
 * @author mingfei.zhang 2017年9月12日 下午5:40:00
 */
public interface ConsumerDemoService {

	/**
	 * 对谁说
	 * @param name
	 * @author mingfei.zhang 2017年9月12日 下午5:40:57
	 */
	void sayTo(String name);
	
	/**
	 * 打印某学生信息
	 * 
	 * @param id
	 * @author Guo YL 2017年9月19日 上午12:06:14
	 */
	void printStudentInfo(Integer id);
	
}
