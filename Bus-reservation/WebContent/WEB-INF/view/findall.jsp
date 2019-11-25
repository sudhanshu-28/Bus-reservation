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
            <th>Bus Type</th>
            <th>Number of Seats</th>
             <th>Departure time</th>
              <th>Arrival Time</th>
        </tr>
       <c:forEach items="${ listofbuses}" var="admin">
<tr>
          <td> ${Bus.busId}<br></td>
          <td>${admin.busName}<br></td>
         <td>${admin.numberPlate}<br></td>
         <td>${admin.noSeats}<br></td>
     </tr>
</c:forEach>

    </table>
   
</body>
</html>