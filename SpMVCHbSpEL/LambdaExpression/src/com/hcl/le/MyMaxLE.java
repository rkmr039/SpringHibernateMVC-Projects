package com.hcl.le;

public class MyMaxLE {
	public static void main(String[] args) {
		MyMaxInterface myMaxInterface = (a,b) -> (a > b?a:b);
		System.out.println(myMaxInterface.getMax(7, 6));
	}
}
