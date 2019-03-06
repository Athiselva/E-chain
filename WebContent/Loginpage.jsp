<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
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
	<style>
		html,
		body {
			height: 100%;
		}

		body {
			display: -ms-flexbox;
			display: -webkit-box;
			display: flex;
			-ms-flex-align: center;
			-ms-flex-pack: center;
			-webkit-box-align: center;
			align-items: center;
			-webkit-box-pack: center;
			justify-content: center;
			padding-top: 40px;
			padding-bottom: 40px;
			background-color: #f5f5f5;
		}

		.form-signin {
			width: 100%;
			max-width: 330px;
			padding: 15px;
			margin: 0 auto;
		}

		.form-signin .checkbox {
			font-weight: 400;
		}

		.form-signin .form-control {
			position: relative;
			box-sizing: border-box;
			height: auto;
			padding: 10px;
			font-size: 16px;
		}

		.form-signin .form-control:focus {
			z-index: 2;
		}

		.form-signin input[type="email"] {
			margin-bottom: -1px;
			border-bottom-right-radius: 0;
			border-bottom-left-radius: 0;
		}

		.form-signin input[type="password"] {
			margin-bottom: 13px;
			border-top-left-radius: 0;
			border-top-right-radius: 0;
		}
		.button5 {
  color: black;
}

.button5 {
  color: black;
}
.button6 {
  color: blue;
}

.color-red {
    color: #F00;
}
	</style>
</head>

<body class="text-center">
	<form method="post" action="LoginServlet" class="form-signin">
	
		<h3><b><font color="black">CHAIN -</font></b>
		<b><font color="red">SYS</font></b></h3>
		Powered by <b><font color="black">e.</font> <font color="red">chain</font></b><br><br>

		<h3 class="h3 mb-3 font-weight-normal">Sign In</h3>
		
		<img alt="govno" src="noimage.jpg" style="width: 120px; height: 120px;"><br><br>

		<label for="inputEmail" class="sr-only">Username</label>
		<input type="text" id="inputEmail" name="username" class="form-control" placeholder="Enter Username" required
			autofocus>
		<label for="inputPassword" class="sr-only">Password</label>
		<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Enter Password" required>
		<div><br>
		
		<a href="ForgetPassword.jsp" class="button6" >Forget Password</a>

		</div><br>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button><br>
		<span>
			
		</span>
		
		<a href="signup.jsp" class="button5" >Create an account</a>

	</form>
</body>

</html>