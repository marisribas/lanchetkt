package Lanches.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela LISTADIA
 * @generated
 */
@Entity
@Table(name = "\"LISTADIA\"")
@NamedQueries({
        @NamedQuery(name = "listaDiaList", query = "select c from ListaDia c")
})
@XmlRootElement
public class ListaDia implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1410646455l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "situacao", nullable = false, unique = false)
	private java.lang.String situacao;
	
	/**
	 * @generated
	 */
	@Column(name = "aluno", nullable = false, unique = false)
	private java.lang.String aluno;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ListaDia(){
	}

	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.String getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	
	/**
	 * Obtém situacao
	 * @param situacao situacao
	 * return situacao
	 * @generated
	 */
	public java.lang.String getSituacao(){
		return this.situacao;
	}
	
	/**
	 * Define situacao
	 * @param situacao situacao
	 * @generated
	 */
	public void setSituacao(java.lang.String situacao){
		this.situacao = situacao;
	}
	
	/**
	 * Obtém aluno
	 * @param aluno aluno
	 * return aluno
	 * @generated
	 */
	public java.lang.String getAluno(){
		return this.aluno;
	}
	
	/**
	 * Define aluno
	 * @param aluno aluno
	 * @generated
	 */
	public void setAluno(java.lang.String aluno){
		this.aluno = aluno;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
	
	/**
	 * @generated
	 */	
	@Override
  	public boolean equals(Object obj) {
    
	    if(this == obj)
	      return true;
	    
	    if(obj == null)
	      return false;
	    
	    if(!(obj instanceof ListaDia))
	      return false;
	    
	    ListaDia other = (ListaDia)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}