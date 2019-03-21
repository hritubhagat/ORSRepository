<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
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
		<h2 class="form-heading">Registration Form</h2>
		<font color="red">${errorMessage}</font>
		<form action="/ors-system/registration.do" name="registrationForm" method="post">
			<table>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="userName" required></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td>Retype Password:</td>
					<td><input type="password" name="repassword" required></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname" required></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lname" required></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="age" required></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" required></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><textarea name="address" cols="21" rows="6"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Create Account" name="submit"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><a
						href="/ors-system">Go to Login</a></td>
				</tr>

			</table>
		</form>
	</div>

</body>
</html>