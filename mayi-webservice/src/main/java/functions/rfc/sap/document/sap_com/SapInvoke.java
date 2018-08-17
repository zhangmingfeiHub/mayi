/**
 * 
 * @author mingfei.z 2018年8月18日 上午6:28:32
 */
package functions.rfc.sap.document.sap_com;

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
			
			System.out.println(call.PASSWORD_PROPERTY);
			System.out.println(call.USERNAME_PROPERTY);
			
			call.setProperty(call.USERNAME_PROPERTY, "ZWS_FMP");
			call.setProperty(call.PASSWORD_PROPERTY, "123456");
			
			// ZWS_FMP  123456
			Object object = call.invoke(new Object[] {});
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
