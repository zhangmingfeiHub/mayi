package com.mfzhang.mayi.job.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mfzhang.mayi.common.utils.CommonUtils;
import com.mfzhang.mayi.job.service.ExportService;
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
	
	@RequestMapping(value = "/user/view", method = RequestMethod.POST)
	public String export(@RequestBody UserInfo userInfo, Model model) {
		
		System.err.println(CommonUtils.writeValueAsString(userInfo));
		
		List<UserInfo> uiList = getUserInfos();
		model.addAttribute("type", 1);
		model.addAttribute("uiList", uiList);
		
		return "userInfoExcelView";
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
	
}
