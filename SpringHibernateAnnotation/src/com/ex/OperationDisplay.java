package com.ex;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class OperationDisplay {
	private HibernateTemplate hbTemplate;

	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}
	
	public void display() throws Exception {
		Session se =getHbTemplate().getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Retrieve All details\n 2. Retrieve sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			Query qr = se.createQuery("from Employee e");
			List<Employee> li = qr.list();
			Iterator<Employee> i = li.iterator();
			while (i.hasNext()) {
				Employee e = i.next();
				System.out.println("Employee [eid=" + e.getId() + ", name=" + e.getName() + ", salary=" + e.getSalary()
						+ ", department=" + e.getDepartment() + ", designation=" + e.getDesignation() + ", address="
						+ e.getAddress() + ", phone=" + e.getPhone() + ", DOJ=" + e.getDOJ() + "]");
			}
		} else if (choice == 2) {
			Query qr = se.createQuery("from Employee e where e.id=:x");
			String option = "";
			do {
				System.out.println("enter id of employee to be retrieve");
				qr.setParameter("x", sc.nextInt());
				List<Employee> li = qr.list();
				Iterator<Employee> i = li.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					System.out.println("Employee [eid=" + e.getId() + ", name=" + e.getName() + ", salary="
							+ e.getSalary() + ", department=" + e.getDepartment() + ", designation="
							+ e.getDesignation() + ", address=" + e.getAddress() + ", phone=" + e.getPhone() + ", DOJ="
							+ e.getDOJ() + "]");
				}
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
		se.close();
	}

}
