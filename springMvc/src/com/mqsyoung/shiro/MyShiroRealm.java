package com.mqsyoung.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/** 
* @author : mengqignsen
* @version 创建时间：2017年12月20日  
* 类说明 
*/


public class MyShiroRealm extends AuthorizingRealm {

	
	/**
	 * @author mengqingsen
	 * 获取授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {

		Object primaryPrincipal = pc.getPrimaryPrincipal();
		
		
		
		
		
		
		return null;
	 
	}

	
	/**
	 * @author mengqingsen
	 * 
	 * 获取认证信息
	 * 
	 */
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken at) throws AuthenticationException {
		
		
		
		
		return null;
	 
	}
 
}
