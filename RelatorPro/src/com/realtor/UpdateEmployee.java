package com.realtor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Employee;


public class UpdateEmployee extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp=new Employee();
		emp.setId(Integer.parseInt(request.getParameter("id")));
		emp.setEname(request.getParameter("ename"));
		emp.setEmail(request.getParameter("email"));
		emp.setPassword(request.getParameter("password"));
		emp.setPhone(request.getParameter("phone"));
		emp.setGender(request.getParameter("gender"));
		emp.setAddress(request.getParameter("address"));
		boolean status=false;
		status=EmployeeUpdateBean.update(emp);
		if(status) {
			response.sendRedirect("./employee_update.jsp?id="+emp.getId()+"&msg=Update sucessfully");
		}
		else
			response.sendRedirect("./employee_update.jsp?id="+emp.getId()+"&msg=update failed");
	}

}
