package com.mfzhang.mayi.datasource.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.datasource.bean.vo.UserInfoVo;
import com.mfzhang.mayi.datasource.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public UserInfoVo getUserInfoByUserId(Integer userId) {
		logger.info("-----getUserInfoByUserId-----，入参={}", userId);
		return null;
	}

	@Override
	public void insertUserInfo(UserInfoVo userInfoVo) {
		
		String content = "-----insertUserInfo-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, CommonUtils.writeValueAsString(objectMapper, userInfoVo));
	}

	@Override
	public void updateUserInfo(UserInfoVo userInfoVo) {
		String content = "-----updateUserInfo-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, CommonUtils.writeValueAsString(objectMapper, userInfoVo));
	}

	@Override
	public void deleteUserInfo(UserInfoVo userInfoVo) {
		String content = "-----deleteUserInfo-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, CommonUtils.writeValueAsString(objectMapper, userInfoVo));
	}

}
