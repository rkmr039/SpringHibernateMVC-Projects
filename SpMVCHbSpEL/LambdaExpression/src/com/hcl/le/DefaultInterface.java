package com.hcl.le;

public interface DefaultInterface {
	default void printHello(){
		System.out.println("Hello Default");
	}
	static void printStaticHello() {
		System.out.println("Hello Static");
	}
}
