package com.Demo;

import oracle.net.aso.b;

/** 
* @author : mengqignsen
* @version 创建时间：2017年12月29日 上午9:36:53 
* 类说明 : 字符串反转
*/
public class StringReverse {
 
	/**
	 * 
	 * @param arr
	 * @param begin
	 * @param end
	 * 
	 * 将字符串转化为字符数据
	 * 
	 */
	
		
	public static void  swapString(char[] arr , int begin , int end ){
		
		
		 while(begin < end ){
			 
			 char temp = arr[end];
			 
			 arr[end] = arr[begin];
			 
			 arr[begin] = temp;
			 
			 begin ++;
			 
			 end --;
			 
		 }
		
		
	}
	
	
	public static void StringWord(String[] str , int begin , int end){
		
		while(begin < end){
			
			String temp = str[end];
			
			str[end] = str[begin];
			
			str[begin] = temp;
			
			begin ++;
			
			end --;
			
		}
		
		
		
	}
	
	
	public static String stringWordTO(String str){
		
		char[] arr = str.toCharArray();
		
		int begin =0;
		int end = arr.length-1;
		
		 while(begin < end ){
			 
			 char  temp = arr[end];
			 
			 arr[end] = arr[begin];
			 
			 arr[begin] = temp;
			 
			 begin ++;
			 
			 end --;
			 
		 }
		 
		 
		 int start =0 ;
		 
		 for(int i =1 ; i < arr.length ; i++){
			 
			 if(arr[i] == ' '){
				 int q = i-1;
				 System.out.println(q+" qq");
				 System.out.println(start);
				 while(start < q){
					 System.out.println(" qwwwwq");
					 
					 char t = arr[q];
					 
					 arr[q] =arr[start];
					 arr[start]  =t;
					 
					 start ++;
					 
					 q --;
					 
				 }
				 start = i+1;
			 }
			 
		 }
		 
		 
		 int a = arr.length-1;
		 
		  while(start < a){
			  
			  char tt = arr[a];
			  arr[a] = arr[start];
			  arr[start] = tt;
			  start ++;
			  
			  a --;
			  
		  }
		 
	/*	 int start =0;
		 
		 for(int i = 1 ; i<arr.length ;i++){
			 
			 if(arr[i] == ' '){
				  int q = i -1;
				 while(start < q){
					 char  tmp = arr[q];
					 
					 arr[q] =arr[start];
					 
					 q --;
					 start++ ;
					 
					 
				 }
				 
			 }
			 start = i + 1;
			 
		 }
		 
		 
		  int startEnd = arr.length-1;
		  
		   while(start < startEnd){
			   
			   char te = arr[startEnd];
			   
			   arr[startEnd] = arr[start];
			   
			   arr[start] = te;
			   
			   start ++;
			   
			   startEnd --;
		   }
		 
		 */
		 
		 return new String(arr);
		
	}
	
	
	
	// 写一个程序，输出所有由1,2,3,4四个数字组成，互不相同且无重复数字的三位数
	
	public static void softString(){
		
		 
		int i =0;
		int j =0;
		int k =0;
		int n =0;
		for(  i=1 ;i<=4 ;i++){
			
			for( j=1 ;j<=4 ;j++){
				
				for( k=1 ;k<=4 ;k++){
					if(i != j && i!= k && j!= k)
					n+=1;
					
					System.out.println(i*100+j*10+k);
						
				}
				
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String str = "qw and you";
		
		char[] arr = str.toCharArray();
		
		
		StringReverse.swapString(arr, 0, arr.length-1);
		
		System.out.println(new String(arr));
		
		String stringWordTO = StringReverse.stringWordTO("me and you");
		
		System.out.println(stringWordTO);
		
		StringReverse.softString();
		
	}
	
	
	
	
}
