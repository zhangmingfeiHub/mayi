/**
 *
 * @author mingfei.z 2018年11月20日 下午5:31:03
 */
package com.zebra.print.vo;

import java.io.Serializable;

/**
 *
 * @author mingfei.z
 */
public class PrintVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 940759289445956381L;

	private String jsonData; // 待打印的数据
	private int count = 0; // 打印标签数量
	private String printerName; // 打印机名称
	private int type = 1; // 模板类型，1-

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
