package com.mfzhang.mayi.datasource.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mfzhang.mayi.datasource.BaseTest;
import com.mfzhang.mayi.datasource.bean.vo.UserInfoVo;
import com.mfzhang.mayi.datasource.service.UserService;

public class UserServiceTest extends BaseTest {

	@Autowired
	private UserService userService;
	@Autowired
	private UserInfoVo userInfo;
	
	@Test
	public void testGetUserInfoByUserId() {
		userService.getUserInfoByUserId(1);
	}
	
	@Test
	public void testInsertUserInfo() {
		userService.insertUserInfo(userInfo);
	}
	
}
