package Lanches.rest;


import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.persistence.*;

import Lanches.rest.util.*;

import Lanches.dao.*;
import Lanches.entity.*;
import Lanches.business.*;
import Lanches.rest.exceptions.*;
import Lanches.dao.*;
import javax.servlet.http.HttpServletRequest;



/**
 * Publicando metodos de negocio via REST
 * @generated
 **/
@Path("/ListaDia")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ListaDiaREST implements RESTService<ListaDia> {
  /**
   * @generated
   */
  private SessionManager session;
  /**
   * @generated
   */  
  private ListaDiaBusiness business;
  /**
   * @generated
   */  
  @Context 
  private HttpServletRequest request;

  /**
   * @generated
   */
  public ListaDiaREST() {
    this.session = SessionManager.getInstance();
    this.session.getEntityManager().clear();
    this.business = new ListaDiaBusiness(session);
  }
  
  /**
   * @generated
   */  
  @POST
  public Response post(ListaDia entity) {
    try {
	    session.begin();
	    business.save(entity);
	    session.commit();
	    business.refresh(entity);
	    return Response.ok(entity).build();
    }
    
    catch(Exception exception){
	    session.rollBack();
        throw new CustomWebApplicationException(exception);
    }
  }

  /**
   * @generated
   */
  @PUT
  public Response put(ListaDia entity) {
    try {
	    session.begin();
	    ListaDia updatedEntity = business.update(entity);
	    session.commit();
	    return Response.ok(updatedEntity).build();
    }
    
    catch(Exception exception){
	    session.rollBack();
        throw new CustomWebApplicationException(exception);
    }  
  }
  
  /**
   * @generated
   */  
  @PUT
  @Path("/{id}")
  public Response putWithId(ListaDia entity) {
    try {
	    session.begin();
	    ListaDia updatedEntity = business.update(entity);
	    session.commit();
	    return Response.ok(updatedEntity).build();
    }
    
    catch(Exception exception){
	    session.rollBack();
        throw new CustomWebApplicationException(exception);
    }  
  }
  
  /**
   * @generated
   */  
  @DELETE
  public Response delete(ListaDia entity) {  
		try {
			session.begin();
			ListaDia updatedEntity = business.update(entity);
			business.delete(updatedEntity);
			session.commit();
			return Response.ok().build();
		}

		catch (Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);
		}    
  } 
   
  /**
   * @generated
   */    
  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") java.lang.String id) {  
		try {
			session.begin();
			if (business.deleteById(id) > 0) {
				session.commit();
				return Response.ok().build();
			} else {
				return Response.status(404).build();
			}
		}

		catch (Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);
		}    
  }
  
  
  


  
  /**
   * NamedQuery list
   * @generated
   */
  @GET
  	
  public GenericEntity<List<ListaDia>> list(@DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<ListaDia>>(business.list(limit, offset)){};

  }
	
}
