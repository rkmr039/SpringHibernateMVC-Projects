<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome ${username}</h1>
	
	<a href="/getAllAccountsByUserid/${userid}" >Display All Accounts</a>
	
	
	<h1>Find By Account Number</h1>
	<form action="findByAccountnum">
		Account Number
		<input type="text" name="accountnum"/><br/><br/>
		<input type="submit" value="search"/>
	</form>
</body>
</html>