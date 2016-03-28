package Lanches.dao;

import javax.persistence.*;
import Lanches.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class SerieDAO extends BasicDAO<String, Serie> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 79776119l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public SerieDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de Serie utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM Serie entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Serie utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Serie findById(java.lang.String id){
      TypedQuery<Serie> query = this.entityManager.createQuery("SELECT entity FROM Serie entity WHERE entity.id = :id", Serie.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Aluno> findAluno(java.lang.String id, int limit, int offset) {
      TypedQuery<Aluno> query = this.entityManager.createQuery("SELECT entity FROM Aluno entity WHERE entity.serie.id = :id", Aluno.class);
      query.setParameter("id", id);

      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }


  /**
   * NamedQuery list
   * @generated
   */
  public List<Serie> list(int limit, int offset){
      return this.entityManager.createNamedQuery("serieList", Serie.class).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
}