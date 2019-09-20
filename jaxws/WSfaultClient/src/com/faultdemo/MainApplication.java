package com.faultdemo;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		HelloWorldProxy helloWorldProxy = new HelloWorldProxy();
		try {
			System.out.println(helloWorldProxy.sayHello(""));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
