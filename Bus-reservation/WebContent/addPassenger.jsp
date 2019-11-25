<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Add Passenger</h2>


<div>
  
  <form  action="/Bus-reservation/addPassengerc" method="post">
    
      
    <div class="container">
    
     Enter ticket id
      <input type="text" placeholder="number" name="ticket_id" required>
      <br><br>
      Enter Name
      <input type="text" placeholder="Enter Name" name="name" required>
      <br><br>
      Enter Gender
      <input type="text" placeholder="Enter Gender" name="gender" required>
      <br><br>
        
      <button type="submit">Add Passenger</button>

</div>

</body>
</html>