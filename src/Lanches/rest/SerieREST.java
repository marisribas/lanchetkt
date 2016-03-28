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
@Path("/Serie")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class SerieREST implements RESTService<Serie> {
  /**
   * @generated
   */
  private SessionManager session;
  /**
   * @generated
   */  
  private SerieBusiness business;
  /**
   * @generated
   */
  private AlunoBusiness alunoBusiness;
  /**
   * @generated
   */  
  @Context 
  private HttpServletRequest request;

  /**
   * @generated
   */
  public SerieREST() {
    this.session = SessionManager.getInstance();
    this.session.getEntityManager().clear();
    this.business = new SerieBusiness(session);
    this.alunoBusiness = new AlunoBusiness(session);
  }
  
  /**
   * @generated
   */  
  @POST
  public Response post(Serie entity) {
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
  public Response put(Serie entity) {
    try {
	    session.begin();
	    Serie updatedEntity = business.update(entity);
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
  public Response putWithId(Serie entity) {
    try {
	    session.begin();
	    Serie updatedEntity = business.update(entity);
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
  public Response delete(Serie entity) {  
		try {
			session.begin();
			Serie updatedEntity = business.update(entity);
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
   * OneToMany Relationship GET
   * @generated
   */
  @GET
  @Path("/{instanceId}/Aluno")
  public GenericEntity<List<Aluno>> findAluno(@PathParam("instanceId") java.lang.String instanceId, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset) {
    return new GenericEntity<List<Aluno>>(this.business.findAluno(instanceId, limit, offset)){};
  }
  
  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @DELETE
  @Path("/{instanceId}/Aluno/{relationId}")
  public Response deleteAluno(@PathParam("relationId") java.lang.String relationId) {
		try {
			session.begin();
			if (this.alunoBusiness.deleteById(relationId) > 0) {
				session.commit();
				return Response.ok().build();
			} else {
				session.rollBack();
				return Response.status(404).build();
			}
		} catch(Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);	
		}
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @PUT
  @Path("/{instanceId}/Aluno/{relationId}")
  public Response putAluno(Aluno entity, @PathParam("relationId") java.lang.String relationId) {
		try {
			session.begin();
			Aluno updatedEntity = this.alunoBusiness.update(entity);
			session.commit();
			return Response.ok(updatedEntity).build();
		} catch(Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);	
		}
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @POST
  @Path("/{instanceId}/Aluno")
  public Response postAluno(Aluno entity, @PathParam("instanceId") java.lang.String instanceId) {
		try {
			session.begin();
			Serie serie = this.business.findById(instanceId);
			entity.setSerie(serie);
			this.alunoBusiness.save(entity);
			session.commit();
			this.alunoBusiness.refresh(entity);
			return Response.ok(entity).build();
		} catch(Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);	
		}
  }   
  


  
  /**
   * NamedQuery list
   * @generated
   */
  @GET
  	
  public GenericEntity<List<Serie>> list(@DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Serie>>(business.list(limit, offset)){};

  }
	
}
