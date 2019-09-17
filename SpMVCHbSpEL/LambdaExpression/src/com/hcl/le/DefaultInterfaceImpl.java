package com.hcl.le;

public class DefaultInterfaceImpl implements DefaultInterface {
	public static void main(String[] args) {
		new DefaultInterfaceImpl().printHello();
		DefaultInterface.printStaticHello();
		
	}
}
