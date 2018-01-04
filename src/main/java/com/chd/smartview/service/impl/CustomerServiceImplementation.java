package com.chd.smartview.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.chd.smartview.model.Customer;
import com.chd.smartview.service.CustomerService;


@Service
public class CustomerServiceImplementation implements CustomerService {

	@Override
	public HashMap<String, Customer> getCustomers() {
		return Customer.customers;
	}

	@Override
	public Customer updateCustomer(String id, Customer customer) {
		Customer originalCustomer = Customer.customers.get(id);
		if(customer.getAge()!=0) {
			originalCustomer.setAge(customer.getAge());
		}
		if(customer.getName()!=null) {
			originalCustomer.setName(customer.getName());
		}
		if(customer.getCompany()!=null) {
			originalCustomer.setCompany(customer.getCompany());
		}	
		return originalCustomer;	
	}

	@Override
	public void deleteCustomer(String id) {
		Customer.customers.remove(id);
	}
}
