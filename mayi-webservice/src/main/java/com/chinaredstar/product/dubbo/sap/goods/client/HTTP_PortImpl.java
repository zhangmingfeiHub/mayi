
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.chinaredstar.product.dubbo.sap.goods.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.16
 * 2018-08-21T15:21:37.780+08:00
 * Generated source version: 3.1.16
 * 
 */

@javax.jws.WebService(
                      serviceName = "SI_ZMM_MATERIAL_DATA_REQService",
                      portName = "HTTP_Port",
                      targetNamespace = "http://chinaredstar.com/ecc2zt",
                      wsdlLocation = "file:/D:/work/proj/future-mmall/ws-client/sap08.wsdl",
                      endpointInterface = "com.chinaredstar.product.dubbo.service.sap08.SIZMMMATERIALDATAREQ")
                      
public class HTTP_PortImpl implements SIZMMMATERIALDATAREQ {

    private static final Logger LOG = Logger.getLogger(HTTP_PortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.chinaredstar.product.dubbo.service.sap08.SIZMMMATERIALDATAREQ#siZMMMATERIALDATAREQ(com.sap.document.sap.rfc.functions.ZMMMATERIALDATA parameters)*
     */
    public com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATAResponse siZMMMATERIALDATAREQ(com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATA parameters) { 
        LOG.info("Executing operation siZMMMATERIALDATAREQ");
        System.out.println(parameters);
        try {
            com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATAResponse _return = new com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATAResponse();
            _return.setOTMESSAG("OTMESSAG132405594");
            _return.setOTSUBRC("OTSUBRC-2116404201");
            com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATAResponse.ETDATA _returnETDATA = new com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATAResponse.ETDATA();
            java.util.List<com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATA2> _returnETDATAItem = new java.util.ArrayList<com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATA2>();
            com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATA2 _returnETDATAItemVal1 = new com.chinaredstar.product.dubbo.sap.goods.ZMMMATERIALDATA2();
            _returnETDATAItemVal1.setMTART("MTART-1231543109");
            _returnETDATAItemVal1.setMATNR("MATNR794421358");
            _returnETDATAItemVal1.setMAKTX("MAKTX1057174549");
            _returnETDATAItemVal1.setMATKL("MATKL-856624049");
            _returnETDATAItemVal1.setWGBEZ("WGBEZ-326396555");
            _returnETDATAItemVal1.setMEINS("MEINS744516129");
            _returnETDATAItemVal1.setBRGEW(new java.math.BigDecimal("8242372639101232620.2429278119654030355"));
            _returnETDATAItemVal1.setNTGEW(new java.math.BigDecimal("-6202700600145066303.6386363238507787411"));
            _returnETDATAItemVal1.setGEWEI("GEWEI-990141857");
            _returnETDATAItemVal1.setVOLUM(new java.math.BigDecimal("-756099006229492741.2572898414778646663"));
            _returnETDATAItemVal1.setVOLEH("VOLEH171287780");
            _returnETDATAItemVal1.setORIGIN("ORIGIN1489029099");
            _returnETDATAItemVal1.setMODEL("MODEL-642697812");
            _returnETDATAItemVal1.setNORMS("NORMS-802148948");
            _returnETDATAItemVal1.setNATURE("NATURE2046754883");
            _returnETDATAItemVal1.setPRODMA("PRODMA-449429458");
            _returnETDATAItemVal1.setBRAND("BRAND-1082826208");
            _returnETDATAItemVal1.setSERIES("SERIES-1287844827");
            _returnETDATAItemVal1.setCOLOUR("COLOUR-1491878009");
            _returnETDATAItemVal1.setLIFNR("LIFNR1334736170");
            _returnETDATAItem.add(_returnETDATAItemVal1);
            _returnETDATA.getItem().addAll(_returnETDATAItem);
            _return.setETDATA(_returnETDATA);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
