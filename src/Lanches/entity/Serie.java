package Lanches.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SERIE
 * @generated
 */
@Entity
@Table(name = "\"SERIE\"")
@NamedQueries({
        @NamedQuery(name = "serieList", query = "select c from Serie c")
})
@XmlRootElement
public class Serie implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 79776119l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "serie", nullable = false, unique = false)
	private java.lang.String serie;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Serie(){
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
	 * Obtém serie
	 * @param serie serie
	 * return serie
	 * @generated
	 */
	public java.lang.String getSerie(){
		return this.serie;
	}
	
	/**
	 * Define serie
	 * @param serie serie
	 * @generated
	 */
	public void setSerie(java.lang.String serie){
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
	    
	    if(!(obj instanceof Serie))
	      return false;
	    
	    Serie other = (Serie)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}