package com.hcl.withoutle;

public class WithoutLambdaExpression {
public static void main(String[] args) {
	MyInterface myInterface = new MyInterface() {
		
		@Override
		public void sayMessage() {
			System.out.println("Welcome to MyInteface : Without Lambda Expression");
		}
	};
	myInterface.sayMessage();
	MyInterfaceWithReturn interfaceWithReturn = new MyInterfaceWithReturn() {
		
		@Override
		public int addTwoNumbers(int a, int b) {
			return a+b;
		}
	};
	System.out.println(interfaceWithReturn.addTwoNumbers(5, 5));
}
}
