/**
 *
 * @author mingfei.z 2018年11月14日 上午10:11:56
 */
package com.zebra.print.constants;

/**
 *
 * @author mingfei.z
 */
public abstract class ZebraElement {

	/**
	 * 获取命令
	 * @return
	 * @author mingfei.z
	 */
	abstract String getZplCommand();
	
	/**
	 * 打印双标签
	 * @param labelX 标签宽度
	 * @return
	 * @author mingfei.z
	 */
	abstract String getZplCommand(int labelX);
	
}
