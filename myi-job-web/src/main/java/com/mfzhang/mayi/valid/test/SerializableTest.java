package com.mfzhang.mayi.valid.test;

import java.util.Date;

import com.mfzhang.mayi.common.utils.CommonUtils;

/**
 * 
 * 
 * SerializableTest.java
 * @date 2017年11月28日 上午10:25:15
 * @author mingfei.zhang
 */
public class SerializableTest {

	public static void main(String[] args) {
		/*UserInfo userInfo = new UserInfo();
		userInfo.setId(2);
		userInfo.setUsername("username");
		userInfo.setBirthDate(new Date());
		
		String userInfoJson = CommonUtils.writeValueAsString(userInfo);
		System.out.println(userInfoJson);*/
		
		String jsonStr = "{\"id\":2,\"username\":\"username\",\"birthDate\":1511836022560,\"address\":null,\"phoneList\":null}";
		UserInfo userInfo = (UserInfo) CommonUtils.readValue(jsonStr, UserInfo.class);
		System.out.println(userInfo.toString());
	}
	
}
