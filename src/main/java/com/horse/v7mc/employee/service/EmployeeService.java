package com.horse.v7mc.employee.service;

import java.util.List;

import com.horse.v7mc.common.exception.SysException;
import com.horse.v7mc.po.V7Employee;
import com.horse.v7mc.queryVo.EmployeeQVo;

public interface EmployeeService {
    /**
     * 获取总数
     * @param queryVo
     * @return
     */
	int getTotalAmount(EmployeeQVo queryVo);

	/**
	 * 获取分页数据
	 * @param queryVo
	 * @return
	 */
	List<V7Employee> getPageData(EmployeeQVo queryVo);

	/**
	 * 新增员工
	 * @param employee
	 * @throws SysException 
	 */
	void addEmployee(V7Employee employee) throws SysException;

	/**
	 * 获取员工详细信息,转换了枚举值
	 * @param id
	 * @return
	 */
	V7Employee employeeDetail(String id);

	/**
	 * 修改员工状态
	 * @param employee
	 */
	void updateEmployeeStatus(V7Employee employee);

	/**
	 * 根据ID获取会员信息
	 * @param id
	 * @return
	 */
	V7Employee searchByKey(String id);

	/**
	 * 修改员工信息
	 * @param employee
	 * @throws SysException 
	 */
	void updateEmployee(V7Employee employee) throws SysException;

	/**
	 * 系统全局缓存对象数据（员工数据，只有正常启用的员工才能被全局缓存）
	 * @return
	 */
	List<V7Employee> search4Ehcache();

	/**
	 * 重复名称校验
	 * @param inName
	 * @return
	 */
	V7Employee checkUniqueness(String inName);

	/**
	 * 业绩计算员工数据
	 * @return
	 */
	List<V7Employee> search4Results();

	/**
	 * 重复电话号码校验
	 * @param inName
	 * @return
	 */
	V7Employee checkUniquenessPhone(String inName);

}
