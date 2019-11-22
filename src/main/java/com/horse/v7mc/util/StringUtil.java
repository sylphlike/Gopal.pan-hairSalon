package com.horse.v7mc.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringUtil {
	
	 
		
	/**
	 * 如果字符串为null，则返回空。不为空，则trim。
	 * @param str
	 * @return
	 */
	public static String trim(String str){
		if(str==null)return "";
		return str.trim();
	}

	
	/**
	 * 判断字符串是否是ipv4地址
	 * @param s  字符串
	 * @return
	 */
	public final static boolean isIPv4Address(String s) {
		if (s != null) {
			int dot1 = s.indexOf('.');
			if (dot1 <= 0) {
				return false;
			}
			int temp;
			try {
				temp = Integer.parseInt(s.substring(0, dot1++));
				if (temp < 0 || temp > 255) {
					return false;
				}
			} catch (Exception ex) {
				return false;
			}

			int dot2 = s.indexOf('.', dot1);
			if (dot2 <= 0) {
				return false;
			}
			try {
				temp = Integer.parseInt(s.substring(dot1, dot2++));
				if (temp < 0 || temp > 255) {
					return false;
				}
			} catch (Exception ex) {
				return false;
			}

			int dot3 = s.indexOf('.', dot2);
			if (dot3 <= 0) {
				return false;
			}
			try {
				temp = Integer.parseInt(s.substring(dot2, dot3++));
				if (temp < 0 || temp > 255) {
					return false;
				}
			} catch (Exception ex) {
				return false;
			}

			try {
				temp = Integer.parseInt(s.substring(dot3));
				if (temp < 0 || temp > 255) {
					return false;
				}
			} catch (Exception ex) {
				return false;
			}

			return true;
		}
		return false;
	}
	
	/**
	 * 过滤字符串中的几个特殊符号（< > ' "），将这几个符号转义，从而保证网页正常显示内容
	 * @param str  待过滤的字符串
	 * @return
	 */
	public static String filterHTMLTag(String str){
	    if(str==null)return null;
	    StringBuffer sb = new StringBuffer();
	    for(int i=0;i<str.length();i++){
	    	char c = str.charAt(i);
	    	if(c=='<'){
	    		sb.append("&#60;");
	    	}
	    	else if(c=='>'){
	    		sb.append("&#62;");
	    	}
	    	else if(c=='\''){
	    		sb.append("&#39;");
	    	}
	    	else if(c=='\"'){
	    		sb.append("&#34;");
	    	}
	    	else{
	    		sb.append(c);
	    	}
	    }
	    return sb.toString();
	}
	
	/**
	 * 生成交易流水号
	 * @return
	 */
	public static String getTranNo(Date tranDate){
		if(tranDate == null){
			tranDate = new Date();
		}
		return new SimpleDateFormat("yyyyMMddHHmmss").format(tranDate) + validateCode(6);
	}
	
	/** 
     * 生成任意位数随机数 
     * @param code_len(位数) 
     * @return
     */  
	public static String validateCode(int code_len) {
        int count = 0;
        char str[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < code_len) {
            int i = Math.abs(r.nextInt(10));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();  
	 }
	
	 

}
