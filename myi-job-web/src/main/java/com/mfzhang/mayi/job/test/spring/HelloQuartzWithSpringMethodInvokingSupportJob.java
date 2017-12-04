package com.mfzhang.mayi.job.test.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.stereotype.Component;

import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.job.test.User;

/**
 * org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean
 * 
 * HelloQuartzWithSpringMethodInvokingSupportJob.java
 * @date 2017年12月4日 下午8:33:25
 * @author mingfei.zhang
 */
@Component
public class HelloQuartzWithSpringMethodInvokingSupportJob {

	private static final Logger logger = LoggerFactory.getLogger(HelloQuartzWithSpringMethodInvokingSupportJob.class);
	private User user;
	
	public void helloQuartz() {
		LogUtils.printLog(logger, Level.INFO, "HelloQuartzWithSpringMethodInvoking execute start...");
		System.err.println("HelloQuartzWithSpringMethodInvoking...");
		LogUtils.printLog(logger, Level.INFO, "HelloQuartzWithSpringMethodInvoking execute end...");
	}
	
}
