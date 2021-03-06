package com.tree.exception;
/**
 * 定义异常类:仅仅是一个中断提示信息类，使用try\catch来捕获异常信息
 * 1、定义异常类
 * 2、按条件抛出异常
 * 3、捕获异常
 * @author admin
 *
 */
public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//异常消息
	private String message;
	
	//提供构造
	public CustomException(){}
	public CustomException(String message){
		
		
		this.message = message;
		}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	}
