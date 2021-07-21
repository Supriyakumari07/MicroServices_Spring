package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//dummy User data
	
	List<User> list = List.of(
			new User(1111L, "Supriya Kumari", "8918918998"),
			new User(1181L, "Maa Paapa", "8918919889")
			);
	
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
