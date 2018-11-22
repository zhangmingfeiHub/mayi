/**
 *
 * @author mingfei.z 2018年11月14日 上午11:23:15
 */
package com.zebra.print.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * 标签模板
 * @author mingfei.z
 */
public class ZebraLabelTemplate {

	/**
	 * 双排打印
	 * 
	 * @param goodsName 商品名称
	 * @param labelDesc 描述
	 * @param sku 
	 * @param qrContent 二维码内容
	 * @return
	 * @author mingfei.z
	 */
	public static String getTemplate(String goodsName, String labelDesc, String sku, String qrContent) {
		// 50 * 20 mm
		ZebraLabel zebraLabel = new ZebraLabel(400, 160, true);
		List<ZebraElement> zebraElements = new ArrayList<>();
		
		// 商品名称
		int x = 28;
		int y = 30;
		if (goodsName.length() < 16) {
			y += y/2;
		}
		ZebraText goodsNameZt = new ZebraText(goodsName, x, y, true);
		zebraElements.add(goodsNameZt);

		// 描述
		ZebraText descZt = new ZebraText(labelDesc, 42, 112);
		zebraElements.add(descZt);
		
		// 二维码
		ZebraQr qr = new ZebraQr(qrContent, 295, 12);
		zebraElements.add(qr);

		// sku
		ZebraText skuZt = new ZebraText(sku, 300, 127);
		zebraElements.add(skuZt);
		
		zebraLabel.setZebraElements(zebraElements);
		
		return zebraLabel.getZplCommand();
	}

}
