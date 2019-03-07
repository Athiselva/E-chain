<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Info</title>
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
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
  cursor: pointer;
}
.button3 {
  background-color: grey; 
  color: black; 
  border: 2px solid #f44336;
}

.button3:hover {
  background-color: #f44336;
  color: white;
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
<form method="post" action="FinalUpdateServlet">
<center>
			
				<tbody>

<br><br>
		<br><br>
		<br>
		<center><h2>Sign In</h2></center>

					<c:forEach var="uplist" items="${PROFILE}">

						<tr>
							<br><br><br>
							<td>Employee Id : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="text" name="id" value="${uplist.employeeId}" style="background-color:lightblue; color:Blue;"><br><br></td>
							<td>Employee Name : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="text" name="name" value="${uplist.name}"style="background-color:lightblue; color:Blue;"><br><br></td>
							<td>Employee Username : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="text" name="username" value="${uplist.username}" style="background-color:lightblue; color:Blue;"><br><br></td>
							<td>Employee Password : &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
							<input type="text" name="password" value="${uplist.password}" style="background-color:lightblue; color:Blue;"><br><br></td>
							<td>Employee Phonenumber :
							<input type="text" name="phonenumber" value="${uplist.phonenumber}" style="background-color:lightblue; color:Blue;"><br><br><br></td>
								
							<button class="button">Update Profile</button>


						</tr>

					</c:forEach>

				</tbody>
			<br><br><br>
			</form><center>
			<form method="post" action="WelcomeServlet">
			<button class="button button3"  >Home</button>
			</form><br><br>
		<form method="post" action="InvalidateServlet">
		<button class="button button3"  >Logout</button>
 		</form>
		</center>


		


</body>
</html>