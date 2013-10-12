package br.com.estatistica.dao.impl;



import javax.persistence.EntityManager;

import br.com.estatistica.dao.DAO;

public class DAOImpl<T, K> implements DAO<T, K> {

	private EntityManager em;

	private Class<T> entityClass;

	@SuppressWarnings("all")
	public DAOImpl(Class<T> entityClas, EntityManager em) {
		this.em = em;
		this.entityClass = entityClas;
	}

	@Override
	public void insert(T entity) {
		entity = em.merge(entity);
		em.persist(entity);

	}

	@Override
	public void removeById(K id) {
		T entity = em.find(entityClass, id);
		em.remove(entity);
	}

	@Override
	public void remove(T entity) {
		em.merge(entity);
		em.remove(entity);
	}

	@Override
	public T searchByID(K id) {
		return em.find(this.entityClass, id);
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
	}

}
