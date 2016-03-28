package Lanches.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ALUNO
 * @generated
 */
@Entity
@Table(name = "\"ALUNO\"")
@NamedQueries({
        @NamedQuery(name = "alunoList", query = "select a from Aluno a")
})
@XmlRootElement
public class Aluno implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 63364293l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "nome", nullable = false, unique = false)
	private java.lang.String nome;
	
	/**
	 * @generated
	 */
	@Column(name = "turma", nullable = false, unique = false)
	private java.lang.String turma;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="fk_serie", referencedColumnName = "id")
	private Serie serie;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Aluno(){
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
	 * Obtém nome
	 * @param nome nome
	 * return nome
	 * @generated
	 */
	public java.lang.String getNome(){
		return this.nome;
	}
	
	/**
	 * Define nome
	 * @param nome nome
	 * @generated
	 */
	public void setNome(java.lang.String nome){
		this.nome = nome;
	}
	
	/**
	 * Obtém turma
	 * @param turma turma
	 * return turma
	 * @generated
	 */
	public java.lang.String getTurma(){
		return this.turma;
	}
	
	/**
	 * Define turma
	 * @param turma turma
	 * @generated
	 */
	public void setTurma(java.lang.String turma){
		this.turma = turma;
	}
	
	/**
	 * Obtém serie
	 * @param serie serie
	 * return serie
	 * @generated
	 */
	public Serie getSerie(){
		return this.serie;
	}
	
	/**
	 * Define serie
	 * @param serie serie
	 * @generated
	 */
	public void setSerie(Serie serie){
		this.serie = serie;
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
	    
	    if(!(obj instanceof Aluno))
	      return false;
	    
	    Aluno other = (Aluno)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}