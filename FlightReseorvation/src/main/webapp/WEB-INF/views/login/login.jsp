<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
 <%@include file="/WEB-INF/views/base.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>


</head>
<body style="background: #e2e2e2e2">
  <div class="row">
   <div class="col-6 offset-3">
   <div class="card mt-5">
   <div class="card-body">
   
   <div class="container text-center">
   <h1>Login Here</h1>
   </div>
   ${error }
   <form action="${contextPath}verifyLogin" method="post">
  <div class="form-group">
    <label for="">Email</label>
    <input type="email" class="form-control" name="email" id="" placeholder="Enter email">
  </div>
   <div class="form-group">
    <label for="">Password</label>
    <input type="text" class="form-control" name="password" id="" placeholder="Enter Password">
  </div>
  <button type="submit" class="btn btn-primary btn-block mt-5">Submit</button>
</form>
</div>
   </div>
   </div>
   </div>
</body>
</html>