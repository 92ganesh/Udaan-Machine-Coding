package com.example.udaan.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.udaan.model.Deal;
import com.example.udaan.repository.DealRepository;

@Service
public class DealService {
	
	@Autowired
	DealRepository dealRepository;
	
	public String addDeal(Deal deal){
		try {
			dealRepository.addDeal(deal);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "Deal added successfully";
	}
	
	public String updateDeal(Deal deal){
		try {
			dealRepository.updateDeal(deal);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "Deal updated successfully";
	}
	
	public Deal getDeal(int dealId) {
		Deal deal;
		try {
			deal = dealRepository.getDeal(dealId);
		}catch(Exception e) {
			return null;
		}
		return deal;
	}
	
	public String endDeal(int dealId) {
		try {
			dealRepository.endDeal(dealId);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "Deal ended successfully";
	}
	
	public String claimDeal(int userId, int dealId) {
		try {
			dealRepository.claimDeal(userId, dealId);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "Deal ended successfully";
	}
	
}
