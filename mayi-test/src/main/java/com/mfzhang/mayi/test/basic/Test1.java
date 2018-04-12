package com.mfzhang.mayi.test.basic;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.mfzhang.mayi.common.utils.CommonUtils;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = Collections.singletonList("a");
		System.err.println(CommonUtils.writeValueAsString(list));
	}
	
}
