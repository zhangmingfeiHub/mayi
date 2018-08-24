/**
 * 
 * @author mingfei.z 2018年8月18日 上午6:28:32
 */
package functions.rfc.sap.document.sap_com_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.Constants;
import org.apache.axis.encoding.XMLType;

/**
 * 
 * @author mingfei.z
 */
public class SapInvoke {

	public static void main(String[] args) {
		try {
			ServiceLocator service = new ServiceLocator();
			
			Call call = service.createCall();
			call.setTargetEndpointAddress(service.getbindingAddress());
			call.setOperationName(service.getServiceName());
//			call.setOperationName(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "binding"));
			
			System.out.println(call.PASSWORD_PROPERTY);
			System.out.println(call.USERNAME_PROPERTY);
			
			
			
			call.addParameter("IN_DATE", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("IN_MATNR", XMLType.XSD_STRING, ParameterMode.IN);
//			
//			call.setReturnType(XMLType.XSD_STRING);
			
			/*
			call.addParameter("OT_SUBRC", XMLType.XSD_STRING, ParameterMode.OUT);
			call.setReturnType(XMLType.XSD_ANY);
			call.addParameter("OT_MESSAG", XMLType.XSD_STRING, ParameterMode.OUT);
			call.setReturnType(XMLType.XSD_ANY);
			*/
			
			call.setProperty(call.USERNAME_PROPERTY, "ZWS_FMP");
			call.setProperty(call.PASSWORD_PROPERTY, "123456");
			
			// ZWS_FMP  123456
			// "2018-08-15 00:00:00"
//			Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-15");
			Object[] objArr = new Object[] {};
			
			Object object = call.invoke(objArr);
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
