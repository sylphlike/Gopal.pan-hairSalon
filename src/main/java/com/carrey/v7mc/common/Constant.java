package com.carrey.v7mc.common;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月2日上午10:57:18
 * @version		v 1.0.1
 * @description 系统常量标示类
 */
public class Constant {

	
	/*****************************************************************
	 *      controller 返回页面时设置返回结构常量 ,主要正对需要进行分页显示的controller*                                                                                    *
	 *            如该controller逻辑返回需要进行分页，那么设置返回参数的名称必须为该常量，*
	 *            否则将无法使用公共分页组件！！！                                                                                          *
	 * ***************************************************************/
	public static String CONTROlLER_RETURN_ATTRNAME = "generalAttrName";
	
	/**
	 * 验证码常量 ：securityCode
	 */
	public static String PAGE_SECURITY_SESSIONNAME = "securityCode"; 
	
	/**
	 * 通用类型状态（实用于会员状态、员工状态、会员卡状态、品牌状态、商品状态）
	 * 1 正常启用，2挂起，3删除
	 */
	
	/**1： 正常启用*/
	public static Integer GENERAL_TYPE_ENABLE = 1; 
	/**2： 挂起  */
	public static Integer GENERAL_TYPE_INVALID = 2; 
	/**3： 删除*/
	public static Integer GENERAL_TYPE_DELETE = 3; 
	
	
	/**
	 * 通用操作类型 String （实用于会员卡操作，产品出库操作，办卡，充值记录表）
	 */
	/**会员卡 1:充值， 产品出库 1 外卖，办卡，充值记录表  1新开户*/
	public static String GENERAL_OPER_TYPE_STRING_ONE = "1";    
	/**会员卡2：消费，产品出库2 项目使用，办卡，充值记录表  2充值*/
	public static String GENERAL_OPER_TYPE_STRING_TWO  = "2";      
	
	

	/**
	 * 通用操作类型 Integer （实用于会员卡操作，产品出库操作）
	 */
	/**会员卡 1:充值， 产品出库 1 外卖    办卡，充值记录表  1新开户   薪水发放 1 未发*/
	public static Integer GENERAL_OPER_TYPE_INTEGER_ONE = 1;    
	/**会员卡2：消费，产品出库2 项目使用 办卡，充值记录表  2充值   薪水发放 2 已发*/
	public static Integer GENERAL_OPER_TYPE_INTEGER_TWO  = 2;   
	
	
	/****************************************************************
	 *      Ehcache constant                                        *
	*****************************************************************/
	
	/**统一日志*/
	public static final String EHC_UNIVERSALLOG_NAME = "EHC_UNIVERSALLOG_NAME";
	
	
	/**系统全局缓存 --员工数据*/
	public static final String EHC_GLOBAL_CASHIER_EMPLOYEE = "EHC_GLOBAL_CASHIER_EMPLOYEE";
	/**缓所有员工数据*/
	public static final String EHC_EMPLOYEE_ALL ="EHC_EMPLOYEE_ALL";
	/**员工职位为 发型师的缓存key值*/
	public static final String EHC_EMPLOYEE_HAIRSTYLIST ="EHC_EMPLOYEE_HAIRSTYLIST";
	/**员工职位为技师的缓存key值*/
	public static final String EHC_EMPLOYEE_TECHNICIAN = "EHC_EMPLOYEE_TECHNICIAN";
	/**员工职位为 助理的缓存key值*/
	public static final String EHC_EMPLOYEE_ASSISTANT ="EHC_EMPLOYEE_ASSISTANT";
	
	
	/**系统全局缓存 --产品品牌数据*/
	public static final String EHC_GLOBAL_BRAND = "EHC_GLOBAL_BRAND";
	/**产品品牌缓存key值*/
	public static final String EHC_BRAND = "EHC_BRAND";
	
	/**系统全局缓存 --产品数据*/
	public static final String EHC_GLOBAL_PRODUCT = "EHC_GLOBAL_PRODUCT";
	/**产品缓存key值*/
	public static final String EHC_PRODUCT = "EHC_PRODUCT";
	
	/**系统全局缓存 --卡折扣数据*/
	public static final String EHC_GLOBAL_CARD_DISCOUNT ="EHC_GLOBAL_CARD_DISCOUNT";
	
	/**系统全局缓存 --消费项目配置*/
	public static final String EHC_GLOBAL_CONSUMPTION_PROJECT ="EHC_GLOBAL_CONSUMPTION_PROJECT";
	
	/**系统全局缓存 --发型师洗吹、剪发价格配置*/
	public static final String EHC_GLOBAL_HAIRCUTTRT_PRICE ="EHC_GLOBAL_HAIRCUTTRT_PRICE";
	
	/**系统全局缓存 --加价产品*/
	public static final String EHC_GLOBAL_RAISE ="EHC_GLOBAL_RAISE";
	/**系统全局缓存 --加价产品 缓存Key值*/
	public static final String EHC_GLOBAL_RAISE_KEY ="EHC_GLOBAL_RAISE_KEY";
}
