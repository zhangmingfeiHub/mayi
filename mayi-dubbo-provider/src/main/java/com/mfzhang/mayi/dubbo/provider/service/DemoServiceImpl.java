package com.mfzhang.mayi.dubbo.provider.service;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.util.StringUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.common.constants.StateCodeEnum;
import com.mfzhang.mayi.common.utils.LogUtils;

/**
 * dubbo demo 中台服务
 *
 * @author Guo YL 2017年9月12日 上午12:10:02
 */
@Service // 声明需要暴露的服务接口
public class DemoServiceImpl implements DemoService {

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Override
	public ServiceResult<String> sayHello(String name) {
		LogUtils.printLog(logger, Level.INFO, "问候一下，入参={}", name);
		ServiceResult<String> serviceResult = new ServiceResult<String>();
		
		if (StringUtils.isEmpty(name)) {
			serviceResult.fail(StateCodeEnum.CODE_ERROR_PARAM.getCode(), StateCodeEnum.CODE_ERROR_PARAM.toString());
			return serviceResult;
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = "hello, {0}";
		serviceResult.success(MessageFormat.format(msg, name));
		return serviceResult;
	}

}
