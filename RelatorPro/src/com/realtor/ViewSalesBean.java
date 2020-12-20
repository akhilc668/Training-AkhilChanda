package com.realtor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Plot;
import com.pojo.Sales;

public class ViewSalesBean {
	public static List<Sales> viewSales(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Sales s");
		List<Sales> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return li;
		}
		return null;
	}
	
	public static Sales getById(int id) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Sales p=(Sales) se.load("com.pojo.Sales", id);
		tx.commit();
		if(p!=null) {
			return p;
		}
		return null;
	}
	
	public static List<Sales> viewSalesByUser(int uid){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("from Sales s where s.uid=:x");
		qe.setParameter("x", uid);
		List<Sales> li=qe.list();
		tx.commit();
		if(!li.isEmpty()) {
			return li;
		}
		return null;
	}
}
