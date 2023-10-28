package com.example.demo.userService;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.userEntity.userEntity;
import com.example.demo.userRepo.userRepo;

@Service
public class userServiceImp implements userService {
	@Autowired
	userRepo userrepo;

	

	

	

	@Override
	public void deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		userrepo.deleteById(userId);
	}

	@Override
	public userEntity updateuserEntity(Long userId, userEntity user) {
		// TODO Auto-generated method stub
		 userEntity depDB = userrepo.findById(userId).get();

	      if(Objects.nonNull(user.getName()) &&
	      !"".equalsIgnoreCase(user.getName())) {
	          depDB.setName(user.getName());
	      }

	      if(Objects.nonNull(user.getType()) &&
	              !"".equalsIgnoreCase(user.getType())) {
	          depDB.setType(user.getType());
	      }

	      if(Objects.nonNull(user.getPassword()) &&
	              !"".equalsIgnoreCase(user.getPassword())) {
	          depDB.setPassword(user.getPassword());
	      }

	      return userrepo.save(depDB);
	  }






	
	






	@Override
	public userEntity fetchUserById(Long userId) {
		// TODO Auto-generated method stub
		return userrepo.findById(userId).get();
	}






	@Override
	public List<userEntity> fetchUserList() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}






	@Override
	public userEntity saveuserEntity(userEntity user) {
		// TODO Auto-generated method stub
	 return userrepo.save(user);
	}


		
	}


