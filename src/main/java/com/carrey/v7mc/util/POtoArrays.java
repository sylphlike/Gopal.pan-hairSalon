package com.carrey.v7mc.util;

import java.lang.reflect.Field;  
import java.util.HashMap;
import java.util.Map;


/**
 * @author carrey(潘冰)
 * @email  15923508369@163.com
 * @date   2016年6月14日下午2:17:49
 * @desc   对象转数组
 */
public class POtoArrays {
	
	/**
	 * 将对象中的值转换成数组类型(日报)
	 * @param bean
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Object[] poToArrays4Day(Object bean) throws IllegalArgumentException, IllegalAccessException{
		//得到类对象  
		Class userCla = (Class) bean.getClass();  
		//得到类中的所有属性集合 
	    Field[] fs = userCla.getDeclaredFields(); 
	    Object[] result = new Object[13];
	    int temp = 0;
	    for(int i = 0 ; i < fs.length; i++){  
	       Field f = fs[i];  
	       f.setAccessible(true); //设置些属性是可以访问的  
	       String name = f.getName();
	       if("v7RCash".equals(name)||"v7RVipout".equals(name)||"v7RHedgeout".equals(name)||"v7RBlowwashout".equals(name)||"v7RBlowcutwashout".equals(name)||
	    		   "v7RVipin".equals(name)||"v7RHedgein".equals(name)||"v7RBlowwashin".equals(name)||"v7RBlowcutwashin".equals(name)||"v7RCardmoney".equals(name)||"v7RTakeout".equals(name)
	    		  ||"v7RTotalCash".equals(name)||"v7RRaiseamount".equals(name)){
	    	   Object val = f.get(bean);//得到此属性的值     
	    	   result[temp++] = val;
	    	   
	       }
			
	    }    
		return result;
		
	}
	
	
	/**
	 * 将对象中的值转换成数组类型(月报)
	 * @param bean
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Object[] poToArrays4Month(Object bean) throws IllegalArgumentException, IllegalAccessException{
		//得到类对象  
		Class userCla = (Class) bean.getClass();  
		//得到类中的所有属性集合 
	    Field[] fs = userCla.getDeclaredFields(); 
	    Object[] result = new Object[13];
	    int temp = 0;
	    for(int i = 0 ; i < fs.length; i++){  
	       Field f = fs[i];  
	       f.setAccessible(true); //设置些属性是可以访问的  
	       String name = f.getName();
	       if("v7MCash".equals(name)||"v7MVipout".equals(name)||"v7MHedgeout".equals(name)||"v7MBlowwashout".equals(name)||"v7MBlowcutwashout".equals(name)||
	    		   "v7MVipin".equals(name)||"v7MHedgein".equals(name)||"v7MBlowwashin".equals(name)||"v7MBlowcutwashin".equals(name)||"v7MCardmoney".equals(name)||"v7MTakeout".equals(name)
	    		  ||"v7MTotalCash".equals(name)||"v7MRaiseamount".equals(name)){
	    	   Object val = f.get(bean);//得到此属性的值     
	    	   result[temp++] = val;
	    	   
	       }
			
	    }    
		return result;
		
	}
	
	/**
	 * 产品出库报表数据转换
	 * @param bean
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Map<String, Object> poToArrays4Pro(Object bean) throws IllegalArgumentException, IllegalAccessException{
		Class userCla = (Class) bean.getClass();  
		//得到类中的所有属性集合 
	    Field[] fs = userCla.getDeclaredFields(); 
	    Map<String, Object> map = new HashMap<String, Object>();
	    int temp = 0;
	    for(int i = 0 ; i < fs.length; i++){  
	       Field f = fs[i];  
	       f.setAccessible(true); //设置些属性是可以访问的  
	       String name = f.getName();
	       if("v7SCount".equals(name)||"v7SPriceCount".equals(name)){
	    	   Object val = f.get(bean);//得到此属性的值     
	    	   map.put(name, val);
	       }
			
	    }    
		return map;
	}
	
}
