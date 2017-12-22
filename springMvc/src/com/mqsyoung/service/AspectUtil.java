package com.mqsyoung.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/** 
* @author : mengqignsen
* @version 创建时间：2017年12月18日  
* 类说明 
*/

@Component
@Aspect
public class AspectUtil {
	/** 
	* @author : mengqignsen
	* @version 创建时间：2017年12月18日 
	* 说明 
	*/
	
	
	@Before(value="execution(* *.*(..))")
	public void startLog(){
		
		
		System.out.println("startLog……");
		
	}
	
}
