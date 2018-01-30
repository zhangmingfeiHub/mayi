package com.mfzhang.mayi.job.service;

import java.util.List;

import javax.servlet.ServletOutputStream;

import com.mfzhang.mayi.valid.test.UserInfo;

/**
 * 
 * @author mingfei.z
 *
 */
public interface ExportService {

	/**
	 * 导出用户数据，xls后缀
	 * @param titles
	 * @param out
	 */
	void exportUserXls(String[] titles, ServletOutputStream out);
	
	/**
	 * 导出用户数据，xlsx后缀
	 * @param titles
	 * @param out
	 */
	void exportUserXlsx(String[] titles, ServletOutputStream out);
	
	/**
	 * 获取需要导出的数据
	 * @return
	 */
	List<UserInfo> getData();
	
}
