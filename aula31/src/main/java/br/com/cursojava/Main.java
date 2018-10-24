package br.com.cursojava;

import java.math.BigInteger;
import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

//		Pessoa p = new Pessoa(null,"Fernando");
		Pessoa p = entityManager.find(Pessoa.class, 5);

		System.out.println(p.getId());
		System.out.println(p.getNome());
		p.setNome("Tiburcio da Silva");
		
		Pessoa p2 = new Pessoa(4, "Ana Maria");
		entityManager.merge(p2);

		
		entityManager.persist(p);

		String sql = "select count(*) from pessoas";
		BigInteger result = (BigInteger) entityManager.createNativeQuery(sql).getSingleResult();

//		System.out.println(result.intValue());
		System.out.println(p2.getId());
		System.out.println(p2.getNome());
		entityManager.getTransaction().commit();
		entityManager.close();

		JPAUtil.shutdown();
		System.exit(0);

	}

}
