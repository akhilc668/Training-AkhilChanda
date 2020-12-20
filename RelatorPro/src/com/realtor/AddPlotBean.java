package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Plot;

public class AddPlotBean {

	public static boolean add(Plot p) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.save(p);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}

}
