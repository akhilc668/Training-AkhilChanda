package com.ex;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class OperationUpdate {
	@Autowired
	EmployeeRepository er;

	public void update() throws Exception {
		Scanner sc = new Scanner(System.in);
		int choice = 0, a = 0;
		String option = "";
		do {
			System.out.println(
					"Select your option\n 1. update name \n 2. update salary \n 3. update department \n 4. update designation \n 5. update address \n 6. update phone");
			choice = sc.nextInt();
			if (choice == 1) {

				System.out.println("Enter new name:");
				String name=sc.next();
				System.out.println("enter the id to which name to be updated: ");
				int id = sc.nextInt();
				a =er.updateByName(name,id);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				System.out.println("Enter new salary:");
				int salary = sc.nextInt();
				System.out.println("enter the id to which salary to be updated: ");
				int id =  sc.nextInt();
				a =er.updateBySalary(salary,id);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				System.out.println("Enter new department:");
				String department= sc.next();
				System.out.println("enter the id to which department to be updated: ");
				int id= sc.nextInt();
				a = er.updateByDepartment(department,id);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 4) {
				System.out.println("Enter new designation:");
				String designation = sc.next();
				System.out.println("enter the id to which designation to be updated: ");
				int id = sc.nextInt();
				a = er.updateByDesignation(designation, id);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 5) {
				
				System.out.println("Enter new address:");
				String address = sc.next();
				System.out.println("enter the id to which address to be updated: ");
				int id = sc.nextInt();
				a = er.updateByAddress(address, id);
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 6) {
				System.out.println("Enter new phone:");
				String phone = sc.next();
				System.out.println("enter the id to which phoneNumber to be updated: ");
				int id= sc.nextInt();
				a = er.updateByPhone(phone, id);
				if (a == 1)
					System.out.println("Record updated");
			}
			
			System.out.println("Do you want to continue (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
	}
}
