/**
 * SatyaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.satya;

public class SatyaServiceLocator extends org.apache.axis.client.Service implements com.satya.SatyaService {

    public SatyaServiceLocator() {
    }


    public SatyaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SatyaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Satya
    private java.lang.String Satya_address = "http://192.168.1.16:8182/PersonInfoService/services/Satya";

    public java.lang.String getSatyaAddress() {
        return Satya_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SatyaWSDDServiceName = "Satya";

    public java.lang.String getSatyaWSDDServiceName() {
        return SatyaWSDDServiceName;
    }

    public void setSatyaWSDDServiceName(java.lang.String name) {
        SatyaWSDDServiceName = name;
    }

    public com.satya.Satya getSatya() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Satya_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSatya(endpoint);
    }

    public com.satya.Satya getSatya(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.satya.SatyaSoapBindingStub _stub = new com.satya.SatyaSoapBindingStub(portAddress, this);
            _stub.setPortName(getSatyaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSatyaEndpointAddress(java.lang.String address) {
        Satya_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.satya.Satya.class.isAssignableFrom(serviceEndpointInterface)) {
                com.satya.SatyaSoapBindingStub _stub = new com.satya.SatyaSoapBindingStub(new java.net.URL(Satya_address), this);
                _stub.setPortName(getSatyaWSDDServiceName());
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
        if ("Satya".equals(inputPortName)) {
            return getSatya();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://satya.com", "SatyaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://satya.com", "Satya"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Satya".equals(portName)) {
            setSatyaEndpointAddress(address);
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
