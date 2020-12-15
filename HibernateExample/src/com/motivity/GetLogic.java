package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		//get search in the database and if there is no data regarding to given information it returns the null value
		Student s=se.get(Student.class, 101);//it directly loads the data to Student.class file
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getSection());
		s=(Student)se.get("com.motivity.Student", 102);//it Search for the .java file and load the data into it.
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getSection());
		se.close();
		sf.close();
	}

}
