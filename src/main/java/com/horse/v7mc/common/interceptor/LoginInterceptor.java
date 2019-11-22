package com.horse.v7mc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.horse.v7mc.po.V7Employee;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月19日上午9:45:33
 * @version		v 1.0.1
 * @description 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
	//进入 Handler方法之前执行
	//用于身份认证、身份授权
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		//获取请求的url
		String url = request.getRequestURI();
	
		if(url.indexOf("loginIn.action")>=0){
			return true;
		}
		
		//判断session
		HttpSession session  = request.getSession();
		//从session中取出用户身份信息
		V7Employee user =  (V7Employee) session.getAttribute("user");
		
		if(user != null){
			//身份存在，放行
			return true;
		}
		//执行这里表示用户身份需要认证，跳转登陆页面
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
	}

}
