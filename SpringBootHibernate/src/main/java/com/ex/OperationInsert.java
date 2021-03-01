package com.ex;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Service
public class OperationInsert {
	@Autowired
	EmployeeRepository er;

	public void insert() throws Exception {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do {
			Employee e = new Employee();
			System.out.println("enter employee id: ");
			e.setId(sc.nextInt());
			System.out.println("enter emploee name :");
			e.setName(sc.next());
			System.out.println("enter employee salary : ");
			e.setSalary(sc.nextInt());
			System.out.println("enter employee department :");
			e.setDepartment(sc.next());
			System.out.println("enter employee designation : ");
			e.setDesignation(sc.next());
			System.out.println("enter employee address: ");
			e.setAddress(sc.next());
			System.out.println("enter employee phone number : ");
			e.setPhone(sc.next());
			System.out.println("enter the date of Join :");
			e.setDOJ(sc.next());
			Object s = er.save(e);
			if (s != null) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
	}
}
