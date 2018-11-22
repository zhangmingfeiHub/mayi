/**
 *
 * @author mingfei.z 2018年11月20日 下午5:57:49
 */
package com.zebra.print.vo;

import java.io.Serializable;

/**
 *
 * @author mingfei.z
 */
public class LabelParamsVo_1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6078884117519194191L;

	private String goodsName;
	private String goodsSku;
	private String labelDesc;
	private String qrContent;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsSku() {
		return goodsSku;
	}

	public void setGoodsSku(String goodsSku) {
		this.goodsSku = goodsSku;
	}

	public String getLabelDesc() {
		return labelDesc;
	}

	public void setLabelDesc(String labelDesc) {
		this.labelDesc = labelDesc;
	}

	public String getQrContent() {
		return qrContent;
	}

	public void setQrContent(String qrContent) {
		this.qrContent = qrContent;
	}

}
