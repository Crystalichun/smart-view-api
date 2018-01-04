package com.chd.smartview.model;

import java.util.HashMap;

public class Customer {
	public static HashMap<String,Customer> customers = new HashMap<String, Customer>();
	private String id;
	private String name;
	private String company;
	private int age;
	
	public Customer() {
		super();
		this.id = "customer" + customers.size();
		customers.put(this.id, this);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}