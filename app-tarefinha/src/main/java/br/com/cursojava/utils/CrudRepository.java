package br.com.cursojava.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CrudRepository<T> {

	private final Class<T> classe;

	public CrudRepository(Class<T> classe) {
		this.classe = classe;
	}

	public boolean inserir(T t) {
		boolean resultado = false;
		if (t != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
			resultado = em.contains(t);
			em.close();
		}
		return resultado;
	}

	public boolean atualizar(T t) {
		boolean resultado = false;

		if (t != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(t);
				em.getTransaction().commit();
				em.close();
				resultado = true;
			} catch (Exception e) {
				if (em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}
			}
		}
		return resultado;

	};

	public boolean remover(Integer id) {
		boolean resultado = false;
		if (id >= 0) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.remove(em.find(classe, id));
				em.getTransaction().commit();
				em.close();
				resultado = true;
			} catch (Exception e) {
				if (em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}

			}
		}
		return resultado;
	};

	public List<T> buscarTodos() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> cQuery = (CriteriaQuery<T>) builder.createQuery(classe);
		Root<T> lista = cQuery.from(classe);
		cQuery.select(lista);
		TypedQuery<T> query = em.createQuery(cQuery);
		List<T> results = query.getResultList();
		return results;
	};

	public T buscarPorId(int id) {
		if (id >= 0) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<T> cQuery = builder.createQuery(classe);
			Root<T> lista = cQuery.from(classe);
			cQuery.select(lista);
			cQuery.where(builder.equal(lista.get("id"), id));
			TypedQuery<T> query = em.createQuery(cQuery);
			T result = query.getSingleResult();
			return result;
		} else {
			return null;
		}
	};

	public long contar() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Long> cQuery = builder.createQuery(Long.class);
		Root<T> lista = cQuery.from(classe);
		cQuery.multiselect(builder.count(lista));
		TypedQuery<Long> query = em.createQuery(cQuery);
		Long results = query.getSingleResult();
		return results;

	}



}
