/**
 * 
 * @author mingfei.z 2018年11月26日 下午1:53:18
 */
package com.zebra.print.zxing;

/**
 * 
 * @author mingfei.z
 */
public class TestLogo {

	public static void main(String[] args) {
		try {
			String text = "https://www.baidu.com";  
			QRCodeUtil.encode(text, "e:/001.jpg", "e:/image/", true);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
