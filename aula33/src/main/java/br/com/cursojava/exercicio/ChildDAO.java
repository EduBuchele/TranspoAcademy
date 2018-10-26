package br.com.cursojava.exercicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import aula33.JPAUtil;

public class ChildDAO  {

	public List<Child> buscarTodos() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

		TypedQuery<Child> query = em.createQuery("from Child order by id", Child.class);
		List<Child> child = query.getResultList();

		em.close();

		return child;
	}

	
	public List<Child> buscarPorNome(String nome) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Child> query = em.createQuery("from Child c where upper(c.nome) like upper(:nome)",
				Child.class);
		query.setParameter("nome", "%" + nome + "%");

		List<Child> childs = query.getResultList();
		em.close();

		return childs;
	}


	
	public Child buscarPorId(Integer id) {
		Child child = null;
		if (id != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			child = em.find(Child.class, id);
			em.close();
		}
		return child;
	}


	public boolean inserir(Child child) {
		boolean resultado = false;
		if (child != null && child.getId() == null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(child);
			em.getTransaction().commit();
			em.close();
			resultado = child.getId() != null;
		}
		return resultado;
	}


	public boolean atualizar(Child child) {
		boolean resultado = false;
		if (child != null && child.getId() != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(child);
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

	}


	public boolean remover(Integer id) {
		boolean resultado = false;
		if (id > 0) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.remove(em.find(Child.class, id));
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

	}


	public int contar() {

		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Long> query = em.createQuery("select count(*) from Child", Long.class);
		int resultado = query.getSingleResult().intValue();
		em.close();
		return resultado;
	}

}
