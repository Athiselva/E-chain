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
<form method="post" action="Welcome.jsp">
<center> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				Logged in as ${email }</center>
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
							
							
							<button class="button button3"  >Home</button>
							
							
						</tr>

					</c:forEach>

				</tbody>
			
		
		

</center>
		
</form>
</body>
</html>