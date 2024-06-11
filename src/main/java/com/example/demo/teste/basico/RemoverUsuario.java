package com.example.demo.teste.basico;

import com.example.demo.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoverUsuario {
    public static void main(String[] args) {
        SpringApplication.run(RemoverUsuario.class,args);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class,4L);

        if (usuario !=null){
            em.getTransaction().begin();
            em.remove(usuario);


            em.getTransaction().commit();
        }



        emf.close();
        em.close();
    }
}
