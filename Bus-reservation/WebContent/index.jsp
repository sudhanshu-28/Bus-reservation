<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link href="${pageContext.request.contextPath}/resources/css/homepage.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/registerlogin.css" rel="stylesheet">

<title>HomePage</title>

      
</head>
<body>
           
    <div class="fixed-header">
            <header>
                    <div class="top-container">
                            <img class="img-valign" src="${pageContext.request.contextPath}/resources/images/buslogo.jpg"
						style="width: 100px; height: 100px;"> <span class="text1">Bus
						Reservation System</span>
                          </div>
                        </header> 
            

        <div class="topnav">
            <a class="active" href="#home">Home</a>
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

            <h2>Bus Search</h2>
	
            <form action="/searchLocation" method="post">
            <div class="div_box">
                <select id="location1" name="Location">
                    <option value="top">Enter Source</option>
                    <c:forEach items="${location}" var="Location">
                        <option value="">${Location.name}</option>
    
                        
                    </c:forEach>
                </select> 
                <span>
                <select id="location2" name="Location">
                    <option value="top">Enter Destination</option>
                    <c:forEach items="${location}" var="Location">
                        <option value="">${Location.name}</option>
                    </c:forEach>
                </select> <br>
                
            </span>
          <br><br>
                <div align="justify">
                        <center><button type="button" class="btn btn-success active">Search Bus</button> </center>
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