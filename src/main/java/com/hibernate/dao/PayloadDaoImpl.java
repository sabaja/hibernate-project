package com.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.domain.Payload;

public class PayloadDaoImpl implements PayloadDao {

	public final static Logger logger = Logger.getLogger(PayloadDaoImpl.class);

	// Method Used To Create The Hibernate's SessionFactory Object
	public static SessionFactory getSessionFactory() {
		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, Service Registry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();

		// Creating Hibernate Session Factory Instance
		SessionFactory factoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return factoryObj;
	}

	@Override
	public Long save(Payload payload) {
		Session sessionObj = getSessionFactory().openSession();
		Transaction transObj = sessionObj.beginTransaction();
		sessionObj.save(payload);
		// Transaction Is Committed To Database
		transObj.commit();
		// Closing The Session Object
		sessionObj.close();
		logger.info("Successfully Created " + payload.toString());
		return payload.getId();
		
	}

	@Override
	public void updatePayload(Payload payload) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Payload> listPayloads() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payload> listPayloadsWithCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePaylod(Long id) {
		// TODO Auto-generated method stub

	}

}
