package com.mfzhang.mayi.job.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mfzhang.mayi.common.WebResult;
import com.mfzhang.mayi.common.utils.LogUtils;

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
	
}
