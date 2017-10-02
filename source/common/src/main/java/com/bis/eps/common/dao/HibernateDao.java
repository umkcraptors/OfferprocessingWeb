package com.bis.eps.common.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.common.entity.IEntity;

public class HibernateDao<T extends IEntity, I> implements IDao<T, I> {

	@Autowired
	private SessionFactory sessionFactory;

	protected Class<T> entityClass;


	public HibernateDao(Class<T> entityClass) {

		this.entityClass = entityClass;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly = true)
	public List<T> findAll() {

		return null;
	}


	@Transactional(readOnly = true)
	public T find(I id) {

		return null;
	}


	@Transactional
	public T save(T entity) {

		return null;
	}


	@Transactional
	public void delete(I id) {

		if (id == null) {
			return;
		}

		T entity = this.find(id);
		if (entity == null) {
			return;
		}

		
	}

}

