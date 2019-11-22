package com.horse.v7mc.system.service.impl;

import java.util.List;

import com.horse.v7mc.mapperInterface.V7UniversalLogMapper;
import com.horse.v7mc.po.V7UniversalLog;
import com.horse.v7mc.queryVo.UniversalQVo;
import com.horse.v7mc.system.service.UniversalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversalServiceImpl implements UniversalService {
	
	@Autowired
	private V7UniversalLogMapper logMapper;

	@Override
	public int getTotalAmount(UniversalQVo queryVo) {
		return logMapper.getTotalAmount(queryVo);
		 
	}

	@Override
	public List<V7UniversalLog> getPageData(UniversalQVo queryVo) {
		return logMapper.getPageData(queryVo);
		 
	}

}
