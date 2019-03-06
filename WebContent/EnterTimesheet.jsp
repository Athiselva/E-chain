<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timesheets</title>
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
<form method="post" action="SingleTimesheetServlet">

<center>
<br><br>
<h1>Timesheet Report</h1>
 
 <h3>Timesheet Report</h3>
  <input type="date" name="ondate" style="width: 250px;"
       min="2018-02-22" max="2019-08-02"><br><br>
        <button class="button">Search</button>
  
 
 </center>

<div class="container">
		<center><br><br>
			<h3>Timesheet Result</h3>
			
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
		</center>
	</div>

</form>
<form method="post" action="UpdateTimesheetServlet">
<center>
<br><br><br>
Timesheet Number &nbsp; <input type="text" name="tsnumber"> &nbsp;&nbsp;&nbsp;&nbsp;
Timesheet Status &nbsp; <input type="text" name="timesheet"><br><br><br><br>
<button class="button">Submit</button>
</center>
</form>

</body>
</html>