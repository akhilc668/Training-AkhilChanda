package com.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationDisplay {
	@Autowired
	EmployeeRepository er;

	public void display() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Retrieve All details\n 2. Retrieve sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			List<Employee> li = er.findAll();
			Iterator<Employee> i = li.iterator();
			while (i.hasNext()) {
				Employee e = i.next();
				System.out.println("Employee [eid=" + e.getId() + ", name=" + e.getName() + ", salary=" + e.getSalary()
						+ ", department=" + e.getDepartment() + ", designation=" + e.getDesignation() + ", address="
						+ e.getAddress() + ", phone=" + e.getPhone() + ", DOJ=" + e.getDOJ() + "]");
			}
		} else if (choice == 2) {

			String option = "";
			do {
				System.out.println("enter id of employee to be retrieve");

				Optional<Employee> li = er.findById(sc.nextInt());
				Employee e = li.get();
				System.out.println("Employee [eid=" + e.getId() + ", name=" + e.getName() + ", salary=" + e.getSalary()
						+ ", department=" + e.getDepartment() + ", designation=" + e.getDesignation() + ", address="
						+ e.getAddress() + ", phone=" + e.getPhone() + ", DOJ=" + e.getDOJ() + "]");

				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
	}

}
