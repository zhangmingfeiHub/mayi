/**
 * 
 * @author mingfei.z 2018年8月20日 下午5:48:02
 */
package sap05;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * 
 * @author mingfei.z
 */
public class Sap05Invoke {

	public static void main(String[] args) {
		try {
			String wsUrl = "http://rssappiq.chinaredstar.com:50000/dir/wsdl?p=sa/73f39cb7620338ec9e86735d9a331d0e";
			String endPoint = "http://rssappiq.chinaredstar.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_OA&receiverParty=&receiverService=&interface=SI_ZOA_SAP_BANK_UNIONPAY_REQ&interfaceNamespace=http%3A%2F%2Fchinaredstar.com%2Fecc2oa";
			String username = "zhaijc";
			String password = "huaxia06";
			
			URL url = new URL(wsUrl);
			Authenticator.setDefault(new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(username, password.toCharArray());
				}
			});
			
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			
			int responseCode = conn.getResponseCode();
			if (responseCode == 200) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
