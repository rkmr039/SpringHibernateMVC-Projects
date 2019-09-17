package com.hcl.le;

@FunctionalInterface
public interface MultiInterface {
	public String sayHello(String name);
	
	public static int add(int a , int b){return a + b;}
	
	// public method of Object Class 
	boolean equals(Object obj);
	
	default public int defaultMethod(int var) {
		return var + 100;
	}
}
