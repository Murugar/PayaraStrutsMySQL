package com.iqmsoft.payara.struts.service;

import org.hibernate.criterion.DetachedCriteria;

import com.iqmsoft.payara.struts.domain.Customer;

import java.util.List;

public interface CustomerService {
	
	void save(Customer c);
	
	List<Customer> getAll();
	
	List<Customer> getAll(DetachedCriteria dc);

}
