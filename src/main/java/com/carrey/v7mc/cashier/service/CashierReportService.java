package com.carrey.v7mc.cashier.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.po.V7Employee;
import com.carrey.v7mc.po.V7RollDayAccounts;
import com.carrey.v7mc.queryVo.RollDayAccountsQVo;

public interface CashierReportService {

	int getTotalAmount(RollDayAccountsQVo queryVo);

	List<V7RollDayAccounts> getPageData(RollDayAccountsQVo queryVo);

	/**
	 * 当前时间点击轧账管理，获取今天的数据是否轧账了。
	 * @param isRoll
	 * @return 
	 */
	Integer queryIsRoll(String isRoll);

	/**
	 * 日轧账，
	 * @param strartStr
	 * @param endStr
	 * @param currentDate 
	 * @param logUser 
	 * @return 
	 */
	void insertRollDay(String strartStr, String endStr, String currentDate, String logUser)throws ParseException, SysException ;

	/**
	 * 查询日报表数据
	 * @param charDate
	 * @return
	 */
	Object[] queryChart(Date charDate)throws IllegalArgumentException, IllegalAccessException ;

	/**
	 *  月运营数据统计调度
	 */
	void monthAccountsSchedule();

}
