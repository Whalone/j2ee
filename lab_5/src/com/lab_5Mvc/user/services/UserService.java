package com.lab_5Mvc.user.services;

import com.lab_5Mvc.user.dao.UserDao;
import com.lab_5Mvc.user.domain.User;

public class UserService {

	public User checkLogin(String userName, String password) {
		UserDao userDao = new UserDao();
		return userDao.checkLogin(userName, password);
	}
		
}
