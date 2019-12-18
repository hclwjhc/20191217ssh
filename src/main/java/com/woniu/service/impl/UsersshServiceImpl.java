package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.UsersshDao;
import com.woniu.pojo.Userssh;
import com.woniu.service.UsersshService;

@Service
@Transactional
public class UsersshServiceImpl implements UsersshService{

	@Autowired
	UsersshDao ud;
	
	public void save(Userssh obj) {
		// TODO Auto-generated method stub
		ud.save(obj);
	}

	public List<Userssh> findAll() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

}
