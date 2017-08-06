package com.mfzhang.mayi.datasource.service.impl;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.common.utils.LogUtils;
import com.mfzhang.mayi.datasource.bean.vo.MdmMallVo;
import com.mfzhang.mayi.datasource.service.MdmMallService;

@Named("mdmMallService")
public class MdmMallServiceImpl implements MdmMallService {

	private final static Logger logger = LoggerFactory.getLogger(MdmMallServiceImpl.class);
	
	/*
	 * 1. 第一种方式自动装配
	 * 
	@Autowired
	private ObjectMapper objectMapper;
	*/
	
	/*
	 * 2. 第二种方式自动装配
	 * 
	private ObjectMapper objectMapper;
	
	@Autowired
	public MdmMallServiceImpl(ObjectMapper objectMapper) {
		LogUtils.printLog(logger, Level.INFO, "-----MdmMallServiceImpl-----");
		this.objectMapper = objectMapper;
	}
	*/
	
	/*
	 * 3. 第三种方式自动装配
	 * 
	private ObjectMapper objectMapper;
	
	@Autowired
	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	*/
	
	/*
	 * 4. 第四种方式自动装配
	 * 
	@Inject
	private ObjectMapper objectMapper;
	*/
	
	@Autowired(required=false)
	private ObjectMapper objectMapper;

	@Override
	public MdmMallVo getMdmMallById(Integer id) {
		
		String content = "-----getMdmMallById-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, id);
		
		return null;
	}

	@Override
	public void insertMdmMall(MdmMallVo mdmMallVo) {
		String content = "-----insertMdmMall-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, CommonUtils.writeValueAsString(objectMapper, mdmMallVo));
	}

	@Override
	public void updateMdmMall(MdmMallVo mdmMallVo) {
		String content = "-----updateMdmMall-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, CommonUtils.writeValueAsString(objectMapper, mdmMallVo));
	}

	@Override
	public void deleteMdmMall(MdmMallVo mdmMallVo) {
		String content = "-----deleteMdmMall-----，入参={}";
		LogUtils.printLog(logger, Level.INFO, content, CommonUtils.writeValueAsString(objectMapper, mdmMallVo));
	}

}
