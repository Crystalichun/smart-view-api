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
import com.chd.smartview.model.Order;
import com.chd.smartview.service.CustomerService;
import com.chd.smartview.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Order> getOrders() {
		return  orderService.getOrders();	
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Order createOrder(@RequestBody Order order) {
		return  order;
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Order getOrder(@PathVariable("id") String id) {
		return Order.orders.get(id);
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Order updateOrder(@PathVariable("id") String id, @RequestBody Order order) {
		return orderService.updateOrder(id, order);	
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<String> deleteOrder(@PathVariable("id") String id) {
		orderService.deleteOrder(id); 
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
