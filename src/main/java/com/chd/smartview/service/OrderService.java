
package com.chd.smartview.service;

import java.util.HashMap;

import com.chd.smartview.model.Order;

public interface OrderService {

	public HashMap<String, Order> getOrders();

	public Order updateOrder(String id, Order order);

	public void deleteOrder(String id);

}
