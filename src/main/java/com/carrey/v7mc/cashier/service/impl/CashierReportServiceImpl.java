package com.carrey.v7mc.cashier.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrey.v7mc.cashier.service.CashierReportService;
import com.carrey.v7mc.common.exception.SysException;
import com.carrey.v7mc.mapperInterface.V7HandleCardMapper;
import com.carrey.v7mc.mapperInterface.V7RollDayAccountsMapper;
import com.carrey.v7mc.mapperInterface.V7RollMonthAccountsMapper;
import com.carrey.v7mc.po.V7RollDayAccounts;
import com.carrey.v7mc.po.V7RollMonthAccounts;
import com.carrey.v7mc.queryVo.RollDayAccountsQVo;
import com.carrey.v7mc.util.DateUtil;
import com.carrey.v7mc.util.POtoArrays;
import com.carrey.v7mc.util.UUIDUtils;

@Service
public class CashierReportServiceImpl implements CashierReportService {

	@Autowired
	private V7RollDayAccountsMapper dayAccountsMapper;
	@Autowired
	private V7HandleCardMapper hcMapper;
	@Autowired
	private V7RollMonthAccountsMapper monthAccMapper;

	@Override
	public int getTotalAmount(RollDayAccountsQVo queryVo) {
		return dayAccountsMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7RollDayAccounts> getPageData(RollDayAccountsQVo queryVo) {
		return dayAccountsMapper.getPageData(queryVo);
	}

	@Override
	public Integer queryIsRoll(String isRoll) {
		return dayAccountsMapper.queryIsRoll(isRoll);
	}

	@Override
	public void insertRollDay(String startStr, String endStr,String currentDate,String logUser) throws ParseException, SysException {
		 
		 V7RollDayAccounts day4Rec = dayAccountsMapper.rollDay4Rec(startStr,endStr);
		 V7RollDayAccounts day4Hande =  hcMapper.rollDay4handle(startStr,endStr);
		 if(null == day4Rec){
			 throw new SysException("data_在文件系统中没检索到今天的数据！");
		 }
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 day4Hande.setId(UUIDUtils.getUUID());
		 day4Hande.setV7RRollingDate(sdf.parse(currentDate));
		 day4Hande.setV7RCash(day4Rec.getV7RCash() == null?0:day4Rec.getV7RCash());
		 day4Hande.setV7RVipout(day4Rec.getV7RVipout() == null?0:day4Rec.getV7RVipout());
		 
		 day4Hande.setV7RHedgeout(day4Rec.getV7RHedgecashin() == null?0:day4Rec.getV7RHedgecashin());
		 day4Hande.setV7RHedgecashin(day4Rec.getV7RHedgecashin() == null?0:day4Rec.getV7RHedgecashin());
		 
		 day4Hande.setV7RBlowwashout(day4Rec.getV7RBlowwashout() == null?0:day4Rec.getV7RBlowwashout());
		 day4Hande.setV7RBlowcutwashout(day4Rec.getV7RBlowcutwashout() == null?0:day4Rec.getV7RBlowcutwashout());
		
		 day4Hande.setV7RCardmoney(day4Hande.getV7RCardmoney()== null?0:day4Hande.getV7RCardmoney());
		 //加价产品
		 day4Hande.setV7RRaiseamount(day4Rec.getV7RRaiseamount() == null?0:day4Rec.getV7RRaiseamount());
		 day4Hande.setV7RTakeout(day4Rec.getV7RTakeout() == null?0:day4Rec.getV7RTakeout());
		 
		 
		 day4Hande.setV7RTotalCash(day4Rec.getV7RTotalCash()+(day4Hande.getV7RCardmoney()== null?0:day4Hande.getV7RCardmoney()));
		 day4Hande.setV7ROperuser(logUser);
		 day4Hande.setV7ROpertime(new Date());
		 
		 dayAccountsMapper.insertSelective(day4Hande);
		
	}

	@Override
	public Object[] queryChart(Date charDate) throws IllegalArgumentException, IllegalAccessException {
		V7RollDayAccounts dayAccounts = dayAccountsMapper.queryChart(charDate);
		Object[] arrays = null;
		if(null != dayAccounts){
			arrays = POtoArrays.poToArrays4Day(dayAccounts);
		}
		return arrays;
	}

	@Override
	public void monthAccountsSchedule() {
		String lastDay = DateUtil.beforeMonthLastDay();
		String lastMonth = lastDay.substring(0,lastDay.lastIndexOf("-")); 
		V7RollMonthAccounts monthAccounts = dayAccountsMapper.monthAccountsSchedule(lastMonth);
		
		monthAccounts.setId(UUIDUtils.getUUID());
		monthAccounts.setV7MRollingDate(lastMonth);
		monthAccounts.setV7MOpertime(new Date());
		monthAccounts.setV7MOperuser("system");

		monthAccMapper.insertSelective(monthAccounts);
	}




}
