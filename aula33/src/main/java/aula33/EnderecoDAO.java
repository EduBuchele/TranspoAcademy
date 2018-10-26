package aula33;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class EnderecoDAO  {


	public List<Endereco> buscarTodos() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

		TypedQuery<Endereco> query = em.createQuery("from enderecos", Endereco.class);
		List<Endereco> produtos = query.getResultList();

		em.close();

		return produtos;
	}

	
	public List<Endereco> buscarPorNome(String nome) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Endereco> query = em.createQuery("from enderecos c where upper(c.nome) like upper(:nome)",
				Endereco.class);
		query.setParameter("nome", "%" + nome + "%");

		List<Endereco> produtos = query.getResultList();
		em.close();

		return produtos;
	}


	
	public Endereco buscarPorId(Integer id) {
		Endereco produto = null;
		if (id != null) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			produto = em.find(Endereco.class, id);
			em.close();
		}
		return produto;
	}


	public boolean inserir(Endereco produto) {
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


	public boolean atualizar(Endereco produto) {
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


	public boolean remover(Integer id) {
		boolean resultado = false;
		if (id > 0) {
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.remove(em.find(Funcionario.class, id));
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
		TypedQuery<Long> query = em.createQuery("select count(*) from enderecos", Long.class);
		int resultado = query.getSingleResult().intValue();
		em.close();
		return resultado;
	}

}
