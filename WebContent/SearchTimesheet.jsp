<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Timesheet</title>
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
.button {
  background-color: #008CBA; /* Green */
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

<form method="post" action="TimesheetServlet">
<center>
<br><br><br><br>
<h1>Timesheet Report</h1>
<br>
<h2>From</h2>
  <input type="date" name="from" style="width: 250px;"
       min="2018-01-01" max="2019-08-02"><br><br>
  
 <h2>To</h2>
  <input type="date" name="to" style="width: 250px;"
       min="2018-01-10" max="2019-03-10"><br><br>
  <button class="button">Search</button>
  
  
	<br><br><br>
	</form>
		
		<form method="post" action="WelcomeServlet">
			<button class="button button3"  >Home</button>
			</form><br><br>
		
		<form method="post" action="InvalidateServlet">
		<button class="button button3"  >Logout</button>
 		</form>
 
 </center>


</body>
</html>