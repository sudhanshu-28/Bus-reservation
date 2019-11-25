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
        
     
<tr>
          <td> ${bookbus.bus_id}<br></td>
          <td>${bookbus.bus_num}<br></td>
           <td>${bookbus.bus_name}<br></td>
         <td>${bookbus.source}<br></td>
         <td>${bookbus.destination}<br></td>
         <td>${bookbus.start_time}<br></td>
         <td>${bookbus.end_time}<br></td>
         <td>${bookbus.fare}<br></td>
       
         
       <!--  <td><a href="BookBus?bus_num=${BusDisplay.bus_num}">Book bus</a></td>-->
         
     </tr>

    </table>
    
    <h1>Book Ticket</h1>
    
    Enter email:
    <input type="text> name="email">
    <br><br>
    Enter No_of_seats:
    <input type="text" name="no_of_passenger">
    <br><br>
    Enter Journey Date:
    <input type="date" name="journeyDate">
    <br><br>
    
    
    
   
</body>
</html>