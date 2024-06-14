package com.example.demo.teste.basico.muitospramuitos;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.muitospramuitos.Sobrinho;
import com.example.demo.modelo.base.muitospramuitos.Tio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoTioSobrinho {
    public static void main(String[] args) {
        SpringApplication.run(NovoTioSobrinho.class,args);
        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");

        Sobrinho sobrinha1 = new Sobrinho("Ana");
        Sobrinho sobrinho2 = new Sobrinho("Junior");

       tia1.getSobrinhos().add(sobrinha1);
       sobrinha1.getTios().add(tia1);
       tia1.getSobrinhos().add(sobrinho2);
       sobrinho2.getTios().add(tio2);

       tio2.getSobrinhos().add(sobrinha1);
       sobrinha1.getTios().add(tio2);
       tio2.getSobrinhos().add(sobrinho2);
       sobrinho2.getTios().add(tio2);

     DAO<Object> dao = new DAO<>();

     dao.abrirT().incluir(tia1).incluir(tio2).incluir(sobrinha1).incluir(sobrinho2).fecharT().fecharManager();


    }
}
