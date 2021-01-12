package com.motivity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Customer c=new Customer();
		c.setId(201);
		c.setName("Nikhil");
		Customer c1=new Customer();
		c1.setId(202);
		c1.setName("Sunny");
		Vendor v=new Vendor();
		v.setId(101);
		v.setName("Flipkart");
		
		Set<Customer> s=new HashSet<>();
		s.add(c);
		s.add(c1);
		v.setCustomer(s);
		
		se.save(v);
		tx.commit();
		se.close();
		sf.close();
	}

}
