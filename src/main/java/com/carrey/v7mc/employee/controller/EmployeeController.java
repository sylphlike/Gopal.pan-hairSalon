package com.carrey.v7mc.employee.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.Cache;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.base.BaseAction;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.employee.service.EmployeeService;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.queryVo.EmployeeQVo;
import com.carrey.v7mc.system.ehcache.BaseEhcacheManager;
import com.carrey.v7mc.util.DateUtil;

/**
 * 
 * @author 		carrey(潘冰)
 * @Email  		15923508369@163.com
 * @Date   		2016年5月8日下午12:52:49
 * @version		v 1.0.0
 * @description 员工管理
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController extends BaseAction {
	private final Logger log = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * 员工列表
	 * @param queryVo
	 * @param model
	 * @return
	 */
	@RequestMapping("employeeList")
	public String employeeList(EmployeeQVo queryVo, Model model){
		
		int recordCount = employeeService.getTotalAmount(queryVo);
		queryVo = (EmployeeQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Employee> pageData = employeeService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		
		return "employee/employee-list";
	}
	
	/**
	 * 跳转新增员工页面
	 * @return
	 */
	@RequestMapping("/gotoNewEmployee")
	public String gotoNewEmployee(){
		return "employee/employee-add";
	}
	

	/**
	 * 新增员工
	 * @param model
	 * @param employee
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/addEmployee")
	public String addEmployee(Model model, V7Employee employee) throws SysException{
		employee.setV7ECreateUser(getLoginUser().getV7EName());
		employeeService.addEmployee(employee);
		model.addAttribute("operMsG","添加成功");
		model.addAttribute("nextOperExplain","请返回员工列表页面");
		
		//刷新缓存
		refresEhcache4Employee();
		
		return "prompt/messages";
	}

	/**
	 * 员工详情页面数据
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/employeeDetail")
	public String employeeDetail(Model model,String id){
		V7Employee employee = employeeService.employeeDetail(id);
		model.addAttribute("employee", employee);
		return "employee/employee-detail";
	}
	
	/**
	 * 更改员工状态
	 * @param id
	 * @param oper
	 */
	@RequestMapping("/updateEmployeeStatus")
	public void updateEmployeeStatus(String id,String oper){
		if((!"".equals(id)|| null != id) && (!"".equals(oper) || null != oper)){
			V7Employee employee  = employeeService.searchByKey(id);
			switch (oper){
				case "1": employee.setV7EStatus(Constant.GENERAL_TYPE_ENABLE);break;
				case "2": employee.setV7EStatus(Constant.GENERAL_TYPE_INVALID);break;
				case "3": employee.setV7EStatus(Constant.GENERAL_TYPE_DELETE);break;
			}
			employeeService.updateEmployeeStatus(employee);
			
		}
		refresEhcache4Employee();
	}
	
	
	/**
	 * 回显员工数据 员工信息修改
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/employeeEditView")
	public String employeeEditView(String id, Model model){
		
		V7Employee employee = employeeService.searchByKey(id);
		Date joinDate = employee.getV7EJoinDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		employee.setV7EJoinDateStr(sdf.format(joinDate));
		model.addAttribute("employee", employee);
		String[] parseStr = DateUtil.dateMemberParseStr(employee.getV7EBirthday());
		model.addAttribute("YearData",parseStr[0]);
		model.addAttribute("MonthData",parseStr[1]);
		model.addAttribute("DayData",parseStr[2]);

		return "employee/employee-edit";
	}
	/**
	 * 修改员工信息
	 * @param model
	 * @param employee
	 * @return
	 * @throws SysException 
	 */
	@RequestMapping("/updateEmployee")
	public String updateEmployee(Model model, V7Employee employee) throws SysException{
		employee.setV7EUpdateUser(getLoginUser().getV7EName());
		employee.setV7EUpdateTime(new Date());
		
		employeeService.updateEmployee(employee);
		model.addAttribute("operMsG","修改成功");
		model.addAttribute("nextOperExplain","请返回员工列表页面");
		
		refresEhcache4Employee();
		return "prompt/messages";
	}
	
	/**
	 * 回显数据 员工密码修改
	 * @return
	 */
	@RequestMapping("/employeeChangePwdView")
	public String employeeChangePwdView(String id,Model model){
		V7Employee employee = employeeService.searchByKey(id);
		model.addAttribute("employee", employee);
		return "employee/employee-changePwd";
	}
	
	/**
	 * 刷新员工类缓存
	 */
	private void refresEhcache4Employee() {
		log.info("刷新员工类缓存");
		Cache cache = BaseEhcacheManager.getCache(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE);
		List cacheKey = cache.getKeys();
		// 删除指定缓存名称下的内容
		for (Object key : cacheKey) { cache.remove(key); }
		
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
	 * 重复名称校验
	 * @param inName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/checkUniqueness")
	public @ResponseBody String checkUniqueness(@RequestBody String inName) throws UnsupportedEncodingException{
		inName= java.net.URLDecoder.decode(inName,"utf-8");
		inName = inName.substring(inName.indexOf("=")+1, inName.length());
		V7Employee employee = employeeService.checkUniqueness(inName);
		if(employee != null){
			return employee.getV7EName();
		}else{
			return null;
		}
		
	}
	
	
	/**
	 * 重复电话号码校验
	 * @param inName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/checkUniquenessPhone")
	public @ResponseBody String checkUniquenessPhone(@RequestBody String inName) throws UnsupportedEncodingException{
		inName= java.net.URLDecoder.decode(inName,"utf-8");
		inName = inName.substring(inName.indexOf("=")+1, inName.length());
		V7Employee employee = employeeService.checkUniquenessPhone(inName);
		if(employee != null){
			return employee.getV7EName();
		}else{
			return null;
		}
		
	}
	
	/**
	 * 仿百度搜索框 获取员工登录名
	 * @param term
	 * @return
	 * @throws SysException
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/getCacheEmployee")
	public @ResponseBody Map<String, List<V7Employee>> getCacheEmployee(@RequestBody String term) throws SysException, UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		Map<String, List<V7Employee>> map = new HashMap<String, List<V7Employee>>();
		//从缓存中获取
		List<V7Employee> list = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		List<V7Employee> result = new ArrayList<V7Employee>();
		for (V7Employee employee : list) {
			String eName = employee.getV7EName();
			if(eName.contains(term)){
				result.add(employee);
			}
		}
		map.put("source", result);
		return map;
	}
	
	/**
	 * 全值匹配缓存中是否存在相同的员工名称
	 * @param term
	 * @return
	 * @throws SysException
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/selectCacheEmployeeExist")
	public @ResponseBody String selectCacheEmployeeExist(@RequestBody String term) throws SysException, UnsupportedEncodingException{
		term = java.net.URLDecoder.decode(term,"utf-8");
		term = term.substring(term.indexOf("=")+1, term.length());
		//从缓存中获取
		String result = "false";
		List<V7Employee> list = (List<V7Employee>) BaseEhcacheManager.get(Constant.EHC_GLOBAL_CASHIER_EMPLOYEE, Constant.EHC_EMPLOYEE_ALL);
		for (V7Employee employee : list) {
			String eName = employee.getV7EName();
			if(eName.equals(term)){
				result = "true";
			}
		}
		return result;
	}

}
