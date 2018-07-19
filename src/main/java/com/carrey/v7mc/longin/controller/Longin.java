package com.carrey.v7mc.longin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.longin.service.LoginService;
import com.carrey.v7mc.po.V7Employee;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月8日下午10:11:03
 * @version		v 1.0.1
 * @description 登录相关
 */
@Controller
@RequestMapping("/login")
public class Longin {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/loginIn")
	public void  Login(HttpSession session,V7Employee employee,String securityCode,
			HttpServletRequest request, HttpServletResponse response) throws IOException,SysException,ServletException{
		if(!StringUtils.isEmpty(securityCode)){
			if(null != session.getAttribute(Constant.PAGE_SECURITY_SESSIONNAME)){
				if(!session.getAttribute(Constant.PAGE_SECURITY_SESSIONNAME).equals(securityCode)){
					response.sendRedirect(request.getContextPath()+"/index.jsp");
					return;
				}
				if(("".equals(employee.getV7EName()) && null == employee.getV7EName())||
						("".equals(employee.getV7EPassword()) && null == employee.getV7EPassword())){
					response.sendRedirect(request.getContextPath()+"/index.jsp");
					return;
				}
				employee =  loginService.loginIn(employee);
				if(employee != null){
					session.setAttribute("user", employee);
					request.getRequestDispatcher("/WEB-INF/pages/main.jsp").forward(request, response);
					return;
				}else {
					response.sendRedirect(request.getContextPath()+"/index.jsp");
					return;
				}
			}
			response.sendRedirect(request.getContextPath()+"/index.jsp");
			return;
		}else {
			response.sendRedirect(request.getContextPath()+"/index.jsp");
			return;
		}
		
	
	}
	@RequestMapping("/loginOut")
	public void LoginOut(HttpSession session){
		session.invalidate();
		
	}
	
	@RequestMapping("/welcome")
	public String welcome(HttpSession session){
		return "welcome";
		
	}

}
