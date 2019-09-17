package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployMainForEachDemo {

	public static void main(String[] args) {
		List<Employ> list = new ArrayList<Employ>();
		list.add(new Employ(10,"Apple",1010f,'E'));
		list.add(new Employ(20,"Banana",2020f,'M'));
		list.add(new Employ(30,"Carrot",3030f,'M'));
		list.add(new Employ(40,"Dates",4040f,'C'));
		list.add(new Employ(50,"Apricot",5050f,'M'));
		
		list.stream().forEach((var)-> System.out.println(var.getEmpNo() +" "+
		var.getName()+" "+var.getSalary()));
		System.out.println(list.stream().count());
		
		
		
		
	}
}
