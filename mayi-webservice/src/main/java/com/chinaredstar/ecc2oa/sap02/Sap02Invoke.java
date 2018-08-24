/**
 * 
 * @author mingfei.z 2018年8月20日 下午3:50:50
 */
package com.chinaredstar.ecc2oa.sap02;

import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.encoding.XMLType;

/**
 * 
 * @author mingfei.z
 */
public class Sap02Invoke {

	public static void main(String[] args) {
		try {
			SI_ZOA_SAP_BANK_UNIONPAY_REQServiceLocator service = new SI_ZOA_SAP_BANK_UNIONPAY_REQServiceLocator();
			
			Call call = service.createCall();
			call.setTargetEndpointAddress(service.getHTTP_PortAddress());
			call.setOperationName(service.getServiceName());
			
//			call.addParameter("PARAMETER", XMLType.XSD_ANY, ParameterMode.IN);
//			call.setReturnType(XMLType.XSD_ANY);
			
			
			call.setProperty(call.USERNAME_PROPERTY, "zhaijc");
			call.setProperty(call.PASSWORD_PROPERTY, "huaxia06");
			
			// http://chinaredstar.com/ecc2oa.SI_ZOA_SAP_BANK_UNIONPAY_REQService
			
			Object object = call.invoke(new Object[] {});
			System.out.println(object);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
