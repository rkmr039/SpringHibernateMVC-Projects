package com.hcl.le;

public class SwappingNumbersImpl {
	public static void main(String[] args) {	
	SwappingInterface swappingInterface = (a,b) -> {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	};
	swappingInterface.swapTwoNumbers(6, 8);
	}
}
