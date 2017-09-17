package com.mfzhang.mayi.dubbo.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.dubbo.provider.service.DemoService;

@Service
public class ConsumerDemoServiceImpl implements ConsumerDemoService {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerDemoServiceImpl.class);
	
	// @Reference
	@Autowired
	private DemoService demoService;
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public void sayTo(String name) {
		try {
			
			ServiceResult<String> serviceResult = demoService.sayHello(name);
			LogUtils.printLog(logger, Level.INFO, "调用服务提供方接口，返回结果={}", objectMapper.writeValueAsString(serviceResult));
		} catch (Exception e) {
			LogUtils.printLog(logger, Level.ERROR, "调用服务提供方接口异常：{}", e);
		}
	}

}
