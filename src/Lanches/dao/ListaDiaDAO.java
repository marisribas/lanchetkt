package Lanches.dao;

import javax.persistence.*;
import Lanches.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class ListaDiaDAO extends BasicDAO<String, ListaDia> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1410646455l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public ListaDiaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de ListaDia utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM ListaDia entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de ListaDia utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public ListaDia findById(java.lang.String id){
      TypedQuery<ListaDia> query = this.entityManager.createQuery("SELECT entity FROM ListaDia entity WHERE entity.id = :id", ListaDia.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }



  /**
   * NamedQuery list
   * @generated
   */
  public List<ListaDia> list(int limit, int offset){
      return this.entityManager.createNamedQuery("listaDiaList", ListaDia.class).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
}