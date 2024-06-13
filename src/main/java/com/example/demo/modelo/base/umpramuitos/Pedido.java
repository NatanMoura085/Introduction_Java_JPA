package com.example.demo.modelo.base.umpramuitos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date date;

    public Pedido(){
    this(new Date());
    }


    public Pedido(Date date){
        super();
        this.date = date;
    }


    public Long getId(){
        return id;
    }

    public Date getDate(){
        return date;
    }

    public void setId(Long id){
        this.id =id;
    }

    public void setDate(Date date){
        this.date =date;
    }
}
