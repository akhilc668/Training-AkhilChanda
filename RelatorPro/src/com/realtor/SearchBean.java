package com.realtor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Plot;

public class SearchBean {

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
