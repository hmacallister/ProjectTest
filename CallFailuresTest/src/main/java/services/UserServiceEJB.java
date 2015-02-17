package services;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import dao.UserDAO;
import entities.User;

@Stateless
@Local
public class UserServiceEJB implements UserServiceLocal{
	
	@EJB
	private UserDAO dao;

	public Collection<User> getUsers() {
		return dao.getAllUsers();
	}

	
	public User getUser(User user) {
		return dao.getUser(user);
	}
	
	public void addUser(User user){
		 dao.addUser(user);
	}
	



}
