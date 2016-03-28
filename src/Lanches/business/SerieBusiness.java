package Lanches.business;

import Lanches.dao.*;
import Lanches.entity.*;
import Lanches.dao.*;

import java.util.*;

/**
 * Classe que representa a camada de negócios de Serie
 * @generated
 **/
public class SerieBusiness {

  /**
   * Instância da classe SerieDAO que faz o acesso ao banco de dados
   * @generated
   */
  private SerieDAO dao;
  
  /**
   * Singleton de sessão usado para abrir e fechar conexão com o banco de dados
   * @generated
   */
  protected SessionManager sessionManager;
	
  /**
   * Copia referência da sessão e instancia DAO relacionada à essa classe para manipular o banco de dados
   * 
   * @param sessionmanager
   *          Singleton de sessão
   * @generated modifiable
   */
  public SerieBusiness(final SessionManager sessionmanager) {
    // begin-user-code
    // end-user-code
    this.sessionManager = sessionmanager;
    this.dao = new SerieDAO(sessionmanager.getEntityManager());
    // begin-user-code
    // end-user-code
  }
  
  /**
   * Construtor padrão, inicializa singleton de sessão
   * @generated modifiable   
   */
  public SerieBusiness() {
    // begin-user-code
    // end-user-code  
    this(SessionManager.getInstance());
    // begin-user-code
    // end-user-code    
  }	

  /**
   * Grava valor no banco
   * 
   * @param entity Linha da tabela a ser persistida no banco de dados
   * @generated modifiable   
   */
  public void save(final Serie entity) {
    // begin-user-code
    // end-user-code  
    dao.save(entity);
    // begin-user-code
    // end-user-code    
  }
  
  /**
   * Dá um refresh na entidade com valores valor no banco
   * 
   * @param entity Entidade
   * @generated modifiable
   */
  public void refresh(final Serie entity) {
    // begin-user-code
    // end-user-code  
    dao.refresh(entity);
    // begin-user-code
    // end-user-code  
  }  
  
  /**
   * Atualiza valor do banco
   * 
   * @param entity Linha da tabela a ser atualizada
   * @generated modifiable   
   */
  public Serie update(final Serie entity) {
    // begin-user-code
    // end-user-code  
	Serie updatedEntity = dao.update(entity);
    // begin-user-code
    // end-user-code	
    return updatedEntity;
  }
  
  /**
   * Apaga valor do banco
   * 
   * @param entity Linha da tabela a ser excluída
   * @generated modifiable   
   */
  public void delete(final Serie entity){
    // begin-user-code
    // end-user-code    
	dao.delete(entity);
    // begin-user-code
    // end-user-code  	
  }
  
  /**
   * Remove a instância de Serie utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated modifiable   
   */  
  public int deleteById(java.lang.String id){
    // begin-user-code
    // end-user-code  
    int result = dao.deleteById(id);
    // begin-user-code
    // end-user-code    
    return result;    
  }  
  
  /**
   * Obtém a instância de Serie utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated modifiable
   */  
  public Serie findById(java.lang.String id){
    // begin-user-code
    // end-user-code  
    Serie entity = dao.findById(id);
    // begin-user-code
    // end-user-code      
    return entity;  
  }   
  
  /**
   * @generated modifiable
   */  
  public List<Aluno> findAluno(java.lang.String id, int limit, int offset) {
      // begin-user-code
      // end-user-code  
      List<Aluno> result = dao.findAluno(id, limit, offset);
      // begin-user-code  
      // end-user-code        
      return result;	  
  }


  
  /**
   * @generated modifiable
   */  	
  public List<Serie> list(int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Serie> result = dao.list(limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
}
