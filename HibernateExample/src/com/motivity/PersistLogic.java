package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=new Student();
		s.setId(101);
		s.setMarks(555);
		s.setName("Akhil");
		s.setSection("A");
		se.persist( s);//it's return type is void
		tx.commit();
		se.close();
		sf.close();
	}

}
