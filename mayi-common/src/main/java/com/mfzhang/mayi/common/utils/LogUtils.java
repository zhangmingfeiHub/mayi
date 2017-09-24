package com.mfzhang.mayi.common.utils;

import org.slf4j.Logger;
import org.slf4j.event.EventConstants;
import org.slf4j.event.Level;

/**
 * 用于打印日志的工具类
 * 
 * @author mingfei.zhang 2017年8月6日 上午11:10:58
 */
public class LogUtils {

	/**
	 * 打印换行
	 * 
	 * @author mingfei.zhang 2017年8月6日 上午11:11:37
	 */
	private static void printNewLineLog(Logger logger, Level level) {
		
		switch (level.toInt()) {
			case EventConstants.DEBUG_INT:
				logger.debug("\n");
				break;
			case EventConstants.INFO_INT:
				logger.info("\n");
				break;
			case EventConstants.WARN_INT:
				logger.warn("\n");
				break;
			case EventConstants.ERROR_INT:
				logger.error("\n");
				break;
			case EventConstants.TRACE_INT:
				logger.trace("\n");
				break;
			default:
				break;
		}
		
	}
	
	/**
	 * 打印日志
	 * 
	 * @param logger
	 * @param level 日志级别
	 * @param content 日志内容
	 * @param params 日志参数
	 * @author mingfei.zhang 2017年8月6日 上午11:32:54
	 */
	public static void printLog(Logger logger, Level level, String content, Object... params) {
		
		printNewLineLog(logger, level);
		
		switch (level.toInt()) {
			case EventConstants.DEBUG_INT:
				logger.debug(content, params);
				break;
			case EventConstants.INFO_INT:
				logger.info(content, params);
				break;
			case EventConstants.WARN_INT:
				logger.warn(content, params);
				break;
			case EventConstants.ERROR_INT:
				logger.error(content, params);
				break;
			case EventConstants.TRACE_INT:
				logger.trace(content, params);
				break;
			default:
				break;
		}
		
	}
	
}
