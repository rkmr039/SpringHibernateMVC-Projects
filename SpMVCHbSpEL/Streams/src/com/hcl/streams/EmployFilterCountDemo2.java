package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployFilterCountDemo2 {

	public static void main(String[] args) {
		List<Employ> list = new ArrayList<Employ>();
		list.add(new Employ(10,"Apple",1010f,  'E'));
		list.add(new Employ(20,"Banana",2020f, 'M'));
		list.add(new Employ(30,"Carrot",3030f, 'M'));
		list.add(new Employ(40,"Dates",4040f,  'C'));
		list.add(new Employ(50,"Apricot",5050f,'M'));
		
		Long noOfRecords = list.stream().count();
		System.out.println(noOfRecords);
		
		Long empSalaryManagrerGt3000 = list.stream().filter((var) -> var.getSalary() > 3000 
														  && var.getBand() == 'M')
							.count();
		System.out.println(empSalaryManagrerGt3000);
	}
}