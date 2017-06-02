package edu.fatec.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import edu.fatec.model.Nota;

public class GenericDAOImpl <T>  implements GenericDAO <T> {
	
	private EntityManager em;
	
	
	public GenericDAOImpl() {
		this(null, null);
	}
	
	@Inject
	public GenericDAOImpl(EntityManager em, Nota n) {
		System.out.println(em);
		System.out.println(n);
		this.em = em;
	}

	@Override
	public void persist(T object) {
		em.persist(object);
		em.flush();
	}

	@Override
	public void refresh(T object) {
		em.refresh(object);
		em.flush();
	}

	@Override
	public void remove(T object) {
		em.remove(object);
		em.flush();
	}

	@Override
	public T find(Class<T> clazz, long id) {
		return em.find(clazz, id);
	}

}
