package com.carrey.v7mc.longin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.longin.service.LoginService;
import com.carrey.v7mc.mapperInterface.V7EmployeeMapper;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.util.MD5Utils;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private V7EmployeeMapper employeeMapper;

	@Override
	public V7Employee loginIn(V7Employee employee) {
		String pwd = employee.getV7EPassword();
		employee.setV7EPassword(MD5Utils.md5(pwd));
		employee = employeeMapper.loginIn(employee);
		return employee;
	}

	

}
