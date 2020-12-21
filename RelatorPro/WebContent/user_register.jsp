<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<h1>Welcome to User Register Page</h1><br><br>
<a href="user.jsp">Home</a> |
<a href="user_register.jsp">User Register</a> |
<a href="user_login.jsp">User Login</a> 
</center>
<br><br><br>
<form action="./user_register" method="post" align="center">
Name: <input type="text" name="uname"><br><br>
Email: <input type="email" name="email"><br><br>
Password: <input type="password" name="password"><br><br>
phone: <input type="number" name="phone"><br><br>
Gender: <input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female<br><br>
Address: <input type="text"  name="address"><br><br>
<input type="submit" value="register">
</form>
</body>
</html>