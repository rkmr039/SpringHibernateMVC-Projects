package hcl.employeejson.service;

import java.rmi.RemoteException;

public class MainApp {

	public static void main(String[] args) {
		EmployeeServiceImplProxy employeeServiceImplProxy = new EmployeeServiceImplProxy();
		try {
			System.out.println(employeeServiceImplProxy.getEmployees());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
