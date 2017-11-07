package com.mfzhang.mayi.job.test;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * 测试quartz
 *
 * @author Guo YL 2017年11月7日 下午11:38:10
 */
public class QuartzTest {

	public static void main(String[] args) {
		try {
			// Grab the Scheduler instance from the Factory
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			
			scheduler.start();
			
			// define the job and tie it to our HelloJob class
			JobDetail job = newJob(HelloJob.class)
					.withIdentity("job1", "group1").build();
			
			// Trigger the job to run now, and then repeat every 40 seconds
			Trigger trigger = newTrigger()
					.withIdentity("trigger1", "group1").startNow()
					.withSchedule(simpleSchedule().withIntervalInSeconds(40)
							.repeatForever()).build();
			
			// Tell quartz to schedule the job using our trigger
			scheduler.scheduleJob(job, trigger);
			
			Thread.sleep(60000);
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
}
