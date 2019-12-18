package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Userssh;

public interface UsersshService {

	void save(Userssh obj);
	List<Userssh> findAll();
	
}
