package com.hcl.parserbase;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employee {
	

	private int empNo;
	private String empName;
	private float salary;
	private char band;
	private Date dateOfJoin;
	
	@XmlElement
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@XmlElement
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@XmlElement
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@XmlElement
	public char getBand() {
		return band;
	}
	public void setBand(char band) {
		this.band = band;
	}
	
	@XmlElement
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	

	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, float salary, char band, Date dateOfJoin) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.band = band;
		this.dateOfJoin = dateOfJoin;
	}

	@Override
	public String toString() {
		return "\n Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", band=" + band
				+ ", dateOfJoin=" + dateOfJoin + "]";
	}
	
	
	
}
