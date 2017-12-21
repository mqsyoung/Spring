package com.mqsyoung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mqsyoung.entity.User;
import com.mqsyoung.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("test")
	public String testSpringMvc(){
		
		System.out.println("123");
		User user = userService.getUser();
		
		System.out.println(user);
		return "success";
	}
}
