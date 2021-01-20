package com.motivity1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		/*
		 * CreditCard cc=new CreditCard(); cc.setId(101); cc.setAmount(10000);
		 * cc.setCardNo("1234567890123456"); cc.setName("Akhil");
		 * cc.setCardType("Master");
		 */
		
		Cheque1 cq=new Cheque1();
		cq.setId(102);
		cq.setAmount(150000);
		cq.setChequeNumber("1254||1346||1550");
		cq.setAccountNumber("65874963210212");
		cq.setChequeType("SBI");
		Transaction tx=se.beginTransaction();
		//se.save(cc);
		se.save(cq);
		tx.commit();
		se.close();
		sf.close();
	}

}
