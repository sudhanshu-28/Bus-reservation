<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link href="${pageContext.request.contextPath}/resources/css/homepage.css" rel="stylesheet">


<title>HomePage</title>

      
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
    <div id="content">

          <h1>Welcome</h1>
	
            <form action="/Bus-reservation/displaybus" method="post">
                <div class="container">
                  
                  
                  <hr>
              
                    
                  <label for="source"><b>Source</b></label>
                  <input type="text" placeholder="Enter Source" name="source" required>
              
                 <span>
                  <label for="destination"><b>Destination</b></label>
                  <input type="text" placeholder="Enter Destination" name="destination" required>
                  </span>
                  <br>
                  <br>
                   <label for="date"><b>Journey Date</b></label>
                  <input type="date" placeholder="Enter Journey Date" name="journeydate" required>
                  <br> 
                  
                
            </span>
          <br><br>
                <div align="justify">
                        <center><button type="submit" class="btn btn-success active">Search Bus</button> </center>
                </div>
            </div>
       
        </form>


    </div>

</center>
    <div class="fixed-footer">
        <div class="container"><center>Copyright &copy; 2019 Bus Reservation System</center></div>        
    </div>
</body>
</html>