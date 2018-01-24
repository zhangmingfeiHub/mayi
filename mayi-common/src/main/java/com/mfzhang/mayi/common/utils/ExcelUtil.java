package com.mfzhang.mayi.common.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

/**
 * 
 * @author mingfei.z
 *
 */
public class ExcelUtil {

	/**
	 * 表头单元格样式 xlsx
	 * @param wb
	 * @return
	 */
	public static CellStyle getHeadStyle(SXSSFWorkbook wb) {
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
	 * 表头单元格样式 xls
	 * @param wb
	 * @return
	 */
	public static HSSFCellStyle getHeadStyle(HSSFWorkbook wb) {
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
	 * 表头单元格样式 
	 * @param wb
	 * @return
	 */
	public static CellStyle getHeadStyle(Workbook wb) {
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
	 * 表体单元格样式 xlsx
	 * @param wb
	 * @return
	 */
	public static CellStyle getBodyStyle(SXSSFWorkbook wb) {
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

	/**
	 * 表体单元格样式 xls
	 * @param wb
	 * @return
	 */
	public static HSSFCellStyle getBodyStyle(HSSFWorkbook wb) {
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
	 * 表体单元格样式 
	 * @param wb
	 * @return
	 */
	public static CellStyle getBodyStyle(Workbook wb) {
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
