package br.com.cursojava.tarefa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.cursojava.utils.CrudRepository;
import br.com.cursojava.utils.JPAUtil;

public class TarefaRepositorio extends CrudRepository<Tarefa> {

	public TarefaRepositorio(Class<Tarefa> classe) {
		super(classe);
	}
	

	public long contarPorCategoria(String categoria) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Long> cQuery = builder.createQuery(Long.class);
		Root<Tarefa> lista = cQuery.from(Tarefa.class);
		cQuery.multiselect(builder.count(lista));
		cQuery.where(builder.like(lista.get("situacao").get("nome"), categoria));
		TypedQuery<Long> query = em.createQuery(cQuery);
		Long results = query.getSingleResult();
		return results;

	}

	public List<Tarefa> carregarTarefasCat(String categoria) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Tarefa> cQuery =builder.createQuery(Tarefa.class);
		Root<Tarefa> lista = cQuery.from(Tarefa.class);
		cQuery.select(lista);
		cQuery.distinct(true);
		cQuery.where(builder.like(lista.get("situacao").get("nome"), categoria));
		TypedQuery<Tarefa> query = em.createQuery(cQuery);
		List<Tarefa> results = query.getResultList();
		return results;
	
	}

	

}
