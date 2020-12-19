<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br><br>
<center>
<a href="user.jsp">Home</a> |
<a href="user_register.jsp">User Register</a> |
<a href="user_login.jsp">User Login</a> 
</center>
<br><br><br>
<form action="./user_login" method="post" align="center">
Email: <input type="email" name="email"><br><br>
Password: <input type="password" name="password"><br><br>
<input type="submit" value="login">
</form>
</body>
</html>