package aula34;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

public class TesteTarefa {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
//		
//		Tarefa t1 = new Tarefa();
//		t1.setTitulo("Minha primeira Tarefa");
//		t1.setStatus(StatusTarefa.NOVA);
//		t1.setCriadoEm(new Date());
//		t1.setAtualizadoEm(new Date());
//		em.persist(t1);
			
		Tarefa t2 = new Tarefa(null,"Tarefa muito dificil2", StatusTarefa.COM_PROBLEMAS, new Date(), new Date());
		Usuario u = new Usuario();
		u.setNome("Tiburcio Brasil");
		u.setEmail("tibu@teste.com");
		u.setTarefas(Arrays.asList(t2));
		t2.setUsuario(u);
		Set<PerfilUsuario> perfis = new HashSet<>();
		perfis.add(PerfilUsuario.BAGRINHO);
		perfis.add(PerfilUsuario.ADMIN);
		perfis.add(PerfilUsuario.MANAGER);
		u.setPerfis(perfis);
		
		
		em.persist(u);
	
			
			
			
		em.getTransaction().commit();
		em.close();
		
		JPAUtil.shutdown();
		
		
	}
	
}
