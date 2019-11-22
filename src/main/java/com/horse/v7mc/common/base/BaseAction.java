package com.horse.v7mc.common.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.horse.v7mc.po.V7Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月18日下午10:33:53
 * @version		v 1.0.1
 * @description Action基类
 */
@Component
public class BaseAction  {
	
    protected HttpServletRequest request;
	protected HttpServletResponse response;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
    }
	/**
	 * 获取 request
	 * @return
	 */
	protected HttpServletRequest getRequest(){
		return request;
	}

	/**
	 * 获取response
	 * @return
	 */
	protected HttpServletResponse getResponse(){
		return response;
	}

	/**
	 * 获取session
	 * @return
	 */
	protected HttpSession getSession(){
		return request.getSession();
	}
	
	/**
	 * 获取登录人信息
	 * @return
	 */
	protected V7Employee getLoginUser(){
		V7Employee employee = (V7Employee) getSession().getAttribute("user");
		return employee;
	}

}
