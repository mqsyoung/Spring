package com.mqsyoung.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/** 
* @author : mengqignsen
* @version ����ʱ�䣺2017��12��18��  
* ��˵�� 
*/

@Component
@Aspect
public class AspectUtil {
	/** 
	* @author : mengqignsen
	* @version ����ʱ�䣺2017��12��18�� 
	* ˵�� 
	*/
	
	
	@Before(value="execution(* *.*(..))")
	public void startLog(){
		
		
		System.out.println("startLog����");
		
	}
	
}
