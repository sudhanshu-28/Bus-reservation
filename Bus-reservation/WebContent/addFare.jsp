<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add fare</h1>
<form method="POST" action="/Bus-reservation/addFare">
Enter Final fare
<input type="number" name="final_fare">
<br><br>
Enter Bus_id
<input type="text" name="bid">
<br><br>
<input type="submit" value="addFare">
</body>
</html>