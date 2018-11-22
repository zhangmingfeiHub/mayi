/**
 *
 * @author mingfei.z 2018年11月14日 上午10:09:47
 */
package com.zebra.print.constants;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

/**
 * 标签
 * @author mingfei.z
 */
public class ZebraLabel {

	private int width; // 标签宽
	private int height; // 标签高
	private int labelGap = 16; // 双标签间距
	private boolean isDoubleLabel = false; // 是否双标签
	
	private List<ZebraElement> zebraElements = new ArrayList<>(); // 标签上的元素
	
	private final String SEP_CHAR = "\n"; // 命令换行符
	
	public ZebraLabel() {}
	
	/**
	 * 
	 * @param width 标签宽
	 * @param height 标签高
	 */
	public ZebraLabel(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * 
	 * @param width 标签宽
	 * @param height 标签高
	 * @param isDoubleLabel 是否双排打印
	 */
	public ZebraLabel(int width, int height, boolean isDoubleLabel) {
		this(width, height);
		this.isDoubleLabel = isDoubleLabel;
	}

	/**
	 * 
	 * @param width 标签宽
	 * @param height 标签高
	 * @param isDoubleLabel 是否双排打印
	 * @param labelGap 双排标签间距
	 */
	public ZebraLabel(int width, int height, boolean isDoubleLabel, int labelGap) {
		this(width, height, isDoubleLabel);
		this.labelGap = labelGap;
	}
	
	/**
	 * 获取标签ZPL打印命令
	 * @return
	 * @author mingfei.z
	 */
	public String getZplCommand() {
		if (CollectionUtils.isEmpty(zebraElements))
			return null;
		
		StringBuilder sb = new StringBuilder();
		String zplStart = getZplStart();
		sb.append(zplStart);
		
		for (ZebraElement ze : zebraElements) {
			sb.append(ze.getZplCommand());
			
			if (isDoubleLabel) {
				sb.append(ze.getZplCommand(this.width + this.labelGap));
			}
		}
		
		String zplEnd = getZplEnd();
		sb.append(zplEnd);
		
		return sb.toString();
	}

	private String getZplStart() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("^XA^SEE:GB18030.DAT^CW1,E:SIMSUN.FNT").append(SEP_CHAR)
			.append("^MMT").append(SEP_CHAR)
			.append("^PW").append(isDoubleLabel ? (width*2 + labelGap) : width).append(SEP_CHAR)
			.append("^LL0").append(height).append(SEP_CHAR);
		
		return sb.toString();
	}
	
	private String getZplEnd() {
		return "^XZ";
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public List<ZebraElement> getZebraElements() {
		return zebraElements;
	}

	public void setZebraElements(List<ZebraElement> zebraElements) {
		this.zebraElements = zebraElements;
	}
	
}
