package com.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class LeftJoin {
	private HibernateTemplate hbTemplate;

	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}

	public void getLeftJoin() {
		
		Session se=getHbTemplate().getSessionFactory().openSession();
		
		Query q=se.createQuery("from Vendor v Left Join v.customer c");
		List<Object[]> li=q.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Object[] o=(Object[])i.next();
			Vendor v=(Vendor)o[0];
			Customer c=(Customer)o[1];
			if(c!=null)
				System.out.println(v.getId()+" "+v.getName()+" "+c.getId()+" "+c.getName());
			else
				System.out.println(v.getId()+" "+v.getName()+" "+" null null");
		}
		
		se.close();
	}

}
