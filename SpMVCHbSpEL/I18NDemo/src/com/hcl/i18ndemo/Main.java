package com.hcl.i18ndemo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
	
	
	public static void main(String[] args) {
		double d = 545455456.343;
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,new Locale("in","IN"));
		df = DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE"));
		df = DateFormat.getDateInstance(DateFormat.LONG,new Locale("ch","CH"));
		df = DateFormat.getDateInstance(DateFormat.LONG,new Locale("ge","GE"));
		NumberFormat nfItaly = NumberFormat.getInstance(Locale.ITALY);
		
		NumberFormat nfChina = NumberFormat.getInstance(Locale.CHINA);
		NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
		
		System.out.println("Short Form of Date : " + df.format(new Date()));
		
		
		System.out.println("Loacal Format for " + d);
		System.out.println("Italy Local: " + nfItaly.format(d));
		System.out.println("China Local: " + nfChina.format(d));
		System.out.println("US Local: " +nfUs.format(d));
		
		
	}
}
