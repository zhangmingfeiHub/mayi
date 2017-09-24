package com.mfzhang.mayi.dubbo.provider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.alibaba.dubbo.config.annotation.Service;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.dubbo.provider.bean.UserInfo;

@Service(validation = "true")
public class UserInfoServiceImpl implements UserInfoService {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
	@Override
	public void save(UserInfo userInfo) {
		
		LogUtils.printLog(logger, Level.INFO, "保存用户信息，入参={}", CommonUtils.writeValueAsString(userInfo));
	}

	@Override
	public void update(UserInfo userInfo) {
		LogUtils.printLog(logger, Level.INFO, "修改用户信息，入参={}", CommonUtils.writeValueAsString(userInfo));
	}

	@Override
	public void deleteById(Long userId) {
		LogUtils.printLog(logger, Level.INFO, "根据id删除用户信息，入参={}", userId);
	}

}
