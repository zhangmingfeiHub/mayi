package com.mfzhang.mayi.datasource.service;

import com.mfzhang.mayi.datasource.bean.vo.MdmMallVo;

/**
 * MDM 商场Service
 * 
 * @author mingfei.zhang 2017年8月6日 下午12:24:28
 */
public interface MdmMallService {

	/**
	 * 根据id，获取商场信息
	 * @param id
	 * @return
	 * @author mingfei.zhang 2017年8月6日 下午12:24:46
	 */
	MdmMallVo getMdmMallById(Integer id);
	
	/**
	 * 
	 * @param mdmMallVo
	 * @author mingfei.zhang 2017年8月6日 下午12:25:02
	 */
	void insertMdmMall(MdmMallVo mdmMallVo);
	
	/**
	 * 
	 * @param mdmMallVo
	 * @author mingfei.zhang 2017年8月6日 下午12:25:06
	 */
	void updateMdmMall(MdmMallVo mdmMallVo);
	
	/**
	 * 
	 * @param mdmMallVo
	 * @author mingfei.zhang 2017年8月6日 下午12:25:10
	 */
	void deleteMdmMall(MdmMallVo mdmMallVo);
	
}
