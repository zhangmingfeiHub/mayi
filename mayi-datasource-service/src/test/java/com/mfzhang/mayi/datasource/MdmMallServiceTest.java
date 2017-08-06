package com.mfzhang.mayi.datasource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mfzhang.mayi.datasource.bean.vo.MdmMallVo;
import com.mfzhang.mayi.datasource.service.MdmMallService;

/**
 * 
 * 
 * @author mingfei.zhang 2017年8月6日 下午2:23:09
 */
public class MdmMallServiceTest extends BaseTest {

	@Autowired
	private MdmMallService mdmMallService;
	@Autowired
	private MdmMallVo mdmMall;
	
	/*
	 * 不可以
	public MdmMallServiceTest() {}
	
	@Autowired
	public MdmMallServiceTest(MdmMallService mdmMallService, MdmMallVo mdmMall) {
		this.mdmMallService = mdmMallService;
		this.mdmMall = mdmMall;
	}*/
	
	@Test
	public void testGetMdmMallById() {
		mdmMallService.getMdmMallById(1);
	}
	
	@Test
	public void testInsertMdmMall() {
		mdmMallService.insertMdmMall(mdmMall);
	}
	
}
