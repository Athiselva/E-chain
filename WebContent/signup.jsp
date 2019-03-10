<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><br><br><br><br><br>
<title>Sign Up</title>
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
</head>
<body>

<form method="post" action="RegisterServlet">
			<center>
			<h2>Sign Up</h2><br>
			Name :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" title="4-20 Characters,A-z,a-z is only allowed" pattern="[a-zA-Z\s]{4,20}" name="name"><br><br>
			Email Id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" 
			pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" 
			name="email"><br><br>
			Position :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" pattern="[a-zA-Z\s\s]{4,30}" name="position"><br><br>
			 Date of Birth :
 &nbsp;&nbsp; <input type="date" name="dob" style="width: 170px;"  min="1980-01-01" max="2000-01-01"><br><br>
			Phone Number :<input type="text" title="Only 10 Numerical value is allowed" pattern="[0-9]{10}" name="phonenumber"><br><br>
			UserName :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" title="6-20 Characters,A-Z,a-z & Special characters only allowed" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}"
			 name="username"><br><br>
			Password :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" title="8-20 Characters,A-Z,a-z & Special characters only allowed"
			pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}" 
			name="password"><br><br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
			<button class="button">Register</button>
			</center><br><br></form>
			
			
			<form method="post" action="Loginpage.jsp">
<center>
				<br>
			<button class="button button3"" style="vertical-align:middle"><span>Login</span></button>
			
			</center>
			</form>
</body>
</html>