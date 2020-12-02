package com.kims;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DoctorRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/kims";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dname=request.getParameter("dname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String gender=request.getParameter("gender");
		String specialization=request.getParameter("specialization");
		int experiance=Integer.parseInt(request.getParameter("experiance"));
		String address=request.getParameter("address");
		PrintWriter pw=response.getWriter();
		String sql="insert into doctor(dname,password,email,phone,gender,specialization,experiance,address) values(?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dname);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setLong(4, mobile);
			ps.setString(5,gender);
			ps.setString(6, specialization);
			ps.setInt(7, experiance);
			ps.setString(8, address);
			int a=ps.executeUpdate();
			if(a!=0)
				response.sendRedirect("./doctor_login.html?msg=registered sucessfully");
			else
				response.sendRedirect("./doctor_register.html?msg=registered failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
