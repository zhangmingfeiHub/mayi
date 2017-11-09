package com.mfzhang.mayi.job.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 
 *
 * @author Guo YL 2017年11月9日 下午9:20:10
 */
public class CalendarTriggerJob2 implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.err.println("CalenderTriggerJob 2 execute start...");
	}

}
