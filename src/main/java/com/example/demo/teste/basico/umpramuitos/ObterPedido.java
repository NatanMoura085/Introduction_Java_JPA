package com.example.demo.teste.basico.umpramuitos;


import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.umpramuitos.ItemPedido;
import com.example.demo.modelo.base.umpramuitos.Pedido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObterPedido {
    public static void main(String[] args) {
        SpringApplication.run(ObterPedido.class,args);
        DAO<Pedido> dao = new DAO<>(Pedido.class);
        Pedido result = dao.obterPorId(1L);

        for (ItemPedido pedido:result.getItens()){
            System.out.print(pedido.getQuantidade());
            System.out.print(pedido.getProduto().getNome());
        }

        dao.fecharManager();

    }
}
