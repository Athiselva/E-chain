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
								
							<button type="submit" style="background-color:blue; color:black;">Update Profile</button>


						</tr>

					</c:forEach>

				</tbody>
			
		</center>


		
</form>

</body>
</html>