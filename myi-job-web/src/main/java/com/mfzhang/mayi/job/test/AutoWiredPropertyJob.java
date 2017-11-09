package com.mfzhang.mayi.job.test;

import java.util.ArrayList;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.mfzhang.mayi.common.utils.CommonUtils;

/**
 * 属性实现自动“注入”
 *
 * @author Guo YL 2017年11月8日 下午11:04:17
 */
public class AutoWiredPropertyJob implements Job {

	private String stringVal;
	private Integer intVal;
	private String stringValTri;
	private ArrayList<Date> dateList;
	private User user;
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.err.println("AutoWiredPropertyJob execute start...");
		System.out.println("");

		try {
			dateList.add(new Date());
			++intVal;
			int res = intVal/0;
			user.setId(user.getId() + 1);
			
			// JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
			System.out.println("mergedJobDataMap.intVal=" + intVal.intValue() + 
					", mergedJobDataMap.stringVal=" + stringVal + 
					", mergedJobDataMap.stringValTri=" + stringValTri + 
					", dateList=" + CommonUtils.writeValueAsString(dateList) + 
					", user=" + CommonUtils.writeValueAsString(user));
			
			System.err.println("AutoWiredPropertyJob execute end...");
		} catch (Exception e) {
			throw new JobExecutionException("Job执行异常");
		}
	}

	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}

	public void setIntVal(Integer intVal) {
		this.intVal = intVal;
	}

	public void setStringValTri(String stringValTri) {
		this.stringValTri = stringValTri;
	}

	public void setDateList(ArrayList<Date> dateList) {
		this.dateList = dateList;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
