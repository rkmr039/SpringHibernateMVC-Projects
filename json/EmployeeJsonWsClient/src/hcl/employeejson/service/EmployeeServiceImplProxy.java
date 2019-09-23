package hcl.employeejson.service;

public class EmployeeServiceImplProxy implements hcl.employeejson.service.EmployeeServiceImpl {
  private String _endpoint = null;
  private hcl.employeejson.service.EmployeeServiceImpl employeeServiceImpl = null;
  
  public EmployeeServiceImplProxy() {
    _initEmployeeServiceImplProxy();
  }
  
  public EmployeeServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeServiceImplProxy();
  }
  
  private void _initEmployeeServiceImplProxy() {
    try {
      employeeServiceImpl = (new hcl.employeejson.service.EmployeeServiceImplServiceLocator()).getEmployeeServiceImpl();
      if (employeeServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeServiceImpl != null)
      ((javax.xml.rpc.Stub)employeeServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public hcl.employeejson.service.EmployeeServiceImpl getEmployeeServiceImpl() {
    if (employeeServiceImpl == null)
      _initEmployeeServiceImplProxy();
    return employeeServiceImpl;
  }
  
  public java.lang.String getEmployees() throws java.rmi.RemoteException{
    if (employeeServiceImpl == null)
      _initEmployeeServiceImplProxy();
    return employeeServiceImpl.getEmployees();
  }
  
  
}