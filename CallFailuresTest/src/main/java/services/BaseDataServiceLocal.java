package services;

import java.util.Collection;

import javax.ejb.Local;

import entities.BaseData;

@Local
public interface BaseDataServiceLocal {
	Collection<BaseData> getFailures();
	Collection<BaseData> getUniqueCauseCodesByIMSI(String imsi);
}
