package com.example.udaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.udaan.model.Deal;
import com.example.udaan.model.User;
import com.example.udaan.service.DealService;
import com.example.udaan.service.UserService;

@RestController
public class HomeController {
	@Autowired
	DealService dealService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/seller/createDeal")
	public String createDeal(Deal deal) {
		
		return dealService.addDeal(deal);
	}
	
	@PostMapping("/seller/updateDeal")
	public String updateDeal(Deal deal) {

		return dealService.updateDeal(deal);
	}
	
	@PostMapping("/seller/endDeal")
	public String endDeal(int dealId) {
		return dealService.endDeal(dealId);
	}
	
	@GetMapping("/seller/getDeal")
	public Deal getDeal(int dealId) {

		return dealService.getDeal(dealId);
	}
	
	@PostMapping("/user/register")
	public String registerUser(User user) {

		return "registered";
	}
	
	@PostMapping("/user/claimDeal")
	public String claimDeal(int userId, int dealId) {
			
		return "deal claimed";
	}
}
