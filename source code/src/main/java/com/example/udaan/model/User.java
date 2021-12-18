package com.example.udaan.model;

import java.util.List;
import java.util.Set;

public class User {
	private int userId;
	private String name;
	private Set<Integer> deals;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Integer> getDeals() {
		return deals;
	}
	public void setDeals(Set<Integer> deals) {
		this.deals = deals;
	}
}
