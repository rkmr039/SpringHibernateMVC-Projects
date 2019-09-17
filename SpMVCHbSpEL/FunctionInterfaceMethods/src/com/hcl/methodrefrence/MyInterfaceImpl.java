package com.hcl.methodrefrence;

import java.util.function.Consumer;

public class MyInterfaceImpl {

	public static void main(String[] args) {
		MyInterface myInterface = (a) -> {System.out.println(a);};
		myInterface.someMethod("HCL");
		
		MyInterface myInterface2 = System.out::println;
		myInterface2.someMethod("Java CoE");
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Bye");
	}
}
