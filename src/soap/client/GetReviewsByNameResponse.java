/**
 * GetReviewsByNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client;

public class GetReviewsByNameResponse  implements java.io.Serializable {
    private java.lang.Object[] getReviewsByNameReturn;

    public GetReviewsByNameResponse() {
    }

    public GetReviewsByNameResponse(
           java.lang.Object[] getReviewsByNameReturn) {
           this.getReviewsByNameReturn = getReviewsByNameReturn;
    }


    /**
     * Gets the getReviewsByNameReturn value for this GetReviewsByNameResponse.
     * 
     * @return getReviewsByNameReturn
     */
    public java.lang.Object[] getGetReviewsByNameReturn() {
        return getReviewsByNameReturn;
    }


    /**
     * Sets the getReviewsByNameReturn value for this GetReviewsByNameResponse.
     * 
     * @param getReviewsByNameReturn
     */
    public void setGetReviewsByNameReturn(java.lang.Object[] getReviewsByNameReturn) {
        this.getReviewsByNameReturn = getReviewsByNameReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReviewsByNameResponse)) return false;
        GetReviewsByNameResponse other = (GetReviewsByNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReviewsByNameReturn==null && other.getGetReviewsByNameReturn()==null) || 
             (this.getReviewsByNameReturn!=null &&
              java.util.Arrays.equals(this.getReviewsByNameReturn, other.getGetReviewsByNameReturn())));
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
        if (getGetReviewsByNameReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetReviewsByNameReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetReviewsByNameReturn(), i);
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
        new org.apache.axis.description.TypeDesc(GetReviewsByNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap", ">getReviewsByNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReviewsByNameReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap", "getReviewsByNameReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap", "item"));
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
