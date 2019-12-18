package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Userssh;
import com.woniu.service.UsersshService;
// 哈哈哈哈哈哈哈哈哈哈
@Controller
public class UsersshAction {

	@Autowired
	private UsersshService us;
	private Userssh u;
	
	public UsersshAction() {
		// TODO Auto-generated constructor stub
		System.out.println("UsersshAction.UsersshAction()");
	}

	public Userssh getU() {
		return u;
	}

	public void setU(Userssh u) {
		this.u = u;
	}
	
	public String save() {
		us.save(u);
		return "success";
		
	}
	
}
