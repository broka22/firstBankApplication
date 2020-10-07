package com.vastika.bank.sys.repository;

import com.vastika.bank.sys.model.User;

import java.util.List;

public interface UserRepository {
	
	void signUp(User user);
	
	User getUserById(int id);

	List<User> getAllUser();

	User getUserByUserName(String username);
	
	void createAccount();
	
	void depositAmount();
	
	void withdrawAmount();
	
	void currentBalance();

}
