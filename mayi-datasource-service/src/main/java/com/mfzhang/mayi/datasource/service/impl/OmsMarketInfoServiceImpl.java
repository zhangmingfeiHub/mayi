package com.mfzhang.mayi.datasource.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.datasource.bean.vo.OmsMarketInfoVo;
import com.mfzhang.mayi.datasource.service.OmsMarketInfoService;

public class OmsMarketInfoServiceImpl implements OmsMarketInfoService {

	private static final Logger logger = LoggerFactory.getLogger(OmsMarketInfoServiceImpl.class);
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public OmsMarketInfoVo getOmsMarketInfoById(Integer id) {
		LogUtils.printLog(logger, Level.INFO, "-----getOmsMarketInfoById-----，入参={}", id);
		return null;
	}

	@Override
	public void insertOmsMarketInfoVo(OmsMarketInfoVo omsMarketInfoVo) {
		LogUtils.printLog(logger, Level.INFO, "-----insertOmsMarketInfoVo-----，入参={}", CommonUtils.writeValueAsString(objectMapper, omsMarketInfoVo));
	}

	@Override
	public void updateOmsMarketInfoVo(OmsMarketInfoVo omsMarketInfoVo) {
		LogUtils.printLog(logger, Level.INFO, "-----updateOmsMarketInfoVo-----，入参={}", CommonUtils.writeValueAsString(objectMapper, omsMarketInfoVo));
	}

	@Override
	public void deleteOmsMarketInfoVo(OmsMarketInfoVo omsMarketInfoVo) {
		LogUtils.printLog(logger, Level.INFO, "-----deleteOmsMarketInfoVo-----，入参={}", CommonUtils.writeValueAsString(objectMapper, omsMarketInfoVo));
	}

}
