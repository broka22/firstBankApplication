<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<h1>Enter your details to open an account</h1>
	<div>
		<form action="user_welcome" method="post">
			<div>
				<label>User Name</label> 
				<input type="text" name="userName">
			</div>
			<div>
				<label>Set up Password</label> 
				<input type="password" name="password">
			</div><div>
				<label>Email</label> 
				<input type="email" name="email">
			</div><div>
				<label>Mobile No</label> 
				<input type="number" name="mobileNo">
			</div><div>
				<label>SSN</label> 
				<input type="number" name="ssn">
			</div>
			<div>
				<input type="submit" name="submit">
			</div>
		</form>
	</div>


</body>
</html>