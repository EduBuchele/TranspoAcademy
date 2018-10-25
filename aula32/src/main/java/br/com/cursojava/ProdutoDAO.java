package br.com.cursojava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProdutoDAO implements RepositorioProdutos {

	@Override
	public List<Produto> buscarTodos() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

		TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
		List<Produto> produtos = query.getResultList();

		em.close();

		return produtos;
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where upper(c.nome) like upper(:nome)",
				Produto.class);
		query.setParameter("nome", "%" + nome + "%");

		List<Produto> produtos = query.getResultList();
		em.close();

		return produtos;
	}

	@Override
	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where preco > :precoMin and preco < :precoMax)",
				Produto.class);
		query.setParameter("precoMin", minimo);
		query.setParameter("precoMax", maximo);

		List<Produto> produtos = query.getResultList();
		em.close();

		return produtos;

	}

	@Override
	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		if (id != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			produto = em.find(Produto.class, id);
			em.close();
		}
		return produto;
	}

	@Override
	public boolean inserir(Produto produto) {
		boolean resultado = false;
		if (produto != null && produto.getId() == null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			em.close();
			resultado = produto.getId() != null;
		}
		return resultado;
	}

	@Override
	public boolean atualizar(Produto produto) {
		boolean resultado = false;
		if (produto != null && produto.getId() != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(produto);
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
	public boolean remover(Integer id) {
		boolean resultado = false;
		if (id > 0) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.remove(em.find(Produto.class, id));
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
	public int contar() {

		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Long> query = em.createQuery("select count(*) from Produto", Long.class);
		int resultado = query.getSingleResult().intValue();
		em.close();
		return resultado;
	}

}
