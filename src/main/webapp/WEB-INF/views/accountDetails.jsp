<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Information</title>
</head>
<body>
	<h1>Your account info is shown below.</h1>

	<c:if test="${!empty users}">
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>User Name</th>
					<th>Password</th>
					<th>Email</th>
					<th>Mobile Number</th>
					<th>SSN</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.id }</td>
						<td>${user.userName }</td>
						<td>${user.password }</td>
						<td>${user.email }</td>
						<td>${user.mobileNo }</td>
						<td>${user.ssn }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>

	<h2>What would you like to do today?</h2>
	<a href="deposit">Deposit Amount <br></a>
	<a href="withdraw"><br>Withdraw Amount</a>
	<a href="user_signOut"><br> <br>Sign out</a>
</body>
</html>