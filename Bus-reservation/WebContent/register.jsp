<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



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
            <a class="active" href="index1.jsp">Home</a>
            <a href="">About</a>
            <a href="">Terms Of Use</a>
            <div class="topnav-right">
              <a href="register.jsp">Sign Up</a>
              <a href="login.jsp">Sign In</a>


              


            </div>
          </div>
          
    </div>

    <center>
  

            <center>
                    <form action="/Bus-reservation/register" method="post">
                      <div class="container">
                        <h1>Sign Up</h1>
                        <p>Please fill in this form to create an account.</p>
                        <hr>
                    
                        <label for="username"><b>Username</b></label>
                        <input type="text" placeholder="Enter Username" name="pname" required>
                    
                        <label for="password"><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="password" required>
                        <br>
                        <label for="address"><b>Address</b></label>
                        <input type="text" placeholder="Enter Address" name="address" required>
                    
                        <label for="gender"><b>Gender</b></label>
                        <input type="text" placeholder="Enter Gender" name="gender" required>
                        <br>
                        <label for="contact"><b>Contact</b></label>
                        <input type="number" placeholder="Enter Contact" name="contact" required>
                    
                        <label for="email"><b>Email Id</b></label>
                        <input type="email" placeholder="Enter Email Id" name="email" required>
                    
                       
            
                    <br>
                        <button type="submit" class="registerbtn">Register</button>
                      </div>
                      
                      <div class="container signin">
                        <p>Already have an account? <a href="login.jsp">Sign In</a>.</p>
                      </div>
                    </form>
                    </center>

    

</center>
    <div class="fixed-footer">
        <div class="container"><center>Copyright &copy; 2019 Bus Reservation System</center></div>        
    </div>
</body>
</html>