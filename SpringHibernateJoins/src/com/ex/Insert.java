package com.ex;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class Insert {
	private HibernateTemplate hbTemplate;

	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}

	public void insertValues() {
		
		Session se=getHbTemplate().getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();
		Customer c=new Customer();
		c.setId(201);
		c.setName("Nikhil");
		Customer c1=new Customer();
		c1.setId(202);
		c1.setName("Sunny");
		Customer c2=new Customer();
		c2.setId(203);
		c2.setName("Akhil");
		Vendor v=new Vendor();
		v.setId(101);
		v.setName("Flipkart");
		Vendor v1=new Vendor();
		v1.setId(102);
		v1.setName("Amazon");
		
		Set<Customer> s=new HashSet<>();
		s.add(c);
		s.add(c1);
		v.setCustomer(s);
		
		
		se.save(v);
		se.save(v1);
		se.save(c2);
		tx.commit();
		se.close();
	}

}
