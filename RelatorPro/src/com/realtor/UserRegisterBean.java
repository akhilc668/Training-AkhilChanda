package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.User;

public class UserRegisterBean {
	public static boolean register(User user) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.save(user);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}
}
