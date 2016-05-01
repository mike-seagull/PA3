/**
 * NYTimesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client.nytimes;

public interface NYTimesService extends javax.xml.rpc.Service {
    public java.lang.String getNYTimesAddress();

    public soap.client.nytimes.NYTimes getNYTimes() throws javax.xml.rpc.ServiceException;

    public soap.client.nytimes.NYTimes getNYTimes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
