
package com.chd.smartview.model;

import java.util.Date;
import java.util.HashMap;

public class Order {
	public static HashMap<String,Order> orders = new HashMap<String, Order>();
	private String id;
	private Date beginTime;
	private Date endTime;
	private String customerId;
	private String beginLocation;
	private String endLocation;
	private double fee;
	
	public Order() {
		super();
		this.id = "order" + orders.size();
		orders.put(this.id, this);
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getBeginLocation() {
		return beginLocation;
	}

	public void setBeginLocation(String beginLocation) {
		this.beginLocation = beginLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	
}
