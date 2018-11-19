package br.com.cursojava.situacao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.cursojava.utils.CrudRepository;
import br.com.cursojava.utils.JPAUtil;

public class SituacaoRepositorio extends CrudRepository<Situacao> {

	public SituacaoRepositorio(Class<Situacao> classe) {
		super(classe);
	}

	public Situacao buscarPorNome(String nome, TipoSituacao tipo) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Situacao> cQuery = builder.createQuery(Situacao.class);
		Root<Situacao> lista = cQuery.from(Situacao.class);
		cQuery.select(lista);
		cQuery.where(
				builder.like(lista.get("nome"), nome),
				builder.equal(lista.get("tipo"), tipo)
				);
		TypedQuery<Situacao> query = em.createQuery(cQuery);
		Situacao result = query.getSingleResult();
		return result;
		
	}


}
