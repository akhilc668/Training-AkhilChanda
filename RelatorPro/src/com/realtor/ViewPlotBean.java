package com.realtor;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Plot;

public class ViewPlotBean {
	public static List<Plot> view(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Plot p");
		List<Plot> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return li;
		}
		return null;
		
	}
	
	public static Plot getById(int id) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Plot p=(Plot) se.load("com.pojo.Plot", id);
		tx.commit();
		if(p!=null) {
			return p;
		}
		return null;
	}
	
	public static List<Plot> viewByStatus(String status){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Plot p where p.status=:x");
		qe.setParameter("x", status);
		List<Plot> li=qe.list();
		tx.commit();
		if(li!=null) {
			return li;
		}
		return null;
	}
	
	public static List<Plot> search(String address,String venture) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Plot p where (p.address=:x and p.status=:y) or (p.venture=:z and p.status=:y)");
		qe.setParameter("x", address);
		qe.setParameter("y", "vacant");
		qe.setParameter("z", venture);
		List<Plot> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return li;
		}
		return null;
	}
}
