package com.customer.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author 33000014
 *
 */

public class CustGuId {
	
	private String custGuId;
	
	/**
	 * 
	 * @param custGuId
	 */

	@JsonCreator
	public CustGuId(@JsonProperty("CustGuId") String custGuId) {
		super();
		this.custGuId = custGuId;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getCustGuId() {
		return custGuId;
	}

	public void setCustGuId(String custGuId) {
		this.custGuId = custGuId;
	}
	

}
