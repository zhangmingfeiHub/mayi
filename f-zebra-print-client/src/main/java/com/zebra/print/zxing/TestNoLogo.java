/**
 * 
 * @author mingfei.z 2018年11月26日 下午1:52:10
 */
package com.zebra.print.zxing;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 * 
 * @author mingfei.z
 */
public class TestNoLogo {

	public static void main(String[] args) {
		try {
			String content = "https://www.baidu.com";
			 String path = "D:/";
			 
			 MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			 Map hints = new HashMap<>();
			 hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			 BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400,hints);
			 File file1 = new File(path,"01.jpg");
			 MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
