<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/pivotal.css" />" />
	<title>WebClient: Account Details</title>
</head>

<body>

	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<a title="Spring IO" href="http://www.spring.io"> 
							<img src="<c:url value="resources/images/spring-trans-dark.png"/>" height="50"/>
						</a>
					</div>
					<div>
						<ul class="nav navbar-nav navbar-right">
							<li>
								<a href="http://www.pivotal.io">
									<img alt="Pivotal" title="Pivotal" height="20" src="<c:url value="resources/images/pivotal-logo-600.png" />" />
								</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<%-- <div style="text-align: right">[ <a href="<c:url value='/'/>">Home</a>
              | <a href="accountList">Accounts</a> ]</div> --%>
		</div>
		<h1>Account Details</h1>
		<c:forEach var="account" items="${accountList}">
		<div class="row">
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3">
						Account Number:
					</div>
					<div class="col-sm-9">
						${account.accountnum}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Type:
					</div>
					<div class="col-sm-9">
						${account.accounttype}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Amount:
					</div>
					<div class="col-sm-9">
						${account.amount}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						UserID:
					</div>
					<div class="col-sm-9">
						${account.userid}
					</div>
				</div>
			
			</div>
								
		</div>
</c:forEach>	
	</div>

</body>

</html>