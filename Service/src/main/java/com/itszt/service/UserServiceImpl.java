package com.itszt.service;


import dao.UserDao;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public void regUser(String username, String userpwd) {
		System.out.println("reg...reg...reg...."+username+"  "+userpwd);
		System.out.println("userdao1....");
		User user=new User();
		user.setUsername(username);
		user.setUserpwd(userpwd);
		userDao.addUser(user);
		System.out.println("添加成功！ "+user);
		System.out.println("userdao2....");
	}
}
