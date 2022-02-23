package com.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entities.CustomerDetails;


/**
 * 
 * @author 33000014
 *
 */

@Repository
public class Customerdao  {
	
	@Autowired
	private EntityManager eManager;
	
	@SuppressWarnings("unchecked")
	public List<CustomerDetails> getCustomerDetail(String CustGuId) {
		StoredProcedureQuery query = eManager.createStoredProcedureQuery("GetCustomerDetail", "CustomerDetails")
				.registerStoredProcedureParameter("CustGuId", String.class, ParameterMode.IN)
				.setParameter("CustGuId", CustGuId);
		query.execute();
		return query.getResultList();
	}
	
}
