package services;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import dao.CallFailureDAO;
import entities.BaseData;

@Stateless
@Local
public class BaseDataServiceEJB implements BaseDataServiceLocal{
	
	@EJB
	private CallFailureDAO dao;


	public Collection<BaseData> getFailures() {
		return dao.getAllFailures();
	}


	public Collection<BaseData> getUniqueCauseCodesByIMSI(String imsi) {
		return dao.getUniqueCauseCodesByIMSI(imsi);
	}

}
