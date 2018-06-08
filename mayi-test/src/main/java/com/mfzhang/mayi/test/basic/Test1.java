package com.mfzhang.mayi.test.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.mfzhang.mayi.common.utils.CommonUtils;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = Collections.singletonList("a");
		System.err.println(CommonUtils.writeValueAsString(list));
		
		try {
			String dateStr = "2018-03-27";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(dateStr);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			System.err.println(sdf.format(calendar.getTime()));
			calendar.add(Calendar.DATE, 100);
			Date _100date = calendar.getTime();
			
			System.err.println(sdf.format(_100date));
		} catch (Exception e) {
			
		}
	}
	
}
