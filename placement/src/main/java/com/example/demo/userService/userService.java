package com.example.demo.userService;

import java.util.List;

import com.example.demo.userEntity.userEntity;



public interface userService {
	

		userEntity saveuserEntity(userEntity user);
		
		public List<userEntity> fetchUserList();

		public userEntity fetchUserById(Long userId);

		public void deleteUserById(Long userId);

		public userEntity updateuserEntity(Long userId, userEntity user);

}
