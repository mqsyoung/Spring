package com.mqsyoung.entity;

import com.mqsyoung.base.BaseEntity;

/** 
* @author : mengqignsen
* @version ����ʱ�䣺2017��12��15��  
* ��˵�� 
*/
public class User extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public User(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public User() {
		super();
	}
	
	
	private String name ;
	
	private String sex;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
