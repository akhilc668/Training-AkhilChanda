<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to User Home Page</h1><br><br>
<a href="user_home.jsp">Home</a> |
<a href="update_user.jsp">Update User</a> |
<a href="available_plot.jsp">Available plot</a> |
<a href="user_bought_plot.jsp">Bought plot</a> |
<a href="index.html">Logout</a> 
</center>
<br><br><br>
<%@page import="com.pojo.User"%>
<%
User p=(User)session.getAttribute("user");
%>
<form action="./update_user" method="post" align="center">
<input type="hidden" name="id" value="<%=p.getId()%>">
User name: <input type="text" name="uname" value="<%=p.getUname()%>"><br><br>
Email: <input type="email" name="email" value="<%=p.getEmail()%>"><br><br>
 <input type="hidden" name="password" value="<%=p.getPassword()%>">
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