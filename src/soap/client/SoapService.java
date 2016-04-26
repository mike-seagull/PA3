/**
 * SoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client;

public interface SoapService extends javax.xml.rpc.Service {
    public java.lang.String getSoapAddress();

    public soap.client.Soap getSoap() throws javax.xml.rpc.ServiceException;

    public soap.client.Soap getSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
