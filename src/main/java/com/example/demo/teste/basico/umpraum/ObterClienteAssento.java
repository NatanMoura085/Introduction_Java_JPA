package com.example.demo.teste.basico.umpraum;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.umpraum.Assento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObterClienteAssento {
    public static void main(String[] args) {
        SpringApplication.run(ObterClienteAssento.class,args);

        DAO<Assento> assentoDAO = new DAO<>(Assento.class);

        Assento assento3 = assentoDAO.obterPorId(3L);

        System.out.print(assento3.getClienteNome());

        assentoDAO.fecharManager();

    }
}
