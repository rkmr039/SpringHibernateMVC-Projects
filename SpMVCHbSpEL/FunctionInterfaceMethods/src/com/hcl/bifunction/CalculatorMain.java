package com.hcl.bifunction;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Integer ans = calculator.calc((x,y)-> (x + y), 50, 65);
		System.out.println(ans);
	}
	
	
	
	
}