<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h2>Add Location</h2>


<div>
  
  <form  action="/Bus-reservation/addLocation" method="post">
    
      
    <div class="container">
     
     <b>Enter Location name</b>
      <input type="text" placeholder="Enter Location Name" name="name" required>
        
      <button type="submit">Add Location</button>

</div>

</body>
</html>