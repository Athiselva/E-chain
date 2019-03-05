<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
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
<br><br><br><br>
			<form method="post" action="SearchAttendance.jsp">
<center>
			<h2>Welcome</h2><br>
			<button type="submit">Attendance Report</button>


</center>
</form>
<form method="post" action="EnterTimesheet.jsp">
<center>
				<br>
			<button type="submit">Timesheets</button>


</center>
</form>

<form method="post" action="SearchTimesheet.jsp">
<center>
				<br>
			<button type="submit">Timesheet Status Report</button>


</center>
</form>

<form method="post" action="UpdateServlet">
<center>
				<br>
			<button type="submit">Edit My Profile</button>


</center>
</form>
</body>
<form method="post" action="Loginpage.jsp">
<center>
				<br>
			<button type="submit">Logout</button>


</center>
</form>
</body>
</html>