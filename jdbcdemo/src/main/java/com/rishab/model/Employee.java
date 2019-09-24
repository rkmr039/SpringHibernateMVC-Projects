package com.rishab.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private int empno;
	
	private String empname;
	private float salary;
	private char band;
	private Date dateofjoin;

	public int getEmpNo() {
		return empno;
	}

	public void setEmpNo(int empNo) {
		this.empno = empNo;
	}

	public String getEmpName() {
		return empname;
	}

	public void setEmpName(String empName) {
		this.empname = empName;
	}

	public double getSalary() {
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

	public Date getDateOfJoin() {
		return dateofjoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateofjoin = dateOfJoin;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empno + ", empName=" + empname + ", salary=" + salary + ", band=" + band
				+ ", dateOfJoin=" + dateofjoin + "]";
	}

}
