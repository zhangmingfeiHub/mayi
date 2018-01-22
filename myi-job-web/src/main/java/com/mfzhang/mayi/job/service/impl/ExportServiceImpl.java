package com.mfzhang.mayi.job.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Service;

import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.job.service.ExportService;
import com.mfzhang.mayi.valid.test.UserInfo;

/**
 * 
 * @author mingfei.z
 *
 */
@Service
public class ExportServiceImpl implements ExportService {

	@Override
	public void exportUserXls(String[] titles, ServletOutputStream out) {
		List<UserInfo> uiList = getUserInfos();
		System.err.println(CommonUtils.writeValueAsString(uiList));
		
		HSSFWorkbook wb = new HSSFWorkbook(); // excel 文件对象
		HSSFSheet sheet = wb.createSheet("new sheet"); // 创建sheet对象
		sheet.setDefaultColumnWidth(20);
		sheet.setAutobreaks(true);
		for (int i=0; i<titles.length; i++) {
			sheet.autoSizeColumn(i); // 自动根据长度调整单元格长度
		}
		
		HSSFCellStyle headerCellStyle = getHeadStyle(wb);
		HSSFCellStyle bodyCellStyle = getBodyStyle(wb);
		
		// 构建表头
		HSSFRow headerRow = sheet.createRow(0); // 创建sheet中的行对象
		for (int i=0; i<titles.length; i++) {
			HSSFCell cell = headerRow.createCell(i); // 创建一行中的一个单元格对象
			cell.setCellStyle(headerCellStyle);
			cell.setCellValue(titles[i]);
		}
		
		// 构建表体
		for (int i=0; i<uiList.size(); i++) {
			HSSFRow bodyRow = sheet.createRow(i+1); // 创建sheet中的行对象
			UserInfo ui = uiList.get(i);
			
			HSSFCell bodyCell1 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell2 = bodyRow.createCell(1);
			bodyCell2.setCellStyle(bodyCellStyle);
			bodyCell2.setCellValue(ui.getUsername());

			HSSFCell bodyCell3 = bodyRow.createCell(2);
			bodyCell3.setCellStyle(bodyCellStyle);
			bodyCell3.setCellValue(ui.getRemark());
			
			/*
			HSSFCell bodyCell3 = bodyRow.createCell(2);
			bodyCell3.setCellStyle(bodyCellStyle);
			bodyCell3.setCellValue(ui.getId());

			HSSFCell bodyCell4 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell5 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell6 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell7 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell8 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell9 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			HSSFCell bodyCell10 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());
			*/
		}
		
		try {
			wb.write(out);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	@Override
	public void exportUserXlsx(String[] titles, ServletOutputStream out) {
		List<UserInfo> uiList = getUserInfos();
		System.err.println(CommonUtils.writeValueAsString(uiList));
		
		SXSSFWorkbook swb = new SXSSFWorkbook(1000); // 内存中保留 1000 条数据，以免内存溢出，其余写入 硬盘
		swb.setCompressTempFiles(true);
		
		SXSSFSheet sheet = swb.createSheet("员工账号");
		sheet.setDefaultColumnWidth(20);
		sheet.setAutobreaks(true);
		sheet.trackAllColumnsForAutoSizing();
		for (int i=0; i<titles.length; i++) {
			sheet.autoSizeColumn(i); // 自动根据长度调整单元格长度
		}
		
		CellStyle headerCellStyle = getHeadStyle(swb);
		CellStyle bodyCellStyle = getBodyStyle(swb);
		
		// 构建表头
		SXSSFRow headerRow = sheet.createRow(0); // 创建sheet中的行对象
		for (int i=0; i<titles.length; i++) {
			SXSSFCell cell = headerRow.createCell(i); // 创建一行中的一个单元格对象
			cell.setCellStyle(headerCellStyle);
			cell.setCellValue(titles[i]);
		}
		
		// 构建表体
		for (int i=0; i<uiList.size(); i++) {
			SXSSFRow bodyRow = sheet.createRow(i+1); // 创建sheet中的行对象
			UserInfo ui = uiList.get(i);
			
			SXSSFCell bodyCell1 = bodyRow.createCell(0);
			bodyCell1.setCellStyle(bodyCellStyle);
			bodyCell1.setCellValue(ui.getId());

			SXSSFCell bodyCell2 = bodyRow.createCell(1);
			bodyCell2.setCellStyle(bodyCellStyle);
			bodyCell2.setCellValue(ui.getUsername());

			SXSSFCell bodyCell3 = bodyRow.createCell(2);
			bodyCell3.setCellStyle(bodyCellStyle);
			bodyCell3.setCellValue(ui.getRemark());
			
		}
		
		try {
			swb.write(out);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	private List<UserInfo> getUserInfos() {
		
		List<UserInfo> uiList = new ArrayList<>();
		
		for (int i=0; i<5; i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setId(1 + i);
			userInfo.setUsername("name: " + (i+1));
			userInfo.setRemark("remark: " + (i+1));
			
			uiList.add(userInfo);
		}
		
		return uiList;
	}
	
	/**
	 * 表头单元格样式
	 * @param wb
	 * @return
	 */
	private HSSFCellStyle getHeadStyle(HSSFWorkbook wb) {
		HSSFCellStyle cellStyle = wb.createCellStyle(); // 单元格样式
		
		cellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.BLUE.getIndex()); // 设置单元格背景淡蓝色
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 设置垂直居中对齐
		cellStyle.setWrapText(true); // 设置自动换行
		
		
		HSSFFont font = wb.createFont(); // 创建字体样式
		font.setBold(true); // 字体加粗
		font.setFontName("宋体"); // 字体名称
		font.setFontHeightInPoints((short) 14); // 字体大小
		
		cellStyle.setFont(font);
		
		cellStyle.setBorderLeft(BorderStyle.THIN); // 设置单元格线条，细线
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		
		return cellStyle;
	}
	
	/**
	 * 表头单元格样式 xlsx
	 * @param wb
	 * @return
	 */
	private CellStyle getHeadStyle(SXSSFWorkbook wb) {
		CellStyle cellStyle = wb.createCellStyle(); // 单元格样式
		
		cellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.BLUE.getIndex()); // 设置单元格背景淡蓝色
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 设置垂直居中对齐
		cellStyle.setWrapText(true); // 设置自动换行
		
		
		Font font = wb.createFont(); // 创建字体样式
		font.setBold(true); // 字体加粗
		font.setFontName("宋体"); // 字体名称
		font.setFontHeightInPoints((short) 14); // 字体大小
		
		cellStyle.setFont(font);
		
		cellStyle.setBorderLeft(BorderStyle.THIN); // 设置单元格线条，细线
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		
		return cellStyle;
	}
	
	/**
	 * 表体单元格样式
	 * @param wb
	 * @return
	 */
	private HSSFCellStyle getBodyStyle(HSSFWorkbook wb) {
		HSSFCellStyle cellStyle = wb.createCellStyle(); // 单元格样式
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 设置垂直居中对齐
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
		cellStyle.setWrapText(true); // 设置自动换行
		
		HSSFFont font = wb.createFont(); // 创建字体样式
		font.setBold(false); // 字体普通
		font.setFontName("宋体"); // 字体名称
		font.setFontHeightInPoints((short) 12); // 字体大小
		
		cellStyle.setFont(font);
		
		cellStyle.setBorderLeft(BorderStyle.THIN); // 设置单元格线条，细线
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		
		return cellStyle;
	}
	
	/**
	 * 表体单元格样式 xlsx
	 * @param wb
	 * @return
	 */
	private CellStyle getBodyStyle(SXSSFWorkbook wb) {
		CellStyle cellStyle = wb.createCellStyle(); // 单元格样式
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 设置垂直居中对齐
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
		cellStyle.setWrapText(true); // 设置自动换行
		
		Font font = wb.createFont(); // 创建字体样式
		font.setBold(false); // 字体普通
		font.setFontName("宋体"); // 字体名称
		font.setFontHeightInPoints((short) 12); // 字体大小
		
		cellStyle.setFont(font);
		
		cellStyle.setBorderLeft(BorderStyle.THIN); // 设置单元格线条，细线
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		
		return cellStyle;
	}

}
