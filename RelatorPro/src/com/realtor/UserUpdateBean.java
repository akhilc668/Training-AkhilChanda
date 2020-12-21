package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.User;

public class UserUpdateBean {
	public static User update(User u) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		User o=(User) se.merge(u);
		tx.commit();
		if(o!=null) {
			return o;
		}
		return null;
	}
}
