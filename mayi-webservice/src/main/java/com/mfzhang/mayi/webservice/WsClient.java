/**
 * 
 * @author mingfei.z 2018年8月14日 下午5:57:56
 */
package com.mfzhang.mayi.webservice;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

/**
 * 
 * @author mingfei.z
 */
public class WsClient {

	public static void main(String[] args) {
		WeatherWebService weatherWebService = new WeatherWebService();
		
		WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
		
		ArrayOfString weatherbyCityName = weatherWebServiceSoap.getWeatherbyCityName("南昌");
		
		List<String> list = weatherbyCityName.getString();
		
		for (String weather : list) {
			System.out.println(weather);
			System.out.println("--------------------------------");
		}
	}
	
}
