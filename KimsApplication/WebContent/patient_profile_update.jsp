<%@include file="connect.jsp" %>
<%
int pid = Integer.parseInt(request.getParameter("id"));
String pname = request.getParameter("pname");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String gender = request.getParameter("gender");
String address = request.getParameter("address");
String sql = "update patient set pname=?,email=?,phone=?,gender=?,address=? where pid=?";
ps = con.prepareStatement(sql);
ps.setString(1, pname);
ps.setString(2, email);
ps.setString(3, phone);
ps.setString(4, gender);
ps.setString(5, address);
ps.setInt(6,pid);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("patient_profile.jsp?msg=updated sucessfully");
%>