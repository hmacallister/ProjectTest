package dao;

import java.util.Collection;

import entities.User;

public interface UserDAO {
	
	Collection<User> getAllUsers();
	User getUser(String username, String password);

}
