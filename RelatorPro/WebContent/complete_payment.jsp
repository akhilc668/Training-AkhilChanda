<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to Payment Page</h1><br><br>
<a href="user_home.jsp">Home</a> |
<a href="available_plot.jsp">Available plot</a> |
<a href="user_bought_plot.jsp">Bought plot</a> |
<a href="index.html">Logout</a> 
</center>
<br><br><br>
<%int id=Integer.parseInt(request.getParameter("id")); %>
<form action="./complete_payment" method="post" align="center"> 
<input type="hidden" name="id" value="<%=id%>">
Amount: <input type="number" name="paidAmount">
<input type="submit" value="pay">
</form>
</body>
</html>