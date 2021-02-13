package com.ex.SpringJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class SpringInsert {
	Scanner sc = new Scanner(System.in);
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert() {
		String con = "";
		do {
			System.out.println("enter student id");
			final int id=sc.nextInt();
			System.out.println("enter student name");
			final String name=sc.next();
			System.out.println("enter student marks");
			final int marks=sc.nextInt();
			System.out.println("enter student section");
			final String section=sc.next();
			String sql = "insert into student1(sid,sname,marks,section) values(?,?,?,?)";
			int a = jdbcTemplate.update(sql, new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement arg0) throws SQLException {
					arg0.setInt(1, id);
					arg0.setString(2, name);
					arg0.setInt(3, marks);
					arg0.setString(4, section);
				}
			});
			if (a > 0)
				System.out.println("inserted successfully");
			else
				System.out.println("insertion failed");
			System.out.println("do you want to insert Y/N");
			con = sc.next();
		} while (con.equalsIgnoreCase("Y"));
	}

}
