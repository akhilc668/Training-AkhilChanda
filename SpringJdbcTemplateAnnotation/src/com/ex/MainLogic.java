package com.ex;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con="";
		ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		do {
			System.out.println("JdbcTemplate");
			System.out.println("1.Insert 2.Display 3.Update 4.Delete");
			System.out.println("enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				SpringInsert si = (SpringInsert) context.getBean("jTemplatei");
				si.insert();
				break;
			case 2:
				SpringSelect ss = (SpringSelect) context.getBean("jTemplates");
				ss.display();
				break;
			case 3:
				SpringUpdate su = (SpringUpdate) context.getBean("jTemplateu");
				su.update();
				break;
			case 4:
				SpringDelete sd = (SpringDelete) context.getBean("jTemplated");
				sd.delete();
				break;
			}
			System.out.println("do you want to continue Y/N");
			con=sc.next();
		} while (con.equalsIgnoreCase("Y"));
		sc.close();
	}

}
