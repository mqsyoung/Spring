package com.mqsyoung.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/** 
* @author : mengqignsen
* @version ����ʱ�䣺2017��12��20��  
* ��˵�� 
*/


public class MyShiroRealm extends AuthorizingRealm {

	
	/**
	 * @author mengqingsen
	 * ��ȡ��Ȩ��Ϣ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {

		Object primaryPrincipal = pc.getPrimaryPrincipal();
		
		
		
		
		
		
		return null;
	 
	}

	
	/**
	 * @author mengqingsen
	 * 
	 * ��ȡ��֤��Ϣ
	 * 
	 */
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken at) throws AuthenticationException {
		
		
		
		
		return null;
	 
	}
 
}
