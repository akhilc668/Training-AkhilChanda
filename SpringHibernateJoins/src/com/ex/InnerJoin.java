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

public class InnerJoin {
	private HibernateTemplate hbTemplate;

	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}

	public void showInnerJoin() {
		
		List<?> li=getHbTemplate().find("from Vendor v INNER Join v.customer c");
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Object[] o=(Object[])i.next();
			Vendor v=(Vendor)o[0];
			Customer c=(Customer)o[1];
			System.out.println(v.getId()+" "+v.getName()+" "+c.getId()+" "+c.getName());
		}
	}

}
