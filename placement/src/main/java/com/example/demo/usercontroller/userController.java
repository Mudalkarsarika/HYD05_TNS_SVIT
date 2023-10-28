package com.example.demo.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.userEntity.userEntity;
import com.example.demo.userService.userService;

@RestController
public class userController {
	@Autowired
	userService userservice;
	
	@PostMapping("/user")
    public userEntity saveuserEntity(@RequestBody userEntity  user) {
       
        return userservice.saveuserEntity(user);
    }
	
	
	 @GetMapping("/user")
	    public List<userEntity> fetchUserList() {
	        
	        return userservice.fetchUserList();
	    }
	    
	 @GetMapping("/user/{id}")
	    public userEntity fetchUserById(@PathVariable("id") Long userId)
	            {
	        return userservice.fetchUserById(userId);
	            }
	 @DeleteMapping("/user/{id}")
	    public String deleteUserById(@PathVariable("id") Long userId) {
	        userservice.deleteUserById(userId);
	        return "User deleted Successfully!!";
	    }
	 
	    @PutMapping("/user/{id}")
	    public userEntity updateUser(@PathVariable("id") Long userId,
	                                       @RequestBody userEntity user) {
	        return userservice.updateuserEntity(userId,user);
	    }
	 
}
