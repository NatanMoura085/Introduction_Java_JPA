package com.example.demo.infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO<E>{
  private static final Logger  logger = Logger.getLogger(DAO.class.getName());
  private static EntityManagerFactory emf;
  private EntityManager em;
  private Class<E> classe;

  static{
    try{
      emf = Persistence.createEntityManagerFactory("curso_java");
    }catch(Exception e){
      logger.log(Level.SEVERE, "Erro ao criar EntityManagerFactory", e);

    }
  }
  public DAO(){
    this(null);
  }

  public DAO(Class<E>classe){
    if (emf == null) {
      throw new IllegalStateException("EntityManagerFactory não foi inicializada.");
    }
    this.classe = classe;
    em = emf.createEntityManager();
  }


  public DAO<E> abrirT(){
    em.getTransaction().begin();
    return this;
  }

  public DAO<E> fecharT(){
    em.getTransaction().commit();
    return this;
  }

  public DAO<E> incluir(E entidade){
    em.persist(entidade);
    return this;
  }

  public DAO<E> incluirAtomico(E entidade){
    return this.abrirT().incluir(entidade).fecharT();
  }

  public E obterPorId(Object id){
    return em.find(classe,id);
  }


  public List<E> obterTodos(){
    return this.obterTodos(10,0);
  }

  public List<E> obterTodos(int qtde, int deslocamento){
    if (classe == null){
      throw new UnsupportedOperationException("Classe nula");
    }
    String jpql = "select e from " + classe.getName() + " e";

    TypedQuery<E> query = em.createQuery(jpql,classe);
    query.setMaxResults(qtde);
    query.setFirstResult(deslocamento);

    return query.getResultList();

  }

  public void fecharManager(){
    em.close();
  }
}
