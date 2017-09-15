package com.mfzhang.mayi.dubbo.provider.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试
 * 
 * @author mingfei.zhang 2017年9月13日 上午10:25:31
 */
public class DemoServiceTest extends BaseServiceTest {

	@Autowired
	private DemoService demoService;
	
	@Test
	public void testSayHello() {
		demoService.sayHello("jim");
	}
	
}
