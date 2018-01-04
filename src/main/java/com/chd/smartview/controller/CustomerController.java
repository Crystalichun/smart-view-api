package com.chd.smartview.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chd.smartview.model.Customer;
import com.chd.smartview.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Customer> getCustomers() {
		return customerService.getCustomers();	
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Customer createCustomer(@RequestBody Customer customer) {
		return  customer;
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Customer getCustomer(@PathVariable("id") String id) {
		return Customer.customers.get(id);
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Customer updateCustomer(@PathVariable("id") String id, @RequestBody Customer customer) {
		return customerService.updateCustomer(id, customer);	
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String id) {
		customerService.deleteCustomer(id); 
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
