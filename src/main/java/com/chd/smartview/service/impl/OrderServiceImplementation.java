package com.chd.smartview.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.chd.smartview.model.Order;
import com.chd.smartview.service.OrderService;
@Service
public class OrderServiceImplementation implements OrderService {


	@Override
	public HashMap<String, Order> getOrders() {
		return Order.orders;
	}

	@Override
	public Order updateOrder(String id, Order order) {
		Order originalOrder = Order.orders.get(id);
		if(order.getFee()!=0) {
			originalOrder.setFee(order.getFee());
		}
		if(order.getEndTime()!=null) {
			originalOrder.setEndTime(order.getEndTime());
		}
		if(order.getBeginTime()!=null) {
			originalOrder.setBeginTime(order.getBeginTime());
		}		
		if(order.getBeginLocation()!=null) {
			originalOrder.setBeginLocation(order.getBeginLocation());
		}
		if(order.getEndLocation()!=null) {
			originalOrder.setEndLocation(order.getEndLocation());
		}	
		return originalOrder;	
	}

	@Override
	public void deleteOrder(String id) {
		Order.orders.remove(id);
		
	}
}
