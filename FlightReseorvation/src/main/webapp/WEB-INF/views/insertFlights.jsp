<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
</head>
<body style="background: #e2e2e2e2">
   
   <div class="row">
   <div class="col-6 offset-3">
   <div class="card mt-5">
   <div class="card-body"> 
   <div class="container text-center">
   <h1>Find Flights</h1>
   </div>
   
    <form action="saveflights" method="post">
  <div class="form-group">
    <label for="name">Flight Number</label>
    <input type="text" class="form-control" id="" name="flightNumber" placeholder="Enter Flight Number" >
    </div>
    
    <div class="form-group">
    <label for="name">Airlines</label>
    <input type="text" class="form-control" id="" name="opreratingAirlines" placeholder="Airlines" >
    </div>
    
    <div class="form-group">
    <label for="name">Departure City</label>
    <input type="text" class="form-control" id="" name="departureCity" placeholder="Enter">
    </div>
    
    <div class="form-group">
    <label for="name">Arrival City</label>
    <input type="text" class="form-control" id="" name="arrivalCity" >
    </div>
    
    <div class="form-group">
    <label for="name">Departure Date</label>
    <input type="date" class="form-control" id="" name="dateOfDeparture" >
    </div>
    <div class="form-group">
    <label for="name">Arrival Date</label>
    <input type="date" class="form-control" id="" name="estimatedDepartureTime" >
    </div>
    
  
  <button type="submit" class="btn btn-primary btn-block mt-3">Submit</button>
</form>
   </div>
   
   </div>
   </div>
   </div>
   </div>
</body>
</html>