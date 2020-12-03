<%@include file="connect.jsp"%>
<%
String dname=(String) session.getAttribute("name");
int id=Integer.parseInt(request.getParameter("id"));
String sql = "update appointment set status=?,dname=? where aid=?";
ps = con.prepareStatement(sql);
ps.setString(1, "Accepted");
ps.setString(2, dname);
ps.setInt(3, id);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("view_appointment.jsp?msg=accepted");
%>