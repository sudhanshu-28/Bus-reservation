<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Bus Service Log</h2>


<div>
  
  <form  action="/Bus-reservation/addBusServiceLog" method="post">
    
      
    <div class="container">
      Enter Bus Service Id
      <input type="number" placeholder="Enter Bus Service Id" name="bs_id" required>

      Enter Bus Id
      <input type="text" placeholder="Enter Bus Id" name="bid" required>
      
      Enter Run Date
      <input type="text" placeholder="Enter Run Date" name="run_date" required>
      
      Enter Actual Start-Time
      <input type="text" placeholder="Enter Actual Start-Time" name="actual_stime" required>
      
      Enter Actual End-Time
      <input type="text" placeholder="Enter Actual End-Time" name="actual_etime" required>
      
      Enter Seat Filled
      <input type="text" placeholder="Enter Seat Filled" name="seats_filled" required>
      
      Enter Remark
      <input type="text" placeholder="Enter Remark" name="remark" required>
      
        
      <button type="submit">Add Bus Service Log</button>

</div>

</body>
</html>