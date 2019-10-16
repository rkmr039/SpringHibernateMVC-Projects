<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Emp No</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Basic</th>
			<th>Desig</th>
		</tr>
		<c:forEach var="e" items="${employeeList}">
			<tr>
				<td><c:out value="${e.empno}"/></td>
				<td><c:out value="${e.name}"/></td>
				<td><c:out value="${e.dept}"/></td>
				<td><c:out value="${e.basic}"/></td>
				<td><c:out value="${e.desig}"/></td>		
			</tr>
		</c:forEach>
	</table><br><br><br>
	<c:set var="num" value="${pages}"/>
	
	 <%
	    int  n = ((Integer)pageContext.getAttribute("num")).intValue();
	 	for(int i=0; i<n; i++){
			 %><a href="/displayAll/Page/<%=i%>"><%=i+1%></a>&nbsp;&nbsp;<%
	 }
	  %>
	<a href="/">Home</a><br><br>
	<!-- <a href="/displayjavacontractors">Display Java Contractors</a><br><br>
	<a href="/displayjavamanagers">Display Java Managers</a><br><br>
	<a href="/displayjavamanagersgt5000">Display Java Managers with salary greater then 5000</a><br><br>
	<a href="/DisplayAllEmployeeWithSalaryLt500AndNameStartsWithAAndSortBySalaryDesc">Display Java Managers with salary greater then 5000 Salary Desc </a><br><br>
	<a href="/displayjavaemployees">Display Java Employees</a><br><br>
	<a href="/displayjavaemployeeslt5000">Display Java Employees with salary less then 5000 and name starts with 'a'</a><br><br>
	<a href="/DisplayAllSortByDesig">Display All Employees Sort By Designation</a><br><br>
	<a href="/DisplayAllSortByDesigDesc">Display All Employees Sort By Designation DESC</a><br><br>
	<a href="/DisplayAllSortByDesigDescDeptDesc">Display All Employees Sort By Designation DESC Dept Desc</a><br><br> -->
	
	
</body>
</html>