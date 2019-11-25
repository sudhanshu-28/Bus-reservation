<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<link href="${pageContext.request.contextPath}/resources/css/homepage.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/registerlogin.css" rel="stylesheet">

</head>
<body>

<div class="fixed-header">
		
		<header>
			<div class="top-container">
				<center class="imgh1">
					<img class="img-valign" src="${pageContext.request.contextPath}/resources/images/buslogo.jpg"
						style="width: 100px; height: 100px;"> <span class="text1">Bus
						Reservation System</span>
				</center>
			</div>
		</header>


		<div class="topnav">
			<a class="active" href="#home">Home</a> <a href="">About</a> <a
				href="">Terms Of Use</a>
			<div class="topnav-right">
				<a href="register.jsp">Sign Up</a> <a href="login.jsp">Sign In</a>





			</div>
		</div>

	</div>

	<div>
		<center>
			<form action="/Bus-reservation/login" method="post">
				<div class="container">
					<h1>Sign In</h1>

					<hr>


					<label for="email"><b>Email Id</b></label> <input type="email"
						placeholder="Enter Email Id" name="email" required> <label
						for="psw"><b>Password</b></label> <input type="password"
						placeholder="Enter Password" name="password" required> <br>






					<hr>

					<button type="submit" class="registerbtn">Sign In</button>
				</div>

				<div class="container signin">
					<p>
						Don't have an account? <a href="register.jsp">Sign Up</a>.
					</p>
				</div>
			</form>
		</center>
	</div>
	<div class="fixed-footer">
		<div class="container">
			<center>Copyright &copy; 2019 Bus Reservation System</center>
		</div>
	</div>
</body>
</html>