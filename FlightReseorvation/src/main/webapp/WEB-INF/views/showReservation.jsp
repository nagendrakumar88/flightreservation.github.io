<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="./base2.jsp" %>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
</head>
<body style="background: #e2e2e2e2">
  
   <div class="container">
   <div class="card mt-3">
   <div class="card-body">
   <div class="row">
   <div class="col-5 "> 
   <div class="container text-center ">
   <h1 style="color:green">Flight Booking Details</h1>
   </div>
   
    <table class="table mt-5">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">FBMUSER00${flights.id }</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">Flight Number :</th>
      <td>${flights.flightNumber}</td>
      
    </tr>
    
  </tbody>
  <tbody>
    <tr>
      <th scope="row">Operator Airlines </th>
      <td>${flights.opreratingAirlines}</td>
      
    </tr>
    
  </tbody>
  <tbody>
    <tr>
      <th scope="row">Departure City</th>
      <td>${flights.departureCity}</td>
      
    </tr>
    
    <tbody>
    <tr>
      <th scope="row">Arrival City</th>
      <td>${flights.arrivalCity }</td>
      
    </tr>
    
    <tbody>
    <tr>
      <th scope="row">Departure Date</th>
      <td>${flights.dateOfDeparture}</td>
      
    </tr>
    
  </tbody>
  
  <tbody>
    <tr>
      <th scope="row">Arrival Date</th>
      <td>${flights.estimatedDepartureTime}</td>
      
    </tr>
    
  
</table>
      
    
     
   </div>
   
    <div class="row">
   <div class="col offset-1 mt-4"> 
   <div class="container text-center ">
   <h1 style="color:blue">Passenger Complete Details</h1>
   </div>
    
     <form action="${contextPath}/confirmReservation" method="post">
  <div class="form-group">
    <label for="name">First Name</label>
    <input type="text" class="form-control" id="" name="firstName"  placeholder="Enter First Name">
     <input type="hidden" class="form-control" name="id" value="${flights.id}" >
   
    </div>
    
    <div class="form-group">
    <label for="name">Middle Name</label>
    <input type="text" class="form-control" id="" name="middleName"  placeholder="Enter Middle Name">
    </div>
  <div class="form-group">
    <label for="">Last Name</label>
    <input type="text" class="form-control" name="lastName" id="" placeholder="Enter Last Name">
  </div>
   <div class="form-group">
    <label for="">Email</label>
    <input type="email" class="form-control" name="email" id="" placeholder="Enter email">
  </div>
   <div class="form-group">
    <label for="">Phone Number</label>
    <input type="text" class="form-control" name="phone" id="" placeholder="Enter Phone Number">
    
  </div>
  <div class="form-group">
    <label for="">Card Holder Name</label>
    <input type="text" class="form-control" name="cardHolderName" id="" placeholder="Enter card Holder NAme">
    
  </div>
  <div class="form-group">
    <label for="">Card Number</label>
    <input type="text" class="form-control" name="cardNumber" id="" placeholder="Enter Card Number">
    
  </div>
  <div class="form-group">
    <label for="">Expiring Date</label>
    <input type="text" class="form-control" name="expirationDate" id="" placeholder="Enter Expiring Date">
    
  </div>
  <div class="form-group">
    <label for="">CVV</label>
    <input type="text" class="form-control" name="cvv" id="" placeholder="Enter CVV">
    
  </div>
  
  <button type="submit" class="btn btn-success btn-block mt-3">Submit</button>
</form>
   
   
   </div>
   </div>
   </div>
   </div>
   </div>
   </div>
</body>
</html>