package com.rishab.advhib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory getConnection() {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
	public static SessionFactory getNamedQuerySF() {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("NamedQuery.hbm.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
