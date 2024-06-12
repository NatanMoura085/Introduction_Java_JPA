package com.example.demo.teste.basico;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoProduto {
    public static void main(String[] args) {
        SpringApplication.run(NovoProduto.class,args);
        Produto produto = new Produto("Celular",1400);

        DAO<Produto> dao = new DAO<>(Produto.class);

        dao.incluirAtomico(produto);

        System.out.print("esse e id" + produto.getId());

    }
}
