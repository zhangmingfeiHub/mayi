package com.mfzhang.mayi.job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.stereotype.Controller;

import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.job.test.User;
import com.mfzhang.mayi.job.test.spring.HelloQuartzWithSpringMethodInvokingSupportJob;
import com.mfzhang.mayi.job.test.spring.HelloQuartzWithSpringSupportJob;

/**
 * Sping 配置
 *
 * @author Guo YL 2017年10月31日 下午10:25:49
 */
@Configuration
@ComponentScan(basePackageClasses = MarkInterface.class, excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
})
@ImportResource("classpath*:spring/spring-*.xml")
public class WebConfig {

	/*@Bean
	public JobDetailFactoryBean helloSpringQuartzJob(User user) {
		JobDetailFactoryBean helloSpringQuartzJob = new JobDetailFactoryBean();
		helloSpringQuartzJob.setJobClass(HelloQuartzWithSpringSupportJob.class);
		helloSpringQuartzJob.setDurability(true);
		helloSpringQuartzJob.setJobDataAsMap(Collections.singletonMap("user", user));
		
		return helloSpringQuartzJob;
	}
	
	@Bean
	public MethodInvokingJobDetailFactoryBean helloQuartzWithSpringMethodInvoking(HelloQuartzWithSpringMethodInvokingSupportJob job) {
		MethodInvokingJobDetailFactoryBean helloSpringQuartzJob = new MethodInvokingJobDetailFactoryBean();
		helloSpringQuartzJob.setTargetObject(job);
		helloSpringQuartzJob.setTargetMethod("helloQuartz");
		
		return helloSpringQuartzJob;
	}
	
	@Bean
	public SimpleTriggerFactoryBean helloSpringQuartzSimpleTrigger(JobDetail helloSpringQuartzJob) {
		SimpleTriggerFactoryBean helloSpringQuartzTrigger = new SimpleTriggerFactoryBean();
		helloSpringQuartzTrigger.setJobDetail(helloSpringQuartzJob);
		helloSpringQuartzTrigger.setStartDelay(5 * 1000);
		helloSpringQuartzTrigger.setRepeatInterval(6 * 1000);
		
		return helloSpringQuartzTrigger;
	}

	@Bean
	public CronTriggerFactoryBean helloSpringQuartzCronTrigger(JobDetail helloSpringQuartzJob) {
		CronTriggerFactoryBean helloSpringQuartzTrigger = new CronTriggerFactoryBean();
		helloSpringQuartzTrigger.setJobDetail(helloSpringQuartzJob);
		helloSpringQuartzTrigger.setStartDelay(5 * 1000);
		helloSpringQuartzTrigger.setCronExpression("0/10 * * * * ?");
		
		return helloSpringQuartzTrigger;
	}
	
	@Bean
	public SchedulerFactoryBean scheduler(Trigger[] triggers) {
		SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
		scheduler.setTriggers(triggers);
		
		return scheduler;
	}
	
	@Bean
	public User user() {
		User user = new User();
		user.setId(1);
		user.setName("user1");
		try {
			user.setBirth(new SimpleDateFormat(CommonConstants.DATE_FORMAT_PATTER.YYYY_MM_DD_HH_MM_SS).parse("2017-10-11 00:00:00"));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		return user;
	}*/
	
}
