package com.mfzhang.mayi.valid.test;

import com.mfzhang.mayi.common.utils.CommonUtils;

/**
 * 对象引用対值影响的测试
 * 
 * VariableTest.java
 * @date 2017年12月4日 下午1:37:07
 * @author mingfei.zhang
 */
public class VariableTest {

	public static void main(String[] args) {
		try {
			VariableTest.class.newInstance().test1();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void test1() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setUsername("name1");
		System.err.println(CommonUtils.writeValueAsString(userInfo));
		
		UserInfo userInfo2 = userInfo;
		userInfo.setRemark("remark");
		System.err.println(CommonUtils.writeValueAsString(userInfo2));
	}
	
}
