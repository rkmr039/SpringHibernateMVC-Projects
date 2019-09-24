package com.rishab.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
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


	@Override
	public String saveOrUpdate(Employee employee) {
		Employee result = employeeRepository.save(employee);
		if(result.getEmpNo() == employee.getEmpNo()) {
			return "INSERTED";
		}
		return "NOT INSERTED";
	}


	@Override
	public String saveAll(List<Employee> employees) {
		 List<Employee> result =
				  (List<Employee>) employeeRepository.saveAll(employees);
		 if(result.size() > 0)
				  { return "INSERTED "; }
		return "NOT INSERTED";
		
	}


	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		System.out.println(employee.toString());
		Employee emp = employee.get();
		return emp;
	}


	@Override
	public String deleteById(int id) {
		employeeRepository.deleteById(id); 
		return "DELETED"; 
	}
}
