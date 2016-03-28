package Lanches.dao;

import javax.persistence.*;
import Lanches.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class AlunoDAO extends BasicDAO<String, Aluno> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 63364293l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public AlunoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de Aluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM Aluno entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Aluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Aluno findById(java.lang.String id){
      TypedQuery<Aluno> query = this.entityManager.createQuery("SELECT entity FROM Aluno entity WHERE entity.id = :id", Aluno.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }



  /**
   * NamedQuery list
   * @generated
   */
  public List<Aluno> list(int limit, int offset){
      return this.entityManager.createNamedQuery("alunoList", Aluno.class).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
}