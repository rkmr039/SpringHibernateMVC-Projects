package com.rishab.java8streams.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		model.setViewName("home");
		logger.debug(new Date() +"  : "+ this.getClass() + "  listEmployee() " + " redirecting to home.jsp");
		return model;
		
	}
	
}
