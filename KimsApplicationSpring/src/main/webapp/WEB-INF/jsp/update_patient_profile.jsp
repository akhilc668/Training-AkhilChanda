<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Update Page</h1>
		<br> <br> <a href="/KimsApplicationSpring/patient_home">Home</a> | <a
			href="/KimsApplicationSpring/patient_profile">Profile</a> | <a href="/KimsApplicationSpring/index">Logout</a>
	</center>
	<br>
	<br>
<form:form action="/KimsApplicationSpring/update_patient" method="post" modelAttribute="patient" align="center">
<form:input type="hidden" path="id" />
<form:input type="text"  path="pname" placeholder="Enter name"/><br><br>
<form:input type="hidden"  path="password"/><br><br>
<form:input type="email" path="email" placeholder="Enter email"/><br><br>
<form:input type="text" path="phone" placeholder="Enter Phone number"/><br><br>
Gender:
<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female<br><br>
<form:textarea rows="15" cols="15" path="address"></form:textarea><br><br>
<input type="submit" value="update">
</form:form>

</body>
</html>