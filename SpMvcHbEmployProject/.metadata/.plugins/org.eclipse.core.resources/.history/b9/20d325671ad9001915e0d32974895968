package com.rishab.java8streams.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	private int empNo;
	private String empName;
	private float salary;
	private char band;
	private Date dateOfJoin;
	
	
	public int getEmpNo() {
		return empNo;
	}
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
	public Date getDateofJoin() {
		return dateOfJoin;
	}
	public void setDateofJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
}
