package com.vastika.bank.sys.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.bank.sys.model.User;
import com.vastika.bank.sys.util.HibernateUtil;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void signUp(User user) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.save(user);
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
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

}
