<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attendance</title>
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

	<div class="container">
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
		</center>
	</div>



</body>
</html>