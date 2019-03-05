<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Updated</title>
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
<form method="post" action="ResultTimesheetServlet">
 </center>
 <br> <br> <br> <br> <br>

<div class="container">
		<center><br><br>
			<h3>Successfully Updated!</h3>
			
			<table border="2" id="timesheet" class="timesheet bordered">
				<thead>
					<tr>
						<th>Date</th>
						<th>Timesheet Number</th>
						<th>Task</th>
						<th>Task Status</th>
						<th>Timesheet Status</th>
					</tr>
				</thead>
				<tbody>


					<c:forEach var="tlist" items="${TIMESHEET}">

						<tr>

							<td>${tlist.ondate}</td>
							<td>${tlist.timesheetNumber}</td>
							<td>${tlist.task}</td>
							<td>${tlist.taskStatus}</td>
							<td>${tlist.timeSheetStatus}</td>



						</tr>

					</c:forEach>

				</tbody>
			</table>
			<br><br><br><a href="Loginpage.jsp">Logout</a>
		</center>
	</div>
	</form>
</body>
</html>