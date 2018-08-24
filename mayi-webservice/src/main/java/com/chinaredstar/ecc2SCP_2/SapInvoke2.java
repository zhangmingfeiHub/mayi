/**
 * 
 * @author mingfei.z 2018年8月20日 下午2:44:24
 */
package com.chinaredstar.ecc2SCP_2;

import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.encoding.XMLType;

/**
 * 
 * @author mingfei.z
 */
public class SapInvoke2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			SI_ZMF_PO_STORAGE_OSServiceLocator service = new SI_ZMF_PO_STORAGE_OSServiceLocator();
			
			Call call = service.createCall();
			call.setTargetEndpointAddress(service.getHTTP_PortAddress());
			call.setOperationName(service.getServiceName());
			

			call.addParameter("IC_FLAG", XMLType.XSD_ANY, ParameterMode.IN);
			call.addParameter("IT_DATA", XMLType.XSD_ANY, ParameterMode.IN);
			
			call.setReturnType(XMLType.XSD_ANY);
			
			call.setProperty(call.USERNAME_PROPERTY, "zhaijc");
			call.setProperty(call.PASSWORD_PROPERTY, "huaxia06");
			
			Object object = call.invoke(new Object[] {"a", new String[] {"b1","b2"} });
			System.out.println(object);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
