package com.mfzhang.mayi.datasource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.datasource.pojo.Student;
import com.mfzhang.mayi.datasource.pojo.User;

public class SpringBeanTest extends BaseTest {

	private static final Logger logger = LoggerFactory.getLogger(SpringBeanTest.class);
	
	@Autowired
	private User user;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private Student student;
	
	@Test
	public void testUser() {
		LogUtils.printLog(logger, Level.INFO, CommonUtils.writeValueAsString(objectMapper, user));
	}
	
	@Test
	public void testStudent() {
		LogUtils.printLog(logger, Level.INFO, CommonUtils.writeValueAsString(objectMapper, student));
	}
	
}
