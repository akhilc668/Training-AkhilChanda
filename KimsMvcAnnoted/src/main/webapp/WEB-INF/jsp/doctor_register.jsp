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
<center><h1>Welcome to Doctor Register Page</h1></center>
<br><br>
<form:form action="/KimsMvcAnnoted/add_doctor" method="post" modelAttribute="dregister" align="center">
Name:<form:input type="text" path="dname" placeholder="Enter name" /><br><br>
Password:<form:password path="password" placeholder="Enter password" /><br><br>
Email:<form:input type="email" path="email" placeholder="Enter email" /><br><br>
Phone:<form:input type="text" path="phone" placeholder="Enter Phone number"/><br><br>
Gender:<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female<br><br>
Specialization<form:select path="specialization">
<form:option value="Dentist">Dentist</form:option>
<form:option value="Cardio">Cardio</form:option>
<form:option value="ENT">ENT</form:option>
</form:select><br><br>
<form:input type="number" path="experiance" placeholder="Enter experiance" /><br><br>
<form:textarea rows="15" cols="15" path="address"></form:textarea><br><br>
<input type="submit" value="register">
</form:form>
</html>