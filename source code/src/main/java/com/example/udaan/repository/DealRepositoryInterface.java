package com.example.udaan.repository;

import java.util.HashMap;

import com.example.udaan.model.Deal;

public interface DealRepositoryInterface {
	public void addDeal(Deal deal) throws Exception ;
	
	public void updateDeal(Deal deal) throws Exception ;
	
	public Deal getDeal(int dealId) throws Exception ;
	
	public void endDeal(int dealId) throws Exception ;
	
	public void claimDeal(int userId, int dealId) throws Exception ;
}
