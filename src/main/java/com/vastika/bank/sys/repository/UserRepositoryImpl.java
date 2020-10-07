package com.vastika.bank.sys.repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.bank.sys.model.User;
import com.vastika.bank.sys.util.HibernateUtil;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void signUp(User user) {
		Session session = HibernateUtil.getSession(sessionFactory);
		System.out.println(user);
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
	public void currentBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(int id) {
		Session session = HibernateUtil.getSession(sessionFactory);
		User user = (User) session.get(User.class, id);
		System.out.println(user);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();
	}

	@Override
	public User getUserByUserName(String username) {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", username));
		return (User) criteria.uniqueResult();
	}

}
