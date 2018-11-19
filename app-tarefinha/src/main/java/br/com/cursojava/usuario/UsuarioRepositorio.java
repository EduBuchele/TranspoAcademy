package br.com.cursojava.usuario;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.cursojava.utils.CrudRepository;
import br.com.cursojava.utils.JPAUtil;

public class UsuarioRepositorio extends CrudRepository<Usuario> {

	
	public UsuarioRepositorio(Class<Usuario> usuario) {
		super(usuario);
	}

	public Usuario buscarPorNome(String nome) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Usuario> cQuery = builder.createQuery(Usuario.class);
		Root<Usuario> lista = cQuery.from(Usuario.class);
		cQuery.select(lista);
		cQuery.where(
				builder.like(lista.get("nome"), nome)
				);
		TypedQuery<Usuario> query = em.createQuery(cQuery);
		Usuario result = query.getSingleResult();
		return result;
	}

	


}
