package com.rishab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rishab.model.Employee;
import com.rishab.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		if(employees.size() > 0) {
			return employees;
		} 
		return new ArrayList<Employee>();
	}

}
