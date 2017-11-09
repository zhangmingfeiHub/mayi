package com.mfzhang.mayi.job.test;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.quartz.JobDataMap;
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
		//scheduler1();
		//scheduler2();
		//scheduler3();
		scheduler4();
	}
	
	private static void scheduler4() {
		try {
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			
			JobDetail jobDetail = newJob(AutoWiredPropertyJob.class)
					.withIdentity("MyAutoWiredPropertyJob", "Group1")
					.usingJobData("stringVal", "Dumb 1...")
					.usingJobData("intVal", 100)
					.build();

			List<Date> myList = new ArrayList<Date>();
			Calendar calendar = Calendar.getInstance();
			calendar.set(2017, Calendar.JUNE, 22, 12, 10);
			myList.add(calendar.getTime());
			
			User user = new User();
			user.setId(100);
			user.setName("username");
			
			JobDataMap newJobDataMap = new JobDataMap();
			newJobDataMap.put("stringValTri", "Dumb Trigger 1...");
			newJobDataMap.put("intVal", 120);
			newJobDataMap.put("dateList", myList);
			newJobDataMap.put("user", user);
			
			Trigger trigger = newTrigger()
					.withIdentity("MyAutoWiredPropertyTrigger", "Group1")
					.withSchedule(simpleSchedule().withIntervalInSeconds(3).repeatForever())
					.usingJobData(newJobDataMap)
					.build();
			
			scheduler.scheduleJob(jobDetail, trigger);
			
			Thread.sleep(10000);
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void scheduler3() {
		try {
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			
			JobDetail jobDetail = newJob(DumbJob.class)
					.withIdentity("MyDumbJob", "Group1")
					.usingJobData("stringVal", "Dumb 1...")
					.usingJobData("intVal", 100)
					.build();
			
			Trigger trigger = newTrigger()
					.withIdentity("MyDumbTrigger", "Group1")
					.withSchedule(simpleSchedule().withIntervalInSeconds(3).repeatForever())
					.usingJobData("stringValTri", "Dumb Trigger 1...")
					.build();
			
			scheduler.scheduleJob(jobDetail, trigger);
			
			Thread.sleep(10000);
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void scheduler2() {
		try {
			StdSchedulerFactory schedulerFactory = new StdSchedulerFactory();
			
			// Grab the Scheduler instance from the Factory 
			// 调度容器实例
			Scheduler scheduler = schedulerFactory.getScheduler();
			
			scheduler.start();
			
			// define the job and tie it to our HelloJob class
			JobDetail job = newJob(HelloJob.class)
					.withIdentity("job1", "group1").build();
			
			// Trigger the job to run now, and then repeat every 40 seconds
			Trigger trigger = newTrigger()
					.withIdentity("trigger1", "group1").startNow()
					.withSchedule(simpleSchedule().withIntervalInSeconds(7).repeatForever()) // ScheduleBuilder
					.build();
			
			// Tell quartz to schedule the job using our trigger
			scheduler.scheduleJob(job, trigger);
			
			Thread.sleep(10000);
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void scheduler1() {
		try {
			// Grab the Scheduler instance from the Factory 
			// 调度容器实例
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			
			scheduler.start();
			
			// define the job and tie it to our HelloJob class
			JobDetail job = newJob(HelloJob.class)
					.withIdentity("job1", "group1").build();
			
			// Trigger the job to run now, and then repeat every 40 seconds
			Trigger trigger = newTrigger()
					.withIdentity("trigger1", "group1").startNow()
					.withSchedule(simpleSchedule().withIntervalInSeconds(7).repeatForever()) // ScheduleBuilder
					.build();
			
			// Tell quartz to schedule the job using our trigger
			scheduler.scheduleJob(job, trigger);
			
			Thread.sleep(30000);
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
