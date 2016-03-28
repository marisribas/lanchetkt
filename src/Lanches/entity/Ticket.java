package Lanches.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TICKET
 * @generated
 */
@Entity
@Table(name = "\"TICKET\"")
@NamedQueries({
        @NamedQuery(name = "ticketList", query = "select c from Ticket c")
})
@XmlRootElement
public class Ticket implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1790091448l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "ticket", nullable = false, unique = false)
	private java.lang.String ticket;
	
	/**
	 * @generated
	 */
	@Column(name = "valor", nullable = false, unique = false)
	private java.lang.Double valor;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Ticket(){
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
	 * Obtém ticket
	 * @param ticket ticket
	 * return ticket
	 * @generated
	 */
	public java.lang.String getTicket(){
		return this.ticket;
	}
	
	/**
	 * Define ticket
	 * @param ticket ticket
	 * @generated
	 */
	public void setTicket(java.lang.String ticket){
		this.ticket = ticket;
	}
	
	/**
	 * Obtém valor
	 * @param valor valor
	 * return valor
	 * @generated
	 */
	public java.lang.Double getValor(){
		return this.valor;
	}
	
	/**
	 * Define valor
	 * @param valor valor
	 * @generated
	 */
	public void setValor(java.lang.Double valor){
		this.valor = valor;
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
	    
	    if(!(obj instanceof Ticket))
	      return false;
	    
	    Ticket other = (Ticket)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}