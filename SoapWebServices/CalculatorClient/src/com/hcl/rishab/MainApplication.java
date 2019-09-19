package com.hcl.rishab;

import java.rmi.RemoteException;

import com.SatyaProxy;
import com.hcl.saikumar.SaiKumarProxy;

public class MainApplication {

	public static void main(String[] args) {
		int sap1;
		int sap2;
		int result;
		SatyaProxy satyaProxy = new SatyaProxy();
		SaiKumarProxy saiKumarProxy = new SaiKumarProxy();
		CalculatorProxy calculatorProxy = new CalculatorProxy();
		
		try {
			sap1 = satyaProxy.getSap();
			sap2 = saiKumarProxy.getInt();
			result = calculatorProxy.add(sap2, sap1);
			System.out.println("Satya SAP ID : "+sap1);
			System.out.println("Sai SAP ID: "+ sap2);
			System.out.println("SAP SUM : "+ result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
