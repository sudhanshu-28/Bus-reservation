<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="Post" action="/Bus-reservation/addRoute">
		<h1>Add Route</h1>
		<br><br>
		Fare:<input type="number" name="fare">
		<br><br>
		Distance:<input type="number" name="distance">
		<br><br>
		Source:<input type="number" name="source_id">
		<br><br>
		Destination:<input type="number" name="destination_id">
		<br><br>
		<input type="submit" value="Add Route">
		
	</form>


</body>
</html>