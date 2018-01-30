package com.mfzhang.mayi.job.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.view.document.AbstractXlsxStreamingView;

import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.valid.test.UserInfo;

/**
 * 
 * @author mingfei.z
 *
 */
public class UserInfoExcelTemplateView extends AbstractXlsxStreamingView {

	private String FORMAT_YYYYMMDDHHMM = "yyyyMMddHHmm";
	
	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<UserInfo> uiList = (List<UserInfo>) model.get("uiList");
		if (CollectionUtils.isEmpty(uiList)) {
			System.err.println("导出数据为空");
			return;
		}
		
		String sheetname = "用户数据";
		Sheet sheet = workbook.createSheet(sheetname); // 创建excel中sheet
		
		CellStyle headerCellStyle = getTitleStyle(workbook);
		CellStyle bodyCellStyle = getbodyStyle(workbook);
		
		String[] titles = getTitles(); // 表头标题
		if (null == titles || titles.length < 1) {
			System.err.println("表头标题为空");
			return;
		}
		
		Row headerRow = sheet.createRow(0); // 创建sheet的第一行
		for (int i=0; i<titles.length; i++) {
			CellUtil.createCell(headerRow, i, titles[i], headerCellStyle);
		}
		
		for (int i=0; i<uiList.size(); i++) {
			Row bodyRow = sheet.createRow(i+1);
			UserInfo ui = uiList.get(i);
			
			CellUtil.createCell(bodyRow, 0, ui.getId().toString(), bodyCellStyle);
			CellUtil.createCell(bodyRow, 1, ui.getUsername().toString(), bodyCellStyle);
			CellUtil.createCell(bodyRow, 2, ui.getRemark().toString(), bodyCellStyle);
			CellUtil.createCell(bodyRow, 3, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ui.getBirthDate()), bodyCellStyle);
		}
		
		SXSSFSheet xSheet = (SXSSFSheet) sheet;
		xSheet.trackAllColumnsForAutoSizing();
		for (int i=0; i<titles.length; i++) {
			sheet.autoSizeColumn(i);
			
			int columnWidth = sheet.getColumnWidth(i); // 实际列宽
			if (columnWidth < 3000) {
				sheet.setColumnWidth(i, 3000);
			}
		}
		
		String encode = request.getCharacterEncoding(); // 获取请求时的编码
		System.err.println("中文encode: " + encode);
		if (StringUtils.isEmpty(encode)) {
			encode = "UTF-8";
		}
		String fileName = new String("用户数据_".getBytes(encode), "ISO-8859-1") + new SimpleDateFormat(FORMAT_YYYYMMDDHHMM).format(new Date()) + ".xlsx";
		response.setCharacterEncoding(encode);
		response.setHeader("Content-disposition", "attachment;filename=" + fileName);
	}
	
	/**
	 * 获取表头标题
	 * @return
	 */
	private String[] getTitles() {
		return "员工ID,员工姓名,备注,出生日期".split(CommonConstants.SEPARATOR_COMM.COMMA);
	}
	
	/**
	 * 获取表头标题的样式
	 * @param cell
	 * @return
	 */
	private CellStyle getTitleStyle(Workbook workbook) {
		CellStyle cellStyle = workbook.createCellStyle();
		
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直居中
		cellStyle.setFillBackgroundColor(IndexedColors.OLIVE_GREEN.getIndex()); // 背景色
		cellStyle.setFillPattern(FillPatternType.BIG_SPOTS); // 填充样式
		
		Font font = workbook.createFont();
		font.setBold(true); // 加粗
		font.setFontName("宋体");
		font.setFontHeightInPoints((short) 14); // 字体大小
		font.setColor(IndexedColors.WHITE.getIndex());
		
		cellStyle.setFont(font);
		cellStyle.setBorderLeft(BorderStyle.THIN); // 设置单元格线条，细线
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		
		return cellStyle;
	}

	/**
	 * 获取表体的样式
	 * @param cell
	 * @return
	 */
	private CellStyle getbodyStyle(Workbook workbook) {
		CellStyle cellStyle = workbook.createCellStyle();
		
		cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直居中
		
		Font font = workbook.createFont();
		font.setBold(false); // 普通，不加粗
		font.setFontName("宋体");
		font.setFontHeightInPoints((short) 12); // 字体大小
		
		cellStyle.setFont(font);
		cellStyle.setBorderLeft(BorderStyle.THIN); // 设置单元格线条，细线
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		
		return cellStyle;
	}
	
	
}
