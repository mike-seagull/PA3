package soap.client.broadway;

public class BroadwayProxy implements soap.client.broadway.Broadway {
  private String _endpoint = null;
  private soap.client.broadway.Broadway broadway = null;
  
  public BroadwayProxy() {
    _initBroadwayProxy();
  }
  
  public BroadwayProxy(String endpoint) {
    _endpoint = endpoint;
    _initBroadwayProxy();
  }
  
  private void _initBroadwayProxy() {
    try {
      broadway = (new soap.client.broadway.BroadwayServiceLocator()).getBroadway();
      if (broadway != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)broadway)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)broadway)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (broadway != null)
      ((javax.xml.rpc.Stub)broadway)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap.client.broadway.Broadway getBroadway() {
    if (broadway == null)
      _initBroadwayProxy();
    return broadway;
  }
  
  public java.lang.Object[] getReviewsByDate(java.util.Calendar date) throws java.rmi.RemoteException{
    if (broadway == null)
      _initBroadwayProxy();
    return broadway.getReviewsByDate(date);
  }
  
  public java.lang.Object[] getReviewsByGenre(java.lang.String genre) throws java.rmi.RemoteException{
    if (broadway == null)
      _initBroadwayProxy();
    return broadway.getReviewsByGenre(genre);
  }
  
  public java.lang.Object[] getReviewsByName(java.lang.String name) throws java.rmi.RemoteException{
    if (broadway == null)
      _initBroadwayProxy();
    return broadway.getReviewsByName(name);
  }
  
  public java.lang.Object[] getReviews() throws java.rmi.RemoteException{
    if (broadway == null)
      _initBroadwayProxy();
    return broadway.getReviews();
  }
  
  
}