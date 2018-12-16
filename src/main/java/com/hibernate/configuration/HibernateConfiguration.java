package com.hibernate.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfiguration {

	private static  Properties properties;
	private static File file;
	public final static Logger logger = Logger.getLogger(HibernateConfiguration.class);

	static{
		file = new File("hibernate.properties");
		properties = new Properties();
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public HibernateConfiguration() {
		super();
	org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
	config.setProperties(properties);
	}

	
	public static SessionFactory getSessionFactory() {
		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, Service Registry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 

		// Creating Hibernate Session Factory Instance
		SessionFactory factoryObj = configObj.buildSessionFactory(serviceRegistryObj);		
		return factoryObj;
	}
}
