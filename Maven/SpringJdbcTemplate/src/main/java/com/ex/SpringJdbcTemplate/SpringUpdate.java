package com.ex.SpringJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class SpringUpdate {
	Scanner sc = new Scanner(System.in);
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void update() {
		int choice = 0, a = 0;
		String option = "";
		do {
			System.out.println("Select your option\n 1. update name \n 2. update marks \n 3. update section");
			choice = sc.nextInt();
			if (choice == 1) {
				String sql = "update student1 set sname=? where sid=?";
				System.out.println("Enter new name:");
				String name = sc.next();
				System.out.println("enter the id to which salary to be updated: ");
				int id = sc.nextInt();
				/*
				 * a=jdbcTemplate.update(sql, new PreparedStatementSetter() {
				 * 
				 * @Override public void setValues(PreparedStatement arg0) throws SQLException {
				 * arg0.setString(1, name); arg0.setInt(2, id); } });
				 */
				a = jdbcTemplate.update(sql,name,id);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				String sql = "update student1 set marks=? where sid=?";
				System.out.println("Enter new marks:");
				final int marks = sc.nextInt();
				System.out.println("enter the id to which salary to be updated: ");
				final int id = sc.nextInt();
				a = jdbcTemplate.update(sql, new PreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement arg0) throws SQLException {
						arg0.setInt(1, marks);
						arg0.setInt(2, id);
					}
				});
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				String sql = "update student1 set section=? where sid=?";
				System.out.println("Enter new section:");
				final String section = sc.next();
				System.out.println("enter the id to which salary to be updated: ");
				final int id = sc.nextInt();
				a = jdbcTemplate.update(sql, new PreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement arg0) throws SQLException {
						arg0.setString(1, section);
						arg0.setInt(2, id);
					}
				});
				if (a == 1)
					System.out.println("Record updated");
			}
			System.out.println("Do you want to update more (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));

	}

}
