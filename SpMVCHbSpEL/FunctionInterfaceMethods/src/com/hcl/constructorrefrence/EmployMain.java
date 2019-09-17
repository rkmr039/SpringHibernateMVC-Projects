package com.hcl.constructorrefrence;

public class EmployMain {
	
	public static void main(String[] args) {
		EmployInterface employInterface = Employ::new;
		Employ employ = employInterface.getEmploy(5, "Rishab");
		
		
		System.out.println(employ.getEmpNo()+ " : "+ employ.getEmpName());
		
		EmployNumInterfaceRefrence employNumInterfaceRefrence  = Employ::new;
		Employ employ2 = employNumInterfaceRefrence.setEmploy(5);
		System.out.println(employ2.getEmpNo());
		
		EmployNameInterfaceRefrence employNameInterfaceRefrence  = Employ::new;
		Employ employ3 = employNameInterfaceRefrence.setEmploy("Rishab");
		System.out.println(employ3.getEmpName());
		
		
	} 

}
