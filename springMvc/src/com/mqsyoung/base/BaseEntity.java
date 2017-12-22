package com.mqsyoung.base;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
* @author : mengqignsen
* @version ����ʱ�䣺2017��12��15�� 
* ��˵��  ��ʵ����̳д��� ʵ�����л�
*/
/**
 * 
 * @author mengqingsen
 * 
 *	@JsonInclude(Include.NON_NULL)
 *	���ã� �ŵ��� ���� ������
 *	  �����ϣ����������Ϊ�� ����ֶβ��������л���Ϊnull ���ֶβ���ʵ�� 
 *	��springmvc ��ע�� �� ��Ϊ�˿��Ʒ���json �ַ��������ֶε���ʾ �� ������Ϊ�յĲ���ʾ
 */

@JsonInclude(Include.NON_NULL)
public class BaseEntity implements Serializable {
	/** 
	* @author : mengqignsen
	* @version ����ʱ�䣺2017��12��15��
	* ˵�� 
	*/
	
	private String className = this.getClass().getSimpleName();

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
	
}
