package com.hcl.streams;

public class Employ {

	private int empNo;
	private String name;
	private float salary;
	private char band;
	
	public Employ() {
		super();
	}
	
	public Employ(int empNo, String name, float salary, char band) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.band = band;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public char getBand() {
		return band;
	}
	public void setBand(char band) {
		this.band = band;
	}
}