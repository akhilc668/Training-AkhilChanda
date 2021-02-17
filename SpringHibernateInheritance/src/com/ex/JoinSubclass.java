package com.ex;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class JoinSubclass {
	private HibernateTemplate hbTemplate;

	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}
	
	public void display() throws Exception {
		Session se =getHbTemplate().getSessionFactory().openSession();
		CreditCard cc = new CreditCard();
		cc.setId(101);
		cc.setAmount(10000);
		cc.setCardNo("1234567890123456");
		cc.setName("Akhil");
		cc.setCardType("Master");

		Cheque cq = new Cheque();
		cq.setId(102);
		cq.setAmount(150000);
		cq.setChequeNumber("1254||1346||1550");
		cq.setAccountNumber("65874963210212");
		cq.setChequeType("SBI");
		Transaction tx = se.beginTransaction();
		se.save(cc);
		se.save(cq);
		tx.commit();
		se.close();
	}
}
