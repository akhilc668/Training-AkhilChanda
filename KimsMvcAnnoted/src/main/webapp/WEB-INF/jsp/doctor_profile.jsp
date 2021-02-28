<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Profile Page</h1>
		<br> <br> <a href="/KimsMvcAnnoted/doctor_home">Home</a>| <a
			href="/KimsMvcAnnoted/doctor_profile">Profile</a> | <a href="/KimsMvcAnnoted/index">Logout</a>
	</center>
	<br><br>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Specialization</td>
			<td>Experiance</td>
			<td>Address</td>
			<td>Action</td>
		</tr>
		
		<tr>
			<td>${doctor.getId()}</td>
			<td>${doctor.getDname()}</td>
			<td>${doctor.getEmail()}</td>
			<td>${doctor.getPhone()}</td>
			<td>${doctor.getGender()}</td>
			<td>${doctor.getSpecialization()}</td>
			<td>${doctor.getExperiance()}</td>
			<td>${doctor.getAddress()}</td>
			<td><a href="/KimsMvcAnnoted/update_doctor_profile">update</a></td>
		</tr>
	</table>
</body>
</html>