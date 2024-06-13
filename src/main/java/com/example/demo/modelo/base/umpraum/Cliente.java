package com.example.demo.modelo.base.umpraum;


import jakarta.persistence.*;

@Entity
@Table(name="clients")
public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;


    public Cliente(){

    }
    public Cliente(String nome, Assento assento){
        super();
        this.nome = nome;
        this.assento = assento;

    }


    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }



    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;

    }
}
