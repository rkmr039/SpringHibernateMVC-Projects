package com.hcl.le;

public class WithLambdaExpression {
	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = () -> {System.out.println("Welcome to myFunctionalInterface : With Lambda Expression");};
		myFunctionalInterface.sayMessage();
		
		MyInterfaceWithReturn interfaceWithReturn = (a,b) -> ( a + b );
		System.out.println(interfaceWithReturn.addTwoNumbers(5, 5));
		
		
	}
}
