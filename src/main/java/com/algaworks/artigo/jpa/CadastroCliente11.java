package com.algaworks.artigo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.artigo.jpa.model.Cliente;

public class CadastroCliente11 {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Rei dos Tecidos");
		entityManager.persist(cliente);
		
		entityManager.getTransaction().begin();
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}
}
