package com.example.udaan.model;

import java.util.Date;

public class Deal {
	private int dealId;
	private double price;
	private int numOfItem;
	
	//Assuming startTime and endTime represents date of a month
	private int startTime;
	private int endTime;
	
	private boolean dealActive;
	
	public int getDealId() {
		return dealId;
	}
	public void setDealId(int dealId) {
		this.dealId = dealId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumOfItem() {
		return numOfItem;
	}
	public void setNumOfItem(int numOfItem) {
		this.numOfItem = numOfItem;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public boolean isDealActive() {
		return dealActive;
	}
	public void setDealActive(boolean dealActive) {
		this.dealActive = dealActive;
	}
}
