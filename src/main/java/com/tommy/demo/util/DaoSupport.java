package com.tommy.demo.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DaoSupport {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {

		return this.sessionFactory;

	}

}
