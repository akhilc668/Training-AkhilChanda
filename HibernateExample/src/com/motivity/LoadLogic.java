package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		//load search in the database and if there is no data regarding to given information it directly gives an exception
		Student s=se.load(Student.class, 101);//it directly loads the data to Student.class file
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getSection());
		s=(Student)se.load("com.motivity.Student", 102);//it Search for the .java file and load the data into it.
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getSection());
		se.close();
		sf.close();
	}

}
