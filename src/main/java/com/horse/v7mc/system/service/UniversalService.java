package com.horse.v7mc.system.service;

import java.util.List;

import com.horse.v7mc.po.V7UniversalLog;
import com.horse.v7mc.queryVo.UniversalQVo;

public interface UniversalService {

	int getTotalAmount(UniversalQVo queryVo);

	List<V7UniversalLog> getPageData(UniversalQVo queryVo);

}
