package com.ex;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class SpringDelete {
	Scanner sc = new Scanner(System.in);
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void delete() {
		System.out.println("Enter your choice \n 1.Delete All details\n 2. Delete sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			String sql = "delete from student1";
			int a = jdbcTemplate.update(sql);
			if (a == 0)
				System.out.println("Records deleted");
		} else if (choice == 2) {
			String option = "";
			do {
				System.out.println("enter a id");
				int id = sc.nextInt();
				String sql = "delete from student1 where sid=?";
				/*
				 * int a=jdbcTemplate.update(sql, new PreparedStatementSetter() {
				 * 
				 * @Override public void setValues(PreparedStatement arg0) throws SQLException {
				 * arg0.setInt(1, id); } });
				 */
				int a = jdbcTemplate.update(sql, id);
				if (a == 1)
					System.out.println("Record Deleted");
				System.out.println("Do you want to delete (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
	}
}
