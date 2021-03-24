package com.pico.dao;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GeneralDAO {

	private static final Logger log = LoggerFactory.getLogger(GeneralDAO.class.getName());
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public BigInteger queryCount() {
		Session session = null;
		if (entityManager == null
		    || (session = entityManager.unwrap(Session.class)) == null) {

		    throw new NullPointerException();
		}		
		
		NativeQuery query = session.createNativeQuery("select count(*) from member");		
		BigInteger result  = (BigInteger)query.getSingleResult();			
		return result;
	}
	
}
