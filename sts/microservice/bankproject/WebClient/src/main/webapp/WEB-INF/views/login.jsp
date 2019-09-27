<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="login" modelAttribute="user">
		Username <form:input type="text" path="username"/><br/><br/>
		Password <form:input type="text" path="password"/><br/><br/>
		<input type="submit" value="Login" /> 
	</form:form> 
</body>
</html>