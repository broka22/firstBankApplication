package com.vastika.bank.sys.service;

import com.vastika.bank.sys.model.User;

public interface UserService {

	void signUp(User user);

	void createAccount();

	void depositAmount();

	void withdrawAmount();

	void checkBalance();

}
