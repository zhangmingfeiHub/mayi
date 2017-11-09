package com.mfzhang.mayi.job.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Job <br/>
 * 一个job就是一个实现了Job接口的类，该接口只有一个方法
 *
 * @author Guo YL 2017年11月8日 下午8:59:20
 */
public class HelloJob implements Job {

	public HelloJob(){}
	
	public HelloJob(String name) {
		System.err.println("name: " + name);
	}
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.err.println("HelloJob execute...");
	}

}
