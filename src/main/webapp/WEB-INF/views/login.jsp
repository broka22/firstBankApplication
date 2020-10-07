<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank of America</title>
</head>
<body>

<div align="center">
	<h1>Welcome to the Bank of America</h1>
	<h2>
		Already an User? Please login
		</h2>

		<div>
			<form action="login" method="post">
				<div>
					<label><br>User Name</label> <input type="text" name=username>
				</div>
				<div>
					<label><br>Password</label> <input type="password"
						name=password>
				</div>
				<div>
					<br> <input type="submit" value=Login>
				</div>
				<input type="hidden" name="${_csrf.parameterName}" value="{_csrf.token}">
			</form>
		</div>

		<h4>
			Not an User?
			<!-- <form action="user_signUp" method="post"> -->
			<a href="user_signUp">Sign Up</a>
		</h4>
</div>
</body>
</html>