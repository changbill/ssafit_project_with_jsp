package com.ssafy.user.model.service;

import java.util.List;

import com.ssafy.user.model.dao.UserDao;
import com.ssafy.user.model.dao.UserDaoImpl;
import com.ssafy.user.model.dto.User;

public class UserServiceImpl implements UserService {

	private static UserService userService = new UserServiceImpl();
	private  UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static UserService getInstance() {
		return userService;
	}
	private UserDao userdao = UserDaoImpl.getInstance();
	
	@Override
	public List<User> getList() {
		return userdao.selectAll();
	}

	@Override
	public void registerUser(User user) {
		userdao.insertUser(user);
	}

	@Override
	public User getUser(String id) {
		return userdao.selectOne(id);
	}

}
