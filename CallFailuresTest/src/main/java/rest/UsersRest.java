package rest;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import services.UserServiceLocal;
import entities.User;

@Path("/users")
@Stateless
public class UsersRest {

	@EJB
	private UserServiceLocal service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<User> getAllFailures() {
		return service.getUsers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(User user) {
		return service.getUser(user);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUser(User user){
		 service .addUser(user);
	}
	
	

}
