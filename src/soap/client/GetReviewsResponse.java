/**
 * GetReviewsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client;

public class GetReviewsResponse  implements java.io.Serializable {
    private java.lang.Object[] getReviewsReturn;

    public GetReviewsResponse() {
    }

    public GetReviewsResponse(
           java.lang.Object[] getReviewsReturn) {
           this.getReviewsReturn = getReviewsReturn;
    }


    /**
     * Gets the getReviewsReturn value for this GetReviewsResponse.
     * 
     * @return getReviewsReturn
     */
    public java.lang.Object[] getGetReviewsReturn() {
        return getReviewsReturn;
    }


    /**
     * Sets the getReviewsReturn value for this GetReviewsResponse.
     * 
     * @param getReviewsReturn
     */
    public void setGetReviewsReturn(java.lang.Object[] getReviewsReturn) {
        this.getReviewsReturn = getReviewsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReviewsResponse)) return false;
        GetReviewsResponse other = (GetReviewsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReviewsReturn==null && other.getGetReviewsReturn()==null) || 
             (this.getReviewsReturn!=null &&
              java.util.Arrays.equals(this.getReviewsReturn, other.getGetReviewsReturn())));
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
        if (getGetReviewsReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetReviewsReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetReviewsReturn(), i);
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
        new org.apache.axis.description.TypeDesc(GetReviewsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap", ">getReviewsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReviewsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap", "getReviewsReturn"));
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
