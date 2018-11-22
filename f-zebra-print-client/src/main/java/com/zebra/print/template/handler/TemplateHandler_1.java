/**
 *
 * @author mingfei.z 2018年11月20日 下午5:39:38
 */
package com.zebra.print.template.handler;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.zebra.print.constants.ZebraLabelTemplate;
import com.zebra.print.utils.JsonUtils;
import com.zebra.print.utils.ZplUtils;
import com.zebra.print.vo.LabelParamsVo_1;
import com.zebra.print.vo.PrintVo;

/**
 *
 * @author mingfei.z
 */
public class TemplateHandler_1 extends ZplTemplateHandler {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public String handle(PrintVo printVo) {

		if (printVo.getCount() < 1 || StringUtils.isEmpty(printVo.getJsonData()) || StringUtils.isEmpty(printVo.getPrinterName())) {
			return "参数错误";
		}
		
		if (printVo.getCount()%2 != 0) { // 只打印双数标签
			return "只打印双数标签";
		}
		
		List<LabelParamsVo_1> labelParamsVo_1List = new ArrayList<>();
		try {
			labelParamsVo_1List = JsonUtils.jsonToList(printVo.getJsonData(), LabelParamsVo_1.class);
		} catch (Exception e) {
			logger.error("打印标签，入参={}，异常", JsonUtils.objectToJsonString(printVo), e);
			return "打印数据错误";
		}
		
		if (CollectionUtils.isEmpty(labelParamsVo_1List)) {
			return "打印数据错误";
		}
		
		for (LabelParamsVo_1 param : labelParamsVo_1List) {
			for (int i=0; i<printVo.getCount()/2; i++) {
		    	String labelTemplate = ZebraLabelTemplate.getTemplate(param.getGoodsName(), param.getLabelDesc(), param.getGoodsSku(), param.getQrContent());
		    	String zplResult = ZplUtils.printZpl(labelTemplate, printVo.getPrinterName());
		    	if (StringUtils.hasText(zplResult)) {
		    		return zplResult;
		    	}
			}
		}
		
		return "success";
	}

}
