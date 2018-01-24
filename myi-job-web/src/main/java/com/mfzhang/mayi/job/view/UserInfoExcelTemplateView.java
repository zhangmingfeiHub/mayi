package com.mfzhang.mayi.job.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.servlet.view.document.AbstractXlsxStreamingView;

import com.mfzhang.mayi.common.constants.CommonConstants;
import com.mfzhang.mayi.common.utils.ExcelUtil;
import com.mfzhang.mayi.valid.test.UserInfo;

@Component("userInfoExcelView")
public class UserInfoExcelTemplateView extends AbstractXlsxStreamingView {
/*
	private Integer type;
	private Object obj;
	
	public UserInfoExcelTemplateView() {}
	
	public UserInfoExcelTemplateView(Integer type, Object obj) {
		this.type = type;
		this.obj = obj;
	}
	*/
	
	private String FORMAT_YYYYMMDDHHMM = "yyyyMMddHHmm";
	
	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("APPLICATION/OCTET-STREAM");
		String fileName = "用户列表_" + new SimpleDateFormat(FORMAT_YYYYMMDDHHMM).format(new Date());
		response.setHeader("Content-Disposition", "inline; filename=" + fileName);
		
		List<UserInfo> uiList = (List<UserInfo>) model.get("uiList");
		if (CollectionUtils.isEmpty(uiList)) {
			return;
		}
		
		String[] titles = getTitles();
		Sheet sheet = workbook.createSheet("用户账号");
		sheet.createFreezePane(0, 1); // 冻结表头
		sheet.setDefaultColumnWidth(30);
		
		CellStyle headerCellStyle = ExcelUtil.getHeadStyle(workbook); // 表头样式
		CellStyle bodyCellStyle = ExcelUtil.getBodyStyle(workbook); // 表体样式

		// 构建表头
		Row headerRow = sheet.createRow(0); // 创建sheet中的行对象
		for (int i=0; i<titles.length; i++) {
			Cell cell = headerRow.createCell(i); // 创建一行中的一个单元格对象
			cell.setCellStyle(headerCellStyle);
			cell.setCellValue(titles[i]);
		}
		
		// 构建表体
		for (int i=0; i<uiList.size(); i++) {
			UserInfo ui = uiList.get(i);
			Row bodyRow = sheet.createRow(i+1);
			
			for (int j=0; j<titles.length; j++) {
				Cell cell = bodyRow.createCell(j);
				cell.setCellStyle(bodyCellStyle);
				setCellValue(cell, titles[j], ui);
			}
		}
	}

	/**
	 * 获取excel中表头
	 * @return
	 * @author mingfei.z
	 */
	private String[] getTitles() {
		
		return "员工ID,员工姓名,备注".split(CommonConstants.SEPARATOR_COMM.COMMA);
	}

	/**
	 * 设置单元格的值
	 * @param cell
	 * @param title
	 * @param ui
	 * @author mingfei.z
	 */
	private void setCellValue(Cell cell, String title, UserInfo ui) {
		switch (title) {
			case "员工ID":
				cell.setCellValue(ui.getId());
				break;
			case "员工姓名":
				cell.setCellValue(ui.getUsername());
				break;
			case "备注":
				cell.setCellValue(ui.getRemark());
				break;
			default:
				break;
		}
	}

}
