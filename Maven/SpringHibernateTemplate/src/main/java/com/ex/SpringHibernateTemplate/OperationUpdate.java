package com.ex.SpringHibernateTemplate;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class OperationUpdate {
	private HibernateTemplate hbTemplate;

	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}
	
	
	public void update() throws Exception {
		Session se =getHbTemplate().getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		int choice = 0, a = 0;
		String option = "";
		do {
			Transaction tx = se.beginTransaction();
			System.out.println(
					"Select your option\n 1. update name \n 2. update salary \n 3. update department \n 4. update designation \n 5. update address \n 6. update phone");
			choice = sc.nextInt();
			if (choice == 1) {
				Query qr = se.createQuery("update Employee e set e.name=:x where e.id=:y");
				System.out.println("Enter new name:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which name to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				Query qr = se.createQuery("update Employee e set e.salary=:x where e.id=:y");
				System.out.println("Enter new salary:");
				qr.setParameter("x", sc.nextInt());
				System.out.println("enter the id to which salary to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				Query qr = se.createQuery("update Employee e set e.department=:x where e.id=:y");
				System.out.println("Enter new department:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which department to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 4) {
				Query qr = se.createQuery("update Employee e set e.designation=:x where e.id=:y");
				System.out.println("Enter new designation:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which designation to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 5) {
				Query qr = se.createQuery("update Employee e set e.address=:x where e.id=:y");
				System.out.println("Enter new address:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which address to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 6) {
				Query qr = se.createQuery("update Employee e set e.phone=:x where e.id=:y");
				System.out.println("Enter new phone:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which phoneNumber to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			}
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
		se.close();
	}
}
