package com.realtor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Employee;

public class EmployeeBean {
	public static List<Employee> viewEmployee(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Employee e");
		List<Employee> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return li;
		}
		return null;
	}
	
	public static Employee getById(int id) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Employee p=(Employee) se.load("com.pojo.Employee", id);
		tx.commit();
		if(p!=null) {
			return p;
		}
		return null;
	}
	
	public static List<Employee> search(String address) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Employee e where e.address=:x");
		qe.setParameter("x", address);
		List<Employee> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return li;
		}
		return null;
	}
}
