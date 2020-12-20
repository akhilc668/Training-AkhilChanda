package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Plot;
import com.pojo.Sales;

public class SalesBean {

	public static boolean updateSales(Sales s, Plot p) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o=se.merge(s);
		if(o!=null) {
			Plot ps=(Plot)se.merge(p);
			tx.commit();
			if(ps!=null) {
				return true;
			}
		}
		return false;
	}

}
