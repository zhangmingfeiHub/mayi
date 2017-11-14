package com.mfzhang.mayi.maven.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		String result = hw.sayHello();
		assertEquals("结果错误", "hello, maven!", result);
	}
	
}
