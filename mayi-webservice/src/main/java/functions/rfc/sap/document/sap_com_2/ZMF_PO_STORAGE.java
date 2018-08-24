/**
 * ZMF_PO_STORAGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com_2;

public class ZMF_PO_STORAGE  implements java.io.Serializable {
    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Item Number of Purchasing Document */
    private java.lang.String EBELP;

    /* Plant */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Document Header Text */
    private java.lang.String BKTXT;

    /* Material Number */
    private java.lang.String MATNR;

    /* Quantity in Unit of Entry */
    private java.math.BigDecimal ERFMG;

    /* Document Date in Document */
    private functions.rfc.sap.document.sap_com_2.Date BLDAT;

    /* Posting Date in the Document */
    private functions.rfc.sap.document.sap_com_2.Date BUDAT;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    public ZMF_PO_STORAGE() {
    }

    public ZMF_PO_STORAGE(
           java.lang.String EBELN,
           java.lang.String EBELP,
           java.lang.String WERKS,
           java.lang.String LGORT,
           java.lang.String BKTXT,
           java.lang.String MATNR,
           java.math.BigDecimal ERFMG,
           functions.rfc.sap.document.sap_com_2.Date BLDAT,
           functions.rfc.sap.document.sap_com_2.Date BUDAT,
           java.lang.String MEINS) {
           this.EBELN = EBELN;
           this.EBELP = EBELP;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.BKTXT = BKTXT;
           this.MATNR = MATNR;
           this.ERFMG = ERFMG;
           this.BLDAT = BLDAT;
           this.BUDAT = BUDAT;
           this.MEINS = MEINS;
    }


    /**
     * Gets the EBELN value for this ZMF_PO_STORAGE.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZMF_PO_STORAGE.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the EBELP value for this ZMF_PO_STORAGE.
     * 
     * @return EBELP   * Item Number of Purchasing Document
     */
    public java.lang.String getEBELP() {
        return EBELP;
    }


    /**
     * Sets the EBELP value for this ZMF_PO_STORAGE.
     * 
     * @param EBELP   * Item Number of Purchasing Document
     */
    public void setEBELP(java.lang.String EBELP) {
        this.EBELP = EBELP;
    }


    /**
     * Gets the WERKS value for this ZMF_PO_STORAGE.
     * 
     * @return WERKS   * Plant
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZMF_PO_STORAGE.
     * 
     * @param WERKS   * Plant
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZMF_PO_STORAGE.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZMF_PO_STORAGE.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the BKTXT value for this ZMF_PO_STORAGE.
     * 
     * @return BKTXT   * Document Header Text
     */
    public java.lang.String getBKTXT() {
        return BKTXT;
    }


    /**
     * Sets the BKTXT value for this ZMF_PO_STORAGE.
     * 
     * @param BKTXT   * Document Header Text
     */
    public void setBKTXT(java.lang.String BKTXT) {
        this.BKTXT = BKTXT;
    }


    /**
     * Gets the MATNR value for this ZMF_PO_STORAGE.
     * 
     * @return MATNR   * Material Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZMF_PO_STORAGE.
     * 
     * @param MATNR   * Material Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the ERFMG value for this ZMF_PO_STORAGE.
     * 
     * @return ERFMG   * Quantity in Unit of Entry
     */
    public java.math.BigDecimal getERFMG() {
        return ERFMG;
    }


    /**
     * Sets the ERFMG value for this ZMF_PO_STORAGE.
     * 
     * @param ERFMG   * Quantity in Unit of Entry
     */
    public void setERFMG(java.math.BigDecimal ERFMG) {
        this.ERFMG = ERFMG;
    }


    /**
     * Gets the BLDAT value for this ZMF_PO_STORAGE.
     * 
     * @return BLDAT   * Document Date in Document
     */
    public functions.rfc.sap.document.sap_com_2.Date getBLDAT() {
        return BLDAT;
    }


    /**
     * Sets the BLDAT value for this ZMF_PO_STORAGE.
     * 
     * @param BLDAT   * Document Date in Document
     */
    public void setBLDAT(functions.rfc.sap.document.sap_com_2.Date BLDAT) {
        this.BLDAT = BLDAT;
    }


    /**
     * Gets the BUDAT value for this ZMF_PO_STORAGE.
     * 
     * @return BUDAT   * Posting Date in the Document
     */
    public functions.rfc.sap.document.sap_com_2.Date getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this ZMF_PO_STORAGE.
     * 
     * @param BUDAT   * Posting Date in the Document
     */
    public void setBUDAT(functions.rfc.sap.document.sap_com_2.Date BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the MEINS value for this ZMF_PO_STORAGE.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZMF_PO_STORAGE.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZMF_PO_STORAGE)) return false;
        ZMF_PO_STORAGE other = (ZMF_PO_STORAGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EBELN==null && other.getEBELN()==null) || 
             (this.EBELN!=null &&
              this.EBELN.equals(other.getEBELN()))) &&
            ((this.EBELP==null && other.getEBELP()==null) || 
             (this.EBELP!=null &&
              this.EBELP.equals(other.getEBELP()))) &&
            ((this.WERKS==null && other.getWERKS()==null) || 
             (this.WERKS!=null &&
              this.WERKS.equals(other.getWERKS()))) &&
            ((this.LGORT==null && other.getLGORT()==null) || 
             (this.LGORT!=null &&
              this.LGORT.equals(other.getLGORT()))) &&
            ((this.BKTXT==null && other.getBKTXT()==null) || 
             (this.BKTXT!=null &&
              this.BKTXT.equals(other.getBKTXT()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.ERFMG==null && other.getERFMG()==null) || 
             (this.ERFMG!=null &&
              this.ERFMG.equals(other.getERFMG()))) &&
            ((this.BLDAT==null && other.getBLDAT()==null) || 
             (this.BLDAT!=null &&
              this.BLDAT.equals(other.getBLDAT()))) &&
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEBELN() != null) {
            _hashCode += getEBELN().hashCode();
        }
        if (getEBELP() != null) {
            _hashCode += getEBELP().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getLGORT() != null) {
            _hashCode += getLGORT().hashCode();
        }
        if (getBKTXT() != null) {
            _hashCode += getBKTXT().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getERFMG() != null) {
            _hashCode += getERFMG().hashCode();
        }
        if (getBLDAT() != null) {
            _hashCode += getBLDAT().hashCode();
        }
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZMF_PO_STORAGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZMF_PO_STORAGE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EBELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBELP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EBELP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BKTXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BKTXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERFMG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERFMG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BLDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BLDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
