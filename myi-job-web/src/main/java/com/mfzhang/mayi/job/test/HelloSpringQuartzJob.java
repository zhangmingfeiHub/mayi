package com.mfzhang.mayi.job.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.mfzhang.mayi.common.utils.LogUtils;

/**
 * 
 * 
 * HelloSpringQuartzJob.java
 * @date 2017年11月27日 下午7:29:24
 * @author mingfei.zhang
 */
public class HelloSpringQuartzJob implements Job {

	private static final Logger logger = LoggerFactory.getLogger(HelloSpringQuartzJob.class);
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		LogUtils.printLog(logger, Level.INFO, "HelloSpringQuartzJob start...");
		LogUtils.printLog(logger, Level.INFO, "HelloSpringQuartzJob execute at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		LogUtils.printLog(logger, Level.INFO, "HelloSpringQuartzJob end...");
	}

}
