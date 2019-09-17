package com.hcl.le;

public class MultiImplMain {
	public static void main(String[] args) {
		MultiInterface multiInterface = ( name) -> ( "Hello : "+ name);	
		System.out.println(multiInterface.sayHello("Rishab"));
		
		System.out.println("Static method call : " + MultiInterface.add(5, 9));
		
		System.out.println("Default method call : " + multiInterface.defaultMethod(100));
		
		MultiInterface multiInterface2 = (String str) -> {return "ABC";};
		System.out.println(multiInterface.equals(multiInterface2));
		
	} 

}
