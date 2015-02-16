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

	public User getUser(String username, String password) {
		Query query = em.createQuery("from User u where u.username = :username and u.password = :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		List<User> result = query.getResultList();
		if(result.isEmpty()){
			return null;
		}
		return result.get(0);
	}

}
