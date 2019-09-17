package com.hcl.methodrefrence;

@FunctionalInterface
public interface StaticMethod {

	public String sayHello(Integer str);
	
	public static String someMethod(Integer num){
		return "Welcome static "+ num;
	}
	
}
