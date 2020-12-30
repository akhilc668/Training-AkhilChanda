<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("background.png");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: repeat;
  background-size: cover;
}
</style>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA" class="bg">
<br>
<%int id=(Integer)session.getAttribute("eid");%>
<center>
<h1>Welcome to Employee Home Page</h1><br>
<a href="employee_home.jsp">Home</a> |
<a href="employee_update.jsp?id=<%=id %>">Update employee</a> |
<a href="view_plot.jsp">View plot</a> |
<a href="bought_plot.jsp">Sales Book</a> |
<a href="./index.html">Logout</a>
</center>
<br>
</body>
</html>