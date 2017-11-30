package com.mfzhang.mayi.job.test.spring;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.job.test.User;

/**
 * 
 * 
 * HelloSpringQuartzJob.java
 * @date 2017年11月30日 下午8:04:40
 * @author mingfei.zhang
 */
public class HelloQuartzWithSpringSupportJob extends QuartzJobBean {

	private static final Logger logger = LoggerFactory.getLogger(HelloQuartzWithSpringSupportJob.class);
	private User user;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try {
			LogUtils.printLog(logger, Level.INFO, "HelloSpringQuartzJob execute start...");
			System.err.println(CommonUtils.writeValueAsString(user) + ", " + new SimpleDateFormat(CommonConstants.DATE_FORMAT_PATTER.YYYY_MM_DD_HH_MM_SS).format(new Date()));
			LogUtils.printLog(logger, Level.INFO, "HelloSpringQuartzJob execute end...");
		} catch (Exception e) {
			LogUtils.printLog(logger, Level.ERROR, "HelloSpringQuartzJob execute exception...");
			throw new JobExecutionException(e);
		}
	}

	public void setUser(User user) {
		this.user = user;
	}

}
