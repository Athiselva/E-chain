<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chainsys Support</title>
<style>
body {
	background-image: url('New Bitmap Image.bmp');
	background-size: 110%;
	background-repeat: repeat-y;
	background-attachment: fixed;
	height: 100%;
	width: 105%;
}
</style>
</head>
<body>
	<form method="post" action="LoginServlet">


		<br>
		<br>
		<br>
		<br><br>
		<br><br>
		<br>
		<center><h2>Sign In</h2></center>
		<br>
		<center>

			Username &nbsp; <input type="text" name="username"><br>
			<br>
			Password &nbsp;&nbsp; <input type="password" name="password"><br>
			<br>
			<a href="signup.jsp" style=" border:none; background-color:grey; color:black;">Click here to Register</a>
			 &nbsp;&nbsp; &nbsp;&nbsp;
			 <button type="submit">Login</button>


		</center>
	</form>
</body>
</html>