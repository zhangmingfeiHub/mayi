/**
 * ZMF_PO_STORAGEType0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com_2;

public class ZMF_PO_STORAGEType0  implements java.io.Serializable {
    private java.lang.String IC_FLAG;

    private functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] ET_DATA;

    private functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] IT_DATA;

    public ZMF_PO_STORAGEType0() {
    }

    public ZMF_PO_STORAGEType0(
           java.lang.String IC_FLAG,
           functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] ET_DATA,
           functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] IT_DATA) {
           this.IC_FLAG = IC_FLAG;
           this.ET_DATA = ET_DATA;
           this.IT_DATA = IT_DATA;
    }


    /**
     * Gets the IC_FLAG value for this ZMF_PO_STORAGEType0.
     * 
     * @return IC_FLAG
     */
    public java.lang.String getIC_FLAG() {
        return IC_FLAG;
    }


    /**
     * Sets the IC_FLAG value for this ZMF_PO_STORAGEType0.
     * 
     * @param IC_FLAG
     */
    public void setIC_FLAG(java.lang.String IC_FLAG) {
        this.IC_FLAG = IC_FLAG;
    }


    /**
     * Gets the ET_DATA value for this ZMF_PO_STORAGEType0.
     * 
     * @return ET_DATA
     */
    public functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] getET_DATA() {
        return ET_DATA;
    }


    /**
     * Sets the ET_DATA value for this ZMF_PO_STORAGEType0.
     * 
     * @param ET_DATA
     */
    public void setET_DATA(functions.rfc.sap.document.sap_com_2.ZMF_DOCUMENT_SCP[] ET_DATA) {
        this.ET_DATA = ET_DATA;
    }


    /**
     * Gets the IT_DATA value for this ZMF_PO_STORAGEType0.
     * 
     * @return IT_DATA
     */
    public functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] getIT_DATA() {
        return IT_DATA;
    }


    /**
     * Sets the IT_DATA value for this ZMF_PO_STORAGEType0.
     * 
     * @param IT_DATA
     */
    public void setIT_DATA(functions.rfc.sap.document.sap_com_2.ZMF_PO_STORAGE[] IT_DATA) {
        this.IT_DATA = IT_DATA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZMF_PO_STORAGEType0)) return false;
        ZMF_PO_STORAGEType0 other = (ZMF_PO_STORAGEType0) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IC_FLAG==null && other.getIC_FLAG()==null) || 
             (this.IC_FLAG!=null &&
              this.IC_FLAG.equals(other.getIC_FLAG()))) &&
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
        if (getIC_FLAG() != null) {
            _hashCode += getIC_FLAG().hashCode();
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
        new org.apache.axis.description.TypeDesc(ZMF_PO_STORAGEType0.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", ">ZMF_PO_STORAGE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IC_FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IC_FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
