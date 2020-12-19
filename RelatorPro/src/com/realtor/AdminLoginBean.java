package com.realtor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Admin;

public class AdminLoginBean {
	public static boolean login(String username,String password) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Admin a where a.username=:x and a.password=:y");
		qe.setParameter("x", username);
		qe.setParameter("y", password);
		List<Admin> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return true;
		}
		return false;
	}
}
