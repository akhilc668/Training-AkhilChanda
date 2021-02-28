<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Profile Page</h1>
		<br> <br> <a href="/KimsApplicationSpring/patient_home">Home</a> | <a
			href="/KimsApplicationSpring/patient_profile">Profile</a> | <a href="/KimsApplicationSpring/index">Logout</a>
	</center>
	<br>
	<br>
	
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Address</td>
			<td>Action</td>
		</tr>
		<tr>
			<td>${patient.getId()}</td>
			<td>${patient.getPname()}</td>
			<td>${patient.getEmail()}</td>
			<td>${patient.getPhone()}</td>
			<td>${patient.getGender()}</td>
			<td>${patient.getAddress()}</td>
			<td><a
				href="/KimsApplicationSpring/update_patient_profile">update</a>
		</tr>
		
	</table>
</body>
</html>