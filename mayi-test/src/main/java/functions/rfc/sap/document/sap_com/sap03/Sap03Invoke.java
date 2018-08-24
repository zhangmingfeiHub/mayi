/**
 * 
 * @author mingfei.z 2018年8月20日 下午4:18:23
 */
package functions.rfc.sap.document.sap_com.sap03;

import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.encoding.XMLType;

/**
 * 
 * @author mingfei.z
 */
public class Sap03Invoke {

	public static void main(String[] args) {
		try {
			ServiceLocator service = new ServiceLocator();
			Call call = service.createCall();
			call.setTargetEndpointAddress(service.getbindingAddress());
			call.setOperationName(service.getServiceName());
			
			call.addParameter("IN_DATE", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("IN_MATNR", XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_ANY);
			
			
			call.setProperty(call.USERNAME_PROPERTY, "ZWS_FMP");
			call.setProperty(call.PASSWORD_PROPERTY, "123456");
			
			Object object = call.invoke(new Object[] {"2018-08-15", "A"});
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
