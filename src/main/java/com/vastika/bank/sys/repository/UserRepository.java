package com.vastika.bank.sys.repository;

import com.vastika.bank.sys.model.User;

public interface UserRepository {
	
	void signUp(User user);
	
	User getUserById(int id);
	
	void createAccount();
	
	void depositAmount();
	
	void withdrawAmount();
	
	void checkBalance();

}
