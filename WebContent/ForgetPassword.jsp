<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
</head>
<style>
.button {
  display: inline-block;
  padding: 8px 15px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #008CBA;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
<style>
body {
	background-image: url('log.jpg');
	background-size: 100%;
	background-repeat: repeat-y;
	background-attachment: fixed;
	height: 100%;
	width: 105%;
}
</style>
<body>
<form method="post" action="ForgetPasswordServlet">
<center>
			<br><br><br><br><br><h2>Reset Password</h2><br>
			
			Name :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" name="name"><br><br>
			Employee Id :&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" name="employeeid"><br><br>
			Position :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" name="position"><br><br>
			UserName :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" name="username"><br><br>
			Email Id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" name="email"><br><br>
			Phone Number :&nbsp;<input type="text" name="phonenumber"><br><br>
			New Password :&nbsp;
			<input type="text" name="password"><br><br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
			<button class="button">Reset Password</button>
			
			
			</center>
			</form>
</body>
</html>