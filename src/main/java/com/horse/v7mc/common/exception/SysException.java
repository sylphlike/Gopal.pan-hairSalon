package com.horse.v7mc.common.exception;

/**
 * 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com
 * @Date   		2015年11月7日上午11:29:22
 * @version		v 1.0.1
 * @description 系统自定义异常类,针对预期的异常，需要在程序中跑出此类异常
 */
@SuppressWarnings("all")
public class SysException extends Exception{
	
	public String message;

	public SysException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
