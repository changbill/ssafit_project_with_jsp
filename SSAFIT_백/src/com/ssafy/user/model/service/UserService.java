package com.ssafy.user.model.service;

import java.util.List;

import com.ssafy.user.model.dto.User;

public interface UserService {
	// 조회
	List<User> getList();

	// 등록
	void registerUser(User user);

	// 삭제
	User getUser(String id);

	// 수정

}
