package com.example.demo.teste.basico;

import com.example.demo.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlteraUsuario2 {
    public static void main(String[] args) {
        SpringApplication.run(AlteraUsuario2.class,args);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario =  em.find(Usuario.class,2L);
        usuario.setNome("ronaldo");
        //em.merge(usuario);

        em.getTransaction().commit();


        emf.close();
        emf.close();
    }
}
