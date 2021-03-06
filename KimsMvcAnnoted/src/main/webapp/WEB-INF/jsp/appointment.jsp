<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Appointment Page</h1>
<br><br>
<a href="/KimsMvcAnnoted/patient_home">Home</a> |
<a href="/KimsMvcAnnoted/patient_profile">Profile</a> |
<a href="/KimsMvcAnnoted/appointment">Appointment</a> |
<a href="/KimsMvcAnnoted/appointment_status">Appointment status</a> |
<a href="/KimsMvcAnnoted/index">Logout</a>
</center>
<br><br>
<form:form action="/KimsMvcAnnoted/apply_appointment" method="post" modelAttribute="appointment"  align="center">
<form:input type="text" path="pname" placeholder="Enter patient name "/>
<form:input type="number" path="phone" placeholder="Enter phone number"/>
<form:input type="email"  path="email" placeholder="Enter emial"/>
<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female
<form:select path="blood_group">
<form:option value="A+">A+</form:option>
<form:option value="A-">A-</form:option>
<form:option value="B+">B+</form:option>
<form:option value="B-">B-</form:option>
<form:option value="AB+">AB+</form:option>
<form:option value="AB-">AB-</form:option>
<form:option value="O+">O+</form:option>
<form:option value="O-">O-</form:option>
</form:select>
<form:select path="specialist">
<form:option value="Dentist">Dentist</form:option>
<form:option value="Cardio">Cardio</form:option>
<form:option value="ENT">ENT</form:option>
</form:select>
<form:input type="date" path="date_of_appointment" placeholder="select date for appointment"/>
<form:input type="time" path="time_of_appointment" placeholder="select time for appointment"/>
<input type="submit" value="apply"> 
</form:form> 
${appointment.getPatient().getId() }
</body>
</html>