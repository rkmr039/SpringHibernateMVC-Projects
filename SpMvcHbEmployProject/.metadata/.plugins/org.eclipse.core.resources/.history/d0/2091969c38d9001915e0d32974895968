<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Project With Lambda Expression and Streams</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		
		<form:form action="searchEmployee" method="POST" modelAttribute="searchEmployee">
			Name:<form:input path="empName"/>
			<input type="submit" value="Search"/> 
		</form:form>  
		<h1>No of Employees ${employeeList.size()}</h1>
		<table border="1">
			<tr>
				<th>EmpNo</th>
				<th>Emp Name</th>
				<th>Emp DOJ</th>
				<th>Band</th>
				<th>Salary</th>
			</tr>
			
			<tr>
				<c:forEach var="employee" items="${employeeList}">
				<tr>
					<td>${employee.empNo}</td>
					<td>${employee.empName}</td>
					<td>${employee.dateOfJoin}</td>
					<td align="center">${employee.band}</td>
					<td>${employee.salary}</td>
				</tr>
			</c:forEach>
			</tr>
		</table>
	</div>
</body>
</html>