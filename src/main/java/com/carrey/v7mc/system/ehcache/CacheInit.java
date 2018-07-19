package com.carrey.v7mc.system.ehcache;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.employee.service.EmployeeService;
import com.carrey.v7mc.po.V7Brand;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.product.service.BrandService;
import com.carrey.v7mc.product.service.ProductService;
import com.carrey.v7mc.util.XMLUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author 		carrey(潘林森)
 * @Email  		15923508369@163.com 
 * @Date   		2015年11月14日下午3:17:27
 * @version		v 1.0.1
 * @description 系统缓存初始化类，程序启动时通过 <listener>加载该类，初始化系统所有需要缓存的数据
 */
@SuppressWarnings("all")
public class CacheInit  implements ServletContextListener{
	protected  final Logger log = Logger.getLogger(CacheInit.class);
	

	@Override
	public void contextDestroyed(ServletContextEvent contextEvent) {
	}

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		log.info("系统缓存初始化开始。。。");
		long startTimeMillis = System.currentTimeMillis();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml","spring/applicationContext-dao.xml");
		
		ehcacheUniversalLog();
		ehcacheEmployee(context);
		ehcacheBrand(context);
		ehcacheProduct(context);
		ehcacheDiscount(context);
		ehcacheConsumptionProject(context);
		ehcacheHaircutterPrice(context);
		ehcacheRaiseAmount(context);
		long endTimeMillis = System.currentTimeMillis();
		long timeDate =  (endTimeMillis - startTimeMillis) / 1000;
		context.destroy();
		log.info("载入缓存共耗时："+ timeDate +"秒" );
	}


	/**
	 * 缓存统一日志配置文件
	 */
	private void ehcacheUniversalLog() {
		Map<String, Map<String, String>> universalLog = XMLUtil.readUniversalLog();
		Set<String> keySet = universalLog.keySet();
		for (String key : keySet) {
			BaseEhcacheManager.put(Constant.EHC_UNIVERSALLOG_NAME ,key,universalLog.get(key)); 
		}
	}

	/**
	 * 缓存员工数据
	 * @param context 
	 */
	private void ehcacheEmployee(ClassPathXmlApplicationContext context){
		
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		List<V7Employee> employee =  employeeService.search4Ehcache();
		
		//过滤到 发型师，技师，助理职位的员工 (1 经理，2股东，3技术总监，4首席发型师，5高级发型师， 6发型师，7技师，8助理，9 前台，10 其它)
		List<V7Employee> hairstylist =new ArrayList<V7Employee>(); 
		List<V7Employee> technician =new ArrayList<V7Employee>(); 
		List<V7Employee> assistant =new ArrayList<V7Employee>(); 
		for (V7Employee temp : employee) {
			String position = temp.getV7EPosition();
			if(!StringUtils.isEmpty(position)){
				if(position.contains("3") || position.contains("4")||position.contains("5")|| position.contains("6")){
					hairstylist.add(temp);
				}
				if(position.contains("7")){
					technician.add(temp);
				}
				if(position.contains("8")){
					assistant.add(temp);
				}
			}
		}
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE ,Constant.EHC_EMPLOYEE_ALL,employee); 
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE ,Constant.EHC_EMPLOYEE_HAIRSTYLIST,hairstylist); 
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE ,Constant.EHC_EMPLOYEE_TECHNICIAN,technician); 
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE ,Constant.EHC_EMPLOYEE_ASSISTANT,assistant); 
	}
	
	/**
	 * 缓存品牌数据
	 * @param context
	 */
	public void ehcacheBrand(ClassPathXmlApplicationContext context){
		BrandService brandService = (BrandService) context.getBean("brandService");
		List<V7Brand> brandList = brandService.search4Ehcache();
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_BRAND, Constant.EHC_BRAND, brandList);
	}
	
	/**
	 * 缓存产品数据
	 * @param context
	 */
	private void ehcacheProduct(ClassPathXmlApplicationContext context) {
		ProductService productService = (ProductService) context.getBean("productService");
		List<V7Brand> brandList = productService.search4Ehcache();
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_PRODUCT, Constant.EHC_PRODUCT, brandList);
	}
	
	/**
	 * 缓存折扣信息
	 * @param context
	 */
	private void ehcacheDiscount(ClassPathXmlApplicationContext context){
		Map<String, Map<String, Double>> discount = XMLUtil.readCashierDiscount();
		Set<String> keySet = discount.keySet();
		for (String key : keySet) {
			BaseEhcacheManager.put(Constant.EHC_GLOBAL_CARD_DISCOUNT ,key,discount.get(key)); 
		}
	}
	
	/**
	 * 缓存消费项目配置项
	 * @param context
	 */
	public void ehcacheConsumptionProject(ClassPathXmlApplicationContext context){
		Map<String, List<String>> consumptionProject = XMLUtil.readConsumptionProject();
		Set<String> keySet = consumptionProject.keySet();
		for (String key : keySet) {
			//其中缓存key的值为配置文件中的消费项目根节点
			BaseEhcacheManager.put(Constant.EHC_GLOBAL_CONSUMPTION_PROJECT, key, consumptionProject.get(key));
		}
	}
	
	

	/**
	 * 缓存发型师洗吹、剪发价格配置表
	 * @param context
	 */
	private void ehcacheHaircutterPrice(ClassPathXmlApplicationContext context) {
		Map<String, Map<String, String>> haircutterprice = XMLUtil.readHaircutterPrice();
		Set<String> keySet = haircutterprice.keySet();
		for (String key : keySet) {
			//其中缓存key的值为配置文件中的消费项目根节点
			BaseEhcacheManager.put(Constant.EHC_GLOBAL_HAIRCUTTRT_PRICE, key, haircutterprice.get(key));
		}
	}
	
	/**
	 * 缓存加价产品数据
	 * @param context
	 */
	private void ehcacheRaiseAmount(ClassPathXmlApplicationContext context) {
		ArrayList<String> raiseAmount = XMLUtil.readRaiseAmount();
		BaseEhcacheManager.put(Constant.EHC_GLOBAL_RAISE, Constant.EHC_GLOBAL_RAISE_KEY, raiseAmount);
	}

}
