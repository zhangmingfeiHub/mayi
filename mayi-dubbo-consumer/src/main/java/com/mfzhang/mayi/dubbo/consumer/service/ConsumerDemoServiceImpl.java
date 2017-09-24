package com.mfzhang.mayi.dubbo.consumer.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.dubbo.provider.bean.Student;
import com.mfzhang.mayi.dubbo.provider.bean.UserInfo;
import com.mfzhang.mayi.dubbo.provider.service.DemoService;
import com.mfzhang.mayi.dubbo.provider.service.StudentService;
import com.mfzhang.mayi.dubbo.provider.service.UserInfoService;

@Service
public class ConsumerDemoServiceImpl implements ConsumerDemoService {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerDemoServiceImpl.class);
	
	// @Reference
	@Autowired
	private DemoService demoService;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private StudentService studentService;
	@Autowired
	private UserInfoService userInfoService;
	
	@Override
	public void sayTo(String name) {
		try {
			
			ServiceResult<String> serviceResult = demoService.sayHello(name);
			LogUtils.printLog(logger, Level.INFO, "调用服务提供方接口，返回结果={}", CommonUtils.writeValueAsString(objectMapper, serviceResult));
		} catch (Exception e) {
			LogUtils.printLog(logger, Level.ERROR, "调用服务提供方接口异常：{}", e);
		}
	}

	@Override
	public void printStudentInfo(Integer id) {
		try {
			ServiceResult<Student> serviceResult = studentService.getStudentInfoById(id);
			LogUtils.printLog(logger, Level.INFO, "调用服务提供方接口，返回结果={}", CommonUtils.writeValueAsString(objectMapper, serviceResult));
		} catch (Exception e) {
			LogUtils.printLog(logger, Level.ERROR, "调用服务提供方接口异常：{}", e);
		}
	}
	
	@Override
	public void saveUserInfo() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("100Name");
		userInfo.setAge(20);
		userInfo.setLoginDate(new Date());
		userInfo.setExpiryDate(new Date(new Date().getTime() + 10000));
		
		try {
			userInfoService.save(userInfo);
		} catch (Exception e) {
			LogUtils.printLog(logger, Level.ERROR, "调用服务提供方接口异常：{}", e);
		}
	}
	
	@Override
	public void updateUserInfo() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(200l);
		
		try {
			userInfoService.update(userInfo);
		} catch (Exception e) {
			LogUtils.printLog(logger, Level.ERROR, "调用服务提供方接口异常：{}", e);
		}
	}
	
}
