package com.example.demo.teste.basico.umpramuitos;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.Produto;
import com.example.demo.modelo.base.umpramuitos.ItemPedido;
import com.example.demo.modelo.base.umpramuitos.Pedido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoPedido {
    public static void main(String[] args) {
        SpringApplication.run(NovoPedido.class,args);
        DAO<Object> dao =new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira",20.000);
        ItemPedido itemPedido = new ItemPedido(pedido,produto,10);

        dao.abrirT().incluir(produto).incluir(pedido).incluir(itemPedido).fecharT().fecharManager();
    }
}
