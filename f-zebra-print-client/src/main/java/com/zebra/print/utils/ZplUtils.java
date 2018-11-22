/**
 * 
 * @author mingfei.z 2018年11月7日 下午2:11:30
 */
package com.zebra.print.utils;

import java.util.ArrayList;
import java.util.List;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author mingfei.z
 */
public class ZplUtils {

	private static final Logger logger = LoggerFactory.getLogger(ZplUtils.class);
	public static final String PRINT_NAME = "ZDesigner GT800 (ZPL)";
	
	/**
	 * ZPL打印
	 * @param zplCommand ZPL命令
	 * @param printerName 打印机名称
	 * @author mingfei.z
	 */
	public static String printZpl(String zplCommand, String printerName) {
		
		logger.info("ZPL打印，zplCommand={}，printerName={}", zplCommand, printerName);
		PrintService printService = getPrinter(printerName);
		if (null == printService) {
			logger.info("ZPL打印，没有找到打印机printerName={}", printerName);
			return "没有找到打印机：" + printerName;
		}
		
		logger.info("ZPL打印，找到打印机printerName={}", printerName);
		DocPrintJob job = printService.createPrintJob();
		byte[] byteArr = null;
		try {
			byteArr = zplCommand.getBytes("GB18030");
		} catch (Exception e) {
			logger.info("ZPL打印，获取ZPL命令字节发生异常", e);
			return "打印失败";
		}
		
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		Doc doc = new SimpleDoc(byteArr, flavor, null);
		
		try {
			job.print(doc, null);
			logger.info("ZPL打印，打印成功");
		} catch (Exception e) {
			logger.info("ZPL打印，打印发生异常", e);
			return "打印失败";
		}
		
		return "";
	}
	
	private static PrintService getPrinter(String printerName) {
		if (null == printerName || "".equals(printerName)) {
			printerName = PRINT_NAME; // 默认驱动
		}
		
		PrintService printService = null;
		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		logger.info("打印机数：" + (null == services ? 0 : services.length));
		if (null != services && services.length > 0) {
			
			for (PrintService service : services) {
				logger.info("打印机名称：" + service.getName());
				
				if (service.getName().contains(printerName)) {
					printService = service;
					break;
				}
			}
		}
		
		return printService;
	}
	
	/**
	 * 获取本地打印机
	 * @return
	 * @author mingfei.z
	 */
	public static List<String> getPrinterName() {
		List<String> printerNameList = new ArrayList<>();
		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		logger.info("打印机数：" + (null == services ? 0 : services.length));
		if (null != services && services.length > 0) {
			
			for (PrintService service : services) {
				logger.info("打印机名称：" + service.getName());
				printerNameList.add(service.getName());
			}
		}
		
		return printerNameList;
	}
	
}
