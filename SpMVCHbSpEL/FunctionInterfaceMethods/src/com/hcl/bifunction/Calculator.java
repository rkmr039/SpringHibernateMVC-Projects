package com.hcl.bifunction;

import java.util.function.BiFunction;

public class Calculator {
	public Integer calc(BiFunction<Integer,Integer, Integer > bi,Integer int1, Integer int2){
	   return bi.apply(int1, int2);	
	}
}
