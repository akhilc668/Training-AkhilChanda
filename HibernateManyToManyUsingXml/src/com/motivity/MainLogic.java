package com.motivity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) 
	{
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction trx=se.beginTransaction();
		Trainee t1=new Trainee();
		t1.setId(101);
		t1.setName("Akhil");
		Trainee t2=new Trainee();
		t2.setId(102);
		t2.setName("Bunny");
		
		Certification c1=new Certification();
		c1.setId(201);
		c1.setName("Java");
		c1.setDuration("30 days");
		Certification c2=new Certification();
		c2.setId(202);
		c2.setName("python");
		c2.setDuration("50 days");
		
		Set<Trainee> setTrainee=new HashSet<>();
		setTrainee.add(t1);
		setTrainee.add(t2);
		Set<Trainee> setTrainee1=new HashSet<>();
		setTrainee1.add(t2);
		c1.setTrainees(setTrainee);
		c2.setTrainees(setTrainee1);
		se.save(c1);
		se.save(c2);
		Set<Certification> setCertification=new HashSet<>();
		setCertification.add(c1);
		setCertification.add(c2);
		Trainee t3=new Trainee();
		t3.setId(103);
		t3.setName("Banu");
		t3.setCertification(setCertification);
		se.save(t3);
		trx.commit();
		se.close();
		sf.close();
	}

}

