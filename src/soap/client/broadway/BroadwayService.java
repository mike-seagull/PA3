/**
 * BroadwayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client.broadway;

public interface BroadwayService extends javax.xml.rpc.Service {
    public java.lang.String getBroadwayAddress();

    public soap.client.broadway.Broadway getBroadway() throws javax.xml.rpc.ServiceException;

    public soap.client.broadway.Broadway getBroadway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}