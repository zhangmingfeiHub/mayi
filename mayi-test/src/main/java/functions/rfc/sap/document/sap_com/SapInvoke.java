/**
 * 
 * @author mingfei.z 2018年8月18日 上午6:28:32
 */
package functions.rfc.sap.document.sap_com;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;

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
			
//			call.addParameter(arg0, arg1, arg2);
			
			Object object = call.invoke(null);
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
