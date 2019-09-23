package hcl.employeejson.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hcl.employeejson.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getEmployees();
	
	public void addEmployee(Employee employee);
}
