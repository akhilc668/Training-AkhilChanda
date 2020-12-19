package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Employee;

public class EmployeeRegisterBean {
	public static boolean register(Employee emp) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.save(emp);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}
}
