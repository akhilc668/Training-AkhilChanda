package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class NotLogic {

	public static void main(String[] args) {
		Session se=Config.config();
		Criteria ct=se.createCriteria(Student.class);
		//it retrives the values which are id's not equal to given id
		Criterion c=Restrictions.not(Restrictions.idEq(102));
		ct.add(c);
		List li=ct.list();
		Iterator i=li.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}

}
