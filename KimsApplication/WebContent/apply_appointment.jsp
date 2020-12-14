<%@include file="connect.jsp"%>
<%
	String pname = request.getParameter("pname");
String phone = request.getParameter("phone");
String email = request.getParameter("email");
String gender = request.getParameter("gender");
String blood_group = request.getParameter("blood_group");
String specialist = request.getParameter("specialist");
String date_of_appointment = request.getParameter("date_of_appointment");
String time_of_appointment = request.getParameter("time_of_appointment");
int id=(Integer)session.getAttribute("id");
String sql = "insert into appointment(pname,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,pid) values(?,?,?,?,?,?,?,?,?)";
ps = con.prepareStatement(sql);
ps.setString(1, pname);
ps.setString(2, phone);
ps.setString(3, email);
ps.setString(4, gender);
ps.setString(5, blood_group);
ps.setString(6, specialist);
ps.setString(7, date_of_appointment);
ps.setString(8, time_of_appointment);
ps.setInt(9,id);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("appointment.jsp?msg=applied sucessfully");
%>