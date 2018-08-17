package functions.rfc.sap.document.sap_com;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.StringHolder;

import functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZMM_MATERIAL_DATAHolder;

public class ZMM_MATERIAL_DATAProxy implements functions.rfc.sap.document.sap_com.ZMM_MATERIAL_DATA_PortType {
  private String _endpoint = null;
  private functions.rfc.sap.document.sap_com.ZMM_MATERIAL_DATA_PortType zMM_MATERIAL_DATA = null;
  
  public ZMM_MATERIAL_DATAProxy() {
    _initZMM_MATERIAL_DATAProxy();
  }
  
  public ZMM_MATERIAL_DATAProxy(String endpoint) {
    _endpoint = endpoint;
    _initZMM_MATERIAL_DATAProxy();
  }
  
  private void _initZMM_MATERIAL_DATAProxy() {
    try {
      zMM_MATERIAL_DATA = (new functions.rfc.sap.document.sap_com.ServiceLocator()).getbinding();
      if (zMM_MATERIAL_DATA != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zMM_MATERIAL_DATA)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zMM_MATERIAL_DATA)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zMM_MATERIAL_DATA != null)
      ((javax.xml.rpc.Stub)zMM_MATERIAL_DATA)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public functions.rfc.sap.document.sap_com.ZMM_MATERIAL_DATA_PortType getZMM_MATERIAL_DATA() {
    if (zMM_MATERIAL_DATA == null)
      _initZMM_MATERIAL_DATAProxy();
    return zMM_MATERIAL_DATA;
  }
  
  @Override
	public void ZMM_MATERIAL_DATA(TABLE_OF_ZMM_MATERIAL_DATAHolder ET_DATA, String IN_DATE, String IN_MATNR,
			StringHolder OT_MESSAG, StringHolder OT_SUBRC) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}