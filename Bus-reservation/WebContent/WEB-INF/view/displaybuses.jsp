<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display buses</title>
</head>
<body>
<caption>
<h2>List of all Buses</h2></caption>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>Bus Id</th>
            <th>Bus Number</th>
            <th>Bus Name</th>
            <th>Source</th>
             <th>Destination</th> 
              <th>Start time</th> 
               <th>End time</th> 
                <th>Fare</th>             
        </tr>
      <c:forEach items="${dbuses}" var="BusDisplay">
<tr>
          <td> ${BusDisplay.bus_id}<br></td>
          <td>${BusDisplay.bus_num}<br></td>
         <td>${BusDisplay.bus_name}<br></td>
         <td>${BusDisplay.source}<br></td>
         <td>${BusDisplay.destination}<br></td>
         <td>${BusDisplay.start_time}<br></td>
         <td>${BusDisplay.end_time}<br></td>
         <td>${BusDisplay.fare}<br></td>
         <td><a href="Bookbus?bus_num=${BusDisplay.bus_num}">Book this bus</a></td>
         
       <!--  <td><a href="BookBus?bus_num=${BusDisplay.bus_num}">Book bus</a></td>-->
         
     </tr>
</c:forEach>
    </table>
   
</body>
</html>