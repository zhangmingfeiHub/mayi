package com.mfzhang.mayi.job.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mfzhang.mayi.common.WebResult;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.valid.test.UserInfo;

/**
 * 
 *
 * @author Guo YL 2017年10月31日 下午10:03:49
 */
@Controller
@RequestMapping("/job")
public class JobController {

	private static final Logger logger = LoggerFactory.getLogger(JobController.class);
	
	@RequestMapping(value = "/do", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public WebResult<String> doJob(@RequestParam(value = "a", required = false, defaultValue = "BBB") String param) {
		WebResult<String> webResult = new WebResult<String>();
		
		LogUtils.printLog(logger, Level.INFO, "执行job，入参={}", param);
		
		webResult.success("成功");
		return webResult;
	}
	
	@RequestMapping(value = "/testValid", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public WebResult<String> testValid(@Valid @RequestBody UserInfo UserInfo, BindingResult bindingResult) {
		WebResult<String> webResult = new WebResult<String>();
		
		if (bindingResult.hasErrors()) {
			webResult.fail("500", bindingResult.getFieldError().getDefaultMessage());
			return webResult;
		}
		
		LogUtils.printLog(logger, Level.INFO, "测试valid={}", CommonUtils.writeValueAsString(UserInfo));
		
		webResult.success("成功");
		return webResult;
	}
	
}
