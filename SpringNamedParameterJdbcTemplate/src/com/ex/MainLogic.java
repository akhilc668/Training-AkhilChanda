package com.ex;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con="";
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		do {
			System.out.println("\nNamed Parameter Jdbc Template");
			System.out.println("1.Insert 2.Display 3.Update 4.Delete");
			System.out.println("enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				SpringInsert si = (SpringInsert) context.getBean("npjTemplatei");
				si.insert();
				break;
			case 2:
				SpringSelect ss = (SpringSelect) context.getBean("npjTemplate");
				ss.display();
				break;
			case 3:
				SpringUpdate su = (SpringUpdate) context.getBean("npjTemplateu");
				su.update();
				break;
			case 4:
				SpringDelete sd = (SpringDelete) context.getBean("npjTemplated");
				sd.delete();
				break;
			}
			System.out.println("do you want to continue Y/N");
			con=sc.next();
		} while (con.equalsIgnoreCase("Y"));
	}

}
