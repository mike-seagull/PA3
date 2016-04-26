package soap.client;

public class SoapProxy implements soap.client.Soap {
  private String _endpoint = null;
  private soap.client.Soap soap = null;
  
  public SoapProxy() {
    _initSoapProxy();
  }
  
  public SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapProxy();
  }
  
  private void _initSoapProxy() {
    try {
      soap = (new soap.client.SoapServiceLocator()).getSoap();
      if (soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soap != null)
      ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap.client.Soap getSoap() {
    if (soap == null)
      _initSoapProxy();
    return soap;
  }
  
  public java.lang.Object[] getReviewsByDate(java.util.Calendar date) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.getReviewsByDate(date);
  }
  
  public java.lang.Object[] getReviewsByGenre(java.lang.String genre) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.getReviewsByGenre(genre);
  }
  
  public java.lang.Object[] getReviewsByName(java.lang.String name) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.getReviewsByName(name);
  }
  
  public java.lang.Object[] getReviews() throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.getReviews();
  }
  
  
}