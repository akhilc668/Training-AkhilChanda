<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to Employee Home Page</h1><br><br>
<a href="employee_home.jsp">Home</a> |
<a href="view_plot.jsp">View plot</a> |
<a href="bought_plot.jsp">Sales Book</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<%@page import="com.pojo.Employee,com.realtor.EmployeeBean"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
Employee p=EmployeeBean.getById(id); %>
<form action="./update_employee" method="post" align="center">
<input type="hidden" name="id" value="<%=p.getId()%>">
Employee name: <input type="text" name="ename" value="<%=p.getEname()%>"><br><br>
Email: <input type="email" name="email" value="<%=p.getEmail()%>"><br><br>
 <input type="hidden" name="password" value="<%=p.getPassword()%>"><br><br>
phone: <input type="number" name="phone" value="<%=p.getPhone()%>"><br><br>
<%if(p.getGender().equals("Male")) {%>
Gender: <input type="radio" name="gender" value="Male" checked="checked">Male
<input type="radio" name="gender" value="Female">Female<br><br>
<%}else{ %>
Gender: <input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female"  checked="checked">Female<br><br>
<%} %>
Address: <input type="text"  name="address" value="<%=p.getAddress()%>"><br><br>
<input type="submit" value="update">
</form>
</body>
</html>