<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updated Successfully</title>
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
<form method="post" action="Welcome.jsp">
<center>
			
				<tbody>

<br><br>
		<br><br>
		<br>
		<center><h1>Updated Sucessfully!</h1></center>

					<c:forEach var="uplist" items="${PROFILE}">

						<tr>
							<br><br><br>
							<h2><td> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Employee Id  :   &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;${uplist.employeeId}<br><br></td>
							<td> &nbsp; &nbsp; &nbsp;Employee Name       :   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; ${uplist.name}<br><br></td>
							<td>Employee Username :  &nbsp; &nbsp; &nbsp; &nbsp;${uplist.username}<br><br></td>
							<td> &nbsp;Employee Password : &nbsp; &nbsp; &nbsp; &nbsp; ${uplist.password}<br><br></td>
							<td> &nbsp; &nbsp; &nbsp;Employee Phonenumber : &nbsp; &nbsp;  &nbsp; &nbsp;${uplist.phonenumber}<br><br><br></td></h2>
							
							<button type="submit" style="background-color:blue; color:black;">Home</button>
							
						</tr>

					</c:forEach>

				</tbody>
			
		<br><br><br><a href="Loginpage.jsp">Logout</a></center>


		
</form>
</body>
</html>