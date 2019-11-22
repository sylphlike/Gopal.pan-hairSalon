package com.horse.v7mc.common.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/**
 * 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com / panlinsen@ultrapower.com.cn
 * @Date   		2015年11月7日上午11:37:52
 * @version		v 1.0.1
 * @description 全局异常处理类
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

	/**
	 * 
	 */
	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse response, Object handler, Exception exception) {
		//handler就是处理器适配器要执行的handler对象（只有method方法）
		SysException sysException = null;
		if(exception instanceof SysException){
			sysException = (SysException)exception;
		}else{
			exception.printStackTrace();
			sysException = new SysException("未知错误");
		}
		
		/**
		 * 获取错误信息，根据获取到的错误信息跳转到相应的页面，但须开发人员遵循一些开发规范，即在抛出自定义异常时需跟相应类型异常的前缀
		 * 例：
		 * 	nullGeneral 通用空异常类错误
		 * 		throw new SysException("null_不存在该任务的详细信息！！！");
		 * 		其中：message中的 'null_'即为 null类型异常的前缀。
		 *  dataBase 类错误
		 * 		throw new SysException("dataBase_不存在该任务的详细信息！！！");
		 * 		其中：message中的 'dataBase_'即为dataBase类型异常的前缀。
		 * 		           一下的所有异常同上，即为自定义异常消息的前缀为该类异常的异常名+"_".
		 *  data 类错误
		 * 	404       类错误
		 * 	500      类错误
		 * #########前台收银错误
		 * nullGeneral 空异常错误
		 * 
		 * 
		 */
		
		ModelAndView modelAndView = new ModelAndView();
		String message = sysException.getMessage();
		if("未知错误".equals(message)){
			modelAndView.setViewName("prompt/500");
			
		}else {
			String prefix = message.substring(0, message.indexOf("_"));
			String prefixVal = "";
			if("null".equals(prefix) || "nullGeneral".equals(prefix)){
				prefixVal = "空数据错误";
			}else if ("dataBase".equals(prefix)){
				prefixVal ="数据库异常";
			}else if("data".equals(prefix) || "dataCashier".equals(prefix)){
				prefixVal ="数据类异常";
			}
			
			
			modelAndView.addObject("prefixVal", prefixVal);
			modelAndView.addObject("message", message.substring(message.indexOf("_")+1, message.length()));
			
			if("nullGeneral".equals(prefix) || "dataBase".equals(prefix)|| "data".equals(prefix)){
				modelAndView.setViewName("prompt/messages4ExceptionGeneral");
			}
			//++++++++++++++++++++++前台异常++++++++++++++++++++++++++++++++++++
			if("nullCashier".equals(prefix) || "dataCashier".equals(prefix)){
				modelAndView.setViewName("prompt/messages4Exception");
			}
		}
		
		
		return modelAndView;

	}

}
