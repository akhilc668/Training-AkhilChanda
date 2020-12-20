package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Sales;

public class BuyPlotBean {
	public static boolean buy(Sales s) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.save(s);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}
}
