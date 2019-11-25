<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Add Bus Service</h2>


<div>
  
  <form  action="/Bus-reservation/addBusService" method="post">
    
      
    <div class="container">
      Enter Route Id
      <input type="number" placeholder="Enter Route Id" name="route_id" required>

      Enter Start Time
      <input type="text" placeholder="Enter Start Time" name="start_time" required>
      
      Enter End Time
      <input type="text" placeholder="Enter End Time" name="end_time" required>
      
      Enter Status
      <input type="text" placeholder="Enter Status" name="status" required>
      
        
      <button type="submit">Add Bus Service</button>

</div>


</body>
</html>