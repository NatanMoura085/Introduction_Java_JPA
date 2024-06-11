package com.example.demo;

import com.example.demo.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("naiki", "naikimairca@gmail.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
