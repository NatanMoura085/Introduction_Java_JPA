package com.example.demo.teste.basico;

import com.example.demo.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObterUsuario {
    public static void main(String[] args) {
        SpringApplication.run(ObterUsuario.class,args);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
        EntityManager em = emf.createEntityManager();
       Usuario usuario =  em.find(Usuario.class,3L);

       System.out.print(usuario.getNome());


        emf.close();
        em.close();
    }
}
