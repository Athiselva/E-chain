<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
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
  background-color: white; 
  color: black; 
  border: 2px solid #f44336;
}

.button3:hover {
  background-color: #f44336;
  color: white;
}

body {
	background-image: url('log.jpg');
	background-size: 100%;
	background-repeat: repeat-y;
	background-attachment: fixed;
	height: 100%;
	width: 105%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attendance</title>

</head>
<body>

	<div class="container">
	<center> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				Logged in as ${email }</center>
		<center><br><br><br>
			<h1>Attendance Report</h1>
			
			
		<h3>	Employee Id : ${ID }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Employee Name : ${Name } <br></h3>
		
			<table border="2" id="attendance" class="attendance bordered">
				<thead>
					<tr>
						<th>Date</th>
						<th>Status</th>
						<th>Present Hours</th>
						<th>Reason</th>
						<th>Approval</th>
					</tr>
				</thead>
				<tbody>


					<c:forEach var="atlist" items="${ATTENDANCE}">

						<tr>

							<td>${atlist.ondate}</td>
							<td>${atlist.status}</td>
							<td>${atlist.presentHours}</td>
							<td>${atlist.reason}</td>
							<td>${atlist.approval}</td>



						</tr>

					</c:forEach>

				</tbody>
			</table>
			
			<br><br><br><a href="Loginpage.jsp">Logout</a></center>
		

	</div>



</body>
</html>