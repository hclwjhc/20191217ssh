package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.UsersshDao;
import com.woniu.pojo.Userssh;

@Repository
public class UsersshDaoImpl implements UsersshDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Userssh obj) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(obj);
	}

	@SuppressWarnings("unchecked")
	public List<Userssh> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createCriteria(Userssh.class).list();
	}

}
