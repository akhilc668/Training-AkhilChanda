package com.ex;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SpringUpdate {
	Scanner sc = new Scanner(System.in);
	NamedParameterJdbcTemplate npjdbcTemplate;
	public void setNpjdbcTemplate(NamedParameterJdbcTemplate npjdbcTemplate) {
		this.npjdbcTemplate = npjdbcTemplate;
	}

	public void update() {
		int choice = 0,a = 0;
		String option = "";
		do {
			System.out.println(
					"Select your option\n 1. update name \n 2. update marks \n 3. update section");
			choice=sc.nextInt();
			if (choice == 1) {
				String sql="update student1 set sname=:sname where sid=:sid";
				System.out.println("Enter new name:");
				String name=sc.next();
				System.out.println("enter the id to which salary to be updated: ");
				int id=sc.nextInt();
				Map<String,Object> map=new HashMap<String,Object>();  
				map.put("sid",id);  
				map.put("sname",name);  
				  
				a=npjdbcTemplate.update(sql,map);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				String sql="update student1 set marks=:marks where sid=:sid";
				System.out.println("Enter new marks:");
				int marks=sc.nextInt();
				System.out.println("enter the id to which salary to be updated: ");
				int id=sc.nextInt();
				Map<String,Object> map=new HashMap<String,Object>();  
				map.put("sid",id);  
				map.put("marks",marks);  
				  
				a=npjdbcTemplate.update(sql,map);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				String sql="update student1 set section=:section where sid=:sid";
				System.out.println("Enter new section:");
				String section=sc.next();
				System.out.println("enter the id to which salary to be updated: ");
				int id=sc.nextInt();
				Map<String,Object> map=new HashMap<String,Object>();  
				map.put("sid",id);  
				map.put("section",section);  
				  
				a=npjdbcTemplate.update(sql,map);
				if (a == 1)
					System.out.println("Record updated");
			}
			System.out.println("Do you want to update more (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
		
	}
	
	
}
