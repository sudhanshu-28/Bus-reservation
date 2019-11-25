<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Locations</title>
</head>
<body>
<caption>
<h2>List of all Locations</h2></caption>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>Location Id</th>
            <th>Location Name</th>
           
        </tr>
       <c:forEach items="${locations}" var="Location">
<tr>
          <td> ${Location.id}<br></td>
          <td>${Location.name}<br></td>
         
     </tr>
</c:forEach>

    </table>
   <br></br>
 
   
</body>
</html>