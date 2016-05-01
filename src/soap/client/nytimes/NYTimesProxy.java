package soap.client.nytimes;

public class NYTimesProxy implements soap.client.nytimes.NYTimes {
  private String _endpoint = null;
  private soap.client.nytimes.NYTimes nYTimes = null;
  
  public NYTimesProxy() {
    _initNYTimesProxy();
  }
  
  public NYTimesProxy(String endpoint) {
    _endpoint = endpoint;
    _initNYTimesProxy();
  }
  
  private void _initNYTimesProxy() {
    try {
      nYTimes = (new soap.client.nytimes.NYTimesServiceLocator()).getNYTimes();
      if (nYTimes != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nYTimes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nYTimes)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nYTimes != null)
      ((javax.xml.rpc.Stub)nYTimes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap.client.nytimes.NYTimes getNYTimes() {
    if (nYTimes == null)
      _initNYTimesProxy();
    return nYTimes;
  }
  
  public java.lang.Object[] getReviewsByDate(java.util.Calendar date) throws java.rmi.RemoteException{
    if (nYTimes == null)
      _initNYTimesProxy();
    return nYTimes.getReviewsByDate(date);
  }
  
  public java.lang.Object[] getReviewsByGenre(java.lang.String genre) throws java.rmi.RemoteException{
    if (nYTimes == null)
      _initNYTimesProxy();
    return nYTimes.getReviewsByGenre(genre);
  }
  
  public java.lang.Object[] getReviewsByName(java.lang.String name) throws java.rmi.RemoteException{
    if (nYTimes == null)
      _initNYTimesProxy();
    return nYTimes.getReviewsByName(name);
  }
  
  public java.lang.Object[] getReviews() throws java.rmi.RemoteException{
    if (nYTimes == null)
      _initNYTimesProxy();
    return nYTimes.getReviews();
  }
  
  
}