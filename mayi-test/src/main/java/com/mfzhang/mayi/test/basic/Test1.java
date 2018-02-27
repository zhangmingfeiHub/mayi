package com.mfzhang.mayi.test.basic;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		String str = "同步龙果线上合同与合同的线上合同结束时间一致（含合同状态一致）-合同有效但已是逻辑删除状态数据修复-一个店铺多个合同";
		System.out.println("length: " + str.length());
		
		String dateStr = new Date().toString();
		System.out.println("dateStr: " + dateStr);
	}
	
}
