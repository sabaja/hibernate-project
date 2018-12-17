package com.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.configuration.HibernateUtil;
import com.hibernate.domain.Payload;

public class PayloadDaoImpl implements PayloadDao {

	public final static Logger logger = Logger.getLogger(PayloadDaoImpl.class);

	

	@Override
	public Long save(Payload payload) {
		Session sessionObj = HibernateUtil.getSessionFactory().getCurrentSession();
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
