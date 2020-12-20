package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Plot;

public class UpdatePlotBean {

	public static boolean update(Plot p) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.merge(p);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}

}
