package com.carrey.v7mc.system.service;

import java.util.List;

import com.carrey.v7mc.po.V7Member;
import com.carrey.v7mc.po.V7UniversalLog;
import com.carrey.v7mc.queryVo.UniversalQVo;

public interface UniversalService {

	int getTotalAmount(UniversalQVo queryVo);

	List<V7UniversalLog> getPageData(UniversalQVo queryVo);

}
