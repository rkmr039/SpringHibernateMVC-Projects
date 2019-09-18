package com.hcl.parserbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoConnection {
	
	public Employees getEmployees() {
		String username = "root";
		String password = "root";
		Employees employees = new Employees();
		List<Employee> empList = new ArrayList<Employee>();
		String url = "jdbc:mysql://localhost:3306/java8streams?characterEncoding=latin1&useConfigs=maxPerformance";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
				
				Employee employee = new Employee();
				employee.setEmpNo(rs.getInt("empNo"));
				employee.setEmpName(rs.getString("empName"));
				employee.setSalary(rs.getFloat("salary"));
				employee.setBand(rs.getString("band").charAt(0));
				employee.setDateOfJoin(rs.getDate("dateOfJoin"));
				
			    //	System.out.println(employee.toString());
				empList.add(employee);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employees.setEmployees(empList);
		return employees;
		
	}
}
