package com.mfzhang.mayi.valid.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

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
		test2();
	}
	
	private static void test2() {
		BigDecimal bd1 = new BigDecimal("12.000300");
		BigDecimal bd2 = new BigDecimal("13.000000");
		
		NumberFormat nf = NumberFormat.getInstance();
		String str1 = nf.format(12.3639);
		String str2 = nf.format(bd2);
		System.out.println(bd1.setScale(2,RoundingMode.HALF_UP));
		System.out.println(str1);
		System.out.println(str2);
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
