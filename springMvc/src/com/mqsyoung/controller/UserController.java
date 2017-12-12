package com.mqsyoung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	
	@RequestMapping("test")
	public void testSpringMvc(){
		
		System.out.println("123");
	}
}
