package com.example.demo.teste.basico;

import com.example.demo.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ObterUsuarios {
    public static void main(String[] args) {
        SpringApplication.run(ObterUsuario.class,args);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso_java");
        EntityManager em = emf.createEntityManager();
        String jpql = "select u from Usuario u ";

        TypedQuery<Usuario> query = em.createQuery(jpql,Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();


        for(Usuario usuario: usuarios){
            System.out.print(usuario.getId() + "" + usuario.getNome() + " " + usuario.getEmail());
        }



        emf.close();
        em.close();
    }
}
