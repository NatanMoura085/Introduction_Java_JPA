package com.example.demo.teste.basico.muitospramuitos;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.muitospramuitos.Ator;
import com.example.demo.modelo.base.muitospramuitos.Filme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoFilmeAtor {
    public static void main(String[] args) {
        SpringApplication.run(NovoFilmeAtor.class,args);

        Filme filmeA = new Filme("Paixão de Cristo",10.00);
        Filme filmeB = new Filme("Avengers",9.0);

        Ator atorA = new Ator("Mel Gibson");
        Ator atorB = new Ator("Robert Downey Jr");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atorB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<Filme>();

        dao.incluirAtomico(filmeA);



    }
}
