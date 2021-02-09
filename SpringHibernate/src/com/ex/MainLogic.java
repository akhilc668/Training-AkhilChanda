package com.ex;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Select your option\n 1. Insert\n 2. Display\n 3. Update\n 4. Delete\n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				OperationInsert si = (OperationInsert) context.getBean("hTemplatei");
				si.insert(si);
			}else if(choice == 2) {
				OperationDisplay si = (OperationDisplay) context.getBean("hTemplates");
				si.display(si);
			}else if(choice == 3) {
				OperationUpdate si = (OperationUpdate) context.getBean("hTemplateu");
				si.update(si);
			}else if(choice == 4) {
				OperationDelete si = (OperationDelete) context.getBean("hTemplated");
				si.delete(si);
			}
		}while(choice!=5);
	}

}
