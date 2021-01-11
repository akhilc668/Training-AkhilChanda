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
		Vendor v=new Vendor();
		v.setId(1);
		v.setName("Flipkart");
		Customer c=new Customer();
		c.setName("Nikhil");
		c.setFvid(v.getId());
		Customer c1=new Customer();
		c1.setName("Sunny");
		c1.setFvid(v.getId());
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
