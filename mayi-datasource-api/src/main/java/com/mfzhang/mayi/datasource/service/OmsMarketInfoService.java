package com.mfzhang.mayi.datasource.service;

import com.mfzhang.mayi.datasource.bean.vo.OmsMarketInfoVo;

/**
 * 
 * 
 * @author mingfei.zhang 2017年8月6日 下午4:36:20
 */
public interface OmsMarketInfoService {

	/**
	 * 
	 * @param id
	 * @return
	 * @author mingfei.zhang 2017年8月6日 下午4:36:30
	 */
	OmsMarketInfoVo getOmsMarketInfoById(Integer id);
	
	/**
	 * 
	 * @param omsMarketInfoVo
	 * @author mingfei.zhang 2017年8月6日 下午4:36:34
	 */
	void insertOmsMarketInfoVo(OmsMarketInfoVo omsMarketInfoVo);
	
	/**
	 * 
	 * @param omsMarketInfoVo
	 * @author mingfei.zhang 2017年8月6日 下午4:36:39
	 */
	void updateOmsMarketInfoVo(OmsMarketInfoVo omsMarketInfoVo);
	
	/**
	 * 
	 * @param omsMarketInfoVo
	 * @author mingfei.zhang 2017年8月6日 下午4:36:42
	 */
	void deleteOmsMarketInfoVo(OmsMarketInfoVo omsMarketInfoVo);
	
}
