<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show_Register</title>
 <%@include file="/WEB-INF/views/base.jsp" %>
</head>
<body style="background: #e2e2e2e2">
   
   <div class="row">
   <div class="col-6 offset-3">
   <div class="card mt-5">
   <div class="card-body">
   
   <div class="container text-center">
   <h1>Register Here</h1>
   </div>
   <form action="saveReg" method="post">
  <div class="form-group">
    <label for="name">First Name</label>
    <input type="text" class="form-control" id="" name="firstName"  placeholder="Enter First Name">
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
    <label for="">Password</label>
    <input type="text" class="form-control" name="password" id="" placeholder="Enter Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary btn-block mt-3">Submit</button>
</form>
</div>
   </div>
   </div>
   </div>
</body>
</html>