package br.com.cursojava;

import javax.persistence.EntityManager;


public class PopulaBanco {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Estado e1 = new Estado(null, "Paraná", "PR");

		em.persist(e1);

		em.getTransaction().commit();
		em.close();

		JPAUtil.shutdown();
//		//estados
//		insert into estado (nome, sigla) values ('Paraná', 'PR'), ('São Paulo', 'SP'), ('Santa Catarina', 'SC'), ('Minas Gerais', 'MG'), ('Mato Grosso do Sul', 'MS');
//		 
//		//cidades
//		insert into cidade (nome, idEstado) values ('Loanda' , 1), ('Paranavaí' , 1), ('Curitiba' , 1), ('Maringá' , 1), ('Umuarama' , 1);
//		insert into cidade (nome, idEstado) values ('São Paulo' , 2), ('Barueri' , 2), ('Osasco' , 2), ('Sorocoba' , 2);
//		insert into cidade (nome, idEstado) values ('Florianópolis' , 3), ('Blumenau' , 3);
//		insert into cidade (nome, idEstado) values ('Belo Horizonte' , 4), ('Uberlândia' , 4), ('Sete Lagoas', 4);
//		insert into cidade (nome, idEstado) values ('Campo Grande' , 5), ('Ponta Porã' , 5), ('Dourados', 5);

	}
}
