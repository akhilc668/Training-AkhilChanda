package com.ex;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class PatientDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean savePatient(PatientBean pb) {
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		se.save(pb);
		tx.commit();
		se.close();
		return true;
	}

	public PatientBean patientLogin(String email, String password) {
		Session se=sessionFactory.openSession();
		Query qe= se.createQuery("from PatientBean p where p.email=:x and p.password=:y").setParameter("x", email).setParameter("y",password);
		List li =qe.list();
		se.close();
		if(li!=null)
			return (PatientBean) li.get(0);
		return null;
	}

	public PatientBean updatePatient(PatientBean register) {
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		PatientBean pb=(PatientBean)se.merge(register);
		tx.commit();
		se.close();
		return pb;
	}

	public boolean applyAppointment(AppointmentBean ab) {
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		se.save(ab);
		tx.commit();
		se.close();
		return true;
	}

	public List<AppointmentBean> appointmentStatus(PatientBean patient) {
		Session se=sessionFactory.openSession();
		Query qe= se.createQuery("from AppointmentBean a where a.patient = :x").setParameter("x", patient);
		List li =qe.list();
		return li;
	}
}
