package com.example.demo.modelo.base;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_produtos")
public class Produto {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="prod_nome",length = 40,nullable = true)
     private String nome;

    @Column(name="prod_preco",nullable = true,precision = 11)
    private Double preco;

 public Produto(){

 }


 public Produto(String nome, double preco){
     this.nome = nome;
     this.preco =preco;

 }

 public Long getId(){
     return id;
 }

 public String getNome(){
     return nome;
 }

 public Double getPreco(){
     return preco;
 }

 public void setId(Long id){
     this.id = id;
 }

 public void setNome(String nome){
     this.nome = nome;
 }

 public void setPreco(double preco){
     this.preco = preco;
 }


}
