package br.com.cursojava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

public class TesteCriteria {
	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();

//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(c);
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}

//		Ordenação Ascendente
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = cb.createQuery(Cidade.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(c);
//		cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}
//
//		Condição Where

//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		cQuery.where(builder.equal(cidade.get("nome"), "Blumenau"));
//		// cQuery.orderBy(cb.asc(c.get("nome")));
//		
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();

//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome() + " Pop. "
//					+ cidades.getPopulacao());
//		}
		// Duas Condições
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		cQuery.where(
//				builder.gt(cidade.get("populacao"), 300000),
//				// gt = greaterThanOrEqualTo
//				builder.lt(cidade.get("populacao"), 400000)
//		// lt = lessThanOrEqualTo
//		);
//		// cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome() + " Pop. "
//					+ cidades.getPopulacao());
//		}
//		Select coluna 1 e 2
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Object[]> cQuery = cb.createQuery(Object[].class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(cb.array(c.get("nome"), c.get("populacao")));
//		// cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Object[]> query = em.createQuery(cQuery);
//		List<Object[]> results = query.getResultList();
//		for (Object[] cidades : results) {
//			System.out.println("Cidade: " + cidades[0] + " Pop.: " + cidades[1]);
//		}

		// max
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Integer> cQuery = cb.createQuery(Integer.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(cb.max(c.get("populacao")));
//		TypedQuery<Integer> query = em.createQuery(cQuery);
//		Integer results = query.getSingleResult();
//		System.out.println(results);

		// min
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Integer> cQuery = cb.createQuery(Integer.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(cb.min(c.get("populacao")));
//		TypedQuery<Integer> query = em.createQuery(cQuery);
//				Integer results = query.getSingleResult();
//				System.out.println(results);

		// count
//				CriteriaBuilder cb = em.getCriteriaBuilder();
//				CriteriaQuery<Long> cQuery = cb.createQuery(Long.class);
//				Root<Cidade> c = cQuery.from(Cidade.class);
//				cQuery.multiselect(cb.count(c.get("nome")));
//				TypedQuery<Long> query = em.createQuery(cQuery);
//				Long results = query.getSingleResult();
//				System.out.println(results);

		// AVG
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Double> cQuery = cb.createQuery(Double.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.multiselect(cb.avg(c.get("populacao")));
//		TypedQuery<Double> query = em.createQuery(cQuery);
//		double results = query.getSingleResult();
//		System.out.printf("%.2f", results);

		// JOIN
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		Fetch<Cidade, Estado> join = cidade.fetch("estado");
//		cQuery.select(cidade);
//
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}

//		 AND OR
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		cQuery.where(builder.and(
//				builder.gt(cidade.get("populacao"), 10),
//				//gt = greaterThanOrEqualTo
//				builder.equal(cidade.get("nome"), "Blumenau")
//				//lt = lessThanOrEqualTo
//				));
//		//cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}

		// LIKE
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		cQuery.where(
//				builder.like(cidade.get("nome"), "%u%")
//				);
//		//cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}

		// >
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		cQuery.where(
//				builder.gt(cidade.get("populacao"), 6000000)
//				);
////		cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome() +" Pop. "+ cidades.getPopulacao());
//		}
		class Result{
			Estado estado;
			Long soma;
			public Result() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Result(Estado estado, Long soma) {
				super();
				this.estado = estado;
				this.soma = soma;
			}
			
			
		}
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Result> cQuery = builder.createQuery(Result.class);
		Root<Cidade> cidade = cQuery.from(Cidade.class);
		cQuery.multiselect(cidade.get("estado"), builder.sum(cidade.get("populacao")));
		
		cQuery.groupBy(cidade.get("estado"));
		cQuery.orderBy(builder.asc(cidade.get("estado").get("id")));
		TypedQuery<Result> query = em.createQuery(cQuery);
		List<Result> results = query.getResultList();
		for (Result cidades : results) {
			System.out.println("Estado: " + cidades.estado + " Pop.: " + cidades.soma);
		}

	}
}
