package com.hcl.methodrefrence;

public class InstanceMethodMain {

	public static void main(String[] args) {
		InstanceInterface instanceInterface = () -> {System.out.println("Hello");};
		instanceInterface.myInterface();
		
		InstanceMethodRefrence instanceMethodRefrence = new InstanceMethodRefrence();
		instanceInterface = instanceMethodRefrence::saySomething;
		instanceInterface.myInterface();
		
		
	}
}
