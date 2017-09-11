package com.mfzhang.mayi.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.dubbo.provider.service.DemoService;

/**
 * 
 *
 * @author Guo YL 2017年9月12日 上午1:04:39
 */
public class ConsumerApplication {

	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        ServiceResult<String> serviceResult = demoService.sayHello("world"); // execute remote invocation
        System.out.println(serviceResult.getData()); // show the result
    }
	
}
