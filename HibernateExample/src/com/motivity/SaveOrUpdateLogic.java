package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Student s=new Student();
		s.setId(103);
		s.setName("nani");
		s.setMarks(555);
		s.setSection("B");
		Transaction tx=se.beginTransaction();
		//if the give object is there then it updates or it saves.
		se.saveOrUpdate(s);//but it's return type is void
		tx.commit();
		se.close();
		sf.close();
	}

}
