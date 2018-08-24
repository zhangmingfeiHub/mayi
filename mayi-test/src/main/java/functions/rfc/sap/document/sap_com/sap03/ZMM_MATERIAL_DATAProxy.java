package functions.rfc.sap.document.sap_com.sap03;

public class ZMM_MATERIAL_DATAProxy {
  private String _endpoint = null;
  private functions.rfc.sap.document.sap_com.sap03.ZMM_MATERIAL_DATA_PortType zMM_MATERIAL_DATA = null;
  
  public ZMM_MATERIAL_DATAProxy() {
    _initZMM_MATERIAL_DATAProxy();
  }
  
  public ZMM_MATERIAL_DATAProxy(String endpoint) {
    _endpoint = endpoint;
    _initZMM_MATERIAL_DATAProxy();
  }
  
  private void _initZMM_MATERIAL_DATAProxy() {
    try {
      zMM_MATERIAL_DATA = (new functions.rfc.sap.document.sap_com.sap03.ServiceLocator()).getbinding();
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
  
  public functions.rfc.sap.document.sap_com.sap03.ZMM_MATERIAL_DATA_PortType getZMM_MATERIAL_DATA() {
    if (zMM_MATERIAL_DATA == null)
      _initZMM_MATERIAL_DATAProxy();
    return zMM_MATERIAL_DATA;
  }
  
  
}