<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert ticket</title>
</head>
<body>
<h1>Ticket add</h1>
<form method="POST" action="/Bus-reservation/addTicket">
Enter Ticket Date:
<input type="text" name="ticket_date">
Enter No_of_Passenger:
<input type="number" name="no_of_passenger">
<br><br>
Enter Bus Service log id:
<input type="number" name="bsl_id">
<br><br>



<br><br>
<input type="submit" value="add">
</form>

</body>
</html>