package com.mfzhang.mayi.job.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.job.service.ExportService;
import com.mfzhang.mayi.job.view.UserInfoExcelTemplateView;
import com.mfzhang.mayi.valid.test.UserInfo;

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
			String fileName = new String("用户_".getBytes("gbk"), "ISO-8859-1") + new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + ".xlsx";
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
	
	@RequestMapping("/view")
	public String exprotView() {
		return "exportView";
	}
	
	@RequestMapping(value = "/user/view")
	public String export(@RequestParam(value = "json") String queryJson, HttpServletResponse response) {
		
		System.err.println(queryJson);
		UserInfo ui = (UserInfo) CommonUtils.readValue(queryJson, UserInfo.class);
		
		System.err.println(CommonUtils.writeValueAsString(ui));
		
		try {
			ServletOutputStream out = response.getOutputStream();
			String fileName = new String("用户_".getBytes("gbk"), "ISO-8859-1") + new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + ".xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);
			
			String[] titles = getTitles().split(",");
			exportService.exportUserXlsx(titles, out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@RequestMapping(value = "/userWithSpringView", method = RequestMethod.POST)
	public ModelAndView exportData() {
		
		List<UserInfo> uiList = exportService.getData();
		ModelMap model = new ModelMap();
		model.addAttribute("uiList", uiList);
		
		return new ModelAndView(new UserInfoExcelTemplateView(), model);
	}

}
