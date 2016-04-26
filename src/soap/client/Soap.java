/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.client;

public interface Soap extends java.rmi.Remote {
    public java.lang.Object[] getReviewsByDate(java.util.Calendar date) throws java.rmi.RemoteException;
    public java.lang.Object[] getReviewsByGenre(java.lang.String genre) throws java.rmi.RemoteException;
    public java.lang.Object[] getReviewsByName(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.Object[] getReviews() throws java.rmi.RemoteException;
}
