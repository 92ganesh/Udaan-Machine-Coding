package com.example.udaan.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.udaan.model.Deal;
import com.example.udaan.model.User;

@Repository
public class UserRepository {
	List<User> users;
	
	public void addUser(User user) {
		if(users==null) {
			users = new ArrayList<>();
		}
		
		user.setUserId(users.size()+1);
		users.add(user);
	}
	
	public boolean userExists(int userId) {
		if(users==null || !users.contains(userId)) {
			return false;
		}
		return true;
	}
	
	public String claimDeal(int userId, int dealId) throws Exception {
		if(users==null || !users.contains(userId)) {
			throw new Exception("user does not exists");
		}
		
		
		for(User user : users) {
			if(user.getUserId()==userId) {
				if(user.getDeals().contains(dealId)) {
					throw new Exception("deal has been claimed already");
				}
				user.getDeals().add(dealId);
			}
		}
		
		return "deal claimed successfully";
	}
}
















