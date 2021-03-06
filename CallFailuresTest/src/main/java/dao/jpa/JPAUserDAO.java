package dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.UserDAO;
import entities.BaseData;
import entities.User;

@Stateless
@Local
public class JPAUserDAO implements UserDAO{
	
	@PersistenceContext
	private EntityManager em;

	public Collection<User> getAllUsers() {
		Query query = em.createQuery("from User");
		List<User> result = query.getResultList();
		return result;
	}

	
	public User getUser(User user) {
		Query query = em.createQuery("from User u where u.username = :username and u.password = :password");
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		List<User> result = query.getResultList();
		/*
		if(result.isEmpty()){
			return new User("ERROR", "ERROR", -1);
		}
		*/
		return result.get(0);
	}
	
	public void addUser(User user){
		Query query = em.createQuery("from User");
		List<User> users = query.getResultList();
		if (!users.contains(user)){
			em.persist(user);
			//return "User Added";
		}
		//return "User Not Added";
	}
	

}
