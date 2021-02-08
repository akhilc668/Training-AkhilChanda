package com.ex;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public class SpringInsert {
	Scanner sc = new Scanner(System.in);
	NamedParameterJdbcTemplate npjdbcTemplate;
	
	public void setNpjdbcTemplate(NamedParameterJdbcTemplate npjdbcTemplate) {
		this.npjdbcTemplate = npjdbcTemplate;
	}

	public void insert() {
		String con = "";
		do {
			System.out.println("enter student id");
			int id=sc.nextInt();
			System.out.println("enter student name");
			String name=sc.next();
			System.out.println("enter student marks");
			int marks=sc.nextInt();
			System.out.println("enter student section");
			String section=sc.next();
			String sql = "insert into student1(sid,sname,marks,section) values(:sid,:sname,:marks,:section)";
			Map<String,Object> map=new HashMap<String,Object>();  
			map.put("sid",id);  
			map.put("sname",name);  
			map.put("marks",marks);
			map.put("section", section);
			  
			int a=npjdbcTemplate.update(sql,map);  
			if (a > 0)
				System.out.println("inserted successfully");
			else
				System.out.println("insertion failed");
			System.out.println("do you want to insert Y/N");
			con = sc.next();
		} while (con.equalsIgnoreCase("Y"));
	}

}
