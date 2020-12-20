<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to Employee Register Page</h1><br><br>
<a href="admin_home.jsp">Home</a> |
<a href="employee_register.jsp">Employee Register</a> |
<a href="add_plot.jsp">Add plot</a> |
<a href="./index.html">Logout</a>
</center>
<br><br><br>
<form action="./employee_register" method="post" align="center">
Name: <input type="text" name="ename"><br><br>
Email: <input type="email" name="email"><br><br>
Password: <input type="password" name="password"><br><br>
phone: <input type="number" name="phone"><br><br>
Gender: <input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female<br><br>
Address: <textarea rows="10" cols="10" name="address"></textarea><br><br>
<input type="submit" value="register">
</form>
</body>
</html>