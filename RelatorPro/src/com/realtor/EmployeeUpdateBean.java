package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Employee;

public class EmployeeUpdateBean {
	public static boolean update(Employee emp) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.merge(emp);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}
}
