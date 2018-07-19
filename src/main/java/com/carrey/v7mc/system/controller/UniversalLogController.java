package com.carrey.v7mc.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrey.v7mc.common.Constant;
import com.carrey.v7mc.common.pageBean.PageUtils;
import com.carrey.v7mc.po.V7UniversalLog;
import com.carrey.v7mc.queryVo.UniversalQVo;
import com.carrey.v7mc.system.service.UniversalService;

@Controller
@RequestMapping("/universalLog")
public class UniversalLogController {
	
	@Autowired
	private UniversalService universalService;

	/**
	 * 系统日志列表
	 * @return
	 */
	@RequestMapping("/universalLogList")
	public String universalLogList(Model model,UniversalQVo queryVo){

		int recordCount = universalService.getTotalAmount(queryVo);
		queryVo = (UniversalQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7UniversalLog> pageData = universalService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		return "/system/universalLog-list";
	}
}
