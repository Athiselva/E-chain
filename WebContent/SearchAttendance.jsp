<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attendance Report</title>

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
<center>
<form method="post" action="AttendanceServlet">

<br><br><br><br>
<h1>Attendance Report</h1>
<br>
<h2>From</h2>
  <input type="date" name="from" style="width: 250px;"
       min="2018-02-22" max="2019-08-02"><br><br>
  
 <h2>To</h2>
  <input type="date" name="to" style="width: 250px;"
       min="2018-02-22" max="2019-08-02"><br><br>
  <input type="submit">
 
 </center>
</form>
</body>
</html>