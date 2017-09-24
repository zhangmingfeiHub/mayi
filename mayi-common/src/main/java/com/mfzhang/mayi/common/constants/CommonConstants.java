package com.mfzhang.mayi.common.constants;

/**
 * 通用常量类
 * 
 * @author mingfei.zhang 2017年8月6日 上午10:42:35
 */
public class CommonConstants {

	/**
	 * 删除状态
	 * 
	 * @author mingfei.zhang 2017年8月6日 上午10:44:07
	 */
	public static class DeleteStatus {
		/** 已删除 */
		public static final byte YES = 1;
		
		/** 未删除 */
		public static final byte NO = 0;
	}
	
	/**
	 * 正则表达式
	 *
	 * @author Guo YL 2017年9月25日 上午12:44:45
	 */
	public static class RegExp {
		/** 邮箱 */
		public static final String EMAIL = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
	}
	
}
