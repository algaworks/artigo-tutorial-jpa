package com.algaworks.artigo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.artigo.jpa.model.Cliente;

public class CadastroCliente05 {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);

		entityManager.getTransaction().begin();
		cliente.setNome("Autopeças Rodovia");
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}

}
