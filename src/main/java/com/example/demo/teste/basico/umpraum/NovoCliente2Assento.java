package com.example.demo.teste.basico.umpraum;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.umpraum.Assento;
import com.example.demo.modelo.base.umpraum.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoCliente2Assento {
    public static void main(String[] args) {
        SpringApplication.run(NovoCliente2Assento.class,args);
        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Ronaldo",assento);

        DAO<Cliente> clienteDAO = new DAO<>(Cliente.class);

        clienteDAO.incluirAtomico(cliente);

    }
}
