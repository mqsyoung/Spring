package com.mqsyoung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mqsyoung.entity.User;
import com.mqsyoung.mapper.dao.UserMapper;
import com.mqsyoung.service.UserService;

/** 
* @author : mengqignsen
* @version ����ʱ�䣺2017��12��15��  
* ��˵�� 
*/
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserMapper userMapper;
	 
	public User getUser() {
		
		
		
		User user = userMapper.getUser(new User());
		
		
		System.out.println("service");
		
		return user;
		 
	}
 
	
	
}
