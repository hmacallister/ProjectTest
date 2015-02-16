package dao.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.CallFailureDAO;
import entities.BaseData;

@Stateless
@Local
public class JPACallFailureDAO implements CallFailureDAO {

	@PersistenceContext
	private EntityManager em;

	public Collection<BaseData> getAllFailures() {
		
		Query query = em.createQuery("from BaseData");
		List<BaseData> result = query.getResultList();
		return result;
	}


	public Collection<BaseData> getUniqueCauseCodesByIMSI(String imsi) {
		Query query = em.createQuery("select distinct ec.causeCode from EventCause ec, "
				+ "BaseData bd where ec.id = bd.eCause and bd.imsi = :imsi");
		query.setParameter("imsi", imsi);
		List<BaseData> result = query.getResultList();
		return result;
	}

}
