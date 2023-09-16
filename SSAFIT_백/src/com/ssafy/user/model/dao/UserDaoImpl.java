package com.ssafy.user.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.user.model.dto.User;

public class UserDaoImpl implements UserDao {

	private static UserDao userdao = new UserDaoImpl();

	private UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public static UserDao getInstance() {
		return userdao;
	}

	private List<User> userList = new ArrayList<>();

	@Override
	public List<User> selectAll() {
		return userList;
	}

	@Override
	public void insertUser(User user) {
		userList.add(user);
	}

	@Override
	public User selectOne(String id) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId().equals(id)) {
				return userList.get(i);
			}
		}
		return null;
	}
}
