/**
 * 
 * @author mingfei.z 2018年8月16日 下午11:27:51
 */
package com.mingfei.sap;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.mingfei.sap.ServiceStub.ZmmMaterialData;
import com.mingfei.sap.ServiceStub.ZmmMaterialDataE;
import com.mingfei.sap.ServiceStub.ZmmMaterialDataResponse;

/**
 * 
 * @author mingfei.z
 */
public class TestSap {

	/**
	 * 
	 * @author mingfei.z
	 * @param args
	 */
	public static void main(String[] args) {
//		try {
//			ServiceStub service = new ServiceStub();
//			
//			ZmmMaterialDataE params = new ZmmMaterialDataE();
//			
//			ZmmMaterialDataResponse response = service.zmmMaterialData(params);
//			
//			System.out.println(response.getEtData());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			ServiceStub service = new ServiceStub();
			
//			HttpTransportProperties.Authenticator a = null;
			
			
			
			ZmmMaterialDataE params = new ZmmMaterialDataE();
			
			ZmmMaterialDataResponse response = service.zmmMaterialData(params);
			
			System.out.println(response.getEtData());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
