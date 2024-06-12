package com.example.demo.teste.basico;

import com.example.demo.infra.ProdutoDAO;
import com.example.demo.modelo.base.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class obterTodosProdutos {
    public static void main(String[] args) {
        SpringApplication.run(obterTodosProdutos.class,args);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> produtoList = produtoDAO.obterTodos();

        for (Produto produto:produtoList){
            System.out.print("ID do produto" +  produto.getId() + "\n" + produto.getNome() + "\n");
        }

        double preçoTotal = produtoList.stream().map(p->p.getPreco()).reduce(0.0,(t,p)->t+p).doubleValue();
        System.out.print("Total do preço dos produtos e:" + preçoTotal + " ");
    }
}
