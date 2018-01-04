package com.chd.smartview.service;

import java.util.HashMap;

import com.chd.smartview.model.Customer;

public interface CustomerService {

	public HashMap<String, Customer> getCustomers();

	public Customer updateCustomer(String id, Customer customer);

	public void deleteCustomer(String id);
}
