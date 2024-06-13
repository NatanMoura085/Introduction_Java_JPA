package com.example.demo.modelo.base.umpraum;


import jakarta.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;
    public Assento() {

    }

    public Assento(String nome) {
        super();
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getClienteNome(){
        return "Cliente:" + this.cliente.getNome() + "\n" +  "Assento: " + this.getNome() + "\n";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
