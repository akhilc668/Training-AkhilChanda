package com.ex;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainLogic {
	@Autowired
	OperationInsert oi;
	
	@Autowired
	OperationDisplay os;
	
	@Autowired
	OperationUpdate ou;
	
	@Autowired
	OperationDelete od;
	
	public  void logic() throws Exception {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Select your option\n 1. Insert\n 2. Display\n 3. Update\n 4. Delete\n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				oi.insert();
			}else if(choice == 2) {
				os.display();
			}else if(choice == 3) {
				ou.update();
			}else if(choice == 4) {
				od.delete();
			}
		}while(choice!=5);
	}

}
