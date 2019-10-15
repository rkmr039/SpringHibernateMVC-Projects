package com.rishab.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class EmployeeController {

	@Autowired
	private EmployeeRepository dao;
	
	@RequestMapping("/")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList",dao.findAll());
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayjavacontractors")
	public ModelAndView getContractorsByDeptAndDesig() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList",dao.findByJavaDeptAndDesig("java", "developer"));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayjavaemployees")
	public ModelAndView getContractorsByDept() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList",dao.findByJavaDept("java"));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayjavamanagers")
	public ModelAndView getContractorsByDeptAndDesigs() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList",dao.findByJavaDeptAndDesig("java", "manager"));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayjavamanagersgt5000")
	public ModelAndView getContractorsByDeptAndBasicGt5000() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList",dao.findByJavaDeptDesigAndBasic("java","manager", 5000));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("//displayjavaemployeeslt5000")
	public ModelAndView getContractorsByDeptAndBasicLt5000() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeList",dao.findByJavaDeptAndBasicLt5000("java", 5000));
		mv.setViewName("home");
		return mv;
	}
	
	
	
	
}
