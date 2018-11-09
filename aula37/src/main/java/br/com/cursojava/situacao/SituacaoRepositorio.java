package br.com.cursojava.situacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.cursojava.util.CrudRepository;
import br.com.cursojava.util.JPAUtil;



public class SituacaoRepositorio implements CrudRepository<Situacao> {

	@Override
	public boolean inserir(Situacao situacao) {
		boolean resultado = false;
		if (situacao != null && situacao.getId() == null){
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(situacao);
			em.getTransaction().commit();
			em.close();
			resultado = situacao.getId() != null;
		}
		return resultado;
	}

	@Override
	public boolean atualizar(Situacao situacao) {
		boolean resultado = false;
		if (situacao != null && situacao.getId() != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(situacao);
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

	@Override
	public boolean remover(int id) {
		boolean resultado = false;
		if (id != 0){
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			Situacao situacao = em.find(Situacao.class, id);
			em.remove(situacao);
			em.getTransaction().commit();
			em.close();
			resultado = true;
		}
		return resultado;
	}

	@Override
	public List<Situacao> buscarTodos() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Situacao> cQuery = builder.createQuery(Situacao.class);
		Root<Situacao> situacoes = cQuery.from(Situacao.class);
		cQuery.select(situacoes);
		TypedQuery<Situacao> query = em.createQuery(cQuery);
		List<Situacao> results = query.getResultList();
		return results;
	}

	@Override
	public Situacao buscarPorId(int id) {
		if (id >= 0) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Situacao> cQuery = builder.createQuery(Situacao.class);
			Root<Situacao> situacoes = cQuery.from(Situacao.class);
			cQuery.select(situacoes);
			cQuery.where(builder.equal(situacoes.get("id"), id));
			TypedQuery<Situacao> query = em.createQuery(cQuery);
			Situacao result = query.getSingleResult();
			return result;
		} else {
			return null;
		}
	}

	@Override
	public long contar() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Long> queryCCount = cb.createQuery(Long.class);
		queryCCount.select(cb.count(queryCCount.from(Situacao.class)));
		Query queryCCountFinal = em.createQuery(queryCCount);
		Long resultado = (Long) queryCCountFinal.getSingleResult();
		return resultado;
	}

}
