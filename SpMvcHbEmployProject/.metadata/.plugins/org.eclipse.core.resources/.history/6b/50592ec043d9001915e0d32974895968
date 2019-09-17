package com.rishab.java8streams.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rishab.java8streams.model.Employee;
import com.rishab.java8streams.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController() {
		logger.debug(new Date() +"  : "+ this.getClass() + " EmployeeController" + "  =========================");
	}
	
	@RequestMapping("/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		logger.debug(new Date() +"  : "+ this.getClass() + "  listEmployee() " + " =========================");
		List<Employee> employeeList = employeeService.getAllEmployee();
		logger.debug(new Date() +"  : "+ this.getClass() + "  listEmployee() " + " Employee fetched : " + employeeList.size());
		model.addObject("employeeList",employeeList);
		model.addObject("searchEmployee",new Employee());
		model.setViewName("home");
		logger.debug(new Date() +"  : "+ this.getClass() + "  listEmployee() " + " redirecting to home.jsp");
		return model;
	}
	
	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployee(ModelAndView model, @ModelAttribute Employee searchEmployee) throws IOException {
		logger.debug(new Date() +"  : "+ this.getClass() + "  searchEmployee() " + " =========================");
		
		List<Employee> employeeList = employeeService.getAllEmployee();
		employeeList = employeeList.stream().filter((var) -> ( searchEmployee.getBand() == 'A' || var.getBand() == searchEmployee.getBand())													  
				&& ( searchEmployee.getSalary() == 0.0 || var.getSalary() >= searchEmployee.getSalary())
				&& (var.getEmpName().startsWith(searchEmployee.getEmpName())))
															.collect(Collectors.toList());
		logger.debug(new Date() +"  : "+ this.getClass() + "  searchEmployee() " + " Employee fetched : " + employeeList.size());
		model.addObject("employeeList",employeeList);
		model.addObject("searchEmployee",searchEmployee);
		model.setViewName("home");
		logger.debug(new Date() +"  : "+ this.getClass() + "  searchEmployee() " + " redirecting to home.jsp");
		return model;
	}	
}
