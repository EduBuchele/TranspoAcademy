package br.com.projetoCurso.dao;


import java.util.List;

import javax.persistence.EntityManager;

import br.com.projetoCurso.model.Professor;

public class DAO<T> {

	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}

	public void adiciona(T t) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	public void remove(T t) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		em.remove(em.merge(t));

		em.getTransaction().commit();
		em.close();
	}

	public void atualiza(T t) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		em.merge(t);

		em.getTransaction().commit();
		em.close();
	}

	public List<T> listaTodosCurso() {
		EntityManager em = new JPAUtil().getEntityManager();

		List<T> listaUm = em.createQuery("select distinct(n) from Curso n order by id").getResultList();

		em.close();
		return listaUm;
	}
	public List<Professor> listaTodosProfessor() {
		EntityManager em = new JPAUtil().getEntityManager();

		List<T> lista = em.createQuery("select distinct(n) from Professor n order by id").getResultList();

		em.close();
		return (List<Professor>) lista;
	}


	
	public T buscaPorId(Integer id) {
		EntityManager em = new JPAUtil().getEntityManager();
		T instancia = em.find(classe, id);
		em.close();
		return instancia;
	}

	public int contaTodos() {
		EntityManager em = new JPAUtil().getEntityManager();
		long result = (Long) em.createQuery("select count(n) from curso n").getSingleResult();
		em.close();

		return (int) result;
	}

}
