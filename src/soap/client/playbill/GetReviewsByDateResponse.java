/**
 * GetReviewsByDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client.playbill;

public class GetReviewsByDateResponse  implements java.io.Serializable {
    private java.lang.Object[] getReviewsByDateReturn;

    public GetReviewsByDateResponse() {
    }

    public GetReviewsByDateResponse(
           java.lang.Object[] getReviewsByDateReturn) {
           this.getReviewsByDateReturn = getReviewsByDateReturn;
    }


    /**
     * Gets the getReviewsByDateReturn value for this GetReviewsByDateResponse.
     * 
     * @return getReviewsByDateReturn
     */
    public java.lang.Object[] getGetReviewsByDateReturn() {
        return getReviewsByDateReturn;
    }


    /**
     * Sets the getReviewsByDateReturn value for this GetReviewsByDateResponse.
     * 
     * @param getReviewsByDateReturn
     */
    public void setGetReviewsByDateReturn(java.lang.Object[] getReviewsByDateReturn) {
        this.getReviewsByDateReturn = getReviewsByDateReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReviewsByDateResponse)) return false;
        GetReviewsByDateResponse other = (GetReviewsByDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReviewsByDateReturn==null && other.getGetReviewsByDateReturn()==null) || 
             (this.getReviewsByDateReturn!=null &&
              java.util.Arrays.equals(this.getReviewsByDateReturn, other.getGetReviewsByDateReturn())));
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
        if (getGetReviewsByDateReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetReviewsByDateReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetReviewsByDateReturn(), i);
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
        new org.apache.axis.description.TypeDesc(GetReviewsByDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap", ">getReviewsByDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReviewsByDateReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap", "getReviewsByDateReturn"));
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
