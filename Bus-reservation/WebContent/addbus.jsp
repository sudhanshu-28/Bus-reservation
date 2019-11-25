<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bus insert form</title>
</head>
<body>
<h1>Bus add</h1>
<form method="POST" action="/Bus-reservation/addBus">
Enter Bus Number:
<input type="text" name="bus_num">
Enter Bus type:
<input type="text" name="bus_type">
<br><br>
Enter Number of seats:
<input type="text" name="max_seats">
<br><br>


<br><br>
<input type="submit" value="add">
</form>

</body>
</html>