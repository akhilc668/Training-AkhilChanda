package com.realtor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Employee;

public class EmployeeLoginBean {
	public static Employee login(String email, String password) {
		Session se = Config.config();
		Transaction tx = se.beginTransaction();
		Query qe = se.createQuery("from Employee e where e.email=:x and e.password=:y");
		qe.setParameter("x", email);
		qe.setParameter("y", password);
		List<Employee> li = qe.list();
		tx.commit();
		if (li.size() == 1) {
			Employee u = li.get(0);
			return u;
		}
		return null;
	}
}
