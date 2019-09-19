package com.satya;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		String res = "";
		SatyaProxy satyaProxy = new SatyaProxy();
		try {
			res = satyaProxy.getName();
			System.out.println("Details Received : " + res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
