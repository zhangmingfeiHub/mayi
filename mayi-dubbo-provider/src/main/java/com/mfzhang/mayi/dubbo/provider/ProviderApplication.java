package com.mfzhang.mayi.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *
 * @author Guo YL 2017年9月12日 上午1:04:48
 */
public class ProviderApplication {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.in.read();
	}
	
}
