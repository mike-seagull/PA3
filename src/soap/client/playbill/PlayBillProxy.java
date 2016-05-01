package soap.client.playbill;

public class PlayBillProxy implements soap.client.playbill.PlayBill {
  private String _endpoint = null;
  private soap.client.playbill.PlayBill playBill = null;
  
  public PlayBillProxy() {
    _initPlayBillProxy();
  }
  
  public PlayBillProxy(String endpoint) {
    _endpoint = endpoint;
    _initPlayBillProxy();
  }
  
  private void _initPlayBillProxy() {
    try {
      playBill = (new soap.client.playbill.PlayBillServiceLocator()).getPlayBill();
      if (playBill != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)playBill)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)playBill)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (playBill != null)
      ((javax.xml.rpc.Stub)playBill)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap.client.playbill.PlayBill getPlayBill() {
    if (playBill == null)
      _initPlayBillProxy();
    return playBill;
  }
  
  public java.lang.Object[] getReviewsByDate(java.util.Calendar date) throws java.rmi.RemoteException{
    if (playBill == null)
      _initPlayBillProxy();
    return playBill.getReviewsByDate(date);
  }
  
  public java.lang.Object[] getReviewsByGenre(java.lang.String genre) throws java.rmi.RemoteException{
    if (playBill == null)
      _initPlayBillProxy();
    return playBill.getReviewsByGenre(genre);
  }
  
  public java.lang.Object[] getReviewsByName(java.lang.String name) throws java.rmi.RemoteException{
    if (playBill == null)
      _initPlayBillProxy();
    return playBill.getReviewsByName(name);
  }
  
  public java.lang.Object[] getReviews() throws java.rmi.RemoteException{
    if (playBill == null)
      _initPlayBillProxy();
    return playBill.getReviews();
  }
  
  
}