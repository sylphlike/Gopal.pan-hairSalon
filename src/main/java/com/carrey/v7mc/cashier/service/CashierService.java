package com.carrey.v7mc.cashier.service;

import java.util.List;

import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.po.V7Reception;
import com.carrey.v7mc.queryVo.CashierQVo;

public interface CashierService {
	/**
	 * 前台结单
	 * @param reception
	 * @param operuser 
	 * @param v7rRaiseamount 
	 */
	void addCashier(V7Reception reception, String operuser, String v7rRaiseamount) throws SysException;

	int getTotalAmount(CashierQVo queryVo);

	List<V7Reception> getPageData(CashierQVo queryVo);

}
