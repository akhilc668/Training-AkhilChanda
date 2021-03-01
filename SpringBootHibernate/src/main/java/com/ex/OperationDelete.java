package com.ex;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OperationDelete {
	@Autowired
	EmployeeRepository er;

	public void delete() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Delete All details\n 2. Delete sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			int a = er.deleteEveryOne();
			if (a == 0)
				System.out.println("Records deleted");
		} else if (choice == 2) {
			String option = "";
			do {

				System.out.println("enter id of employee to be deleted");
				er.deleteById(sc.nextInt());
				System.out.println("Record Deleted");
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
	}
}
