package com.vastika.bank.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.bank.sys.model.User;
import com.vastika.bank.sys.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserSeriviceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void signUp(User user) {
		userRepository.signUp(user);
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void currentBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(int id) {
		return userRepository.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

}
