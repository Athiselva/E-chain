<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
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
<center> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				Logged in as ${email }</center>
<div class="container">
		<center><br><br><br>
			<h1>Employee List</h1>
			
			
		<h3>	Admin Id : ${ID }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Admin Name : ${Name } <br></h3>
		
			<table border="2" id="timesheet" class="timesheet bordered">
				<thead>
					<tr>
						<th>Employee Id</th>
						<th>Employee Name</th>
						<th>Position</th>
						<th>Username</th>
						<th>Phone Number</th>
						<th>Email</th>
						<th>Date of Birth</th>
					</tr>
				</thead>
				<tbody>


					<c:forEach var="elist" items="${EMPLOYEES}">

						<tr>

							<td>${elist.employeeId}</td>
							<td>${elist.name}</td>
							<td>${elist.position}</td>
							<td>${elist.username}</td>
							<td>${elist.phonenumber}</td>
							<td>${elist.email}</td>
							<td>${elist.dob}</td>



						</tr>

					</c:forEach>

				</tbody>
			</table>
			
			<br><br><br>
			
			<form method="post" action="AdminWelcomeServlet">
			<button class="button button3"  >Home</button>
			</form><br><br>
		
		<form method="post" action="InvalidateServlet">
		<button class="button button3"  >Logout</button>
 		</form>
		</center>
	</div>



</body>
</html>