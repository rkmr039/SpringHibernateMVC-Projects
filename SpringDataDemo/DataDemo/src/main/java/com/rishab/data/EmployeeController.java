package com.rishab.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class EmployeeController {

//	@Autowired
//	private EmployeeRepository dao;
//
//	int numRecords = 2; // records per page
//	int numOfPages; // num of pages
//
//	@RequestMapping("/")
//	public ModelAndView getEmployee() {
//		ModelAndView mv = new ModelAndView();
//		List<Employee> employeeList = (List<Employee>) dao.findAll();
//		numOfPages = employeeList.size() / numRecords + employeeList.size() % numRecords;
//		mv.addObject("pages", numOfPages);
//		mv.addObject("employeeList", employeeList);
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/displayjavacontractors")
//	public ModelAndView getContractorsByDeptAndDesig() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findByJavaDeptAndDesig("java", "developer"));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/displayjavaemployees")
//	public ModelAndView getContractorsByDept() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findByJavaDept("java"));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/displayjavamanagers")
//	public ModelAndView getContractorsByDeptAndDesigs() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findByJavaDeptAndDesig("java", "manager"));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/displayjavamanagersgt5000")
//	public ModelAndView getContractorsByDeptAndBasicGt5000() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findByJavaDeptDesigAndBasic("java", "manager", 5000));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/displayjavaemployeeslt5000")
//	public ModelAndView getContractorsByDeptAndBasicLt5000() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findByJavaDeptAndBasicLt5000("java", 5000));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/DisplayAllSortByDesig")
//	public ModelAndView getContractorsByDesigSort() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findAll(Sort.by("desig")));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/DisplayAllSortByDesigDesc")
//	public ModelAndView getContractorsByDesigSortDesc() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findAll(Sort.by(Direction.DESC, "desig")));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/DisplayAllSortByDesigDescDeptDesc")
//	public ModelAndView getContractorsByDesigSortDescDeptDesc() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findAll(Sort.by(Direction.DESC, "desig", "dept")));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/DisplayAllEmployeeWithSalaryLt500AndNameStartsWithAAndSortBySalaryDesc")
//	public ModelAndView getContractorsBySalarySortDescSalaryLt5000() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employeeList", dao.findContractorsBySalarySortDescSalaryLt5000("manager", 5000));
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/displayAll/Page/{pageno}")
//	public ModelAndView displayAllSortByDesig(@PathVariable("pageno") int pageno) {
//		ModelAndView mv = new ModelAndView();
//		Page<Employee> pages = dao.findAll(PageRequest.of(pageno, numRecords));
//		mv.addObject("pages", numOfPages);
//		mv.addObject("employeeList", (pages).getContent());
//		mv.setViewName("home");
//		return mv;
//	}

}
