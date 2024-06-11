package com.example.demo.teste.basico;

import com.example.demo.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlteraUsuario1 {
    public static void main(String[] args) {
        SpringApplication.run(AlteraUsuario1.class,args);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,3L);
        usuario.setNome("mayko");
        em.merge(usuario);



        em.getTransaction().commit();

        emf.close();
        em.close();

    }
}
