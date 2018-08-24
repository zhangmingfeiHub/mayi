package com.chinaredstar.ecc2SCP_2;

public class SI_ZMF_PO_STORAGE_OSProxy implements com.chinaredstar.ecc2SCP_2.SI_ZMF_PO_STORAGE_OS {
  private String _endpoint = null;
  private com.chinaredstar.ecc2SCP_2.SI_ZMF_PO_STORAGE_OS sI_ZMF_PO_STORAGE_OS = null;
  
  public SI_ZMF_PO_STORAGE_OSProxy() {
    _initSI_ZMF_PO_STORAGE_OSProxy();
  }
  
  public SI_ZMF_PO_STORAGE_OSProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_ZMF_PO_STORAGE_OSProxy();
  }
  
  private void _initSI_ZMF_PO_STORAGE_OSProxy() {
    try {
      sI_ZMF_PO_STORAGE_OS = (new com.chinaredstar.ecc2SCP_2.SI_ZMF_PO_STORAGE_OSServiceLocator()).getHTTPS_Port();
      if (sI_ZMF_PO_STORAGE_OS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_ZMF_PO_STORAGE_OS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_ZMF_PO_STORAGE_OS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_ZMF_PO_STORAGE_OS != null)
      ((javax.xml.rpc.Stub)sI_ZMF_PO_STORAGE_OS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.chinaredstar.ecc2SCP_2.SI_ZMF_PO_STORAGE_OS getSI_ZMF_PO_STORAGE_OS() {
    if (sI_ZMF_PO_STORAGE_OS == null)
      _initSI_ZMF_PO_STORAGE_OSProxy();
    return sI_ZMF_PO_STORAGE_OS;
  }
  
  public functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGEResponse SI_ZMF_PO_STORAGE_OS(functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGEType0 parameters) throws java.rmi.RemoteException{
    if (sI_ZMF_PO_STORAGE_OS == null)
      _initSI_ZMF_PO_STORAGE_OSProxy();
    return sI_ZMF_PO_STORAGE_OS.SI_ZMF_PO_STORAGE_OS(parameters);
  }
  
  
}