package com.rishab.java8streams.service;

import java.util.Date;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rishab.java8streams.dao.EmployeeDAO;
import com.rishab.java8streams.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
	
	private static final Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	@Override
	public List<Employee> getAllEmployee() {
		logger.debug(new Date() +"  : "+ this.getClass() + "  getAllEmployee() " + " =========================");
		return employeeDao.getAllEmployee();
	}
	
	
	
}
