package com.rishab.service;

import java.util.List;

import com.rishab.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(int id);
	
	public String saveOrUpdate(Employee employee);
	
	
	public String saveAll(List<Employee> employees);
	
	public String deleteById(int id);
	
	
	
}
