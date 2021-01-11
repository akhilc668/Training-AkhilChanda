package com.motivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class InLogic {

	public static void main(String[] args) {
		Session se=Config.config();
		Criteria ct=se.createCriteria(Student.class);
		System.out.println("Using the collections");
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(101);
		c1.add(104);
		Criterion c=Restrictions.in("id",c1 );
		ct.add(c);
		List li=ct.list();
		Iterator i=li.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
		System.out.println("Using objects");
		c=Restrictions.in("id", 101,105);
		ct.add(c);
		 li=ct.list();
		 i=li.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}

}
