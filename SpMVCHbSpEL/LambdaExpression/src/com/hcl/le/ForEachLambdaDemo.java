package com.hcl.le;

import java.util.List;
import java.util.ArrayList;

public class ForEachLambdaDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.forEach((n) -> System.out.println(n));
	}
}
