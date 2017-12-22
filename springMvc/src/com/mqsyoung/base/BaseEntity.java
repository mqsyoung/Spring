package com.mqsyoung.base;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
* @author : mengqignsen
* @version 创建时间：2017年12月15日 
* 类说明  ：实体类继承此类 实现序列化
*/
/**
 * 
 * @author mengqingsen
 * 
 *	@JsonInclude(Include.NON_NULL)
 *	作用： 放到类 或者 属性上
 *	  属性上：如果该属性为空 则该字段不进行序列化（为null 的字段不现实） 
 *	是springmvc 的注解 ， 是为了控制返回json 字符串返回字段的显示 ， 这里是为空的不显示
 */

@JsonInclude(Include.NON_NULL)
public class BaseEntity implements Serializable {
	/** 
	* @author : mengqignsen
	* @version 创建时间：2017年12月15日
	* 说明 
	*/
	
	private String className = this.getClass().getSimpleName();

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
	
}
