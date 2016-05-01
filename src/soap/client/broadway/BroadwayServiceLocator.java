/**
 * BroadwayServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client.broadway;

public class BroadwayServiceLocator extends org.apache.axis.client.Service implements soap.client.broadway.BroadwayService {

    public BroadwayServiceLocator() {
    }


    public BroadwayServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BroadwayServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Broadway
    private java.lang.String Broadway_address = "http://localhost:11660/PA3/services/Broadway";

    public java.lang.String getBroadwayAddress() {
        return Broadway_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BroadwayWSDDServiceName = "Broadway";

    public java.lang.String getBroadwayWSDDServiceName() {
        return BroadwayWSDDServiceName;
    }

    public void setBroadwayWSDDServiceName(java.lang.String name) {
        BroadwayWSDDServiceName = name;
    }

    public soap.client.broadway.Broadway getBroadway() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Broadway_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBroadway(endpoint);
    }

    public soap.client.broadway.Broadway getBroadway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap.client.broadway.BroadwaySoapBindingStub _stub = new soap.client.broadway.BroadwaySoapBindingStub(portAddress, this);
            _stub.setPortName(getBroadwayWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBroadwayEndpointAddress(java.lang.String address) {
        Broadway_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap.client.broadway.Broadway.class.isAssignableFrom(serviceEndpointInterface)) {
                soap.client.broadway.BroadwaySoapBindingStub _stub = new soap.client.broadway.BroadwaySoapBindingStub(new java.net.URL(Broadway_address), this);
                _stub.setPortName(getBroadwayWSDDServiceName());
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
        if ("Broadway".equals(inputPortName)) {
            return getBroadway();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap", "BroadwayService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap", "Broadway"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Broadway".equals(portName)) {
            setBroadwayEndpointAddress(address);
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
