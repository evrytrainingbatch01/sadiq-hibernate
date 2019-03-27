package com.evry.hibernatejsp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.evry.hibernatejsp.dto.Patient;

public class ParentDAO {
	
	public static Patient saveData(Patient patient) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(patient);
		session.getTransaction().commit();
		return patient;
		
	}

}
