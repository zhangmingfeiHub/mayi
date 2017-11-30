package com.mfzhang.mayi.dubbo.consumer.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * 
 * @author mingfei.zhang 2017年9月12日 下午5:53:13
 */
public class ConsumerDemoServiceTest extends BaseServiceTest {

	@Autowired
	private ConsumerDemoService consumerDemoService;
	
	@Test
	public void testSayTo() {
//		consumerDemoService.sayTo("Bob");
	}
	
	@Test
	public void testPrintStudentInfo() {
//		consumerDemoService.printStudentInfo(100);
	}
	
	@Test
	public void testSaveUserInfo() {
//		consumerDemoService.saveUserInfo();
	}

	@Test
	public void testUpdateUserInfo() {
//		consumerDemoService.updateUserInfo();
	}
	
}
