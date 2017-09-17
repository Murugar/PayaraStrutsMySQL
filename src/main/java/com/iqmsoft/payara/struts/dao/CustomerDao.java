package com.iqmsoft.payara.struts.dao;

import org.hibernate.criterion.DetachedCriteria;

import com.iqmsoft.payara.struts.domain.Customer;

import java.util.List;

public interface CustomerDao {
	
	void save(Customer c);
	
	List<Customer> getAll();
	
	Customer getById(Long cust_id);
	
	List<Customer> getAll(DetachedCriteria dc);

}
