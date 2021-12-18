package com.example.udaan.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.udaan.model.Deal;

@Repository
public class DealRepository implements DealRepositoryInterface{
	HashMap<Integer, Deal> deals;
	
	@Override
	public void addDeal(Deal deal) throws Exception {
		if(deals==null) {
			deals = new HashMap<>();
		}
		if(deals.containsKey(deal)) {
			throw new Exception("Deal already exists");
		}
		
		deals.put(deal.getDealId(), deal);
	}
	
	@Override
	public void updateDeal(Deal deal) throws Exception {
		if(deals==null || !deals.containsKey(deal.getDealId())) {
			throw new Exception("Deal does not exist");
		}
		deals.put(deal.getDealId(), deal);
	}
	
	@Override
	public Deal getDeal(int dealId) throws Exception {
		if(deals==null || !deals.containsKey(dealId)) {
			throw new Exception("Deal does not exist");
		}
		System.out.println(deals);
		return deals.get(dealId);
	}
	
	@Override
	public void endDeal(int dealId) throws Exception {
		if(deals==null || !deals.containsKey(dealId)) {
			throw new Exception("Deal does not exist");
		}
		Deal deal = deals.get(dealId);
		deal.setDealActive(false);
	}
	
	@Override
	public void claimDeal(int userId, int dealId) throws Exception {
		if(deals==null || !deals.containsKey(dealId)) {
			throw new Exception("Deal does not exist");
		}
		Deal deal = deals.get(dealId);
		int quantity = deal.getNumOfItem();
		deal.setNumOfItem(quantity-1);
		deals.put(dealId, deal);
	}
}

















