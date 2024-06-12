package com.example.demo.teste.basico.umpraum;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.umpraum.Assento;
import com.example.demo.modelo.base.umpraum.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoCliente1Assento {
    public static void main(String[] args) {
        Assento assento = new Assento("8F");
        Cliente cliente = new Cliente("Natan",assento);
        SpringApplication.run(NovoCliente1Assento.class,args);
        DAO<Object> clienteDAO = new DAO<>();

        clienteDAO.incluirAtomico(cliente);
    }
}
