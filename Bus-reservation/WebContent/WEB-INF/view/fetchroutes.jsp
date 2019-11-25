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
<h2>List of all Routes</h2></caption>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>Route Id</th>
            <th>Source id</th>
            <th>Destination id</th>
            <th>Fare</th>
               <th>Distance</th>
             
        </tr>
      <c:forEach items="${routes}" var="BusRoute">
<tr>
          <td> ${BusRoute.route_id}<br></td>
          <td>${BusRoute.source_id}<br></td>
         <td>${BusRoute.destination_id}<br></td>
           <td>${BusRoute.fare}<br></td>
           <td>${BusRoute.distance}<br></td>
         
     </tr>
</c:forEach>
    </table>
   
</body>
</html>