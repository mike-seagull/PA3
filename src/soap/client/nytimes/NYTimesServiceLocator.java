/**
 * NYTimesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client.nytimes;

public class NYTimesServiceLocator extends org.apache.axis.client.Service implements soap.client.nytimes.NYTimesService {

    public NYTimesServiceLocator() {
    }


    public NYTimesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NYTimesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NYTimes
    private java.lang.String NYTimes_address = "http://localhost:8080/PA3/services/NYTimes";

    public java.lang.String getNYTimesAddress() {
        return NYTimes_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NYTimesWSDDServiceName = "NYTimes";

    public java.lang.String getNYTimesWSDDServiceName() {
        return NYTimesWSDDServiceName;
    }

    public void setNYTimesWSDDServiceName(java.lang.String name) {
        NYTimesWSDDServiceName = name;
    }

    public soap.client.nytimes.NYTimes getNYTimes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NYTimes_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNYTimes(endpoint);
    }

    public soap.client.nytimes.NYTimes getNYTimes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap.client.nytimes.NYTimesSoapBindingStub _stub = new soap.client.nytimes.NYTimesSoapBindingStub(portAddress, this);
            _stub.setPortName(getNYTimesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNYTimesEndpointAddress(java.lang.String address) {
        NYTimes_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap.client.nytimes.NYTimes.class.isAssignableFrom(serviceEndpointInterface)) {
                soap.client.nytimes.NYTimesSoapBindingStub _stub = new soap.client.nytimes.NYTimesSoapBindingStub(new java.net.URL(NYTimes_address), this);
                _stub.setPortName(getNYTimesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NYTimes".equals(inputPortName)) {
            return getNYTimes();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap", "NYTimesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap", "NYTimes"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NYTimes".equals(portName)) {
            setNYTimesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
