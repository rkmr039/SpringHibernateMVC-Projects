<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	
		<h1>Apply Loan</h1>
	</center>
	<form method="post" action="show" modelAttribute="user">
		<center>
			Customer Name: <input type="text" name="customerName" /> <br /> <br />
			Loan Amount: <input type="text" name="loanAmount" /> <br /> <br />
			Property Type:
			 <select name="propertyType">
			 	<option value="select">Select Type</option>
				<option value="newProperty">New Property</option>
				<option value="existingProperty">Existing Property</option>
				<option value="existingWithReFinance">Existing With Re-Finance</option>
			</select><br /> <br /> 
			Mortgage Item:
			 <select name="mortgageitem">
				<option value="select">Select Item</option>
				<option value="gold">Gold</option>
				<option value="land">Land</option>
				<option value="house">House</option>
			</select><br /> <br /> 
			Weight:
			 <input type="text" name="weight" /> <br />
			<br />
			 Credit Score: <input type="text" name="creditscore" /> <br />
			<br /> 
			PAN: <input type="text" name="pan" /> <br /> <br />
			<input type="submit" value="Apply" />
		</center>
	</form>
</body>
</html>



