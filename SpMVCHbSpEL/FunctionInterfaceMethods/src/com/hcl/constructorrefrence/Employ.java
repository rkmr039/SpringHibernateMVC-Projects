package com.hcl.constructorrefrence;

public class Employ {

	private int empNo;
	private String empName;
	
	public Employ(){
		
	}

	
	public Employ(String empName) {
		super();
		this.empName = empName;
	}


	public Employ(int empNo) {
		super();
		this.empNo = empNo;
	}


	public Employ(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
