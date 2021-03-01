package com.ex;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainLogic {
	@Autowired
	SpringInsert si;
	
	@Autowired
	SpringSelect ss;
	
	@Autowired
	SpringUpdate su;
	
	@Autowired
	SpringDelete sd;
	
	public void Logics() {
		Scanner sc = new Scanner(System.in);
		String con="";
		do {
			System.out.println("JdbcTemplate");
			System.out.println("1.Insert 2.Display 3.Update 4.Delete");
			System.out.println("enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				si.insert();
				break;
			case 2:
				ss.display();
				break;
			case 3:
				su.update();
				break;
			case 4:
				sd.delete();
				break;
			}
			System.out.println("do you want to continue Y/N");
			con=sc.next();
		} while (con.equalsIgnoreCase("Y"));
	}

}
