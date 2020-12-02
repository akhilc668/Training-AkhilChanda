package com.kims;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PatientLogin extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
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
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		PrintWriter pw=response.getWriter();
		String sql="select * from patient where email=? and password=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(2, password);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			HttpSession hs=request.getSession();
			if(rs.next()) {
				hs.setAttribute("id",  rs.getInt(1));
				response.sendRedirect("./patient_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./patient_login.html?msg=login failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
