/**
 * ZMF_PO_STORAGEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com_2;

public class ZMF_PO_STORAGEResponse  implements java.io.Serializable {
    private java.lang.String EC_MESSAGE;

    private java.lang.String EC_SUBRC;

    private functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] ET_DATA;

    private functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] IT_DATA;

    public ZMF_PO_STORAGEResponse() {
    }

    public ZMF_PO_STORAGEResponse(
           java.lang.String EC_MESSAGE,
           java.lang.String EC_SUBRC,
           functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] ET_DATA,
           functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] IT_DATA) {
           this.EC_MESSAGE = EC_MESSAGE;
           this.EC_SUBRC = EC_SUBRC;
           this.ET_DATA = ET_DATA;
           this.IT_DATA = IT_DATA;
    }


    /**
     * Gets the EC_MESSAGE value for this ZMF_PO_STORAGEResponse.
     * 
     * @return EC_MESSAGE
     */
    public java.lang.String getEC_MESSAGE() {
        return EC_MESSAGE;
    }


    /**
     * Sets the EC_MESSAGE value for this ZMF_PO_STORAGEResponse.
     * 
     * @param EC_MESSAGE
     */
    public void setEC_MESSAGE(java.lang.String EC_MESSAGE) {
        this.EC_MESSAGE = EC_MESSAGE;
    }


    /**
     * Gets the EC_SUBRC value for this ZMF_PO_STORAGEResponse.
     * 
     * @return EC_SUBRC
     */
    public java.lang.String getEC_SUBRC() {
        return EC_SUBRC;
    }


    /**
     * Sets the EC_SUBRC value for this ZMF_PO_STORAGEResponse.
     * 
     * @param EC_SUBRC
     */
    public void setEC_SUBRC(java.lang.String EC_SUBRC) {
        this.EC_SUBRC = EC_SUBRC;
    }


    /**
     * Gets the ET_DATA value for this ZMF_PO_STORAGEResponse.
     * 
     * @return ET_DATA
     */
    public functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] getET_DATA() {
        return ET_DATA;
    }


    /**
     * Sets the ET_DATA value for this ZMF_PO_STORAGEResponse.
     * 
     * @param ET_DATA
     */
    public void setET_DATA(functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] ET_DATA) {
        this.ET_DATA = ET_DATA;
    }


    /**
     * Gets the IT_DATA value for this ZMF_PO_STORAGEResponse.
     * 
     * @return IT_DATA
     */
    public functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] getIT_DATA() {
        return IT_DATA;
    }


    /**
     * Sets the IT_DATA value for this ZMF_PO_STORAGEResponse.
     * 
     * @param IT_DATA
     */
    public void setIT_DATA(functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] IT_DATA) {
        this.IT_DATA = IT_DATA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZMF_PO_STORAGEResponse)) return false;
        ZMF_PO_STORAGEResponse other = (ZMF_PO_STORAGEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EC_MESSAGE==null && other.getEC_MESSAGE()==null) || 
             (this.EC_MESSAGE!=null &&
              this.EC_MESSAGE.equals(other.getEC_MESSAGE()))) &&
            ((this.EC_SUBRC==null && other.getEC_SUBRC()==null) || 
             (this.EC_SUBRC!=null &&
              this.EC_SUBRC.equals(other.getEC_SUBRC()))) &&
            ((this.ET_DATA==null && other.getET_DATA()==null) || 
             (this.ET_DATA!=null &&
              java.util.Arrays.equals(this.ET_DATA, other.getET_DATA()))) &&
            ((this.IT_DATA==null && other.getIT_DATA()==null) || 
             (this.IT_DATA!=null &&
              java.util.Arrays.equals(this.IT_DATA, other.getIT_DATA())));
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
        if (getEC_MESSAGE() != null) {
            _hashCode += getEC_MESSAGE().hashCode();
        }
        if (getEC_SUBRC() != null) {
            _hashCode += getEC_SUBRC().hashCode();
        }
        if (getET_DATA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getET_DATA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getET_DATA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIT_DATA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIT_DATA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIT_DATA(), i);
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
        new org.apache.axis.description.TypeDesc(ZMF_PO_STORAGEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZMF_PO_STORAGE.Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EC_MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EC_MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EC_SUBRC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EC_SUBRC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ET_DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ET_DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZMF_DOCUMENT_SCP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IT_DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZMF_PO_STORAGE"));
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
