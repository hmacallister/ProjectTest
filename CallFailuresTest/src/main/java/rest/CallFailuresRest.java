package rest;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import services.BaseDataServiceLocal;
import entities.BaseData;

@Path("/callfailures")
@Stateless
public class CallFailuresRest {

	@EJB
	private BaseDataServiceLocal service;
	
	//works
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Collection<BaseData> getAllFailures() {
			return service.getFailures();
		}
		
		//works
		@GET
		@Path("/unique_cause_codes/{imsi}")
		@Produces(MediaType.APPLICATION_JSON)
		public Collection<BaseData> getUniqueCauseCodesByIMSI(@PathParam("imsi") String imsi) {
			return service.getUniqueCauseCodesByIMSI(imsi);
		}

}
