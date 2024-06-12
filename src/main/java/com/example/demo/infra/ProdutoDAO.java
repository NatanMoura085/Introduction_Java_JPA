package com.example.demo.infra;

import com.example.demo.modelo.base.Produto;

public class ProdutoDAO extends DAO<Produto>{
    public ProdutoDAO(){
        super(Produto.class);
    }
}
