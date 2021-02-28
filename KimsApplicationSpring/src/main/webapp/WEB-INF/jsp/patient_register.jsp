<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Patient Register Page</h1></center>
<br><br>
<form:form action="/KimsApplicationSpring/add_patient" method="post" modelAttribute="register" align="center">
<form:input type="text"  path="pname" placeholder="Enter name"/><br><br>
<form:password  path="password" placeholder="Enter password"/><br><br>
<form:input type="email" path="email" placeholder="Enter email"/><br><br>
<form:input type="text" path="phone" placeholder="Enter Phone number"/><br><br>
Gender:
<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female<br><br>
<form:textarea rows="15" cols="15" path="address"></form:textarea><br><br>
<input type="submit" value="register">
</form:form>
</body>
</html>