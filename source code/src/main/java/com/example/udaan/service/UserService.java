package com.example.udaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.udaan.model.Deal;
import com.example.udaan.model.User;
import com.example.udaan.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DealService dealService;
	
	
	public void addUser(User user) {
		userRepository.addUser(user);
	}
	
	public String claimDeal(int userId, int dealId) throws Exception {
		Deal deal = dealService.getDeal(dealId);
		if(deal.isDealActive() && deal.getNumOfItem()>0) {
			dealService.claimDeal(userId, dealId);
			userRepository.claimDeal(userId, dealId);
			return "deal claimed";
		}
		return "Sorry, could not claim the deal";
	}
}
