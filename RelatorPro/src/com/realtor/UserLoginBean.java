package com.realtor;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.User;

public class UserLoginBean {
	public static User login(String email,String password) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from User u where u.email=:x and u.password=:y");
		qe.setParameter("x", email);
		qe.setParameter("y", password);
		List<User> li=qe.list();
		tx.commit();
		if(li.size()==1) {
			User u=li.get(0);
			return u;
		}
		return null;
	}
}
