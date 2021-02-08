package com.ex;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SpringDelete {
	Scanner sc=new Scanner(System.in);
	NamedParameterJdbcTemplate npjdbcTemplate;
	
	public void setNpjdbcTemplate(NamedParameterJdbcTemplate npjdbcTemplate) {
		this.npjdbcTemplate = npjdbcTemplate;
	}

	public void delete() {		
		System.out.println("Enter your choice \n 1.Delete All details\n 2. Delete sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			String sql="delete from student1";
			Map<String,Object> map=new HashMap<String,Object>();  
			int a=npjdbcTemplate.update(sql,map);
			if (a == 0)
				System.out.println("Records deleted");
		} else if (choice == 2) {
			String option = "";
			do {
				System.out.println("enter a id");
				int id=sc.nextInt();
				String sql="delete from student1 where sid=:sid";
				Map<String,Object> map=new HashMap<String,Object>();  
				map.put("sid",id);   
				  
				int a=npjdbcTemplate.update(sql,map);
				if (a == 1)
					System.out.println("Record Deleted");
				System.out.println("Do you want to delete (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
	}
}
