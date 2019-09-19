package helloservice.endpoint;

import java.rmi.RemoteException;

public class MainApplication {
public static void main(String[] args) {
	HelloProxy helloProxy = new HelloProxy();
	try {
		System.out.println(helloProxy.sayHello("Rishab"));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
