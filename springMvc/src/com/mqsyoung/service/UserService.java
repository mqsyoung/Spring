package com.mqsyoung.service;

import com.mqsyoung.entity.User;

/** 
* @author : mengqignsen
* @version 创建时间：2017年12月15日 
* 类说明  : 这是service 接口 ， 都是方法 ， 在serviceImpl  中实现这些方法
*/
public interface UserService {


	/**
	 * @author mengqingsen
	 * 	获取 user 对象
	 * @return
	 */
	
	public User  getUser();
	
}
