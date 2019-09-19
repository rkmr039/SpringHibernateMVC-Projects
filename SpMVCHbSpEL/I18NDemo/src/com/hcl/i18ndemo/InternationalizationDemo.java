package com.hcl.i18ndemo;


import java.util.Locale;
import java.util.ResourceBundle;
public class InternationalizationDemo {
	public static void main(String[] args) {
	
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
		System.out.println("Message in " + Locale.US + " : " + bundle.getString("greeting"));
		
		//changing the default locale to indonasian 
		Locale.setDefault(new Locale("in", "ID"));
		bundle = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in " + Locale.getDefault() + " : " + bundle.getString("greeting"));
		
		Locale.setDefault(new Locale("ar", "BH"));
		bundle = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in " + Locale.getDefault() + " : " + bundle.getString("greeting"));
		
		Locale.setDefault(new Locale("zh", "CH"));
		bundle = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in " + Locale.getDefault() + " : " + bundle.getString("greeting"));
	
		// bundle = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in nl_BE : " + bundle.getString("greeting_nl_BE"));
	}
}