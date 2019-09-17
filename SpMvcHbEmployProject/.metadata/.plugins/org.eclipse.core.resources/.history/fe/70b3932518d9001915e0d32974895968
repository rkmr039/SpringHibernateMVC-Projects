package com.rishab.java8streams.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rishab.java8streams.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	
	@Override
	public List<Employee> getAllEmployee() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	@Override
	public List<Employee> getAllEmployeeByBand(char band) {
		return sessionFactory.getCurrentSession().createQuery("from Employee where band = "+band).list();
	}

	@Override
	public Employee getEmployeeById(int empNo) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empNo);
	}

	@Override
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int empNo) {
		Employee employee = (Employee)sessionFactory.getCurrentSession().load(Employee.class, empNo);
		if(employee != null) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}
		
	}

}
