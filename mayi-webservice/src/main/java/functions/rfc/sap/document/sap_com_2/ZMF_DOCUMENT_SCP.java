/**
 * ZMF_DOCUMENT_SCP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com_2;

public class ZMF_DOCUMENT_SCP  implements java.io.Serializable {
    /* Number of Material Document */
    private java.lang.String MBLNR;

    /* Material Document Year */
    private java.lang.String MJAHR;

    /* Item in Material Document */
    private java.lang.String ZEILE;

    /* Purchasing Document Number */
    private java.lang.String EBELN;

    /* Item Number of Purchasing Document */
    private java.lang.String EBELP;

    /* Plant */
    private java.lang.String WERKS;

    /* Storage Location */
    private java.lang.String LGORT;

    /* Material Number */
    private java.lang.String MATNR;

    /* Quantity in Unit of Entry */
    private java.math.BigDecimal ERFMG;

    /* Base Unit of Measure */
    private java.lang.String MEINS;

    public ZMF_DOCUMENT_SCP() {
    }

    public ZMF_DOCUMENT_SCP(
           java.lang.String MBLNR,
           java.lang.String MJAHR,
           java.lang.String ZEILE,
           java.lang.String EBELN,
           java.lang.String EBELP,
           java.lang.String WERKS,
           java.lang.String LGORT,
           java.lang.String MATNR,
           java.math.BigDecimal ERFMG,
           java.lang.String MEINS) {
           this.MBLNR = MBLNR;
           this.MJAHR = MJAHR;
           this.ZEILE = ZEILE;
           this.EBELN = EBELN;
           this.EBELP = EBELP;
           this.WERKS = WERKS;
           this.LGORT = LGORT;
           this.MATNR = MATNR;
           this.ERFMG = ERFMG;
           this.MEINS = MEINS;
    }


    /**
     * Gets the MBLNR value for this ZMF_DOCUMENT_SCP.
     * 
     * @return MBLNR   * Number of Material Document
     */
    public java.lang.String getMBLNR() {
        return MBLNR;
    }


    /**
     * Sets the MBLNR value for this ZMF_DOCUMENT_SCP.
     * 
     * @param MBLNR   * Number of Material Document
     */
    public void setMBLNR(java.lang.String MBLNR) {
        this.MBLNR = MBLNR;
    }


    /**
     * Gets the MJAHR value for this ZMF_DOCUMENT_SCP.
     * 
     * @return MJAHR   * Material Document Year
     */
    public java.lang.String getMJAHR() {
        return MJAHR;
    }


    /**
     * Sets the MJAHR value for this ZMF_DOCUMENT_SCP.
     * 
     * @param MJAHR   * Material Document Year
     */
    public void setMJAHR(java.lang.String MJAHR) {
        this.MJAHR = MJAHR;
    }


    /**
     * Gets the ZEILE value for this ZMF_DOCUMENT_SCP.
     * 
     * @return ZEILE   * Item in Material Document
     */
    public java.lang.String getZEILE() {
        return ZEILE;
    }


    /**
     * Sets the ZEILE value for this ZMF_DOCUMENT_SCP.
     * 
     * @param ZEILE   * Item in Material Document
     */
    public void setZEILE(java.lang.String ZEILE) {
        this.ZEILE = ZEILE;
    }


    /**
     * Gets the EBELN value for this ZMF_DOCUMENT_SCP.
     * 
     * @return EBELN   * Purchasing Document Number
     */
    public java.lang.String getEBELN() {
        return EBELN;
    }


    /**
     * Sets the EBELN value for this ZMF_DOCUMENT_SCP.
     * 
     * @param EBELN   * Purchasing Document Number
     */
    public void setEBELN(java.lang.String EBELN) {
        this.EBELN = EBELN;
    }


    /**
     * Gets the EBELP value for this ZMF_DOCUMENT_SCP.
     * 
     * @return EBELP   * Item Number of Purchasing Document
     */
    public java.lang.String getEBELP() {
        return EBELP;
    }


    /**
     * Sets the EBELP value for this ZMF_DOCUMENT_SCP.
     * 
     * @param EBELP   * Item Number of Purchasing Document
     */
    public void setEBELP(java.lang.String EBELP) {
        this.EBELP = EBELP;
    }


    /**
     * Gets the WERKS value for this ZMF_DOCUMENT_SCP.
     * 
     * @return WERKS   * Plant
     */
    public java.lang.String getWERKS() {
        return WERKS;
    }


    /**
     * Sets the WERKS value for this ZMF_DOCUMENT_SCP.
     * 
     * @param WERKS   * Plant
     */
    public void setWERKS(java.lang.String WERKS) {
        this.WERKS = WERKS;
    }


    /**
     * Gets the LGORT value for this ZMF_DOCUMENT_SCP.
     * 
     * @return LGORT   * Storage Location
     */
    public java.lang.String getLGORT() {
        return LGORT;
    }


    /**
     * Sets the LGORT value for this ZMF_DOCUMENT_SCP.
     * 
     * @param LGORT   * Storage Location
     */
    public void setLGORT(java.lang.String LGORT) {
        this.LGORT = LGORT;
    }


    /**
     * Gets the MATNR value for this ZMF_DOCUMENT_SCP.
     * 
     * @return MATNR   * Material Number
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this ZMF_DOCUMENT_SCP.
     * 
     * @param MATNR   * Material Number
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the ERFMG value for this ZMF_DOCUMENT_SCP.
     * 
     * @return ERFMG   * Quantity in Unit of Entry
     */
    public java.math.BigDecimal getERFMG() {
        return ERFMG;
    }


    /**
     * Sets the ERFMG value for this ZMF_DOCUMENT_SCP.
     * 
     * @param ERFMG   * Quantity in Unit of Entry
     */
    public void setERFMG(java.math.BigDecimal ERFMG) {
        this.ERFMG = ERFMG;
    }


    /**
     * Gets the MEINS value for this ZMF_DOCUMENT_SCP.
     * 
     * @return MEINS   * Base Unit of Measure
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZMF_DOCUMENT_SCP.
     * 
     * @param MEINS   * Base Unit of Measure
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZMF_DOCUMENT_SCP)) return false;
        ZMF_DOCUMENT_SCP other = (ZMF_DOCUMENT_SCP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MBLNR==null && other.getMBLNR()==null) || 
             (this.MBLNR!=null &&
              this.MBLNR.equals(other.getMBLNR()))) &&
            ((this.MJAHR==null && other.getMJAHR()==null) || 
             (this.MJAHR!=null &&
              this.MJAHR.equals(other.getMJAHR()))) &&
            ((this.ZEILE==null && other.getZEILE()==null) || 
             (this.ZEILE!=null &&
              this.ZEILE.equals(other.getZEILE()))) &&
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
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.ERFMG==null && other.getERFMG()==null) || 
             (this.ERFMG!=null &&
              this.ERFMG.equals(other.getERFMG()))) &&
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
        if (getMBLNR() != null) {
            _hashCode += getMBLNR().hashCode();
        }
        if (getMJAHR() != null) {
            _hashCode += getMJAHR().hashCode();
        }
        if (getZEILE() != null) {
            _hashCode += getZEILE().hashCode();
        }
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
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getERFMG() != null) {
            _hashCode += getERFMG().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZMF_DOCUMENT_SCP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZMF_DOCUMENT_SCP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MBLNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MBLNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MJAHR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MJAHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZEILE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZEILE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
