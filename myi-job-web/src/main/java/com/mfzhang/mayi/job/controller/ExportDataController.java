package com.mfzhang.mayi.job.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mfzhang.mayi.job.service.ExportService;

@Controller
@RequestMapping("/export")
public class ExportDataController {

	@Autowired
	private ExportService exportService;
	
	@RequestMapping("/user")
	public String exportUser(HttpServletResponse response) {
		
		// response.setContentType("application/binary;charset=UTF-8");
		response.setContentType("application/force-download");

		try {
			ServletOutputStream out = response.getOutputStream();
			String fileName = "users_" + new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + ".xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);
			
			String[] titles = getTitles().split(",");
			// exportService.exportUserXls(titles, out);
			exportService.exportUserXlsx(titles, out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getTitles() {
		// String titles = "员工ID,员工姓名,联系电话,岗位名称,店铺名称,主营品牌,申请人,申请时间,审核时间,员工状态";
		String titles = "员工ID,员工姓名,备注";
		return titles;
	}
	
}
