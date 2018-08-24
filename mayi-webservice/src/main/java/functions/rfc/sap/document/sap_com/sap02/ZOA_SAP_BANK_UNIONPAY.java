/**
 * ZOA_SAP_BANK_UNIONPAY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com.sap02;

public class ZOA_SAP_BANK_UNIONPAY  implements java.io.Serializable {
    private java.lang.String PARAMETER;

    private functions.rfc.sap.document.sap_com.sap02.ZBANKUNIONPAY[] BANKUNIONPAY;

    public ZOA_SAP_BANK_UNIONPAY() {
    }

    public ZOA_SAP_BANK_UNIONPAY(
           java.lang.String PARAMETER,
           functions.rfc.sap.document.sap_com.sap02.ZBANKUNIONPAY[] BANKUNIONPAY) {
           this.PARAMETER = PARAMETER;
           this.BANKUNIONPAY = BANKUNIONPAY;
    }


    /**
     * Gets the PARAMETER value for this ZOA_SAP_BANK_UNIONPAY.
     * 
     * @return PARAMETER
     */
    public java.lang.String getPARAMETER() {
        return PARAMETER;
    }


    /**
     * Sets the PARAMETER value for this ZOA_SAP_BANK_UNIONPAY.
     * 
     * @param PARAMETER
     */
    public void setPARAMETER(java.lang.String PARAMETER) {
        this.PARAMETER = PARAMETER;
    }


    /**
     * Gets the BANKUNIONPAY value for this ZOA_SAP_BANK_UNIONPAY.
     * 
     * @return BANKUNIONPAY
     */
    public functions.rfc.sap.document.sap_com.sap02.ZBANKUNIONPAY[] getBANKUNIONPAY() {
        return BANKUNIONPAY;
    }


    /**
     * Sets the BANKUNIONPAY value for this ZOA_SAP_BANK_UNIONPAY.
     * 
     * @param BANKUNIONPAY
     */
    public void setBANKUNIONPAY(functions.rfc.sap.document.sap_com.sap02.ZBANKUNIONPAY[] BANKUNIONPAY) {
        this.BANKUNIONPAY = BANKUNIONPAY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOA_SAP_BANK_UNIONPAY)) return false;
        ZOA_SAP_BANK_UNIONPAY other = (ZOA_SAP_BANK_UNIONPAY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PARAMETER==null && other.getPARAMETER()==null) || 
             (this.PARAMETER!=null &&
              this.PARAMETER.equals(other.getPARAMETER()))) &&
            ((this.BANKUNIONPAY==null && other.getBANKUNIONPAY()==null) || 
             (this.BANKUNIONPAY!=null &&
              java.util.Arrays.equals(this.BANKUNIONPAY, other.getBANKUNIONPAY())));
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
        if (getPARAMETER() != null) {
            _hashCode += getPARAMETER().hashCode();
        }
        if (getBANKUNIONPAY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBANKUNIONPAY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBANKUNIONPAY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOA_SAP_BANK_UNIONPAY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZOA_SAP_BANK_UNIONPAY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARAMETER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PARAMETER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKUNIONPAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BANKUNIONPAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZBANKUNIONPAY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
