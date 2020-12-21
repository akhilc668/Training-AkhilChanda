<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<%int id=(Integer)session.getAttribute("eid");%>
<center>
<h1>Welcome to Employee Home Page</h1><br><br>
<a href="employee_home.jsp">Home</a> |
<a href="employee_update.jsp?id=<%=id %>">Update employee</a> |
<a href="view_plot.jsp">View plot</a> |
<a href="bought_plot.jsp">Sales Book</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
</body>
</html>