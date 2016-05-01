/**
 * PlayBillService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client.playbill;

public interface PlayBillService extends javax.xml.rpc.Service {
    public java.lang.String getPlayBillAddress();

    public soap.client.playbill.PlayBill getPlayBill() throws javax.xml.rpc.ServiceException;

    public soap.client.playbill.PlayBill getPlayBill(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
