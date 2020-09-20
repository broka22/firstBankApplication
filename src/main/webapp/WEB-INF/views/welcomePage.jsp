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

	<h1>Welcome to the Bank of America</h1>
	<h3>
		Already an User? Please login
		</h2>

		<div>
			<form action="user_login" method="post">
				<div>
					<label><br>User Name</label> <input type="text" name=userName>
				</div>
				<div>
					<label><br>Password</label> <input type="password"
						name=password>
				</div>
				<div>
					<label><br>ID</label> <input type="number"
						name=id>
				</div> 
				<div>
					<br> <input type="submit" value=submit>
				</div>
			</form>
		</div>

		<h4>
			Not an User?
			<!-- <form action="user_signUp" method="post"> -->
			<a href="user_signUp">Sign Up</a>
		</h4>
</body>
</html>