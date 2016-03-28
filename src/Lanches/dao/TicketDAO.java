package Lanches.dao;

import javax.persistence.*;
import Lanches.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class TicketDAO extends BasicDAO<String, Ticket> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1790091448l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public TicketDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de Ticket utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM Ticket entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Ticket utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Ticket findById(java.lang.String id){
      TypedQuery<Ticket> query = this.entityManager.createQuery("SELECT entity FROM Ticket entity WHERE entity.id = :id", Ticket.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }



  /**
   * NamedQuery list
   * @generated
   */
  public List<Ticket> list(int limit, int offset){
      return this.entityManager.createNamedQuery("ticketList", Ticket.class).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
}