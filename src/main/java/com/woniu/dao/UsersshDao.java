package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Userssh;

public interface UsersshDao {

	void save(Userssh obj);
	List<Userssh> findAll();
	
}
