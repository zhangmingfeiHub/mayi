package com.mfzhang.mayi.job.test;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.simpl.PropertySettingJobFactory;
import org.quartz.spi.TriggerFiredBundle;

/**
 * 自定义JobFactory实现
 *
 * @author Guo YL 2017年11月9日 上午8:08:05
 */
public class MyJobFactory extends PropertySettingJobFactory {
	
	public Job newJob(TriggerFiredBundle bundle, Scheduler scheduler) throws SchedulerException {
		System.err.println("MyJobFactory newJob...");
		
		return super.newJob(bundle, scheduler);
	}
}
