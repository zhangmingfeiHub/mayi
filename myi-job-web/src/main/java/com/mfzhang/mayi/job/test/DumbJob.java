package com.mfzhang.mayi.job.test;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.TriggerKey;

/**
 * 
 *
 * @author Guo YL 2017年11月8日 下午10:30:13
 */
public class DumbJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.err.println("DumbJob execute start...");
		System.out.println("");
		
		processData1(context);
		
		System.err.println("DumbJob execute end...");
	}
	
	private void processData1(JobExecutionContext context) {

		JobKey jobKey = context.getJobDetail().getKey();
		JobDataMap detailJobDataMap = context.getJobDetail().getJobDataMap();
		System.out.println("JobDetail: jobKey.name=" + jobKey.getName() + ", jobKey.group=" + jobKey.getGroup() + 
				", detailJobDataMap.intVal=" + detailJobDataMap.getInt("intVal") + 
				", detailJobDataMap.stringVal=" + detailJobDataMap.getString("stringVal"));
		
		TriggerKey triggerKey = context.getTrigger().getKey();
		JobKey triggerJobKey = context.getTrigger().getJobKey();
		JobDataMap triggerJobDataMap = context.getTrigger().getJobDataMap();
		System.out.println("Trigger: triggerKey.name=" + triggerKey.getName() + ", triggerKey.group=" + triggerKey.getGroup() + 
				", triggerJobKey.name=" + triggerJobKey.getName() + ", triggerJobKey.group=" + triggerJobKey.getGroup() +
				// ", triggerJobDataMap.intVal=" + triggerJobDataMap.getInt("intVal") + 
				// ", triggerJobDataMap.stringVal=" + triggerJobDataMap.getString("stringVal") + 
				", triggerJobDataMap.stringValTri=" + triggerJobDataMap.getString("stringValTri"));
		
		JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
		System.out.println("mergedJobDataMap.intVal=" + mergedJobDataMap.getInt("intVal") + 
				", mergedJobDataMap.stringVal=" + mergedJobDataMap.getString("stringVal") + 
				", mergedJobDataMap.stringValTri=" + mergedJobDataMap.getString("stringValTri"));
		
	}

}
