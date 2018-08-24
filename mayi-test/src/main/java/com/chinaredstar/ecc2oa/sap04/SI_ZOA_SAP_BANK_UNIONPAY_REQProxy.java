package com.chinaredstar.ecc2oa.sap04;

public class SI_ZOA_SAP_BANK_UNIONPAY_REQProxy implements com.chinaredstar.ecc2oa.sap04.SI_ZOA_SAP_BANK_UNIONPAY_REQ {
  private String _endpoint = null;
  private com.chinaredstar.ecc2oa.sap04.SI_ZOA_SAP_BANK_UNIONPAY_REQ sI_ZOA_SAP_BANK_UNIONPAY_REQ = null;
  
  public SI_ZOA_SAP_BANK_UNIONPAY_REQProxy() {
    _initSI_ZOA_SAP_BANK_UNIONPAY_REQProxy();
  }
  
  public SI_ZOA_SAP_BANK_UNIONPAY_REQProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_ZOA_SAP_BANK_UNIONPAY_REQProxy();
  }
  
  private void _initSI_ZOA_SAP_BANK_UNIONPAY_REQProxy() {
    try {
      sI_ZOA_SAP_BANK_UNIONPAY_REQ = (new com.chinaredstar.ecc2oa.sap04.SI_ZOA_SAP_BANK_UNIONPAY_REQServiceLocator()).getHTTPS_Port();
      if (sI_ZOA_SAP_BANK_UNIONPAY_REQ != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_ZOA_SAP_BANK_UNIONPAY_REQ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_ZOA_SAP_BANK_UNIONPAY_REQ)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_ZOA_SAP_BANK_UNIONPAY_REQ != null)
      ((javax.xml.rpc.Stub)sI_ZOA_SAP_BANK_UNIONPAY_REQ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.chinaredstar.ecc2oa.sap04.SI_ZOA_SAP_BANK_UNIONPAY_REQ getSI_ZOA_SAP_BANK_UNIONPAY_REQ() {
    if (sI_ZOA_SAP_BANK_UNIONPAY_REQ == null)
      _initSI_ZOA_SAP_BANK_UNIONPAY_REQProxy();
    return sI_ZOA_SAP_BANK_UNIONPAY_REQ;
  }
  
  public functions.rfc.sap.document.sap_com.sap04.ZOA_SAP_BANK_UNIONPAYResponse SI_ZOA_SAP_BANK_UNIONPAY_REQ(functions.rfc.sap.document.sap_com.sap04.ZOA_SAP_BANK_UNIONPAY parameters) throws java.rmi.RemoteException{
    if (sI_ZOA_SAP_BANK_UNIONPAY_REQ == null)
      _initSI_ZOA_SAP_BANK_UNIONPAY_REQProxy();
    return sI_ZOA_SAP_BANK_UNIONPAY_REQ.SI_ZOA_SAP_BANK_UNIONPAY_REQ(parameters);
  }
  
  
}