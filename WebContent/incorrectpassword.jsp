<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incorrect password!</title>
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
<center>
			
		<br>
		<br>
		<br>
		<br><br>
		<br><br>
		<br>
			<h2>Sign In</h2><br>
			Username &nbsp;  <input type="text" name="username"><br><br>
			Password &nbsp;&nbsp; <input type="text" name="password"><br>
			
			<br>Incorrect Username or password!<br><br>
			<button type="submit">Login</button>


</center>
</form>
</body>
</html>