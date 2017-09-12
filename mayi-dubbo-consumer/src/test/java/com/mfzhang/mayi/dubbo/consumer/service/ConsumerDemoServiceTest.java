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
		consumerDemoService.sayTo("Bob");
	}
	
}