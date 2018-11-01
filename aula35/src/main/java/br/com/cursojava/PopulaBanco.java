package br.com.cursojava;

import javax.persistence.EntityManager;


public class PopulaBanco {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Estado e1 = new Estado(null, "Paran�", "PR");

		em.persist(e1);

		em.getTransaction().commit();
		em.close();

		JPAUtil.shutdown();
//		//estados
//		insert into estado (nome, sigla) values ('Paran�', 'PR'), ('S�o Paulo', 'SP'), ('Santa Catarina', 'SC'), ('Minas Gerais', 'MG'), ('Mato Grosso do Sul', 'MS');
//		 
//		//cidades
//		insert into cidade (nome, idEstado) values ('Loanda' , 1), ('Paranava�' , 1), ('Curitiba' , 1), ('Maring�' , 1), ('Umuarama' , 1);
//		insert into cidade (nome, idEstado) values ('S�o Paulo' , 2), ('Barueri' , 2), ('Osasco' , 2), ('Sorocoba' , 2);
//		insert into cidade (nome, idEstado) values ('Florian�polis' , 3), ('Blumenau' , 3);
//		insert into cidade (nome, idEstado) values ('Belo Horizonte' , 4), ('Uberl�ndia' , 4), ('Sete Lagoas', 4);
//		insert into cidade (nome, idEstado) values ('Campo Grande' , 5), ('Ponta Por�' , 5), ('Dourados', 5);

	}
}
