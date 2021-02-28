<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Appointment Stauts Page</h1>
		<br>
		<br> <a href="/KimsApplicationSpring/patient_home">Home</a> | <a
			href="/KimsApplicationSpring/patient_profile">Profile</a> | <a
			href="/KimsApplicationSpring/appointment">Appointment</a> | <a
			href="/KimsApplicationSpring/appointment_status">Appointment status</a> | <a
			href="/KimsApplicationSpring/index">Logout</a>
	</center>
	<br>
	<br>

	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Patient Name</td>
			<td>Phone</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Blood_group</td>
			<td>Specialist</td>
			<td>Date of appointment</td>
			<td>Time of appointment</td>
			<td>Doctor Name</td>
			<td>Status</td>
		</tr>
		<c:forEach var="ab" items="${list}">
			<tr>
				<td>${ab.getPname()}</td>
				<td>${ab.getPhone()}</td>
				<td>${ab.getEmail()}</td>
				<td>${ab.getGender()}</td>
				<td>${ab.getBlood_group()}</td>
				<td>${ab.getSpecialist()}</td>
				<td>${ab.getDate_of_appointment()}</td>
				<td>${ab.getTime_of_appointment()}</td>
				<td>${ab.getDname()}</td>
				<td>${ab.getStatus()}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>