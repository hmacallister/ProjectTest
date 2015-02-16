package rest;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	@Path("/getuser/{username}{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("username") String username, @PathParam("password") String password) {
		return service.getUser(username, password);
	}

}
