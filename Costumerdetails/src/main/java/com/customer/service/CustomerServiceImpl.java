package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.Customerdao;
import com.customer.entities.CustomerDetails;
import com.customer.entities.Response;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private Customerdao customerdao;

	@Override
	public Response getCustomerDetails(String custGuId) {
		// TODO Auto-generated method stub
		
		List<CustomerDetails> list = customerdao.getCustomerDetail(custGuId);
		Response response  = new Response(1 ,0 , "I" , "sucess" , list.get(0));
		return response;
	}

}
