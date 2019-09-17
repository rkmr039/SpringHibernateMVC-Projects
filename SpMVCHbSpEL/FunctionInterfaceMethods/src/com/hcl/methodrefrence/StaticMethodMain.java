package com.hcl.methodrefrence;

public class StaticMethodMain {
	public static void main(String[] args) {
		StaticMethod staticMethod = (a) -> {return "welcome "+a;};
		System.out.println(staticMethod.sayHello(22));
		
		StaticMethod staticMethod2 = StaticMethod::someMethod;
		System.out.println(staticMethod2.sayHello(44));
	}
}
