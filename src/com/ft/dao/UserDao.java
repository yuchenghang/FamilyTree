package com.ft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ft.entity.User;
import com.ft.utils.HibernateUtils;

public class UserDao {
	static{
	
	}
	
public void add(User user)
{
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(user);
	tx.commit();
	session.close();
	sessionFactory.close();
	
}

public void delete(User user){

	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	session.delete(user);
	tx.commit();
	session.close();
	sessionFactory.close();
}

public void update(User user){

	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	session.update(user);
	tx.commit();
	session.close();
	sessionFactory.close();
}

public User get(int id){

	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	User temp=(User)session.get(User.class,id);
	tx.commit();
	session.close();
	sessionFactory.close();
	return temp;
}

}
