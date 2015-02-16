package services;

import java.util.Collection;

import javax.ejb.Local;

import entities.User;

@Local
public interface UserServiceLocal {
	
	Collection<User> getUsers();
	User getUser(String username, String password);

}
