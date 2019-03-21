<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<style>
.container{
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body>
	<div class="container">
		<h2 class="form-heading">Login Form</h2>
		<font color="red">${errorMessage}</font>
		<font color="green">${userCreated}</font>
		<form action="/ors-system/login.do" name="loginForm" method="post">
			<table>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="userName" placeholder="username" required></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" placeholder="password" required></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Login" name="submit"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">Don't have account? <a
						href="/ors-system/showRegistration">SignUp</a></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>