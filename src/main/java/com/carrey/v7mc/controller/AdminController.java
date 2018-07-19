package com.carrey.v7mc.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.base.BaseAction;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseAction {
	
	/**
	 * 资源
	 * @param model
	 * @return
	 */
	@RequestMapping("/resourcesList")
	public String resourcesList(Model model){
		
		return "/admin/resourcesList";
	}

	/**
	 * 角色
	 * @param model
	 * @return
	 */
	@RequestMapping("/roleList")
	public String roleList(Model model){
		return "/admin/soleList";
	}
	
	/**
	 * 权限
	 * @param model
	 * @return
	 */
	@RequestMapping("/permissionsList")
	public String permissionsList(Model model){
		return "/admin/permissionsList";
	}
}
