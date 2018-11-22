/**
 *
 * @author mingfei.z 2018年11月7日 下午5:42:59
 */
package com.zebra.print.constants;

/**
 *
 * @author mingfei.z
 */
public class ZebraQr extends ZebraElement {

	private int qrX = 20; // x轴起始位置
	private int qrY = 20; // y轴起始位置
	private String qrContent;
	
	/**
	 * 
	 * @param qrContent
	 * @param x
	 * @param y
	 */
	public ZebraQr(String qrContent, int x, int y) {
		this.qrContent = qrContent;
		this.qrX = x;
		this.qrY = y;
	}
	
	/**
	 * 获取打印qr二维码命令
	 * 
	 * @return
	 * @author mingfei.z
	 */
	public String getZplCommand() {
//		String qrCommand = "^FO%s,%s^BQ,2,3^FDQA,${data}^FS";
		String qrCommand = "^FO%s,%s^BQ,2,3^FH\\^FDLA,${data}^FS";
//		String qrCommand = "^FO%s,%s^BQ,2,4^FH\\^FDLA,${data}^FS";
		qrCommand = String.format(qrCommand, this.qrX, this.qrY);
		qrCommand = qrCommand.replace("${data}", this.qrContent);
		
		return qrCommand + "\n";
	}

	/**
	 * 获取打印qr二维码命令，双排
	 * 
	 * @param labelX
	 * @return
	 * @author mingfei.z
	 */
	public String getZplCommand(int labelX) {
		this.qrX += labelX;
		return getZplCommand();
	}
	
}
