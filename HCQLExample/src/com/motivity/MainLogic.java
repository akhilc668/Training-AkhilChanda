package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class MainLogic {

	public static void main(String[] args) {
		Session se=Config.config();
		Criteria ct=se.createCriteria(Student.class);
		//It find values by id
		Criterion c=Restrictions.idEq(101);
		ct.add(c);
		List li=ct.list();
		Iterator i=li.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}

}
