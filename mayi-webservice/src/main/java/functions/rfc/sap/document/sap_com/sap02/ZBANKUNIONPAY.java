/**
 * ZBANKUNIONPAY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com.sap02;

public class ZBANKUNIONPAY  implements java.io.Serializable {
    /* Bank number */
    private java.lang.String UNIONPAY;

    /* Name of bank */
    private java.lang.String BANKNAME;

    public ZBANKUNIONPAY() {
    }

    public ZBANKUNIONPAY(
           java.lang.String UNIONPAY,
           java.lang.String BANKNAME) {
           this.UNIONPAY = UNIONPAY;
           this.BANKNAME = BANKNAME;
    }


    /**
     * Gets the UNIONPAY value for this ZBANKUNIONPAY.
     * 
     * @return UNIONPAY   * Bank number
     */
    public java.lang.String getUNIONPAY() {
        return UNIONPAY;
    }


    /**
     * Sets the UNIONPAY value for this ZBANKUNIONPAY.
     * 
     * @param UNIONPAY   * Bank number
     */
    public void setUNIONPAY(java.lang.String UNIONPAY) {
        this.UNIONPAY = UNIONPAY;
    }


    /**
     * Gets the BANKNAME value for this ZBANKUNIONPAY.
     * 
     * @return BANKNAME   * Name of bank
     */
    public java.lang.String getBANKNAME() {
        return BANKNAME;
    }


    /**
     * Sets the BANKNAME value for this ZBANKUNIONPAY.
     * 
     * @param BANKNAME   * Name of bank
     */
    public void setBANKNAME(java.lang.String BANKNAME) {
        this.BANKNAME = BANKNAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBANKUNIONPAY)) return false;
        ZBANKUNIONPAY other = (ZBANKUNIONPAY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UNIONPAY==null && other.getUNIONPAY()==null) || 
             (this.UNIONPAY!=null &&
              this.UNIONPAY.equals(other.getUNIONPAY()))) &&
            ((this.BANKNAME==null && other.getBANKNAME()==null) || 
             (this.BANKNAME!=null &&
              this.BANKNAME.equals(other.getBANKNAME())));
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
        if (getUNIONPAY() != null) {
            _hashCode += getUNIONPAY().hashCode();
        }
        if (getBANKNAME() != null) {
            _hashCode += getBANKNAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBANKUNIONPAY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBANKUNIONPAY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIONPAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNIONPAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BANKNAME"));
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
