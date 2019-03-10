<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set Timesheet</title>
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
.button:hover {
	background-color: #3e8e41
}

.button:active {
	background-color: #3e8e41;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
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
					</tr>
				</thead>
				<tbody>


					<c:forEach var="elist" items="${EMPLOYEES}">

						<tr>

							<td>${elist.employeeId}</td>
							<td>${elist.name}</td>
							<td>${elist.position}</td>



						</tr>

					</c:forEach>

				</tbody>
			</table>
			<br>
			
			
			<form method="post" action="GettingTask">
		<center>
			 
 			 <br>Employee Id &nbsp;
 			 
 			 <select name="id">
 			 <c:forEach var="elist"  items="${EMPLOYEES}"> 
   			 <option class="required" value="${elist.employeeId}">${elist.employeeId}</option>
     		 </c:forEach> 
     		 </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				Date&nbsp;&nbsp;
  <input type="date" name="date" style="width: 150px;"
       min="2019-03-11" max="2019-03-20"><br><br>
			<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Task&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" pattern=".{6,30}"
				style="width: 320px;" name="task"><br>
				<br>
			
			<br>
			<br>
			<br>
			<button class="button">Submit</button>
		</center>
	</form>
			
			<br><br>
			
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