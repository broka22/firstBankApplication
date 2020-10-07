package com.vastika.bank.sys.service;

import com.vastika.bank.sys.model.User;

import java.util.List;

public interface UserService {

	void signUp(User user);
	
	User getUserById(int id);

	List<User> getAllUser();

	void createAccount();

	void depositAmount();

	void withdrawAmount();

	void currentBalance();

}
