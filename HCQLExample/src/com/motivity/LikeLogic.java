package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LikeLogic {

	public static void main(String[] args) {
		Session se=Config.config();
		Criteria ct=se.createCriteria(Student.class);
		//it retrives the values where the name column having the like condions
		Criterion c=Restrictions.ilike("name", "%n_");
		ct.add(c);
		List li=ct.list();
		Iterator i=li.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}

}
