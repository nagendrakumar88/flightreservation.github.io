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
  
   <div class="row">
   <div class="col-8 offset-2">
   <div class="card mt-5">
   <div class="card-body"> 
   <div class="container text-center">
   <h1>Find Flights</h1>
   </div>
   
   <table class="table mt-5">
  <thead>
    <tr>
      <th scope="col">Airlines</th>
      <th scope="col">Departure City</th>
      <th scope="col">Arrival City</th>
      <th scope="col">Departure Time</th>
      <th scope="col">Arrival Time</th>
      
      <th scope="col">Select Flight</th>
       </tr>
  </thead>
  <tbody>
 
   <c:forEach items="${flights}" var="flights">
    <tr>
   
      <td >${flights.opreratingAirlines }</td>
      <td >${flights.departureCity }</td>
       <td >${flights.arrivalCity }</td>
       <td >${flights.dateOfDeparture }</td>
        <td >${flights.estimatedDepartureTime }</td>
         <td>
         <form action="${contextPath }showCompleteResorvation/${flights.id}" >
         <button class="btn btn-success" type="submit">SELECT</button>
         </form>
         </td>
        
    </tr>
    </c:forEach>
  </tbody>
</table>
   
   </div>
   </div>
   </div>
   </div>
</body>
</html>