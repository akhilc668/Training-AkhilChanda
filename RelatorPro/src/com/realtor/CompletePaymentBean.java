package com.realtor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Sales;

public class CompletePaymentBean {

	public static boolean updateSales(Sales s) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Sales sa=(Sales)se.merge(s);
		tx.commit();
		if(sa!=null) {
			return true;
		}
		return false;
	}

}
