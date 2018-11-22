/**
 *
 * @author mingfei.z 2018年11月20日 下午5:11:48
 */
package com.zebra.print.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zebra.print.template.handler.TemplateHandler_1;
import com.zebra.print.template.handler.ZplTemplateHandler;
import com.zebra.print.utils.JsonResult;
import com.zebra.print.utils.JsonUtils;
import com.zebra.print.utils.ZplUtils;
import com.zebra.print.vo.PrintVo;

/**
 *
 * @author mingfei.z
 */
@Controller
public class ZebraPrintController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	private ZplTemplateHandler zplTemplateHandler;
	
	@RequestMapping(value = "/printLabel", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult<String> printLabel(@RequestBody PrintVo printVo) {
		
		JsonResult<String> jsonResult = new JsonResult<>();
		
		if (null == printVo) {
			jsonResult.setOk(false);
			jsonResult.setResDescription("参数错误");
			return jsonResult;
		}
		
		logger.info("打印标签，入参={}", JsonUtils.objectToJsonString(printVo));
		String result = "";
		if (printVo.getType() == 1) {
			zplTemplateHandler = new TemplateHandler_1();
			result = zplTemplateHandler.handle(printVo);
		}
		
		logger.info("打印标签，入参={}，结果={}", JsonUtils.objectToJsonString(printVo), result);
		jsonResult.setOk("success".equals(result) ? true : false);
		jsonResult.setResDescription("success".equals(result) ? "打印成功" : "".equals(result) ? "未打印，请检查" : result);
		return jsonResult;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "suc";
	}
	
	@RequestMapping(value = "/printer", method = RequestMethod.GET)
	@ResponseBody
	public List<String> getPrinter() {
		return ZplUtils.getPrinterName();
	}
	
}
