package com.carrey.v7mc.util;


import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;



/**
 * 获取客户端电脑信息 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com 
 * @Date   		2015-12-2下午05:32:54
 * @version		v 1.0.1
 * @description
 */
public class GetClientInfo {
	
	/**
	 * 获取客户端IP地址  调用类需继承  HttpServletRequest 或注入 HttpServletRequest
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) { 
	    String ip = request.getHeader("x-forwarded-for"); 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	        ip = request.getHeader("Proxy-Client-IP"); 
	    } 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	        ip = request.getHeader("WL-Proxy-Client-IP"); 
	    } 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	        ip = request.getRemoteAddr(); 
	    } 
	    return ip; 
	}   
	
	
	/**
	 * 获取客户端电脑名称
	 * @return
	 */
	public static String getHostName(){
		String hostName ="";
		try {
			InetAddress netAddress = InetAddress.getLocalHost();
			hostName = netAddress.getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hostName;
	}

}
