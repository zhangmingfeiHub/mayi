package com.mfzhang.mayi.dubbo.provider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.mfzhang.mayi.common.ServiceResult;
import com.mfzhang.mayi.common.constants.StateCodeEnum;
import com.mfzhang.mayi.common.utils.LogUtils;

/**
 * dubbo demo 中台服务
 *
 * @author Guo YL 2017年9月12日 上午12:10:02
 */
@Service("demoService")
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
		
		String msg = "hello, " + name;
		serviceResult.success(msg);
		return serviceResult;
	}

}