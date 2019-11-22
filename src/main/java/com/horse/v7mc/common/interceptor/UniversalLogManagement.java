package com.horse.v7mc.common.interceptor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.horse.v7mc.po.V7Employee;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.horse.v7mc.common.log.UniversalLogService;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月19日上午9:45:59
 * @version		v 1.0.1
 * @description 统一日志管理
 */
public class UniversalLogManagement implements HandlerInterceptor {
	private static Logger log = Logger.getLogger(UniversalLogManagement.class);
	
	@Autowired
	private UniversalLogService logService;

	/**
	 * 执行Handler完成执行此方法
	 * 统一异常处理，统一日志处理
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//只针对修改，删除新增做日志记录
		//获取请求的url
		String fullPath = request.getRequestURI();
		String url = fullPath.substring(fullPath.lastIndexOf("/")+1, fullPath.length());
		/**
		 *  <tx:method name="save*" propagation="REQUIRED"/>
			<tx:method name="add*" propagation="REQUIRED"/>
			<tx:method name="insert*" propagation="REQUIRED"/>
			<tx:method name="delete*" propagation="REQUIRED"/>
			<tx:method name="del*" propagation="REQUIRED"/>
			<tx:method name="update*" propagation="REQUIRED"/>
		 */
		if(url.matches("^save.*\\.action") || url.matches("^insert.*\\.action") || url.matches("^add.*\\.action")
				|| url.matches("^delete.*\\.action") || url.matches("^del.*\\.action") || url.matches("^update.*\\.action")
				|| url.matches("^upd.*\\.action")){
			Map<String, String[]> parameterMap = request.getParameterMap();
			Map<String, String> params = new HashMap<String, String>();
			Set<String> set = parameterMap.keySet();
			for (String key : set) {
				String[] str = parameterMap.get(key);
				String temp ="";
				for (int i = 0; i < str.length; i++) {
					temp += str[i]+" ";
				}
				params.put(key, temp);
			}
			int status = response.getStatus();
			V7Employee user = (V7Employee) request.getSession().getAttribute("user");
			String operUser = user.getV7EName();
			
			logService.recordLog(fullPath, params.toString(), status, operUser,request);
			log.info("请求参数为："+params.toString());
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		return true;
	}

}
