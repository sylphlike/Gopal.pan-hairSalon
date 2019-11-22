package com.horse.v7mc.financial.service;

import java.util.List;

import com.horse.v7mc.po.V7Charge;
import com.horse.v7mc.po.V7Employee;
import com.horse.v7mc.queryVo.ChargeQVo;

public interface ChargeService {

	void addCharge(V7Charge charge, V7Employee emp);

	int getTotalAmount(ChargeQVo queryVo);

	List<V7Charge> getPageData(ChargeQVo queryVo);

	V7Charge searchCharge(String id);

	void updateCharge(V7Charge charge);

	void delCharge(String id);

}
