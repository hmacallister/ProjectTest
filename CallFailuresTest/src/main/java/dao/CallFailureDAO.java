package dao;

import java.util.Collection;

import javax.ejb.Local;

import entities.BaseData;
@Local
public interface CallFailureDAO {

	Collection<BaseData> getAllFailures();
	
	Collection<BaseData> getUniqueCauseCodesByIMSI(String imsi);
}
